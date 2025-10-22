package com.logonedigital.gestionmagasin.modele;

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbProduits;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nbProduits = 0;
    }

    public void ajouterProduit(Produit p) {
        if (nbProduits < capacite) {
            produits[nbProduits++] = p;
        } else {
            System.out.println("Magasin plein !");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin #" + id + " - " + adresse);
        System.out.println("Capacité : " + capacite + " | Produits : " + nbProduits);
    }

    public void afficherProduits() {
        System.out.println("Produits du magasin :");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(" - " + produits[i]);
        }
    }

    public int getNombreProduits() { return nbProduits; }
}

