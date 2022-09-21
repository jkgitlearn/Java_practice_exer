package oops_exceptions;

public class ThrowExcep {              //confused code will write another try catch code
	
	static void fun()
	{
		try 
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
		    System.out.println("caught inside fun()");
			throw e;                                   // rethrowing exception, if i dont write rethrow caught in main dont execute
		}
	}
	public static void main(String[] args) {
	try 
	{
		fun();		
	}
	catch(NullPointerException e) 
	{
		System.out.println("caught in main");
	}
		
	}	

}
