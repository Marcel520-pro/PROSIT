public class Produit {
    protected int id;
    protected String libelle;
    protected double prix;

    public Produit(int id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public String toString() {
        return "Produit [ID: " + id + ", Libelle: " + libelle + ", Prix: " + prix + "]";
    }
}
