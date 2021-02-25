package Classes;

public class Giraffe extends Animal {
	
	private int  inaltime;

	public Giraffe(String name, float greutate, int inaltime) {
		super(name, greutate);
		this.inaltime = inaltime;
	}
	
	

	public Giraffe(String name, float greutate) {
		super(name, greutate);
		// TODO Auto-generated constructor stub
	}



	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
	
	
	
	

}
