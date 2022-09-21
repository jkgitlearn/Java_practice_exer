package oops_interface;

public class Animal_InterfaceMain {

	public static void main(String[] args) {
		
				Pig p = new Pig();
				p.animalsound();
				p.sleep();
	}

}


/*Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object 
(interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces.
Note: To implement multiple interfaces, separate them with a comma (see example below). */