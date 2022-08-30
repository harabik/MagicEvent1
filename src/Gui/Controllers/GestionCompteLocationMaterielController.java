/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GestionCompteLocationMaterielController implements Initializable {


    final FileChooser fc = new FileChooser();
    @FXML
    private Button AddFiles;

    @FXML
    private Button Addcv;

    @FXML
    private TextField Adress;

    @FXML
    private Button Edit;

    @FXML
    private ListView<File> LvFiles;

    @FXML
    private TextField Phone;

    @FXML
    private TextField cin;

    @FXML
    private TextField email;
        @FXML
    private TextArea tacv;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleAddcv(ActionEvent event) {
        //setthe title
        fc.setTitle("My File Chooser");
        //fc.setInitialDirectory(new File (System.getProperty(user.home)));
        //Gets the extension filters used in the displayed file
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("ALL Files", "*.*"));
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.PDF"));
        File file = fc.showOpenDialog(null);
        if (file != null) {
            //returns the absolute pathame string of this abstract pathname
            tacv.appendText(file.getAbsolutePath() + "\n");
        } else {
            System.out.println(" file is invalid!");

        }
    }

    @FXML
    private void handleMultiFiles(ActionEvent event) {
        fc.setTitle("My File Chooser");
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().addAll(
          new FileChooser.ExtensionFilter("ALL Files", "*.*"),
          new FileChooser.ExtensionFilter("PDF Files", "*.PDF"),
          new FileChooser.ExtensionFilter("ALL Files", "*.txt"));
        List<File> files = fc.showOpenMultipleDialog(null);
        for (int i = 0; i < files.size(); i++) {
            if (files != null) {
//           LvFiles.getItems().add(files.get(i));
                LvFiles.getItems().add(files.get(i));
                
            } else {
                System.out.println(" file is invalid!");

            }
        }
    }

}
