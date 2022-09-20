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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Liste_LocataireController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private Button btn_home_lo;
    @FXML
    private Button btn_order_lo;
    @FXML
    private Button btn_menu_lo;
    @FXML
    private Button btn_package_lo;
    @FXML
    private Button btn_setting_lo;
    @FXML
    private Button bnt_signout_lo;
    @FXML
    private Pane pane_home_an;
    @FXML
    private Pane pane_order_an;
    @FXML
    private Pane pane_menu_an;
    @FXML
    private Pane pane_overview;
    @FXML
    private TextField recherche_lo;
    @FXML
    private Label total_lo;
    @FXML
    private Label nom_lo;
    @FXML
    private Label gender_lo;
    @FXML
    private Label ville_lo;
    @FXML
    private Label num_tlf_lo;
    @FXML
    private Label book_lo;
    @FXML
    private VBox champ_liste_lo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleClicks(ActionEvent event) {
    }

    @FXML
    private void GoTOhome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
