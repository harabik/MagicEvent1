/*
<<<<<<< HEAD
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
=======
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
 */
package Entites;

/**
 *
<<<<<<< HEAD
 * @author Admin
 */
public class Location {
    
    
     private int id; // default Null
    private String nom_societe; // not null
=======
 * @author Elife-Beja-097
 */
public class Location {
    private int id; // default Null
    private String nomsociete; // not null
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
    
    private String nom; // not null
    private String num; // not null
    private String adress; // null
    private String email; // not null
      private String id_ville; // not null
    private String id_region; // not null
    
    private String active; // not null

<<<<<<< HEAD
    public Location(int id, String nom_societe, String nom, String num, String adress, String email, String id_ville, String id_region, String active) {
        this.id = id;
        this.nom_societe = nom_societe;
=======
    public Location(int id, String nomsociete, String nom, String num, String adress, String email, String id_ville, String id_region, String active) {
        this.id = id;
        this.nomsociete = nomsociete;
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
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
<<<<<<< HEAD
        return nom_societe;
    }

    public void setNomsociete(String nomsociete) {
        this.nom_societe = nomsociete;
=======
        return nomsociete;
    }

    public void setNomsociete(String nomsociete) {
        this.nomsociete = nomsociete;
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
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
    
<<<<<<< HEAD
    
=======
>>>>>>> 8f16dc7f9e72236072744f58a2c5cb95aaea7737
}
