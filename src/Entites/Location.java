/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class Location {
    
    
    private int id; // default Null
    private String nom_societe; // not null
    
    private String nom;
    private String num_mo; // not null
    private String adresse; // null
    private String email; // not null
    private String id_ville; // not null
    private String id_region; // not null
    private String typemateriel;
    private String active; // not null

  

    public Location() {
    }

    public Location(int id, String nom_societe, String nom, String num_mo, String adresse, String email, String id_ville, String id_region, String typemateriel, String active) {
        this.id = id;
        this.nom_societe = nom_societe;
        this.nom = nom;
        this.num_mo = num_mo;
        this.adresse = adresse;
        this.email = email;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.typemateriel = typemateriel;
        this.active = active;
    }

    public Location(String nom_societe, String num_mo, String adresse, String typemateriel) {
        this.nom_societe = nom_societe;
        this.num_mo = num_mo;
        this.adresse = adresse;
        this.typemateriel = typemateriel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_societe() {
        return nom_societe;
    }

    public void setNom_societe(String nom_societe) {
        this.nom_societe = nom_societe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum_mo() {
        return num_mo;
    }

    public void setNum_mo(String num_mo) {
        this.num_mo = num_mo;
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

    public String getTypemateriel() {
        return typemateriel;
    }

    public void setTypemateriel(String typemateriel) {
        this.typemateriel = typemateriel;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    
   
    
    
}
