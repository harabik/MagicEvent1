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
    private int num;
    private String nom;
    private String login;
    private String prenom;
    private String password;
    private String cin;
    private String adress;
    private String email;

    public Traiteur() {
    }

    public Traiteur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Traiteur(int id, int num, String nom, String login, String prenom, String password, String cin,
            String adress, String email) {
        this.id = id;
        this.num = num;
        this.nom = nom;
        this.login = login;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adress = adress;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Traiteur{" + "id=" + id + ", num=" + num + ", nom=" + nom + ", login=" + login + ", prenom=" + prenom + ", password=" + password + ", cin=" + cin + ", adress=" + adress + ", email=" + email + '}';
    }
    
    // this is a comment

}
