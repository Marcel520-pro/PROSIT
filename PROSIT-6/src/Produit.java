public class Produit {
    protected int id;
    protected String libelle;
    protected double prix;

    public Produit(int id, String libelle, double prix) throws PrixNegatifException {
        if (prix < 0){
            throw new PrixNegatifException("Erreur : Le prix du produit " + libelle + " ne peut pas être négatif (" + prix + ").");
        }
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }
}
