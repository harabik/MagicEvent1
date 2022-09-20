/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Serveurs {
    private int id; // default Nul
    private String nom;
    private String adresse;
    private String cin;
    private String gende;
    private String langue;
    private String num_mo;
    private String photo_pro;
    private String photo_cin;
    private String email;
    private String ph_certif;
    private Date date_naissance;

    public Serveurs() {
    }

    public Serveurs(String nom, String adresse, String gende, String num_mo) {
        this.nom = nom;
        this.adresse = adresse;
        this.gende = gende;
        this.num_mo = num_mo;
    }
    

    public Serveurs(int id, String nom, String cin,String adresse, String gende, String langue, String num_mo, String photo_pro, String photo_cin, String email, String ph_certif, Date date_naissance) {
        this.id = id;
        this.nom = nom;
        this.cin = cin;
         this.adresse = adresse;
        this.gende = gende;
        this.langue = langue;
        this.num_mo = num_mo;
        this.photo_pro = photo_pro;
        this.photo_cin = photo_cin;
        this.email = email;
        this.ph_certif = ph_certif;
        this.date_naissance = date_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getNum_mo() {
        return num_mo;
    }

    public void setNum_mo(String num_mo) {
        this.num_mo = num_mo;
    }

    public String getPhoto_pro() {
        return photo_pro;
    }

    public void setPhoto_pro(String photo_pro) {
        this.photo_pro = photo_pro;
    }

    public String getPhoto_cin() {
        return photo_cin;
    }

    public void setPhoto_cin(String photo_cin) {
        this.photo_cin = photo_cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_certif() {
        return ph_certif;
    }

    public void setPh_certif(String ph_certif) {
        this.ph_certif = ph_certif;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    @Override
    public String toString() {
        return "Serveurs{" + "id=" + id + ", nom=" + nom + ", cin=" + cin + ", gende=" + gende + ", langue=" + langue + ", num_mo=" + num_mo + ", photo_pro=" + photo_pro + ", photo_cin=" + photo_cin + ", email=" + email + ", ph_certif=" + ph_certif + ", date_naissance=" + date_naissance + '}';
    }
    
    
    
    
    
    
}
