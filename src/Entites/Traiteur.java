/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class Traiteur {
    private int id;
    private String num_mo;
    private String nom_societe;
    private String login;
    private String prenom;
    private String password;
    private String cin;
    private String adresse;
    private String email;
    private String specialite;
    

    public Traiteur() {
    }

    public Traiteur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Traiteur(String num_mo, String nom_societe, String adresse, String specialite) {
        this.num_mo = num_mo;
        this.nom_societe = nom_societe;
        this.adresse = adresse;
        this.specialite = specialite;
    }

    public Traiteur(int id, String num_mo, String nom_societe, String login, String prenom, String password, String cin, String adresse, String email, String specialite) {
        this.id = id;
        this.num_mo = num_mo;
        this.nom_societe = nom_societe;
        this.login = login;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.email = email;
        this.specialite = specialite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_mo() {
        return num_mo;
    }

    public void setNum_mo(String num_mo) {
        this.num_mo = num_mo;
    }

    public String getNom_societe() {
        return nom_societe;
    }

    public void setNom_societe(String nom_societe) {
        this.nom_societe = nom_societe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }


}