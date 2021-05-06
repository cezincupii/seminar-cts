import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.chain.*;

public class Main {

        public static void main(String[] args) {
            ManagerComenzi manager = new ManagerComenzi();
            manager.invoca(null);

            Cont contCurent = new ContCurent(1600, "Catalin", null);

            Cont contEconomii = new Economii(2500, "Catalin",  null);

            Cont contCredit = new Credit(4000, "Catalin", null);

            Cont contIndisponibil = new ContIndisponibil("Catalin");

            contCurent.setSuccesor(contEconomii);
            contEconomii.setSuccesor(contCredit);
            contCredit.setSuccesor(contIndisponibil);

            contCurent.plateste(4500);
        }


}
