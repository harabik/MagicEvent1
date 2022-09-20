/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Serveurs;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GestionCompteS implements Initializable {
     private Parent root;
     private Stage stage;
     private Scene scene;

    final FileChooser fc = new FileChooser();
     @FXML
    private Button AddFiles;

    @FXML
    private Button Addcv;
     @FXML
    private TextField Nom;

    @FXML
    private TextField Num_mo;

    @FXML
    private TextField Adresse;
       

    @FXML
    private Button Close;

    @FXML
    private Button Edit;

    @FXML
    private ListView<File> LvFiles;


    @FXML
    private TextField cin;

    @FXML
<<<<<<< HEAD
    private TextArea tacv;
        @FXML
=======
    private TextField email;

    @FXML
    private TextField Nom;

    @FXML
    private TextArea tacv;
    
     @FXML
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;
    
 
     Serveurs S =new Serveurs();
<<<<<<< HEAD
//     ObservableList<Serveurs> Profil = FXCollections.observableArrayList();
=======
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737

    /**
     * Initializes the controller class.
     */
<<<<<<< HEAD
    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    }
//    
//     // 
    
   
   
    public void initialize(URL url, ResourceBundle rb) {
=======
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    }
     
     public void initialize(URL url, ResourceBundle rb) {
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
        // TODO
        
//       Connection con =ConnectionDB.getConnection();
//          st=ConnectionDB.openConnection().createStatement();
try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }
<<<<<<< HEAD
=======

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
        
        try {
            String sql;
            sql = "select *  from serveur ";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Nom.setPromptText(rs.getString("nom"));
                Adress.setPromptText(rs.getString("adresse"));
                Phone .setPromptText(rs.getString("num_mo"));
                cin.setPromptText(rs.getString("cin"));
//                 S.setNom(rs.getString("nom"));
//                 S.setAdresse(rs.getString("adresse"));
//                 S.setNum_mo(rs.getString("num_mo"));
                
                System.out.println("ohhhhhhhhhhhhhhhhh");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to affich List for Client  " + e.getMessage());
        }
     
     
     
     
     
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
        
        try {
            String sql;
            sql = "select *  from serveur ";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Nom.setPromptText(rs.getString("nom"));
                Adresse.setPromptText(rs.getString("adresse"));
                Num_mo.setPromptText(rs.getString("num_mo"));
                cin.setPromptText(rs.getString("cin"));
//                 S.setNom(rs.getString("nom"));
//                 S.setAdresse(rs.getString("adresse"));
//                 S.setNum_mo(rs.getString("num_mo"));
                
                System.out.println("ohhhhhhhhhhhhhhhhh");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to affich List for Client  " + e.getMessage());
        }
    
        
        
        
        
        
//        try {
//            ResultSet rs =con.createStatement().executeQuery("select * from serveur");
//            while(rs.next()){
////            S.add(new Serveurs(rs.getString("nom"),rs.getString("adresse"),rs.getString("num_mo"),rs.getString("gende")));
//             S.setNom(rs.getString("chiheb"));
//             S.setAdresse(rs.getString("7 rue 42216 ghdir golla hrairia tunis"));
//             S.setNum_mo(rs.getString("99088487"));
//             
////                S.setNom("ali");
//          
//             
//            }
//            } catch (SQLException ex) {
//            Logger.getLogger(Liste_ServeursController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
        
        
       
             

        
       
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
}
    
    
    
    
    
    
    
    
    

    
    


