/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import Entites.Photographe;
import Utils.ConnectionDB;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GestionComptephotographeController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
     String s;

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
    private Button Close;

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
        @FXML
    private TextField nom;
        
         @FXML
    private Connection con;

    @FXML
    private Statement stmt;
     @FXML
    private Statement st;

    @FXML
    private ResultSet rs;
    
 
     Photographe S =new Photographe();

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
            sql = "select *  from photographe ";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                nom.setPromptText(rs.getString("nom"));
                Adress.setPromptText(rs.getString("adresse"));
                Phone.setPromptText(rs.getString("num"));
                email.setPromptText(rs.getString("mail"));
                cin.setPromptText(rs.getString("nbr_equipe"));
//                 S.setNom(rs.getString("nom"));
//                 S.setAdresse(rs.getString("adresse"));
//                 S.setNum_mo(rs.getString("num_mo"));
                
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to affich List for Client  " + e.getMessage());
        }
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
        
        
// @FXML
//    void Modifer(ActionEvent event) {
//        
//        
//         try {
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
//            stmt = (Statement) con.createStatement();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
//        }
//        
//        try {
//            String sql;
////            sql = "select *  from photographe ";
//        
//         try{
//              System.out.println("khalil");
//               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
////               stmt = (Statement) con.createStatement();
//               PreparedStatement stmt = con.prepareStatement("UPDATE  photographe SET(nom,num,mail,adresse,nbr_equipe) values(?,?,?,?,?)");
//               InputStream is = new FileInputStream(new File(s));
////                nom.setPromptText(rs.getString("nom"));
////                Adress.setPromptText(rs.getString("adresse"));
////                Phone.setPromptText(rs.getString("num"));
////                email.setPromptText(rs.getString("mail"));
////                cin.setPromptText(rs.getString("nbr_equipe"));
//               
//               System.out.println("8assobii");
//               stmt.setString(3,nom.getText());
//               stmt.setString(6, Phone.getText());
//               stmt.setString(7, email.getText());
//               stmt.setString(11,  Adress.getText());
//               stmt.setString(14, cin.getText());
//              
////               stmt.setBlob(5,is);
//               stmt.executeUpdate();
//               
//               JOptionPane.showMessageDialog(null, "Data Inserted");
//           }catch(Exception ex){
//               ex.printStackTrace();
//           }
       
    @FXML
    void Edit(ActionEvent event) {

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
    void edit(ActionEvent event) {
        //System.out.println("khalil offffffffff");
        //System.out.println(Nom.getText());

         con = ConnectionDB.openConnection();
        try {
            try (java.sql.PreparedStatement ps = con
                    .prepareStatement("UPDATE photographe SET   adresse = ?, num_mo = ?," +
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
    
    
    
    
//     @FXML
//    void Edit(ActionEvent event) throws SQLException {
//        
//        
//        
//         try {
//             
//         
//            String  sql = "  UPDATE photographe  SET nom=?, adresse=?, num=?, ";
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
//            stmt = (Statement) con.prepareStatement(sql);
//             rs = stmt.executeQuery(sql);
////           st = con.prepareStatement(sql);
////             stmt.setString(nom.getText());
////             stmt.setString( Adress.getText());
////             stmt.setString( Phone.getText());  
////             stmt.setString( cin.getText());
////             stmt.setString( email.getText());
////                nom.setText(rs.get);
////                Adress.getPromptText(rs.setString("adresse"));
////                Phone.getPromptText(rs.setString("num"));
////                email.getPromptText(rs.setString("mail"));
////                cin.getPromptText(rs.setString("nbr_equipe"));
//             
////             stmt.executeUpdate();
//////             JOptionPane.showMessageDialog(null, "update succc");
//////         }
//////                 catch{  (Exception e)
////                 
////            System.err.println("Got an exception! ");
////            System.err.println(e.getMessage());
////}
////          
//          
//          
//          
//          
//          
//          
////          String sql;
////             sql = "update photographe set nom,adresse,num,mail,nbr_equipe  = ?,?,?,?,?,?";
////            rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//      
//         rs.setString(nom.SetText());
            
            
//            }
      
      
     
//      preparedStmt.setInt   (1, 6000);
//      preparedStmt.setString(2, "Fred");
//
//      // execute the java preparedstatement
//      preparedStmt.executeUpdate();
      
//      con.close();
//    }
//    catch (Exception e)
//    {
//      System.err.println("Got an exception! ");
//      System.err.println(e.getMessage());
      
       

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


        