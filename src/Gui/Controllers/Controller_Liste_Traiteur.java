package Gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Utils.ConnectionDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author oXCToo
 */

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author PHILSERVER
 */
public class Controller_liste_Traiteur implements Initializable {

    @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;

    @FXML
    private TextField cbGender;

    @FXML
    private TextField tfLocation;

    @FXML
    private TextField tfFirstname;

    @FXML
    private TextField tfSearch;

    @FXML
    private Button update;

    @FXML
    private Button insert;

    @FXML
    private Button delete;

    @FXML
    private TextField tfSecondname;

    @FXML
    void search(ActionEvent event) {

        if (tfSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Enter firstname please !!!");
        } else {
            if (checkName()) {
                search();

            } else {
                JOptionPane.showMessageDialog(null, "firstname does not exist");
            }

        }

    }

    @FXML
    void deleteRecord(ActionEvent event) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "delete from client where username ='" + tfSearch.getText() + "'";
            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record deleted sucessfully");
            tfSearch.setText(null);
            tfFirstname.setText(null);
            tfSecondname.setText(null);
            cbGender.setText(null);
            tfLocation.setText(null);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to delete record " + e.getMessage());
        }
    }

    @FXML
    void updateRecord(ActionEvent event) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "update client set prenom='" + tfSecondname.getText() + "',"
                    + "adresse='" + tfLocation.getText() + "',"
                    + "gende='" + cbGender.getText() + "'"
                    + " where username='" + tfSearch.getText() + "'";

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record updated sucessfully");
        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Unable to update record " + f.getMessage());
        }

    }

    @FXML
    void insertRecord(ActionEvent event) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "insert into client(username,  password, prenom ,  nom,  num,  adresse,  email, gende , id_ville,  id_region) values ("
                    + "'" + tfFirstname.getText() + "',"
                    + "'" + "123456" + "',"
                    + "'" + tfSecondname.getText() + "',"
                    + "'" + tfFirstname.getText() + "',"
                    + "'" + "12345678" + "',"
                    + "'" + tfLocation.getText() + "',"
                    + "'" + "chiheb@gmail.com" + "',"
                    + "'" + cbGender.getText() + "',"
                    + "'" + 1 + "',"
                    + "'" + 1
                    + "')";

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "record saved sucessfully ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }

    private boolean checkName() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }
        try {
            String sql;
            sql = "select * from client where username ='" + tfSearch.getText() + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "unable to retrieve record" + e.getMessage());
        }
        return false;
    }

    private void search() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
            // "root", "");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "select nom , prenom , gende ,adresse  from client where username='" + tfSearch.getText() + "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tfFirstname.setText(rs.getString("prenom"));
                tfSecondname.setText(rs.getString("nom"));
                cbGender.setText(rs.getString("gende"));
                tfLocation.setText(rs.getString("adresse"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to retrieve record " + e.getMessage());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javafx.fxml.Initializable#initialize(java.net.URL,
     * java.util.ResourceBundle)
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
