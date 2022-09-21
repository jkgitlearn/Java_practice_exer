package mixedPractice;

public class Print7_Multiplication {

	public static void main(String[] args) {    //print 7 multiplication table upto 20 like 7*1=7 till 7*20=140
		
		int num =7;
		for (int i=1; i<=20; i++) {
			System.out.println(num + "*" +  +i + " = " + (num*i));
		}
	}
}


class Print7_Multiplication_while{
	
	public static void main(String[]args) {
		
	int num1=7;
	int a=1;
	while(a<=20) 
	{
		System.out.println(num1 + " * " +  +a + " = " + (num1*a));
		a++;
	}
	
	}
}

