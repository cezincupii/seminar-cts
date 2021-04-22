package ro.ase.cts.ro.ase.cts.strategy.classes;

public class Card implements ModPlata {

    private double sold;

    public Card(double sold) {
        super();
        this.sold = sold;
    }

    @Override
    public void plateste(double suma) {
        if(sold>=suma) {
            System.out.println("Se plateste cu cardul suma: "+suma);
            sold-=suma;
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
