package oops_Polymorphism;

public class Cow extends Pig {  // u can extend pig too u get the same result it inherits all methods from that class u extended
	
	public void animalSound() {
		System.out.println("the cow says: moo moo");
	}

	public static void main(String[] args) {
		Animal MyAnimal = new Animal();
		MyAnimal.animalSound();
		Pig MyPig = new Pig();
		MyPig.animalSound();
		Cow MyCow = new Cow();
		MyCow.animalSound();


	}

}
