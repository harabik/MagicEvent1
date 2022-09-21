/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entites.Client;
import Utils.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class ControlLogin {

    Statement st;
    String type;

    public boolean isLogin(Client u) {

        try {

            st=ConnectionDB.openConnection().createStatement();
            String check = "select * from client where username ='" + u.getUsername() + "' and password = '" + u.getPassword() + "'";
            ResultSet result = st.executeQuery(check);
            while (result.next()) {
                type = result.getString(3);
                return true;
            }
            ConnectionDB.closeConnection();
                   } catch (SQLException ex) {
            ConnectionDB.closeConnection();
            System.out.println("hi" + ex.getMessage());
        }

        return false;
    }


}
