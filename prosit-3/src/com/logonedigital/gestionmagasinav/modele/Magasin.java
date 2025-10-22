package com.logonedigital.gestionmagasinav.modele;

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

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(p)) return true;
        }
        return false;
    }

    public void ajouterProduit(Produit p) {
        if (chercherProduit(p)) {
            System.out.println("Produit déjà présent !");
            return;
        }
        if (nbProduits < capacite) {
            produits[nbProduits++] = p;
            System.out.println("Produit ajouté !");
        } else {
            System.out.println("Magasin plein !");
        }
    }

    public void supprimerProduit(Produit p) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(p)) {
                produits[i] = produits[--nbProduits];
                produits[nbProduits] = null;
                System.out.println("Produit supprimé !");
                return;
            }
        }
        System.out.println("Produit non trouvé !");
    }

    public void afficherProduits() {
        System.out.println("Produits du magasin :");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(" - " + produits[i]);
        }
    }

    public static Magasin plusGrandMagasin(Magasin m1, Magasin m2) {
        return (m1.nbProduits > m2.nbProduits) ? m1 : m2;
    }
}
