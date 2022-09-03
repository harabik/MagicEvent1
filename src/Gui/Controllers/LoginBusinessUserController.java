package Gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Entites.BusinessUser;
import Entites.Client;
import Services.ControlLogin;
import Services.ControlLoginBusinessUser;

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

public class LoginBusinessUserController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField Login;

    @FXML
    private Button LoginbusinesUser;

    @FXML
    private Label loginmsg;

    @FXML
    private PasswordField password;

    @FXML
    private Button reset;

    @FXML
    void goToHome(ActionEvent event) {

        try {
            root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    BusinessUser user = new BusinessUser();
    ControlLoginBusinessUser bu = new ControlLoginBusinessUser();

    @FXML
    void goToProfile(ActionEvent event) throws IOException {

        user.setLogin(Login.getText());
        user.setPassword(password.getText());
        user.setRole(bu.isRole(user));
        String x = bu.isRole(user);
        System.out.println(user.getRole());

        if (bu.isLogin(user)) {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();

            // compte Traiteur

            // compte Traiteur

            if (x.equals("1")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionCompteTraiteur.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                // compte location materiel
            } else if (x.equals("2")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionCompteLocationMateriel.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                // compte Espace
            } else if (x.equals("3")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionCompteEspace.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                // compte serveur

            } else if (x.equals("4")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionCompteS.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                // compte photograohe

            } else if (x.equals("5")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionComptephotographe.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

                // compte animateur

                // compte animateur

            } else if (x.equals("6")) {
                System.out.println(user.getRole());

                Parent root = FXMLLoader.load(getClass().getResource("/Gui/Views/GestionCompteAnimateur.fxml"));

                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }

        } else
            loginmsg.setText("Invalid Login .Please try again.");
    }
}