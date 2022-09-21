package oops_interface;

public interface Animal1 {
	
	public void myMethod(); // interface/abstract method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface/abstract method
	}

	class DemoClass implements Animal1, SecondInterface {  //multiple interface
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  public void myOtherMethod() {
	    System.out.println("Some other text...");
	  }
	}

	/*class MainInterface {          //i cannot write main method here it is not executing i dont know why.
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
}*/
