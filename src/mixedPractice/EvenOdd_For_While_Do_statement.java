package mixedPractice;

public class EvenOdd_For_While_Do_statement {

	public static void main(String[] args) {
		
		// print even numbers until 1000
				
			
		for(int a=2; a<=1000; a++)
			
		if (a%2==0){               // a%2!=0 it is to print odd numbers
			System.out.println(+a + " is an even number");
		} /*else {
			System.out.println(+a + " is an odd number"); //this statment will show both even and odd
		}*/
	}
}




 class Even_Odd
{ 
	public static void main(String[] args) //to calculate the sum of even numbers from 1 to 20?  program should list the numbers 
	                                       //and display their sum.
	{ 
		int sum = 0; 
		int i; 
// start a for loop from 2 and increment the counter by 2 
		for(i=2 ; i<=20 ; i+=2)  //increment is i++ or i+=2 for 2 increments
		{	
			System.out.println(i); 
			sum = sum+i; 
		} 
		 System.out.println("Sum is : "+sum);		
	} 
} 



