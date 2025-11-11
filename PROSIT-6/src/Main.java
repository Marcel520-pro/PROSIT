//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(23, "Carrefour", "Obili");

        try{
            Produit p1 = new Produit(1234, "Ordinateur", 72000);
            Produit p2 = new Produit(8234, "Telephone", 1000);
            Produit p3 = new Produit(8934, "Aspirateur", 13000);

            m1.ajouterProduit(p1);
            m1.ajouterProduit(p2);
            m1.ajouterProduit(p3);


        }catch (MagasinPleinException | PrixNegatifException e){
            System.out.println(e.getMessage());
        }

        m1.afficherProduit();
    }
}