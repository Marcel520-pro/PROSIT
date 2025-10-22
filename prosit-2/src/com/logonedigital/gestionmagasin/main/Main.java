package com.logonedigital.gestionmagasin.main;

import com.logonedigital.gestionmagasin.modele.Magasin;
import com.logonedigital.gestionmagasin.modele.Produit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magasin magasin1 = new Magasin(1, "Yaoundé - Mvog-Mbi", 50);

        Produit lait = new Produit(1021, "Lait", "Delice", 700, new Date());
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 500, new Date());
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1200, new Date());

        magasin1.ajouterProduit(lait);
        magasin1.ajouterProduit(yaourt);
        magasin1.ajouterProduit(tomate);

        magasin1.afficherMagasin();
        magasin1.afficherProduits();

        System.out.println("\nTotal produits : " + magasin1.getNombreProduits());
    }
}

