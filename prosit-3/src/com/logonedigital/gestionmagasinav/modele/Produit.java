package com.logonedigital.gestionmagasinav.modele;

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
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public boolean comparer(Produit p) {
        return this.id == p.id && this.libelle.equals(p.libelle) && this.prix == p.prix;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.id == p2.id && p1.libelle.equals(p2.libelle) && p1.prix == p2.prix;
    }

    public int getId() { return id; }
    public String getLibelle() { return libelle; }
    public String getMarque() { return marque; }
    public double getPrix() { return prix; }
    public Date getDateExpiration() { return dateExpiration; }

    @Override
    public String toString() {
        return libelle + " (" + marque + ") - " + prix + " FCFA";
    }
}
