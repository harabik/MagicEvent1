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
public class Location {
    private int id; // default Null
    private String nomsociete; // not null
    
    private String nom; // not null
    private String num; // not null
    private String adress; // null
    private String email; // not null
      private String id_ville; // not null
    private String id_region; // not null
    
    private String active; // not null

    public Location(int id, String nomsociete, String nom, String num, String adress, String email, String id_ville, String id_region, String active) {
        this.id = id;
        this.nomsociete = nomsociete;
        this.nom = nom;
        this.num = num;
        this.adress = adress;
        this.email = email;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.active = active;
    }

    public Location() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomsociete() {
        return nomsociete;
    }

    public void setNomsociete(String nomsociete) {
        this.nomsociete = nomsociete;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
    
}
