package Gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller_Liste_Traiteur implements Initializable {

    @FXML
    private Label address_tr;

    @FXML
    private Label booking_tr;

    @FXML
    private Button btn_Customers_tr;

    @FXML
    private Button btn_Menus_tr;

    @FXML
    private Button btn_Orders_tr;

    @FXML
    private Button btn_Packages_tr;

    @FXML
    private Button btn_Settings_tr;

    @FXML
    private Button btn_Signout_tr;

    @FXML
    private Button btn_home_tr;

    @FXML
    private VBox champ_item_tr;

    @FXML
    private Label city_tr;

    @FXML
    private ImageView logo_tr;

    @FXML
    private Label nom_interface;

    @FXML
    private Label nom_liste_tr;

    @FXML
    private Label nom_societe_tr;

    @FXML
    private Label num_tlf_tr;

    @FXML
    private Pane pane_Customer_tr;

    @FXML
    private Pane pane_Menus_tr;

    @FXML
    private Pane pane_Orders_tr;

    @FXML
    private Pane pane_Overview_tr;

    @FXML
    private TextField recherche_tr;

    @FXML
    private HBox tab_col_tr;

    @FXML
    private Label total2_tr;

    @FXML
    private Label total_tr;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Liste_Traiteur_Item.fxml")));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });
                champ_item_tr.getChildren().add(nodes[i]);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn_Customers_tr) {
            pane_Customer_tr.setStyle("-fx-background-color : #1620A1");
            pane_Customer_tr.toFront();
        }
        if (actionEvent.getSource() == btn_Menus_tr) {
            pane_Menus_tr.setStyle("-fx-background-color : #53639F");
            pane_Menus_tr.toFront();
        }
        if (actionEvent.getSource() == btn_home_tr) {
            pane_Overview_tr.setStyle("-fx-background-color : #02030A");
            pane_Overview_tr.toFront();
        }
        if(actionEvent.getSource()==btn_Orders_tr)
        {
            pane_Orders_tr.setStyle("-fx-background-color : #464F67");
            pane_Orders_tr.toFront();
        }
    }
}
