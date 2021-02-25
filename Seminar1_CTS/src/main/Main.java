package main;

import Classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zookeeper zookeeper = new Zookeeper("Madalin");
		Zoo zoo=new Zoo();
		zoo.setZookeeper(zookeeper);
		
	}

}
