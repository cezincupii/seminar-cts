package main;

import Classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zookeeper zookeeper = new Zookeeper("Madalin");
		Zoo zoo=new Zoo();
		zoo.setZookeeper(zookeeper);
		
		
		Giraffe giraffe= new Giraffe("Girafa",10);
		Giraffe secondGiraffe=new Giraffe("GirafaDoi",15,20);
		
		zoo.addAnimal(giraffe);
		zoo.addAnimal(secondGiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra zebra=new Zebra("Zebra",15);
		Zebra secondZebra=new Zebra("Zebra",20,50);
		
		zoo.addAnimal(zebra);
		zoo.addAnimal(secondZebra);
		
		zoo.feedAllAnimals();
	}

}
