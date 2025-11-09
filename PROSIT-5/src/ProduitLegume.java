public class ProduitLegume extends Produit implements Critere{
    protected String saison;

    public ProduitLegume(String id, String type, String libelle, double quantite, String saison) {
        super(id, type, libelle, quantite);
        this.saison = saison;
    }

    public ProduitLegume() {

    }

    @Override
    public String determinerTypeProduit() {
        return "Legume";
    }

    public boolean estFrais(String saison) {
        if (this.saison.equalsIgnoreCase(saison)) {
            return true; // même mois → frais
        }

        if (this.saison.equalsIgnoreCase("Janvier") && saison.equalsIgnoreCase("Février")) return true;
        if (this.saison.equalsIgnoreCase("Février") && saison.equalsIgnoreCase("Mars")) return true;
        if (this.saison.equalsIgnoreCase("Mars") && saison.equalsIgnoreCase("Avril")) return true;
        if (this.saison.equalsIgnoreCase("Avril") && saison.equalsIgnoreCase("Mai")) return true;
        if (this.saison.equalsIgnoreCase("Mai") && saison.equalsIgnoreCase("Juin")) return true;
        if (this.saison.equalsIgnoreCase("Juin") && saison.equalsIgnoreCase("Juillet")) return true;
        if (this.saison.equalsIgnoreCase("Juillet") && saison.equalsIgnoreCase("Août")) return true;
        if (this.saison.equalsIgnoreCase("Août") && saison.equalsIgnoreCase("Septembre")) return true;
        if (this.saison.equalsIgnoreCase("Septembre") && saison.equalsIgnoreCase("Octobre")) return true;
        if (this.saison.equalsIgnoreCase("Octobre") && saison.equalsIgnoreCase("Novembre")) return true;
        if (this.saison.equalsIgnoreCase("Novembre") && saison.equalsIgnoreCase("Décembre")) return true;
        return this.saison.equalsIgnoreCase("Décembre") && saison.equalsIgnoreCase("Janvier");
    }


    @Override
    public String toString() {
        return super.toString() + "ProduitLegume{" +
                "saison='" + saison + '\'' +
                '}';
    }
}
