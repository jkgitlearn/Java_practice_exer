package oopsConcepts_Inheritnace;

public class Car extends Vehicle {
	
	String modelName = "Mustang";  // car attribute
	

	public static void main(String[] args) {
		
		Car c = new Car();          // Create a myCar object
		c.honk();                   // Call the honk() method (from the Vehicle class) on the myCar objec
		                           // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	System.out.println(c.brand +  " " + c.modelName);
	}

}
//Inheritance lets us inherit attributes and methods from another class