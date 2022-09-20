/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Serveurs;
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
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Liste_ServeursController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    Statement st;  
    
    @FXML
    private Label Lserveurs;


    @FXML
    private Label serveur;

    
    @FXML
    private Label labellServeur;
   
    @FXML
   
    private TableView<Serveurs> table;
     @FXML
    private TableColumn<Serveurs, String> adress;


    @FXML
    private TableColumn<Serveurs, String> gende;

    @FXML
    private TableColumn<Serveurs, String> nom;

    @FXML
    private TableColumn<Serveurs, String> numero;
 

      @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;

    
    @FXML
    private Button Close;


    /**
     * Initializes the controller class.
     */
  ObservableList<Serveurs> oblist = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
//       Connection con =ConnectionDB.getConnection();
//          st=ConnectionDB.openConnection().createStatement();
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
            ResultSet rs =con.createStatement().executeQuery("select * from serveur");
            while(rs.next()){
            oblist.add(new Serveurs(rs.getString("nom"),rs.getString("adresse"),rs.getString("num_mo"),rs.getString("gende")));
            }
            } catch (SQLException ex) {
            Logger.getLogger(Liste_ServeursController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        adress.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        numero.setCellValueFactory(new PropertyValueFactory<>("num_mo"));
        gende.setCellValueFactory(new PropertyValueFactory<>("gende"));
        
        table.setItems(oblist);

    }    
     
//    private void affich_client() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
//        }
//
//        try {
//            // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
//            // "root", "");
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
//            stmt = (Statement) con.createStatement();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
//        }
//
//        try {
//            String sql;
//            sql = "select *  from serveur ";
//            rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                
//             oblist.add(new Serveurs(rs.getString("nom"),rs.getString("adresse"),rs.getString("num_mo"),rs.getString("gende")));
//
//
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Unable to affich List for serveur " + e.getMessage());
//        }
//    }
//    String query = null;
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//  
//    // BusinessUser user = new BusinessUser()
//    ObservableList<BusinessUser> UserList = FXCollections.observableArrayList();
   @FXML
    void GoToHome(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

  
      
    
}
