/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SignupBusinessUsersController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    private Statement stmt;
    
     @FXML
    private TextField Adress;

    @FXML
    private TextField Email;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Login;

    @FXML
    private PasswordField Password;

    @FXML
    private TextField Phone;

    @FXML
    private Button Register;

    @FXML
    private Button Reset;

    @FXML
    private TextField Role;

    @FXML
    private Label SignupBusinessUsers;

    @FXML
    private TextField cin;


      public void goToSigupclient(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/Sigupclient.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
//      //goToGestionCompte
//       public void goToGestionCompte(ActionEvent event) throws IOException {
//        
//        root = FXMLLoader.load(getClass().getResource("../Views/GestionCompteAnimateur.fxml"));
//        scene = new Scene(root);
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//
//    }
@FXML
     void goToGestionCompte(ActionEvent event) throws IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) connection.createStatement();
            System.out.println("conect");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
//INSERT INTO `bus_user`(`id`, `bus_user_id`, `login`, `password`, `role`, `nom`, `prenom`, `email`, `num`, `cin`, `adresse`, `is_active`, `created_at`, `verif_code`)
        try {
                        System.out.println("bienvenu");

             
          String sql = "insert into bus_user(login,bus_user_id,nom , prenom , role,num ,email , cin,password ,is_active) values ("
                    + "'" + Login.getText() + "',"
                    + "'" + "chiheb0123456" + "',"
                    + "'" + LastName.getText() + "',"
                    + "'" + FirstName.getText() + "',"
                    + "'" + Role.getText() + "',"
                    + "'" + Phone.getText() + "',"
                    + "'" + Email.getText() + "',"
                    + "'" + cin.getText() + "',"
                    + "'" + Password.getText() + "',"
                    + "'" + 1
                    + "')";
          
            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "record saved sucessfully ");
             root = FXMLLoader.load(getClass().getResource("../Views/LoginBusinessUser.fxml"));
             scene = new Scene(root);
             stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
             stage.setScene(scene);
             stage.show();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert  11111 record " + e.getMessage());
        }
             

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
