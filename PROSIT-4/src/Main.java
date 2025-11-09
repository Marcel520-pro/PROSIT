public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin m2 = new Magasin(2, "SantaLucia", "Nkoabang");

        m1.ajouterEmployes(new Caissier(1, "Paul", "Yaoundé", 170, 101));
        m1.ajouterEmployes(new Caissier(2, "Marie", "Yaoundé", 190, 102));
        m1.ajouterEmployes(new Vendeur(3, "Jean", "Mvan", 160, 0.8));
        m1.ajouterEmployes(new Responsable(4, "Alice", "Nsimeyong", 165, 50000));

        m2.ajouterEmployes(new Caissier(5, "Luc", "Nkoabang", 185, 201));
        m2.ajouterEmployes(new Vendeur(6, "Brice", "Nkoabang", 160, 0.7));
        m2.ajouterEmployes(new Vendeur(7, "Julie", "Nkoabang", 160, 0.9));
        m2.ajouterEmployes(new Vendeur(8, "Nadine", "Nkoabang", 160, 0.6));
        m2.ajouterEmployes(new Responsable(9, "Thomas", "Nkoabang", 170, 70000));

        m1.ajouterProduit(new Produit(1, "Lait", 1200));
        m1.ajouterProduit(new Produit(2, "Pain", 500));
        m1.ajouterProduit(new Produit(3, "Riz", 6500));

        m2.ajouterProduit(new Produit(4, "Huile", 4500));
        m2.ajouterProduit(new Produit(5, "Sucre", 1200));
        m2.ajouterProduit(new Produit(6, "Sel", 400));

        m1.afficherInformations();
        m2.afficherInformations();
    }
}
