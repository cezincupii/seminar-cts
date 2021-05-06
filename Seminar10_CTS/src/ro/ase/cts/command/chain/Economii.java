package ro.ase.cts.command.chain;

public class Economii  extends Cont {

    public Economii(float sold, String numeClient, Cont succesor) {
        super(sold, numeClient, succesor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void plateste(float suma) {
        if(super.getSold() >= suma) {
            System.out.println(super.getNumeClient() + " a realizat plata de: " + suma + " din contul de economii");
        } else {
            super.getSuccesor().plateste(suma);
        }

    }

}