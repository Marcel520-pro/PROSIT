public class Responsable extends Employe {
    protected double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public double calculerSalaire() {
        double taux = 2000;
        if (nbHeures > 160) {
            int supp = nbHeures - 160;
            return (160 * taux) + (supp * taux * 1.20) + prime;
        }
        return nbHeures * taux + prime;
    }

    public String toString() {
        return "Responsable [" + super.toString() + ", Prime: " + prime + "]";
    }
}
