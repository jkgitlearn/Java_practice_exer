package mixedPractice;

public class Methods {               //class, objects, methods
	
	
	//Write a static method to compute the average of three numbers.
	
	static void averageOfThreeNumbers() {
		int a=22;
		int b=23;
		int c=24;
		int d= (a+b+c)/3;
		System.out.println("average of three numbers " + a + "+" + b + "+" + c  + "=" + d);
	}
		
	static int averageOfThreeNumbers1(int a, int b, int c) {
			int d=(a+b+c)/3;
			System.out.println(d);
			return d;		
	}
	
	public static void main(String[] args) {
		averageOfThreeNumbers();
		averageOfThreeNumbers1(3,4,5);
				
	}
}

class Methods1{
	

	int a; int b; int c; int d;          // for constructor calling object in main method ---->average of 3 numbers
                                        //constructor is a kind of method but the constructor name should have same name as class
	                                    // if u see any method same as class name it means that is constructor
	/*public Methods1() {  //constructor
	 a=12;
	 b=13;
	 c=14;
	 d=(a+b+c)/3;
	//System.out.println(d);
   }*/	
	
	Methods1(int ab, int bc, int cd) {
		a=ab;
		b=bc;
		c=cd;
		d=(a+b+c)/3;
		//System.out.println(d);
	}
	
	public static void main(String[]args) {
		
		Methods1 num = new Methods1(14,5,6);
		System.out.println(num.d);	
	}
}

class Methods2{
	
	int a=5;           //calling object in main method ----->average of three numbers--->non static method
	int b=6;           
	int c=7;
	int d= (a+b+c)/3;	
   
		public static void main(String[]args) {
		
		Methods2 num = new Methods2();
	    System.out.println(num.d);			
	}
}


//It is common to use if...else statements inside methods:

class Methods3 {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}




