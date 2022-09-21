package oops_concepts;

import java.util.Scanner;

public class Oops_Scanner {  //use this class name when object is created in main method.     // sum of even and odd numbers
	
	/* Instance variables in Java are non-static variables which are defined in a class outside any method, constructor or a block. 
 Each instantiated object of the class has a separate copy or instance of that variable. An instance variable belongs to a class.*/
	
    int even=0;             //instance variable, this can also be written in static variable---->Instance variables are created when an object is created 
	int n=20;              //instance variable                                                       with the use of the keyword 'new'
	static int odd=0;     // class variable----->Class variables are variables in which there is only one copy of the variable shared 
	                     //                      with all the instance of the class
	
    	public static void main(String[] args) {
    		Oops_Scanner sum = new Oops_Scanner();        // object created to call instance variables
    		
    		for(int a=1; a<=sum.n; a++) {
    			if(a%2==0) {
    			sum.even=sum.even+a;
    			}else
    			{
    				odd=odd+a;                        //  // call directly bcoz its a static member of a class
    			}
    		}
    		System.out.println("the sum of even numbers is = " +sum.even);
    		System.out.println("the sum of odd numbers is = " + odd);
    		
	}
}

//more than 1 time variable is used go with "object reference", only 1 time variable used  go with  "object"

class Oops_1 {   //FACTORIAL
	
	int p=5;
	int q=1;
	int c=1;
	
	public static void main(String[]args) {
		
		Oops_1 fact = new Oops_1();  //object created to call instance variables that is in class
		
		for (int a =1; a<=fact.p; a++) {
		  fact.c=1;
		  for(int b=a; b>=fact.q; b--)
		  {
			  fact.c=fact.c*b;
		  }
		  System.out.println(a + "!= " + fact.c);
		}			
	}	
}

//one copy of class variables exists for all objects
//separate copy of instance variables exists for every object

class Oops_2 {
	
	static int b;
	int r=0;                                 //instance var
	int s=0;                                 //instance var this can also be written in static va
	
	
	public static void main(String[]args) {  //find the given number is palidrone like 232 reverse is 232 itself
		
		Scanner sc= new Scanner(System.in);
		System.out.println("print any number");
		b=sc.nextInt();
		Oops_2 ob = new Oops_2();           //created an object for instance variable 
		
		for(int n=b; n!=ob.s; n/=10) 
		{
			int t=n%10;
		    ob.r= ob.r*10+t;
		}
		if(ob.r==b)
		{	
			System.out.println("reveresd number " + ob.r + "  is  a palidrome");
		}
		else
		{
			System.out.println("reveresd number " + ob.r + "  is not a palidrome");
		}		
	}	
}


class Oops_3{                         // find first and last digit is equal to middle digit

    int b=235;                   //instance variables
    int ld=0, md=0;              //instance variables
    int fd=0;                    //instance variables
   // static int t =0;             //class variable
    
    public static void main(String[] args) {
    	Oops_3 ob =new Oops_3();
    	
    	ob.ld=ob.b%10;
    	ob.b=ob.b/10;
    	ob.md=ob.b%10;
    	ob.b=ob.b/10;
    	ob.fd=ob.b%10;
    	
    	int sum=ob.fd+ob.ld;
    	
    	if(sum==ob.md) {
    		System.out.println("sum of the first & last digits equal to middle digit");
    	}else {
    		System.out.println("sum of the first & last digits not equal to middle digit");
    	}
    	
		/*
		 * for(int a=ob.b; a!=0; a/=10) { ob.ld=a%10; // used object reference
		 * while(a!=0) { ob.fd=a%10; a/=10; } t = ob.ld+ob.fd; } if(t==ob.fd) // taken
		 * directly for class/static variable { System.out.println(ob.b+
		 * "="+" sum of first and last digits "+ob.fd+"+"+ob.ld+ "="+t+
		 * " is equal to the middle number"); } else { System.out.println(ob.b+
		 * "="+" sum of first and last digits "+ob.fd+"+"+ob.ld+ "="+t+
		 * " is not equal to the middle number"); }
		 * 
		 */            
    }
}    

class Oops_4 {
	
	
	int x=5;
	static int y=10;
	
	public static void main(String[] args) {
		Oops_4 ob1 = new Oops_4();            //object created to call instance variables
		Oops_4 ob2 = new Oops_4();
		
		ob1.x=ob1.x+2;
		ob1.y=ob1.y+2;	
		//ob2.x=ob2.x+3;	
		
		System.out.println(ob1.x);  // instance variable exists separate copy for every object ob1---> 5+2=7
		System.out.println(ob1.y);	// class variable exists only one copy of class variable in all objects  ob1--->10+2=12
	    System.out.println(ob2.x);  // instance variable exists separate copy of every object ob2--->5
	    System.out.println(ob2.y);  // class variable exists only one copy of class variable in all objects  ob2--->10+2=12
	
	}		
}
	
//one copy of class variables exists for all objects
//separate copy of instance variables exists for every object
	
	





