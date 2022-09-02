package Gui.Controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.jws.soap.SOAPBinding.Use;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Entites.BusinessUser;
import Entites.Client;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import javafx.scene.control.TextField;

public class Controller_admin implements Initializable {
    @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;

    @FXML
    private TableView<Client> ClientTable;

    @FXML
    private TableView<BusinessUser> UserTable;

    @FXML
    private TextField active_client;

    @FXML
    private TextField active_user;

    @FXML
    private TextField cin_user;

    @FXML
    private Button delete_client;

    @FXML
    private Button delete_client1;

    @FXML
    private Button delete_client11;

    @FXML
    private Button delete_user;

    @FXML
    private TableColumn<BusinessUser, String> email;

    @FXML
    private TextField email_client;

    @FXML
    private TextField email_user;

    @FXML
    private TextField firstname_client;

    @FXML
    private TextField firstname_user;

    @FXML
    private TextField gende_client;

    @FXML
    private TableColumn<BusinessUser, String> id;

    @FXML
    private TextField id_user;

    @FXML
    private TableColumn<Client, String> idc;

    @FXML
    private Button insert_client;

    @FXML
    private Button insert_user;

    @FXML
    private TextField lastname_client;

    @FXML
    private TextField lastname_user;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatus1;

    @FXML
    private TableColumn<BusinessUser, String> login;

    @FXML
    private TextField login_client;

    @FXML
    private TextField login_user;

    @FXML
    private TableColumn<Client, String> loginc;

    @FXML
    private TableColumn<BusinessUser, String> nom;

    @FXML
    private TableColumn<Client, String> nomc;

    @FXML
    private TableColumn<BusinessUser, String> num;

    @FXML
    private TextField num_client;

    @FXML
    private TextField num_user;

    @FXML
    private TableColumn<Client, String> numc;

    @FXML
    private TableColumn<Client, String> emailc;

    @FXML
    private TextField password1_client;

    @FXML
    private TextField password1_user;

    @FXML
    private TextField password_client;

    @FXML
    private TextField password_user;

    @FXML
    private TableColumn<BusinessUser, String> prenom;

    @FXML
    private TableColumn<Client, String> prenomc;

    @FXML
    private TextField region_client;

    @FXML
    private TextField role_user;

    @FXML
    private TableColumn<BusinessUser, String> role;

    @FXML
    private Button print;

    @FXML
    private Button search_client;

    @FXML
    private Button search_user;

    @FXML
    private Button update_client;

    @FXML
    private Button update_user;

    @FXML
    private TextField ville_client;

    /***************** */

    // BusinessUser user = new BusinessUser();

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* delete_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    @FXML
    void delete_user(ActionEvent event) {
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
            sql = "delete from bus_user where login ='" + login_user.getText() + "'";
            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record deleted sucessfully");
            login_user.setText(null);
            id_user.setText(null);
            firstname_user.setText(null);
            lastname_user.setText(null);
            role_user.setText(null);
            num_user.setText(null);
            email_user.setText(null);
            cin_user.setText(null);
            password_user.setText(null);
            password1_user.setText(null);
            active_user.setText(null);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to delete record " + e.getMessage());
        }
    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* delete_client *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    @FXML
    void delete_client(ActionEvent event) {
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
            sql = "delete from client where username ='" + login_client.getText() + "'";
            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record deleted sucessfully");
            login_client.setText(null);
            firstname_client.setText(null);
            lastname_client.setText(null);
            gende_client.setText(null);
            num_client.setText(null);
            email_client.setText(null);
            ville_client.setText(null);
            region_client.setText(null);
            password_client.setText(null);
            password1_client.setText(null);
            active_client.setText(null);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to delete record " + e.getMessage());
        }
    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* insert_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/
    @FXML
    void insert_user(ActionEvent event) {
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
            sql = "select * from bus_user where login ='" + login_user.getText() + "'";
            rs = stmt.executeQuery(sql);
            if (!(rs.next())) {
                try {

                    String sql1;
                    sql1 = "insert into bus_user(login,bus_user_id,nom , prenom , role,num ,email , cin,password ,is_active) values ("
                            + "'" + login_user.getText() + "',"
                            + "'" + id_user.getText() + "',"
                            + "'" + firstname_user.getText() + "',"
                            + "'" + lastname_user.getText() + "',"
                            + "'" + role_user.getText() + "',"
                            + "'" + num_user.getText() + "',"
                            + "'" + email_user.getText() + "',"
                            + "'" + cin_user.getText() + "',"
                            + "'" + password_user.getText() + "',"
                            + "'" + active_user.getText()
                            + "')";

                    int result = stmt.executeUpdate(sql1);

                    JOptionPane.showMessageDialog(null, "user saved sucessfully 1 ");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to insert 1 user " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "user deja ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "unable to retrieve user " + e.getMessage());
        }

    }

    /*
     * @FXML
     * void insert_user(ActionEvent event) {
     * try {
     * Class.forName("com.mysql.jdbc.Driver");
     * } catch (ClassNotFoundException e) {
     * JOptionPane.showMessageDialog(null, "Unable to register class 2 " +
     * e.getMessage());
     * }
     * 
     * try {
     * con = (Connection)
     * DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root",
     * "");
     * stmt = (Statement) con.createStatement();
     * } catch (SQLException e) {
     * JOptionPane.showMessageDialog(null, "Unable to connect to database 2 " +
     * e.getMessage());
     * }
     * 
     * try {
     * 
     * String sql;
     * sql =
     * "insert into bus_user(login,bus_user_id,nom , prenom , role,num ,email , cin,password ,is_active) values ("
     * + "'" + login_user.getText() + "',"
     * + "'" + id_user.getText() + "',"
     * + "'" + firstname_user.getText() + "',"
     * + "'" + lastname_user.getText() + "',"
     * + "'" + role_user.getText() + "',"
     * + "'" + num_user.getText() + "',"
     * + "'" + email_user.getText() + "',"
     * + "'" + cin_user.getText() + "',"
     * + "'" + password_user.getText() + "',"
     * + "'" + active_user.getText()
     * + "')";
     * 
     * int result = stmt.executeUpdate(sql);
     * 
     * JOptionPane.showMessageDialog(null, "user saved sucessfully ");
     * 
     * } catch (Exception e) {
     * JOptionPane.showMessageDialog(null, "Unable to insert 1 user " +
     * e.getMessage());
     * }
     * // insert_role(login_user.getText(), role_user.getText());
     * 
     * }
     */
    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* verif compte *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* insert_role *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    private void insert_role(String Login, String role) {
        System.out.println(Login + " " + role);

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class 1 " + e.getMessage());
        }

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database 2 " + e.getMessage());
        }
        int x = 0;
        try {
            System.out.println("bienvenu");

            String sql, sql1;

            sql1 = "select * from bus_user where login='" + Login + "'";
            rs = stmt.executeQuery(sql1);
            System.out.println(sql1);

            while (rs.next()) {
                String y = (rs.getString("id "));
                x = Integer.parseInt(y);
                System.out.println(x);
            }

            try {
                System.out.println("bienvenu 2 ");
                sql = "insert into bus_user_role(role_id ,user_role_id) values ("
                        + "'" + role_user.getText() + "',"
                        + "'" + x
                        + "')";
                System.out.println(x);
                int result = stmt.executeUpdate(sql);
                System.out.println("ok ");
                JOptionPane.showMessageDialog(null, "role saved sucessfully 1 ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to insert role 5  " + e.getMessage());
            }

            JOptionPane.showMessageDialog(null, "role saved sucessfully ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert role select  " + e.getMessage());
        }

    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* insert_client *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    @FXML
    void insert_client(ActionEvent event) {
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
            sql = "select * from client where username ='" + login_client.getText() + "'";
            rs = stmt.executeQuery(sql);
            if (!(rs.next())) {

                try {
                    String sql1;
                    sql1 = "insert into client(username,nom , prenom , gende,num ,email , id_ville,id_region,password ,is_active) values ("
                            + "'" + login_client.getText() + "',"
                            + "'" + lastname_client.getText() + "',"
                            + "'" + firstname_client.getText() + "',"
                            + "'" + gende_client.getText() + "',"
                            + "'" + num_client.getText() + "',"
                            + "'" + email_client.getText() + "',"
                            + "'" + ville_client.getText() + "',"
                            + "'" + region_client.getText() + "',"
                            + "'" + password_client.getText() + "',"
                            + "'" + active_client.getText()
                            + "')";

                    int result = stmt.executeUpdate(sql1);
                    JOptionPane.showMessageDialog(null, "Client saved sucessfully ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "client deja ");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* search_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    @FXML
    void search_user(ActionEvent event) {
        if (login_user.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Enter login please !!!");
        } else {
            if (checkName_user()) {
                search_user();

            } else {
                JOptionPane.showMessageDialog(null, "login does not exist");
            }

        }

    }

    @FXML
    void search_client(ActionEvent event) {
        if (login_client.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Enter login please !!!");
        } else {
            if (checkName_client()) {
                search_client();

            } else {
                JOptionPane.showMessageDialog(null, "login does not exist");
            }

        }

    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* update_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    @FXML
    void update_user(ActionEvent event) {
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
            sql = "update bus_user set login='" + login_user.getText() + "',"
                    + "bus_user_id='" + id_user.getText() + "',"
                    + "nom='" + firstname_user.getText() + "',"
                    + "prenom='" + lastname_user.getText() + "',"
                    + "role='" + role_user.getText() + "',"
                    + "num='" + num_user.getText() + "',"
                    + "email='" + email_user.getText() + "',"
                    + "cin='" + cin_user.getText() + "',"
                    + "password='" + password_user.getText() + "'"
                    + "is_active='" + active_user.getText() + "'"
                    + " where login='" + login_user.getText() + "'";

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record updated sucessfully");
        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Unable to update record " + f.getMessage());
        }

    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* update_client *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/
    @FXML
    void update_client(ActionEvent event) {
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
            sql = "update client set username='" + login_client.getText() + "',"
                    + "nom='" + firstname_client.getText() + "',"
                    + "prenom='" + lastname_client.getText() + "',"
                    + "gende='" + gende_client.getText() + "',"
                    + "num='" + num_client.getText() + "',"
                    + "email='" + email_client.getText() + "',"
                    + "id_ville='" + ville_client.getText() + "',"
                    + "id_region='" + region_client.getText() + "',"
                    + "password='" + password_client.getText() + "',"
                    + "is_active='" + active_client.getText() + "'"
                    + " where username='" + login_client.getText() + "'";

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Record updated sucessfully");
        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Unable to update record " + f.getMessage());
        }

    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* checkName_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/
    private boolean checkName_user() {
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
            sql = "select * from bus_user where login ='" + login_user.getText() + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "unable to retrieve record" + e.getMessage());
        }
        return false;
    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* search_user *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    private void search_user() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
            // "root", "");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "select login,bus_user_id,nom , prenom , role,num ,email , cin,password ,is_active  from bus_user where login='"
                    + login_user.getText() + "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                login_user.setText(rs.getString("login"));
                id_user.setText(rs.getString("bus_user_id"));
                firstname_user.setText(rs.getString("nom"));
                lastname_user.setText(rs.getString("prenom"));
                role_user.setText(rs.getString("role"));
                num_user.setText(rs.getString("num"));
                email_user.setText(rs.getString("email"));
                cin_user.setText(rs.getString("cin"));
                password_user.setText(rs.getString("password"));
                password1_user.setText(rs.getString("password"));
                active_user.setText(rs.getString("is_active"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to retrieve record " + e.getMessage());
        }

    }

    private void clearFields() {
    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* checkName_client *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    private boolean checkName_client() {
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
            sql = "select * from client where username ='" + login_client.getText() + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "unable to retrieve record" + e.getMessage());
        }
        return false;
    }

    /***************************************************************
     * ***************************************************************
     * ***************************************************************
     * ********************* search_client *************************
     * ***************************************************************
     * ***************************************************************
     ****************************************************************/

    private void search_client() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
            // "root", "");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "select username,nom , prenom , gende,num ,email , id_ville,id_region,password ,is_active  from client where username='"
                    + login_client.getText() + "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                login_client.setText(rs.getString("username"));

                firstname_client.setText(rs.getString("nom"));
                lastname_client.setText(rs.getString("prenom"));
                gende_client.setText(rs.getString("gende"));
                num_client.setText(rs.getString("num"));
                email_client.setText(rs.getString("email"));
                ville_client.setText(rs.getString("id_ville"));
                region_client.setText(rs.getString("id_region"));
                password_client.setText(rs.getString("password"));
                password1_client.setText(rs.getString("password"));
                active_client.setText(rs.getString("is_active"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to retrieve record " + e.getMessage());
        }
    }

    private void affich_client() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to register class " + e.getMessage());
        }

        try {
            // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
            // "root", "");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
            stmt = (Statement) con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database " + e.getMessage());
        }

        try {
            String sql;
            sql = "select *  from client ";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                client.setId(Integer.parseInt(rs.getString("id")));
                client.setUsername((rs.getString("username")));
                client.setNom(rs.getString("nom"));
                client.setPrenom(rs.getString("prenom"));
                client.setGende(rs.getString("gende"));
                client.setNum(rs.getString("num"));
                client.setEmail(rs.getString("email"));
                client.setId_ville(rs.getString("id_ville"));
                client.setId_region(rs.getString("id_region"));
                client.setPassword(rs.getString("password"));
                client.setActive(rs.getString("is_active"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to affich List for Client  " + e.getMessage());
        }
    }
    /*
     * private ObservableList<ObservableList> data;
     * String SQL = "SELECT * from bus_user";
     * 
     * // only fetch columns
     * public void fetColumnList() {
     * 
     * try {
     * con = (Connection)
     * DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root",
     * "");
     * stmt = (Statement) con.createStatement();
     * // rs = stmt.executeQuery(SQL);
     * // int result = stmt.executeUpdate(sql);
     * ResultSet rs = stmt.executeQuery(SQL);
     * 
     * // SQL FOR SELECTING ALL OF CUSTOMER
     * for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
     * // We are using non property style for making dynamic table
     * final int j = i;
     * TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i +
     * 1).toUpperCase());
     * col.setCellValueFactory(
     * new Callback<CellDataFeatures<ObservableList, String>,
     * ObservableValue<String>>() {
     * public ObservableValue<String> call(CellDataFeatures<ObservableList, String>
     * param) {
     * 
     * return new SimpleStringProperty(param.getValue().get(j).toString());
     * }
     * });
     * 
     * // tblData.getColumns().removeAll(col);
     * tblData.getColumns().addAll(col);
     * 
     * System.out.println("Column [" + i + "] ");
     * 
     * }
     * 
     * } catch (Exception e) {
     * System.out.println("Error " + e.getMessage());
     * 
     * }
     * }
     * 
     * // fetches rows and data from the list
     * public void fetRowList() {
     * data = FXCollections.observableArrayList();
     * ResultSet rs;
     * List list = new LinkedList();
     * try {
     * con = (Connection)
     * DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root",
     * "");
     * stmt = (Statement) con.createStatement();
     * // rs = stmt.executeQuery(sql);
     * rs = stmt.executeQuery(SQL);
     * 
     * while (rs.next()) {
     * // Iterate Row
     * ObservableList row = FXCollections.observableArrayList();
     * for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
     * // Iterate Column
     * row.add(rs.getString(i));
     * 
     * }
     * System.out.println("Row [1] added " + row);
     * data.add(row);
     * 
     * 
     * }
     * tblData.getItems(data);
     * System.out.println(data);
     * // tblData.getItems().setAll(ObservableList<user>);
     * } catch (SQLException ex) {
     * System.err.println(ex.getMessage());
     * }
     * }
     * 
     * @Override
     * public void initialize(URL location, ResourceBundle resources) {
     * // TODO Auto-generated method stub
     * // fetColumnList();
     * // fetRowList();
     * 
     * // fetRowList();
     * // fetColumnList();
     * // clearFields();
     * }
     */

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    BusinessUser user = null;
    // BusinessUser user = new BusinessUser()
    ObservableList<BusinessUser> UserList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadDate();
        loadDate_c();
    }

    @FXML
    private void refreshTable() {
        try {
            UserList.clear();

            query = "SELECT * FROM `bus_user`";

            preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                UserList.add(new BusinessUser(

                        resultSet.getInt("id"),
                        resultSet.getString("bus_user_id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("role"),
                        resultSet.getString("nom"),
                        resultSet.getString("prenom"),
                        resultSet.getString("email"),
                        resultSet.getString("num"),
                        resultSet.getString("cin"),
                        resultSet.getString("adresse"),
                        resultSet.getString("is_active")));
                UserTable.setItems(UserList);

            }

        } catch (SQLException ex) {
            // Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
            // ex);
            JOptionPane.showMessageDialog(null, " list  " + ex.getMessage());

        }

    }

    @FXML
    private void print(MouseEvent event) {
    }

    private void loadDate() {

        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;

        refreshTable();

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        login.setCellValueFactory(new PropertyValueFactory<>("login"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        role.setCellValueFactory(new PropertyValueFactory<>("role"));
        num.setCellValueFactory(new PropertyValueFactory<>("num"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        // add cell of button edit
        Callback<TableColumn<BusinessUser, String>, TableCell<BusinessUser, String>> cellFoctory = (
                TableColumn<BusinessUser, String> param) -> {
            // make cell containing buttons
            final TableCell<BusinessUser, String> cell = new TableCell<BusinessUser, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    // that cell created only on non-empty rows
                    if (empty) {
                        setGraphic(null);
                        setText(null);

                    }
                    /*
                     * else {
                     * 
                     * FontAwesomeIconView deleteIcon = new
                     * FontAwesomeIconView(FontAwesomeIcon.TRASH);
                     * FontAwesomeIconView editIcon = new
                     * FontAwesomeIconView(FontAwesomeIcon.PENCIL_SQUARE);
                     * 
                     * deleteIcon.setStyle(
                     * " -fx-cursor: hand ;"
                     * + "-glyph-size:28px;"
                     * + "-fx-fill:#ff1744;"
                     * );
                     * editIcon.setStyle(
                     * " -fx-cursor: hand ;"
                     * + "-glyph-size:28px;"
                     * + "-fx-fill:#00E676;"
                     * );
                     * deleteIcon.setOnMouseClicked((MouseEvent event) -> {
                     * 
                     * try {
                     * student = UserTable.getSelectionModel().getSelectedItem();
                     * query = "DELETE FROM `student` WHERE id  ="+student.getId();
                     * connection = DbConnect.getConnect();
                     * preparedStatement = connection.prepareStatement(query);
                     * preparedStatement.execute();
                     * refreshTable();
                     * 
                     * } catch (SQLException ex) {
                     * Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
                     * ex);
                     * }
                     * 
                     * 
                     * 
                     * 
                     * 
                     * });
                     * editIcon.setOnMouseClicked((MouseEvent event) -> {
                     * 
                     * student = UserTable.getSelectionModel().getSelectedItem();
                     * FXMLLoader loader = new FXMLLoader ();
                     * loader.setLocation(getClass().getResource("/tableView/addStudent.fxml"));
                     * try {
                     * loader.load();
                     * } catch (IOException ex) {
                     * Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
                     * ex);
                     * }
                     * 
                     * AddStudentController addStudentController = loader.getController();
                     * addStudentController.setUpdate(true);
                     * addStudentController.setTextField(student.getId(), student.getName(),
                     * student.getBirth().toLocalDate(),student.getAdress(), student.getEmail());
                     * Parent parent = loader.getRoot();
                     * Stage stage = new Stage();
                     * stage.setScene(new Scene(parent));
                     * stage.initStyle(StageStyle.UTILITY);
                     * stage.show();
                     * 
                     * 
                     * 
                     * 
                     * });
                     * 
                     * HBox managebtn = new HBox(editIcon, deleteIcon);
                     * managebtn.setStyle("-fx-alignment:center");
                     * HBox.setMargin(deleteIcon, new Insets(2, 2, 0, 3));
                     * HBox.setMargin(editIcon, new Insets(2, 3, 0, 2));
                     * 
                     * setGraphic(managebtn);
                     * 
                     * setText(null);
                     * 
                     * }
                     */
                }

            };

            return cell;
        };
        // editCol.setCellFactory(cellFoctory);
        UserTable.setItems(UserList);

    }

    String query1 = null;

    ResultSet resultSet1 = null;
    Client client = null;
    // BusinessUser user = new BusinessUser()
    ObservableList<Client> ClientList = FXCollections.observableArrayList();

    @FXML
    private void refreshTable_c() {
        try {
            UserList.clear();

            query1 = "SELECT * FROM `client`";

            preparedStatement = (PreparedStatement) connection.prepareStatement(query1);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ClientList.add(new Client(

                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("nom"),
                        resultSet.getString("prenom"),

                        resultSet.getString("num"),
                        resultSet.getString("email"),
                        resultSet.getString("gende"),
                        resultSet.getString("id_ville"),
                        resultSet.getString("id_region"),

                        resultSet.getString("is_active")));
                ClientTable.setItems(ClientList);

            }

        } catch (SQLException ex) {
            // Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
            // ex);
            JOptionPane.showMessageDialog(null, " list  " + ex.getMessage());

        }

    }

    private void loadDate_c() {

        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root", "");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;

        refreshTable_c();

        idc.setCellValueFactory(new PropertyValueFactory<>("id"));
        loginc.setCellValueFactory(new PropertyValueFactory<>("username"));
        nomc.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomc.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        numc.setCellValueFactory(new PropertyValueFactory<>("num"));
        emailc.setCellValueFactory(new PropertyValueFactory<>("email"));

        // add cell of button edit
        Callback<TableColumn<Client, String>, TableCell<Client, String>> cellFoctory = (
                TableColumn<Client, String> param) -> {
            // make cell containing buttons
            final TableCell<Client, String> cell = new TableCell<Client, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    // that cell created only on non-empty rows
                    if (empty) {
                        setGraphic(null);
                        setText(null);

                    }
                    /*
                     * else {
                     * 
                     * FontAwesomeIconView deleteIcon = new
                     * FontAwesomeIconView(FontAwesomeIcon.TRASH);
                     * FontAwesomeIconView editIcon = new
                     * FontAwesomeIconView(FontAwesomeIcon.PENCIL_SQUARE);
                     * 
                     * deleteIcon.setStyle(
                     * " -fx-cursor: hand ;"
                     * + "-glyph-size:28px;"
                     * + "-fx-fill:#ff1744;"
                     * );
                     * editIcon.setStyle(
                     * " -fx-cursor: hand ;"
                     * + "-glyph-size:28px;"
                     * + "-fx-fill:#00E676;"
                     * );
                     * deleteIcon.setOnMouseClicked((MouseEvent event) -> {
                     * 
                     * try {
                     * student = UserTable.getSelectionModel().getSelectedItem();
                     * query = "DELETE FROM `student` WHERE id  ="+student.getId();
                     * connection = DbConnect.getConnect();
                     * preparedStatement = connection.prepareStatement(query);
                     * preparedStatement.execute();
                     * refreshTable();
                     * 
                     * } catch (SQLException ex) {
                     * Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
                     * ex);
                     * }
                     * 
                     * 
                     * 
                     * 
                     * 
                     * });
                     * editIcon.setOnMouseClicked((MouseEvent event) -> {
                     * 
                     * student = UserTable.getSelectionModel().getSelectedItem();
                     * FXMLLoader loader = new FXMLLoader ();
                     * loader.setLocation(getClass().getResource("/tableView/addStudent.fxml"));
                     * try {
                     * loader.load();
                     * } catch (IOException ex) {
                     * Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null,
                     * ex);
                     * }
                     * 
                     * AddStudentController addStudentController = loader.getController();
                     * addStudentController.setUpdate(true);
                     * addStudentController.setTextField(student.getId(), student.getName(),
                     * student.getBirth().toLocalDate(),student.getAdress(), student.getEmail());
                     * Parent parent = loader.getRoot();
                     * Stage stage = new Stage();
                     * stage.setScene(new Scene(parent));
                     * stage.initStyle(StageStyle.UTILITY);
                     * stage.show();
                     * 
                     * 
                     * 
                     * 
                     * });
                     * 
                     * HBox managebtn = new HBox(editIcon, deleteIcon);
                     * managebtn.setStyle("-fx-alignment:center");
                     * HBox.setMargin(deleteIcon, new Insets(2, 2, 0, 3));
                     * HBox.setMargin(editIcon, new Insets(2, 3, 0, 2));
                     * 
                     * setGraphic(managebtn);
                     * 
                     * setText(null);
                     * 
                     * }
                     */
                }

            };

            return cell;
        };
        // editCol.setCellFactory(cellFoctory);
        ClientTable.setItems(ClientList);

    }

}
