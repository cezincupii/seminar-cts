package ro.ase.cts.ro.ase.cts.stateV2.classes;

public class Masa {
    private int nrMasa;
    private Stare stareMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stareMasa=new StareLibera();
    }


    public void elibereazaMasa() {
        if(!(stareMasa instanceof StareLibera)) {
            System.out.println("Masa cu nr: "+nrMasa+" a fost eliberata");
            stareMasa= new StareLibera();
        } else {
            System.out.println("Masa este deja libera");
        }
    }

    public void rezervaMasa() {
        if(stareMasa instanceof StareLibera) {
            System.out.println("Masa cu nr: "+nrMasa+" a fost rezervata");
            stareMasa=new StareRezervata();
        } else {
            System.out.println("Masa este deja rezervata");
        }
    }

    public void ocupaMasa() {
        if(!(stareMasa instanceof StareOcupata)) {
            System.out.println("Masa cu nr: "+nrMasa+"a fost ocupataa");
            stareMasa=new StareOcupata();
        } else {
            System.out.println("Masa este deja ocupata");
        }
    }
}
