public class Vendeur extends Employe {
    protected double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public double calculerSalaire() {
        return 810000 * tauxDeVente;
    }

    public String toString() {
        return "Vendeur [" + super.toString() + ", Taux de vente: " + (tauxDeVente * 100) + "%]";
    }
}
