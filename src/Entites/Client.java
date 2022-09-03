/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

import java.net.URL;
import java.util.ResourceBundle;

import Gui.Controllers.Controller_admin;

/**
 *
 * @author Admin
 */
public class Client {

    private int id; // default Null
    private String username; // not null
    private String password; // not null
    private String prenom; // not null
    private String nom; // not null
    private String num; // not null
    private String adress; // null
    private String email; // not null
    private String gende; // not null
    private String id_ville; // not null
    private String id_region; // not null
    private String active; // not null

    public Client() {
    }

    public Client(int id, String username, String password, String prenom, String nom, String num, String adress,
            String email, String gende, String id_ville, String id_region, String active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.num = num;
        this.adress = adress;
        this.email = email;
        this.gende = gende;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.active = active;
    }

    public Client(int id, String username, String password, String prenom, String nom, String num, String adress,
            String email, String gende, String id_ville, String id_region) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.num = num;
        this.adress = adress;
        this.email = email;
        this.gende = gende;
        this.id_ville = id_ville;
        this.id_region = id_region;
    }

    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGende() {
        return gende;
    }

    public void setGende(String gende) {
        this.gende = gende;
    }

    public String getId_ville() {
        return id_ville;
    }

    public void setId_ville(String id_ville) {
        this.id_ville = id_ville;
    }

    public String getId_region() {
        return id_region;
    }

    public void setId_region(String id_region) {
        this.id_region = id_region;
    }

    @Override
    public String toString() {
        return "Client [adress=" + adress + ", email=" + email + ", gende=" + gende + ", id=" + id + ", id_region="
                + id_region + ", id_ville=" + id_ville + ", nom=" + nom + ", num=" + num + ", password=" + password
                + ", prenom=" + prenom + ", username=" + username + "]";
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
// client sa role cree evenement or...
