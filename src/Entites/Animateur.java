/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class Animateur {
    
    
    
    
    private int id; // default Null
    private String nbr_equipe; // not null
    private String username; // not null
    private String prenom; // not null
    private String nom; // not null
    private String num; // not null
    private String adresse; // null
    private String mail; // not null
    private String gende; // not null
    private String active; // not null

    public Animateur(int id, String nbrequipe, String username, String prenom, String nom, String num, String adresse, String mail, String gende, String active) {
        this.id = id;
        this.nbr_equipe = nbrequipe;
        this.username = username;
        this.prenom = prenom;
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
        this.mail = mail;
        this.gende = gende;
        this.active = active;
    }

    public Animateur() {
    }

    public Animateur(String nom, String num, String adresse, String mail) {
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
        this.mail = mail;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNbrequipe() {
        return nbr_equipe;
    }

    public void setNbrequipe(String nbrequipe) {
        this.nbr_equipe = nbrequipe;
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

    public String getNbr_equipe() {
        return nbr_equipe;
    }

    public void setNbr_equipe(String nbr_equipe) {
        this.nbr_equipe = nbr_equipe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
