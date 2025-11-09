public class ProduitFruit extends Produit implements Critere{
    protected String saison;

    public ProduitFruit(String id, String type, String libelle, double quantite, String saison) {
        super(id, type,  libelle, quantite);
        this.saison = saison;
    }


    @Override
    public String determinerTypeProduit() {
        return "Fruit";
    }

    public boolean estFrais(String saison){
        return this.saison.equalsIgnoreCase(saison);
    }

    @Override
    public String toString() {
        return "ProduitFruit{" +
                "saison='" + saison + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}
