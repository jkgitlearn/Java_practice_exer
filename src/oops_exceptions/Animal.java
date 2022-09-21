package oops_exceptions;

public class Animal {

	public static void main(String[] args) {
		try {
			int x=90;
			System.out.println(90/0);
		}catch(ArithmeticException e) {     // if u dont write the catch exception e it will throw error in case if u r=write try catch should be written
			System.out.println(e);                  // if no exception found it wont look at catch block if exception found then look at catch block and see if matches to that exception if matches it runs smoothly othere wese exceotion thread 
	}finally {                         // it will always give o/p even catch is not written
			System.out.println("this is important code which extends always irrespective of exception");
		}

	}

}
