package ro.ase.cts.ro.ase.cts.state.classes.main;

import ro.ase.cts.ro.ase.cts.state.classes.Masa;
import ro.ase.cts.ro.ase.cts.state.classes.StareLibera;

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
