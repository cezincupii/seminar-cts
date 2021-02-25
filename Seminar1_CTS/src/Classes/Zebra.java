package Classes;

public class Zebra extends Animal {
	private int nrStriatii;

	public Zebra(String name, float greutate, int nrStriatii) {
		super(name, greutate);
		this.nrStriatii = nrStriatii;
	}

	public Zebra(String name, float greutate) {
		super(name, greutate);
		// TODO Auto-generated constructor stub
	}

	public int getNrStriatii() {
		return nrStriatii;
	}

	public void setNrStriatii(int nrStriatii) {
		this.nrStriatii = nrStriatii;
	}
	
	

}
