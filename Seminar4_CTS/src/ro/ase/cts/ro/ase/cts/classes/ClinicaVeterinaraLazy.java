package ro.ase.cts.ro.ase.cts.classes;

public class ClinicaVeterinaraLazy {
    private String nume;
    private String adresa;
    private int numeMedici;
    private float buget;

    private static ClinicaVeterinaraLazy instanta= null;

    private ClinicaVeterinaraLazy(String nume, String adresa, int numeMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.numeMedici = numeMedici;
        this.buget = buget;
    }

    public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numeMedici, float buget) {
        if(instanta==null) {
            instanta = new ClinicaVeterinaraLazy(nume,adresa,numeMedici,buget);
        }
        return instanta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNumeMedici(int numeMedici) {
        this.numeMedici = numeMedici;
    }

    public void setBuget(float buget) {
        this.buget = buget;
    }

    public static void setInstanta(ClinicaVeterinaraLazy instanta) {
        ClinicaVeterinaraLazy.instanta = instanta;
    }

    @Override
    public String toString() {
        return "ClinicaVeterinaraLazy{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numeMedici=" + numeMedici +
                ", buget=" + buget +
                '}';
    }
}
