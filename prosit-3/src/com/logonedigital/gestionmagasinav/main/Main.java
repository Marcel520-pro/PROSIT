package com.logonedigital.gestionmagasinav.main;

import com.logonedigital.gestionmagasinav.modele.Magasin;
import com.logonedigital.gestionmagasinav.modele.Produit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Douala - Akwa", 50);
        Magasin m2 = new Magasin(2, "Yaoundé - Omnisport", 50);

        Produit lait = new Produit(1021, "Lait", "Delice", 700, new Date());
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 500, new Date());
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1200, new Date());

        m1.ajouterProduit(lait);
        m1.ajouterProduit(yaourt);
        m1.ajouterProduit(tomate);

        m1.afficherProduits();

        m1.supprimerProduit(yaourt);
        m1.afficherProduits();

        m2.ajouterProduit(lait);
        Magasin plusGrand = Magasin.plusGrandMagasin(m1, m2);
        System.out.println("\nLe plus grand magasin est : " + (plusGrand == m1 ? "Magasin 1" : "Magasin 2"));
    }
}
