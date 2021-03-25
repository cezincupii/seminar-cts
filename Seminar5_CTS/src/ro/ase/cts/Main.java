package ro.ase.cts;

import ro.ase.cts.factorymethod.*;
import ro.ase.cts.factorymethod.Categorie;

public class Main {

    public static FactoryCategorie getTipFactory() {
        return new FactoryGripa();
    }

    public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
        Categorie categorie= factoryCategorie.createCategorie(pretDeBaza);
        System.out.println(categorie.toString());
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        printeazaCategorie(getTipFactory(), 15);

    }
}
