package oops_concepts;

//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

public class Encapsu {
	
	private String name;   //Private =restricted access
	
	
	 // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;              //the this keyword is used to refer to the current object.
	  }

	public static void main(String[] args) {
		// Encapsu myObj = new Encapsu();
		//    myObj.name = "John";  
		//   System.out.println(myObj.name); //  if i write in the same class it executes if i write in
		                                     // another class it will not execute because it is private string
		                                // to provide to the public we have to use get and set 
		                                 //make it public instead private then it will give output even u write in
		                                 //differnt class
		                                  //private is accesible with in that class so if i write in another class it wont execute
		
	}

}
