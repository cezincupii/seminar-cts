package observer.main;

import observer.classes.ClientAbonat;
import observer.classes.Sala;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ClientAbonat clientMarcel = new ClientAbonat("Marcel");
        ClientAbonat clientIon = new ClientAbonat("Ion");
        ClientAbonat clientMirel = new ClientAbonat("Mirel");

        Sala sala = new Sala("Sala FCSB");
        sala.aboneazaClient(clientMirel);
        sala.aboneazaClient(clientIon);
        sala.aboneazaClient(clientMarcel);
        sala.anuntaMeci();
        sala.dezaboneazaClient(clientIon);
        sala.anuntaMeciVolei();
    }

}
