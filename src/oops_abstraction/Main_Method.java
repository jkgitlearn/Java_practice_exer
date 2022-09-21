package oops_abstraction;

public class Main_Method {

	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();         // this was regular method

	}

}
//why and when to use abstract class and methods? To achieve security - hide certain details and only show the important details of an object.

//Note: Abstraction can also be achieved with Interfaces with keyword implements