package ro.ase.cts;

public class Main {

    public static CategoriiMedicamente getTipCategorie() {
        return CategoriiMedicamente.raceala;
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        CategorieFactory factory=new CategorieFactory();
        Categorie durere= factory.creareCategorie(CategoriiMedicamente.durere,5);
        Categorie body= factory.creareCategorie(CategoriiMedicamente.body,10);
        Categorie categorie=factory.creareCategorie(getTipCategorie(),15);

        System.out.println(durere.toString());
        System.out.println(body.toString());
        System.out.println(categorie.toString());
    }
}
