package oops_exceptions;

public class ThrowExcep1 {   //try catch exception with multiple catches 
	
	

	public static void main(String[] args) {
		//try block containing exception prone code
        try{    
            System.out.println("try Block:: Begin");  
            int myArray[]=new int[5];    
            myArray [5]=10/0;    
        } 
        //multiple catch blocks
        catch(ArithmeticException e)  //child class of exception
        {  
            System.out.println("Arithmetic Exception :: Divide by zero!!");  
        }
        catch(ArrayIndexOutOfBoundsException e)  //child class of exception
        {  
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");  
        } 
        catch(Exception e)  //parent class-- it has to be child to parent not parent to child if first parent then child it gives u error
        {  
            System.out.println("Exception :: " + e.getMessage ());  
        }       
        System.out.println("rest of the code"); 

	}

}
