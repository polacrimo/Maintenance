package com.example.maintenance;

import java.io.Serializable;

public class Vehicule implements Serializable {

    private String immat;
    private String marque;
    private String modele;
    private String couleur;
    private int puissance;
    private String categorie;
    private String boite_vitesse;
    private int annee;

    public Vehicule(){ }

    public Vehicule(String immat, String marque, String modele, String couleur, int puissance, String categorie, String boite_vitesse, int annee){
        this.immat = immat;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.categorie = categorie;
        this.boite_vitesse = boite_vitesse;
        this.annee = annee;
    }

    public void setImmat(String immat){
        this.immat = immat;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public void setModele(String modele){
        this.modele = modele;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }

    public void setPuissance(int puissance){
        this.puissance = puissance;
    }

    public void setCategorie(String categorie){
        this.categorie = categorie;
    }

    public void setBoiteVitesse(String boite_vitesse){
        this.boite_vitesse = boite_vitesse;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    public String getImmat(){
        return this.immat;
    }

    public String getMarque(){
        return this.marque;
    }

    public String getModele(){
        return this.modele;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public int getPuissance(){
        return this.puissance;
    }

    public String getCategorie(){
        return this.categorie;
    }

    public String getBoiteVitesse(){
        return this.boite_vitesse;
    }

    public int getAnnee(){
        return this.annee;
    }
}
