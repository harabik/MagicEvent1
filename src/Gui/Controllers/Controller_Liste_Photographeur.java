package Gui.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Controller_Liste_Photographeur {
    @FXML
    private Button bnt_signout_ph;

    @FXML
    private Label book_ph;

    @FXML
    private Button btn_home_ph;

    @FXML
    private Button btn_menu_ph;

    @FXML
    private Button btn_order_ph;

    @FXML
    private Button btn_package_ph;

    @FXML
    private Button btn_setting_ph;

    @FXML
    private VBox champ_liste_ph;

    @FXML
    private Label gender_ph;

    @FXML
    private Label nom_ph;

    @FXML
    private Label num_tlf_ph;

    @FXML
    private Pane pane_home_ph;

    @FXML
    private Pane pane_menu_ph;

    @FXML
    private Pane pane_order_ph;

    @FXML
    private Pane pane_overview;

    @FXML
    private TextField recherche_ph;

    @FXML
    private Label total_ph;

    @FXML
    private Label ville_ph;
}
