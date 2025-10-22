package com.logonedigital.gestionproduit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit lait = new Produit(1021, "Lait", "Delice", 0, new Date());
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 0, new Date());
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.2, new Date());

        System.out.println("--- Avant modification ---");
        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        lait.setPrix(0.7);

        System.out.println("\n--- Après modification ---");
        lait.afficher();

        System.out.println("\n--- Affichage avec toString() ---");
        System.out.println(lait);
        System.out.println(yaourt);
        System.out.println(tomate);
    }
}
