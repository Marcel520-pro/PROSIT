public class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbHeures;

    public Employe(int id, String nom, String adresse, int nbHeures){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbHeures = nbHeures;
    }

    public double calculerSalaire(){
        return 0;
    }

    public String toString(){
        return "{ ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + ", Horaire: " + nbHeures + " }";

    }
}
