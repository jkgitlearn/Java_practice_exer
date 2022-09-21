package oops_abstraction;

public abstract class Animal1 {   // abstract class and cannot create an object
	
	
	public abstract void animalSound();// abstract method and abstract doesnt have body
	public void sleep() {              // regular method
		System.out.println("zzz");
	}

	public static void main(String[] args) {
		//Animal1 myObj = new Animal1();      // will generate an error bcoz we cannot create object (abstract class)
	}

}

class Pig extends Animal1 { // subclass inherit form animal
	
    public void animalSound() {  //// The body of animalSound() is provided here
	System.out.println("the pig says: oink oink");
}
	
}