package com.logonedigital.gestionmagasin.modele;

import java.util.Date;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit(int id, String libelle, String marque, double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        setPrix(prix);
        this.dateExpiration = dateExpiration;
    }

    public void afficher() {
        System.out.println(libelle + " - " + marque + " - " + prix + " FCFA");
    }

    public int getId() { return id; }
    public String getLibelle() { return libelle; }
    public String getMarque() { return marque; }
    public double getPrix() { return prix; }
    public Date getDateExpiration() { return dateExpiration; }

    public void setPrix(double prix) {
        if (prix >= 0) this.prix = prix;
        else System.out.println("Le prix ne peut pas être négatif !");
    }

    @Override
    public String toString() {
        return libelle + " (" + marque + ") - " + prix + " FCFA";
    }
}

