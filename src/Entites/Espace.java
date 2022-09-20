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
    private int surface; // default Null 
    private int id_ville; // default Null 
    private int id_region; // default Null
   private String nom; // not null
   private String num; // not null
   private String adress; // null
   private String active; // not null

    public Espace(int id, int nbr, int surface, int id_ville, int id_region, String nom, String num, String adress, String active) {
        this.id = id;
        this.nbr = nbr;
        this.surface = surface;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.nom = nom;
        this.num = num;
        this.adress = adress;
        this.active = active;
    }

    public Espace() {
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

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    
}
