package ro.ase.cts.ro.ase.cts.stateV2.main;

import ro.ase.cts.ro.ase.cts.stateV2.classes.Masa;

public class Main {

    public static void main(String[] args) {
        Masa masa=new Masa(1);
        masa.rezervaMasa();

        masa.rezervaMasa();

        masa.rezervaMasa();

        masa.ocupaMasa();

        masa.elibereazaMasa();
    }
}
