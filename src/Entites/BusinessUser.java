/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class BusinessUser {

    private int id; // default
    private String id_user; // null
    private String login; // not null
    private String password; // not null
    private String role; // not null
    private String nom; // not null
    private String prenom; // not null
    private String email; // not null
    private String num; // not null
    private String cin; // not null
    private String adresse; // null
    private String active; // not null default "1"

    public BusinessUser() {
    }

    public BusinessUser(int id, String id_user, String login, String password, String role, String nom, String prenom,
            String email, String num, String cin, String adresse, String active) {
        this.id = id;
        this.id_user = id_user;
        this.login = login;
        this.password = password;
        this.role = role;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.num = num;
        this.cin = cin;
        this.adresse = adresse;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BusinessUser{" + "id=" + id + ", id_user=" + id_user + ", login=" + login + ", password=" + password + ", role=" + role + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", num=" + num + ", cin=" + cin + ", adresse=" + adresse + ", active=" + active + '}';
    }

}
