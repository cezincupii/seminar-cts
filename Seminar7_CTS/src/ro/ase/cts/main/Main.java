package ro.ase.cts.main;


import ro.ase.cts.adapter.AdapterCredit;
import ro.ase.cts.adapter.AdapterCreditObj;
import ro.ase.cts.adapter.InterfataCredit;
import ro.ase.cts.adapter.Leasing;
import ro.ase.cts.decorator.AbstractDecorator;
import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.ConcretDecorator;
import ro.ase.cts.decorator.ICard;

public class Main {

    public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
        credit.acordaCredit(numeClient,suma);
    }

    public static void main(String[] args) {
	// write your code here
        Leasing leasing= new Leasing();
        AdapterCreditObj adapter = new AdapterCreditObj(leasing);
        oferaInfoCredit(adapter,"GIgel",250.50f);

        AdapterCredit adapterCredit=new AdapterCredit();
        oferaInfoCredit(adapterCredit,"Mihai",122.43f);

        ICard card= new Card("Maria");
        card.platesteFizic();
        card.platesteOnline();

        AbstractDecorator decorator= new ConcretDecorator(card);
        decorator.platesteContactless();
    }
}
