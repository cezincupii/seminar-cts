package ro.ase.cts.ro.ase.cts.classes;

public class Vaccin {
    private String numeProducator;
    private int numarDoze;
    private float pret;

    private static Vaccin instanta=null;

    public static synchronized Vaccin getInstance(String numeProducator, int numarDoze, float pret) {
        instanta=(instanta==null ? new Vaccin(numeProducator,numarDoze,pret) : instanta );
        return instanta;
    }

    //T


    public void setNumeProducator(String numeProducator) {
        this.numeProducator = numeProducator;
    }

    public void setNumarDoze(int numarDoze) {
        this.numarDoze = numarDoze;
    }

    public void setpret(int pret) {
        this.pret = pret;
    }

    public static void setInstanta(Vaccin instanta) {
        Vaccin.instanta = instanta;
    }

    private Vaccin(String numeProducator, int numarDoze, float pret) {
        this.numeProducator = numeProducator;
        this.numarDoze = numarDoze;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Vaccin{" +
                "numeProducator='" + numeProducator + '\'' +
                ", numarDoze=" + numarDoze +
                ", pret=" + pret +
                '}';
    }
}


