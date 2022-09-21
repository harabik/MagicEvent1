/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Animateur;
import Entites.Espace;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Liste_Animateur_Controller implements Initializable {
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
    private ImageView image;
    @FXML
    private Label animateurs;
    @FXML
    private Button close;
      
    @FXML
    private Label Lanimateur;
    @FXML
    private TableView<Animateur> table;
    
    @FXML
    private TableColumn<Animateur,String> adresse;
    @FXML
    private TableColumn<Animateur,String> nom;
     @FXML
    private TableColumn<Animateur,String> email;

    @FXML
    private TableColumn<Animateur,String> numero;
    
     ObservableList<Animateur> olist = FXCollections.observableArrayList();

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
            ResultSet rs =con.createStatement().executeQuery("select * from animateur ");
            while(rs.next()){
            olist.add(new Animateur (rs.getString("nom"),rs.getString("adresse"),rs.getString("mail"),rs.getString("num")));
            }
            } catch (SQLException ex) {
            Logger.getLogger(Liste_ServeursController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        email.setCellValueFactory(new PropertyValueFactory<>("mail"));
        numero.setCellValueFactory(new PropertyValueFactory<>("num"));
       
        table.setItems(olist);
        
    }    


    private void gotohome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToHome(ActionEvent event) {
    }
    
}
