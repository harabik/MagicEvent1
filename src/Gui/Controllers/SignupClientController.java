/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Gui.Controllers;

import java.awt.Choice;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SignupClientController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    private Statement stmt;
    
     
    @FXML
    private TextField Adress;

    @FXML
    private Button BusinessUsers;

    @FXML
    private TextField Email;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField Gende;

    @FXML
    private TextField LastName;

    @FXML
    private PasswordField Password;

    @FXML
    private TextField Phone;

    @FXML
    private Button Register;

    @FXML
    private Button Reset;

    @FXML
    private TextField UserName;
     public void goToSignupBusinessUsers(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/SignupBusinessUsers.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
     
     
    
     //goToCreationEvent
     @FXML
    public void goToCreationEvent(ActionEvent event) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) connection.createStatement();
            System.out.println("conect");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
    
        try {
            String sql;
            sql = "insert into client(`username`, `password`, `nom`, `prenom`, `image`, `num`, `email`, `gende`, `id_ville`, `id_region`, `adresse`) values ("
                     + "'" + UserName.getText() + "',"
                    + "'" + Password.getText() + "',"
                    + "'" + LastName.getText()  + "',"
                    
                    + "'" + FirstName.getText() + "',"
                       + "'" + "rien" + "',"
                   + "'" + Phone.getText() + "',"
                    + "'" + Email.getText() + "',"
                    + "'" + Gende.getText() + "',"
                    + "'" + "1" + "',"
                     + "'" + "1" + "',"
                    
                    + "'" + Adress.getText() 
                    
                    + "')";
            // Contrôle de saisie username
//        if ((UserName.getText().length()==0) ){
//
//            UserName.setStyle("-fx-border-color: red ; -fx-border-width: 2px;");
//            new animatefx.animation.Shake(UserName).play();
//            
//        }else UserName.setStyle(null);
//        // Contrôle de saisie Password 
//                
//        if ((password.getText().length()==0) ){
//
//            password.setStyle("-fx-border-color: red ; -fx-border-width: 2px;");
//            new animatefx.animation.Shake(password).play();
//            
//        }else password.setStyle(null);
//         
            sendmail();        
            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "record saved sucessfully ");
            
           root = FXMLLoader.load(getClass().getResource("../Views/login.fxml"));
           scene = new Scene(root);
           stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }
     
//     public void goToCreationEvent(ActionEvent event) throws IOException {
//        
//        root = FXMLLoader.load(getClass().getResource("../Views/CreationEvent.fxml"));
//        scene = new Scene(root);
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//
//    }
     
       public void goTologin(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../Views/login.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    private void sendmail() {
        
        String ToEmail = "abdelkarim.harrabi@esprit.tn";
        String FromEmail = "chiheb.menjli@esprit.tn";
        String FromEmailPassword = "E11655439";
        String Subjects = "test";
        String msg = "  bienvenu a Magic event ";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
            message.setText(msg);

            Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




    
    

