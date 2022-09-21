package oops_exceptions;

public class Throws_excep1 {
	
	int i=2,j=0;
	public void checkmethod () throws ArithmeticException{
	System.out.println(i/j);
	}
	 

	public static void main(String[] args) {
		Throws_excep1 d =new Throws_excep1();
		 
		try {
		d.checkmethod();
		}
		catch (ArithmeticException ae) {
		 
		ae.printStackTrace();
		}
	}

}


/* 1 Exceptions are abnormal events that are occurred during the program execution and it will affect the execution flow.
2 An error is different from exceptions. Errors Example: Memory out of error.
3 Checked exceptions are checked during compilation and it is mandatory to deal with this checked exception.
4 An unchecked exception occurs during the runtime.*/



