package oops_Polymorphism;

public class Pig  extends Animal{
	
	public void animalSound() {              //overriding animal class method
		System.out.println("the pig says: oink oink"); 
	}
	
	

	public static void main(String[] args) {
		Animal MyAnimal = new Animal();
		MyAnimal.animalSound();
		Pig MyPig = new Pig();
		MyPig.animalSound();

	}

}
