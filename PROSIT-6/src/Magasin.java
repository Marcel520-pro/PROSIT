public class Magasin {
    protected int id;
    protected String nom;
    protected String adresse;
    protected Produit[] produits = new Produit[02];
    protected int nbProduits = 0;
    //protected int nbEmployes = 0;

    public Magasin(int id, String nom, String adresse){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public void ajouterProduit(Produit p) throws MagasinPleinException {
        if(nbProduits >= produits.length){
            throw new MagasinPleinException("Le magasin est plein, impossible d'ajouter le produit.");
        }
        produits[nbProduits] = p;
        nbProduits++;
    }

    public void afficherProduit(){
        System.out.println("Produits:");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("  " + produits[i]);
        }
    }
/*
    public void afficherInformations(){
        System.out.println("Magasin: " + nom + " (" + adresse + ")");
        System.out.println("Produits:");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("  " + produits[i]);
        }
        System.out.println("Employes:");
        for (int i = 0; i < nbEmployes; i++) {
            System.out.println("  " + employes[i] + " | Salaire: " + employes[i].calculerSalaire());
        }
        System.out.println();
    }
*/
}
