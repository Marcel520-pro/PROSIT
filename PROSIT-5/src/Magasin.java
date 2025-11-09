public class Magasin {
    protected String nom;
    protected Produit[] produits = new Produit[5];
    protected int nbProduits = 0;

    public Magasin(String nom){
        this.nom = nom;
    }

    public Magasin(){}

    public void ajouterProduit(Produit p){
        produits[nbProduits] = p;
        nbProduits++;
    }

    public void afficherProduit(){
        System.out.println("Produits du magasin: " + nom);
        for(int i = 0; i<nbProduits; i++){
            System.out.println(produits[i] + " | Type: " + produits[i].determinerTypeProduit());
        }
    }

    public double calculStock(){
        double total = 0;
        for(int i = 0; i<nbProduits; i++){
            if (produits[i] instanceof ProduitFruit)
                total += produits[i].quantite;
        }
        return total;
    }
}
