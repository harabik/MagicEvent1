/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entites.BusinessUser;
import Entites.Client;
import Utils.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class ControlLoginBusinessUser {

    Statement st;
    String type;

    public boolean isLogin(BusinessUser BU) {

        try {

            st = ConnectionDB.openConnection().createStatement();
            String check = "select * from bus_user where login ='" + BU.getLogin() + "' and password= '"
                    + BU.getPassword() + "'";
            ResultSet result = st.executeQuery(check);
            while (result.next()) {
                type = result.getString(3);
                return true;
            }
            ConnectionDB.closeConnection();
        } catch (SQLException ex) {
            ConnectionDB.closeConnection();
            System.out.println("hiiiii" + ex.getMessage());
        }

        return false;
    }

    public String isRole(BusinessUser BU) {

        try {

            st = ConnectionDB.openConnection().createStatement();
            String check = "select role from bus_user where login ='" + BU.getLogin() + "' and password= '"
                    + BU.getPassword() + "'";
            ResultSet result = st.executeQuery(check);
            while (result.next()) {
                type = result.getString(1);
                return type;
            }
            ConnectionDB.closeConnection();
        } catch (SQLException ex) {
            ConnectionDB.closeConnection();
            System.out.println("hiiiii" + ex.getMessage());
        }

        return "-1";
    }

    // public String getBus_user_id(){
    //
    // if(type.equals("Traiteur"))
    // return "admin";
    // else
    // return "magasinier";
    // }
}
