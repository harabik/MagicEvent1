/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Elife-Beja-096
 */
public class Animateur {
    
    
     private int id; // default Null
       private String nbrequipe; // not null
    private String username; // not null
    private String prenom; // not null
    private String nom; // not null
    private String num; // not null
    private String adress; // null
    private String email; // not null
    private String gende; // not null
    private String active; // not null

    public Animateur(int id, String nbrequipe, String username, String prenom, String nom, String num, String adress, String email, String gende, String active) {
        this.id = id;
        this.nbrequipe = nbrequipe;
        this.username = username;
        this.prenom = prenom;
        this.nom = nom;
        this.num = num;
        this.adress = adress;
        this.email = email;
        this.gende = gende;
        this.active = active;
    }

    public Animateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNbrequipe() {
        return nbrequipe;
    }

    public void setNbrequipe(String nbrequipe) {
        this.nbrequipe = nbrequipe;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    
}
