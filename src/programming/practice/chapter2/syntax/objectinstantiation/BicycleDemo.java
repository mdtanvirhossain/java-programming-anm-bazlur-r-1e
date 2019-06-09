package programming.practice.chapter2.syntax.objectinstantiation;

public class BicycleDemo {

	public static void main(String[] args) {
		
		//create two different
		//Bicycle objects
		
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		//call methods on those objects
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.printStates();


	}

}
