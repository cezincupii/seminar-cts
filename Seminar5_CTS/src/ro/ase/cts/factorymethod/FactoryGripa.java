package ro.ase.cts.factorymethod;

public class FactoryGripa implements FactoryCategorie {
    @Override
    public Categorie createCategorie(float pretDeBaza) {
        return new Gripa(pretDeBaza);
    }
}
