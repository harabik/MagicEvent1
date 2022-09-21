/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class Espace {
    
    
    private int id; // default Null
    private int nbr; // default Null
    private String surface; // default Null 
    private int id_ville; // default Null 
    private int id_region; // default Null
   private String nom; // not null
   private String num_mo; // not null
   private String adresse; // null
   private String active; // not null

    public Espace(int id, int nbr, String surface, int id_ville, int id_region, String nom, String num_mo, String adresse, String active) {
        this.id = id;
        this.nbr = nbr;
        this.surface = surface;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.nom = nom;
        this.num_mo = num_mo;
        this.adresse = adresse;
        this.active = active;
    }

    public Espace() {
    }

    public Espace(String surface, String nom, String num_mo, String adresse) {
        this.surface = surface;
        this.nom = nom;
        this.num_mo = num_mo;
        this.adresse = adresse;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

  

    public int getId_ville() {
        return id_ville;
    }

    public void setId_ville(int id_ville) {
        this.id_ville = id_ville;
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
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

 
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    
}
