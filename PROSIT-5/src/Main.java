//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin("Carrefour");

        ProduitFruit p1 = new ProduitFruit("1254", "Fruit", "Fraise", 12.3, "Mars");
        ProduitFruit p2 = new ProduitFruit("1224", "Fruit", "Pasteque", 50, "Juin");
        ProduitFruit p3 = new ProduitFruit("7896", "Fruit", "Mandarine", 25.6, "Decembre");
        ProduitLegume p4 = new ProduitLegume("8521", "Legumes", "Artichauts", 14, "Janvier");

        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);
        magasin.ajouterProduit(p4);

        magasin.afficherProduit();

        System.out.println("Quantité totale de fruits: " + magasin.calculStock());

        System.out.println("Frais selon saison:");
        System.out.println(p1.libelle + " est frais en Mars? " + p1.estFrais("Mars"));
        System.out.println(p4.libelle + " est frais en Février? " + p4.estFrais("Février"));

    }
}