package Services;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Entites.BusinessUser;
import Entites.Client;

public class Admin_compte {

    BusinessUser user = new BusinessUser();
    Client client = new Client();

    /*
     * 
     * private String search_client_login(String x) {
     * try {
     * Class.forName("com.mysql.jdbc.Driver");
     * } catch (ClassNotFoundException e) {
     * JOptionPane.showMessageDialog(null, "Unable to register class " +
     * e.getMessage());
     * }
     * 
     * Statement stmt;
     * try {
     * // con = DriverManager.getConnection("jdbc:mysql://localhost/smartevent01",
     * // "root", "");
     * Connection con = (Connection)
     * DriverManager.getConnection("jdbc:mysql://localhost/smartevent01", "root",
     * "");
     * stmt = (Statement) con.createStatement();
     * } catch (SQLException e) {
     * JOptionPane.showMessageDialog(null, "Unable to connect to database " +
     * e.getMessage());
     * }
     * 
     * try {
     * String sql;
     * sql = "select * from client where username='"
     * + x + "'";
     * ResultSet rs = stmt.executeQuery(sql);
     * while (rs.next()) {
     * client.setId(Integer.parseInt(rs.getString("id")));
     * client.setUsername((rs.getString("username")));
     * client.setNom(rs.getString("nom"));
     * client.setPrenom(rs.getString("prenom"));
     * client.setGende(rs.getString("gende"));
     * client.setNum(rs.getString("num"));
     * client.setEmail(rs.getString("email"));
     * client.setId_ville(rs.getString("id_ville"));
     * client.setId_region(rs.getString("id_region"));
     * client.setPassword(rs.getString("password"));
     * client.setActive(rs.getString("is_active"));
     * 
     * }
     * } catch (SQLException e) {
     * JOptionPane.showMessageDialog(null, "Unable to retrieve record " +
     * e.getMessage());
     * }
     * return "";
     * }
     * 
     */

}
