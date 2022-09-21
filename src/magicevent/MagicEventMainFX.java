/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package magicevent;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class MagicEventMainFX extends Application {
// main 
    @Override
    public void start(Stage primaryStage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Espace.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Locataire.fxml"));
//          Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Photographeur.fxml"));
//       Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Serveurs.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_traiteur.fxml"));
     //    Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/Liste_Animateur.fxml"));

//
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteLocationMateriel.fxml"));
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteEspace.fxml"));
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionComptephotographe.fxml"));
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteAnimateur.fxml"));
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteTraiteur.fxml"));
//         Parent root = FXMLLoader.load(getClass().getResource("../Gui/Views/GestionCompteS.fxml"));
        // Parent root =
         Parent root =FXMLLoader.load(getClass().getResource("../Gui/Views/Sigupclient.fxml"));
//           Parent root =  FXMLLoader.load(getClass().getResource("../Gui/Views/login.fxml"));
        //Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/SignupBusinessUsers.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/CreationEvent.fxml"));
        // Parent root =
        // FXMLLoader.load(getClass().getResource("../Gui/Views/Validevent.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("MagicEvent");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
