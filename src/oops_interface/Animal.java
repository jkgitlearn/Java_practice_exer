package oops_interface;

public interface Animal {    //Another way to achieve abstraction in Java, is with interfaces.

	public void animalsound(); // interface/abstract method does not have a body 
	public void sleep();       // interface/abstract method does not have a body
		                       // and interface should have only abstract method even u didnt 	                           //specify abstract it automatically it is abstract as it is interface
}

class Pig implements Animal {
	
	public void animalsound() {            // The body of animalSound() is provided here
		System.out.println("interface pig says: oink oink");   
	}	                                             
	
	public void sleep() {              //The body of sleep() is provided here
		System.out.println("interface sleep: zzzzz");  
		
		                             // whenever we r implemtnitng an interface for each and
	}	                            //every abstract method of that interface, we should provide
		                              //implementation in child class otherwise make that class as abstract	
}

 /*class Main {    // i cant write here main method i wrote in different class because its not executing and i dont know why
	public static void main(String[] args) {   // its executing in oops executions i write like this main method there but here its not working i dont know why
		
		Pig p = new Pig();
		p.animalsound();
		p.sleep();
	}
}*/

//Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
//Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)


