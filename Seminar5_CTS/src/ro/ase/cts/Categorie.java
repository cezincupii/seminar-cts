package ro.ase.cts;

public abstract class Categorie {
    float pretDeBaza=0;

    public float getPretDeBaza() {
        return pretDeBaza;
    }

    public void setPretDeBaza(float pretDeBaza) {
        this.pretDeBaza = pretDeBaza;
    }

    public Categorie(float pretDeBaza) {
        this.pretDeBaza = pretDeBaza;
    }
}
