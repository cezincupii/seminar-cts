package ro.ase.cts;

import ro.ase.cts.ro.ase.cts.strategy.classes.Card;
import ro.ase.cts.ro.ase.cts.strategy.classes.Cash;
import ro.ase.cts.ro.ase.cts.strategy.classes.Client;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client= new Client("Gigel");
        client.setModPlata(new Cash());

        client.platesteNota(200);

        client.setModPlata(new Card(500));
        client.platesteNota(350);
        client.platesteNota(250);
    }
}
