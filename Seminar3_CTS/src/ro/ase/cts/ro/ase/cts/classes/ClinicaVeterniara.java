package ro.ase.cts.ro.ase.cts.classes;

public class ClinicaVeterniara {
    private String nume;
    private String adresa;
    private int numeMedici;
    private float buget;

    //Instanta este initializata la momentul declararii
    private static final ClinicaVeterniara clinica= new ClinicaVeterniara("Clinica Vet","Str Dorobanti",4,200);


    //Constructorul obligatoriu trebuie sa fie private
    public ClinicaVeterniara(String nume, String adresa, int numeMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.numeMedici = numeMedici;
        this.buget = buget;
    }

    //Functia statica care va returna instanta
    public static ClinicaVeterniara getInstance() {
        return clinica;
    }

    @Override
    public String toString() {
        return "ClinicaVeterniara{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numeMedici=" + numeMedici +
                ", buget=" + buget +
                '}';
    }
}
