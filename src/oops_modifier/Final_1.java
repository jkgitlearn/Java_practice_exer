package oops_modifier;

public class Final_1 {
	
	final int i = 10;
	final double PI = 3.14;

	public static void main(String[] args) {
		Final_1 f = new Final_1();
	//	f.i=20;     // will generate an error: cannot assign a value to a final variable
	//	f.PI=34.2;  // will generate an error: cannot assign a value to a final variable
	System.out.println(f.i + " + " + f.PI);

	}

}
 
//If you don't want the ability to override existing attribute values, declare attributes as final:

//Access Modifiers:
//For classes, you can use either public or default:
//For attributes, methods and constructors, you can use the one of the following:public,private,default,protected

//Non-Access Modifiers
//For classes, you can use either final or abstract:
//For attributes, methods  you can use the one of the following:final,static,abstract,transient,synchronized,volatile