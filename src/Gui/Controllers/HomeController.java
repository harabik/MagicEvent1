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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HomeController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private Button buttonTraiteur;
    @FXML
    private ImageView imgtrateur;
    @FXML
    private Button buttonEspace;
    @FXML
    private ImageView imgespace;
    @FXML
    private Button buttonAnimateur;
    @FXML
    private ImageView imageanimateur;
    @FXML
    private Button buttonLocataire;
    @FXML
    private ImageView imagelocataire;
    @FXML
    private Button buttonPhotographe;
    @FXML
    private ImageView imagephotographe;
    @FXML
    private Button buttonServeurs;
    @FXML
    private ImageView imagesServeurs;
    @FXML
    private Button buttonLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToTraiteur(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("../Views/Liste_traiteur.fxml"));
       scene = new Scene(root);
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       stage.setScene(scene);
       stage.show(); 
    }

    @FXML
    private void GoToEspace(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Liste_Espace.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToAnimateur(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Liste_Animateur.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToLocataire(ActionEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("../Views/Liste_Locataire.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToPhotographe(ActionEvent event) throws IOException {
           root = FXMLLoader.load(getClass().getResource("../Views/Liste_Photographeur.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void GoToServeurs(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Liste_Serveurs.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void gotoLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/login.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
        
}
