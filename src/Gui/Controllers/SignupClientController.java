/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SignupClientController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField LastName;
    @FXML
    private TextField FirstName;
    @FXML
    private TextField Email;
    @FXML
    private TextField Phone;
    @FXML
    private TextField Login;
    @FXML
    private PasswordField Password;
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
     
     public void goToCreationEvent(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/CreationEvent.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
     
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
