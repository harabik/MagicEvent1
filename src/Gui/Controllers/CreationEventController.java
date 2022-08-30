/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class CreationEventController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private DatePicker myDatePicker;
    @FXML
    private RadioButton rbutton1;
    @FXML
    private Button envoyer;
    @FXML
    private Button reset;
    @FXML
    private ImageView image;
    @FXML
    private RadioButton rbutton2;

    @FXML
    private RadioButton rbutton3;

    @FXML
    private RadioButton rbutton5;

    @FXML
    private Label label;
    @FXML
    private Label myLabel;
    @FXML
    private Label myLabel10;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[] Events = {"Marriage", "Anniversairs", "Soirées privées", "Séminaires", "Conférences", "Lancement de produit", "Net working", "Arbre de Noël", "Formations", "Incentive", "Soirées de gala", "Cocktails d'entreprises", "Team Building", "Soirées d'entreprise", "Inaugurations", "Défilés de mode", "Enterrement", "Salons"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(Events);
        myChoiceBox.setOnAction(this::getEvents);
        Choice.getItems().addAll(Espaces);
        Choice.setOnAction(this::getEspaces);
    }

    public void getEvents(ActionEvent event) {
        String myEvents = myChoiceBox.getValue();
        myLabel.setText(myEvents);

    }
    @FXML
    private ChoiceBox<String> Choice;
    private String[] Espaces = {"Salle de Fête", "Maisons d'hôtes", "Salle d'hôtel", "Espace café"};

    public void getEspaces(ActionEvent event) {
        String myEspaces = Choice.getValue();
        myLabel10.setText(myEspaces);

    }

    public void getDate(ActionEvent event) {
     LocalDate myDate =  myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-DD-YYY"));
    }
    //goToValidevent
     public void goToValidevent(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/Validevent.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    
  
     public void goToHom(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}
