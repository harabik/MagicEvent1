/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Elife-Beja-097
 */
public class Photgraphe {
    
      private int id; // default Nul
       private int nb_equipe;
        private int prix;
    private String nom;
     private String prenom;
    private String cin;
    private String gende;
    private String email;
     private String adress;

    public Photgraphe(int id, int nb_equipe, int prix, String nom, String prenom, String cin, String gende, String email, String adress) {
        this.id = id;
        this.nb_equipe = nb_equipe;
        this.prix = prix;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.gende = gende;
        this.email = email;
        this.adress = adress;
    }

    public Photgraphe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNb_equipe() {
        return nb_equipe;
    }

    public void setNb_equipe(int nb_equipe) {
        this.nb_equipe = nb_equipe;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getGende() {
        return gende;
    }

    public void setGende(String gende) {
        this.gende = gende;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
   
    

    
}
