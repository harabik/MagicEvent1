/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Client;
import Services.ControlLogin;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LoginController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private Button BUsers;

    @FXML
    private Hyperlink Signup;

    @FXML
    private Button connecte;

    @FXML
    private Label loginmessage;

    @FXML
    private PasswordField password;

    @FXML
    private Button reset;

    @FXML
    private TextField username;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    Client user = new Client();
    ControlLogin pc= new ControlLogin();
    @FXML
    void goTocreationevent(ActionEvent event) throws IOException{
        
        user.setUsername(username.getText());
        user.setPassword(password.getText());
        // Contrôle de saisie username
        if ((username.getText().length()==0) ){

            username.setStyle("-fx-border-color: red ; -fx-border-width: 2px;");
            new animatefx.animation.Shake(username).play();
            
        }else username.setStyle(null);
        // Contrôle de saisie Password 
                
        if ((password.getText().length()==0) ){

            password.setStyle("-fx-border-color: red ; -fx-border-width: 2px;");
            new animatefx.animation.Shake(password).play();
            
        }else password.setStyle(null);
        
       
           if (pc.isLogin(user)) {
               Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();                  
                    stage.close();
                   Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/CreationEvent.fxml"));      
                   Scene scene = new Scene(root);      
                   stage.setScene(scene);
                   stage.show();
                   
                   
                   
                   
                   
                   
           }
           else
               loginmessage.setText("Invalid Login .Please try again.");
    }
//LoginBusinessUser
      @FXML
    void goToBUsers(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/LoginBusinessUser.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
     
    @FXML
    void goToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

     @FXML
    void goToSigupclient(ActionEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("../Views/Sigupclient.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    
}
