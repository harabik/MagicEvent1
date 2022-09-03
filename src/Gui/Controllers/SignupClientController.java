/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.awt.Choice;
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
import javafx.scene.control.ChoiceBox;
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
public class SignupClientController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    private Statement stmt;
    
    
    @FXML
    private TextField Gende;

    @FXML
    private TextField LastName;
    @FXML
    private TextField FirstName;
    @FXML
    private TextField Email;
    @FXML
    private TextField Phone;
    @FXML
    private TextField UserName;
    @FXML
    private PasswordField Password;
     @FXML
    private TextField Adress;
    @FXML
    private Button Register;
    @FXML
    private Button BusinessUsers;
    @FXML
    private Button Reset;
     public void goToSignupBusinessUsers(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/SignupBusinessUsers.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
     
     
    
     //goToCreationEvent
     @FXML
    public void goToCreationEvent(ActionEvent event) {
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

        try {
            String sql;
            sql = "insert into client(`username`, `password`, `nom`, `prenom`, `image`, `num`, `email`, `gende`, `id_ville`, `id_region`, `adresse`) values ("
                     + "'" + UserName.getText() + "',"
                    + "'" + Password.getText() + "',"
                    + "'" + LastName.getText()  + "',"
                    
                    
                    
                    + "'" + FirstName.getText() + "',"
                       + "'" + "rien" + "',"
                   + "'" + Phone.getText() + "',"
                    + "'" + Email.getText() + "',"
                    + "'" + Gende.getText() + "',"
                    + "'" + "1" + "',"
                     + "'" + "1" + "',"
                    
                    + "'" + Adress.getText() 
                    
                    + "')";

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "record saved sucessfully ");
           root = FXMLLoader.load(getClass().getResource("../Views/login.fxml"));
           scene = new Scene(root);
           stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }
     
//     public void goToCreationEvent(ActionEvent event) throws IOException {
//        
//        root = FXMLLoader.load(getClass().getResource("../Views/CreationEvent.fxml"));
//        scene = new Scene(root);
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//
//    }
     
       public void goTologin(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/login.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
