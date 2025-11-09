public class Produit {
    protected String id;
    protected String type;
    protected String libelle;
    protected double quantite;

    public Produit(String type, String id, String libelle, double quantite) {
        this.type = type;
        this.id = id;
        this.libelle = libelle;
        this.quantite = quantite;
    }

    public Produit() {

    }

    public String determinerTypeProduit(){
        return "Autre";
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}
