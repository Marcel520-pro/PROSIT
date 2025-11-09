public class Magasin {
    protected int id;
    protected String nom;
    protected String adresse;
    protected Produit[] produits = new Produit[50];
    protected Employe[] employes = new Employe[50];
    protected int nbProduits = 0;
    protected int nbEmployes = 0;

    public Magasin(int id, String nom, String adresse){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public void ajouterProduit(Produit p){
        produits[nbProduits] = p;
        nbProduits++;
    }

    public void ajouterEmployes(Employe e){
        if(nbEmployes < 20) {
            employes[nbEmployes] = e;
            nbEmployes++;
        }
    }

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

}
