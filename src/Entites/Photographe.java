/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Admin
 */
public class Photographe {
    
        
    private int id; // default Null
    private String nom; // not null
    private String prenom; // not null
    private String mail; // not null
    private String gende; // not null
    private int id_ville; // default Null 
    private int id_region; // default Null
    private String num; // not null
    private String adresse; // null
    private String societe; // not null
    private String poste; // not null
    private String nbr_equipe; // not null

    public Photographe() {
    }

    public Photographe(String nom, String num, String adresse, String poste) {
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
        this.poste = poste;
    }

    public Photographe(int id, String nom, String prenom, String mail, String gende, int id_ville, int id_region, String num, String adresse, String societe, String poste, String nbr_equipe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.gende = gende;
        this.id_ville = id_ville;
        this.id_region = id_region;
        this.num = num;
        this.adresse = adresse;
        this.societe = societe;
        this.poste = poste;
        this.nbr_equipe = nbr_equipe;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adress) {
        this.adresse = adress;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNbr_equipe() {
        return nbr_equipe;
    }

    public void setNbr_equipe(String nbr_equipe) {
        this.nbr_equipe = nbr_equipe;
    }
    
 
    
    
}
