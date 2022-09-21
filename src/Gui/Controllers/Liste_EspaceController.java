/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Espace;
import Entites.Location;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Liste_EspaceController implements Initializable {
    
    private Parent root;
    private Stage stage;
    private Scene scene;
    
    @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;
    @FXML
    private Label Lespaces;

    @FXML
    private TableColumn<Espace,String> adress;

   
    @FXML
    private Button close;

    @FXML
    private Label espaces;

    @FXML
    private TableColumn<Espace,String> Surface;

    @FXML
    private ImageView image;

    @FXML
    private TableColumn<Espace,String> nom;

    @FXML
    private TableColumn<Espace,String> numero;

    @FXML
    private TableView<Espace> table;
   
     ObservableList<Espace> olist = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      // TODO
 
try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
        try {
            ResultSet rs =con.createStatement().executeQuery("select * from espace ");
            while(rs.next()){
            olist.add(new Espace(rs.getString("nom"),rs.getString("adresse"),rs.getString("num_mo"),rs.getString("surface")));
            }
            } catch (SQLException ex) {
            Logger.getLogger(Liste_ServeursController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        adress.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        numero.setCellValueFactory(new PropertyValueFactory<>("num_mo"));
        Surface.setCellValueFactory(new PropertyValueFactory<>("surface"));
       
        table.setItems(olist);
        
    }     

    @FXML
    private void handleClicks(ActionEvent event) {
    }

    @FXML
    void GoToHome(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
   
    
}
