package ro.ase.cts.ro.ase.cts.state.classes;

public class StareRezervata implements StareMasa {

    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStareMasa() instanceof StareLibera) {
            masa.setStareMasa(this);
            System.out.println("Ati rezervat masa " + masa.getNrMasa());
        }else {
            System.out.println("Masa nu este disponibila");
        }
    }
}
