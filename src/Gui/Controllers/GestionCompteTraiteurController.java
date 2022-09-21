/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Traiteur;
import Utils.ConnectionDB;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GestionCompteTraiteurController implements Initializable {
     private Parent root;
     private Stage stage;
     private Scene scene;

    final FileChooser fc = new FileChooser();
     @FXML
    private Button AddFiles;

    @FXML
    private Button Addcv;

    @FXML
    private TextField Adress;

    @FXML
    private Button Close;

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
    private TextField lastNameFirstName;

    @FXML
    private TextArea tacv;
    
     @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;
    
 
     Traiteur S =new Traiteur();

    /**
     * Initializes the controller class.
     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    }
    
     @Override
     public void initialize(URL url, ResourceBundle rb) {
    
    try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
        
        try {
            String sql;
            sql = "select *  from traiteur ";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                lastNameFirstName.setPromptText(rs.getString("nom_societe"));
                Adress.setPromptText(rs.getString("adresse"));
                Phone.setPromptText(rs.getString("num_mo"));
                email.setPromptText(rs.getString("id_ville"));
                cin.setPromptText(rs.getString("specialite"));
//                 S.setNom(rs.getString("nom"));
//                 S.setAdresse(rs.getString("adresse"));
//                 S.setNum_mo(rs.getString("num_mo"));
                
                System.out.println("ohhhhhhhhhhhhhhhhh");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to affich List for Client  " + e.getMessage());
        }
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

     @FXML
    void GoToHome(ActionEvent event) throws IOException {
     root = FXMLLoader.load(getClass().getResource("../Views/Home.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

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
    
    @FXML
    void edit(ActionEvent event) {
        //System.out.println("khalil offffffffff");
        //System.out.println(Nom.getText());

         con = ConnectionDB.openConnection();
        try {
            try (java.sql.PreparedStatement ps = con
                    .prepareStatement("UPDATE traiteur SET   adresse = ?, num_mo = ?," +
                            "cin = ?,email=? WHERE id = 1")) {

                ps.setString(1, Adress.getText());
                ps.setString(2, Phone.getText());
                ps.setString(3, cin.getText());
                ps.setString(4, email.getText());

                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    
    

    }}


