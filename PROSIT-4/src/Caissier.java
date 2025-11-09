public class Caissier extends Employe{
    protected int idCaissier;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.idCaissier = idCaissier;
    }

    public double calculerSalaire(){
        double taux = 1000;
        if (nbHeures > 180) {
            int heureSupp = nbHeures - 180;
            return (180 * taux) + (heureSupp * taux * 1.15);
        }
        return nbHeures * taux;
    }

    public String toString() {
        return "Caissier [" + super.toString() + ", Caisse: " + idCaissier + "]";
    }
}
