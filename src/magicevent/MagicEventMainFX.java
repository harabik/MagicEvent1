/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package magicevent;

<<<<<<< HEAD

import java.io.IOException;
=======
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class MagicEventMainFX extends Application {
<<<<<<< HEAD
// main 
    @Override
    public void start(Stage primaryStage) throws IOException {

//        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Photographeur.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Serveurs.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_traiteur.fxml"));

//
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteLocationMateriel.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteEspace.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionComptephotographe.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteAnimateur.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteTraiteur.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteS.fxml"));
        // Parent root =
//         Parent root =FXMLLoader.load(getClass().getResource("../Gui/Views/Sigupclient.fxml"));
//         Parent root =
//         FXMLLoader.load(getClass().getResource("../Gui/Views/login.fxml"));
        //Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/SignupBusinessUsers.fxml"));
=======

        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/Home.fxml"));

        @Override
        public void start(Stage primaryStage) throws IOException {

                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/Home.fxml"));

<<<<<<< HEAD
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteLocationMateriel.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteEspace.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionComptephotographe.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteAnimateur.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteTraiteur.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteS.fxml"));
        // Parent root =
//         Parent root =FXMLLoader.load(getClass().getResource("../Gui/Views/Sigupclient.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/login.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Traiteur.fxml"));
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/CreationEvent.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/Validevent.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("MagicEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
=======
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteLocationMateriel.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteEspace.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionComptephotographe.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteAnimateur.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteTraiteur.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteS.fxml"));
                // Parent root =
                // Parent root
                // =FXMLLoader.load(getClass().getResource("../Gui/Views/Sigupclient.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/login.fxml"));
                Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/admin.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/CreationEvent.fxml"));
                // Parent root =
                // FXMLLoader.load(getClass().getResource("../Gui/Views/Validevent.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setTitle("MagicEvent");
                primaryStage.setScene(scene);
                primaryStage.show();
>>>>>>> b381806be604a864b56032e724f45c9fc8f15eba

        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                launch(args);
        }

}