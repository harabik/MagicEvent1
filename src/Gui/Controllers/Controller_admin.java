package Gui.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.control.TextField;

public class Controller_admin {

    @FXML
    private Connection con;

    @FXML
    private Statement stmt;

    @FXML
    private ResultSet rs;

    @FXML
    private TextField active_client;

    @FXML
    private TextField active_user;

    @FXML
    private TextField cin_user;

    @FXML
    private Button delete_client;

    @FXML
    private Button delete_user;

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
    private TextField id_user;

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
    private TextField login_client;

    @FXML
    private TextField login_user;

    @FXML
    private TextField num_client;

    @FXML
    private TextField num_user;

    @FXML
    private TextField password1_client;

    @FXML
    private TextField password1_user;

    @FXML
    private TextField password_client;

    @FXML
    private TextField password_user;

    @FXML
    private TextField region_client;

    @FXML
    private TextField role_user;

    @FXML
    private Button search_client;

    @FXML
    private Button search_user;

    @FXML
    private TableView<?> tblData;

    @FXML
    private TableView<?> tblData1;

    @FXML
    private Button update_client;

    @FXML
    private Button update_user;

    @FXML
    private TextField ville_client;

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
            sql = "insert into bus_user(login,bus_user_id,nom , prenom , role,num ,email , cin,password ,is_active) values ("
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

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "record saved sucessfully ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }

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
            sql = "insert into client(username,nom , prenom , gende,num ,email , id_ville,id_region,password ,is_active) values ("
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

            int result = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Client saved sucessfully ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert record " + e.getMessage());
        }

    }

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

}
