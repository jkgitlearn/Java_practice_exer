package mixedPractice;

public class Prime_Numbers {

	public static void main(String[] args) {        //prime numbers between 0 to 100
		 //Empty String
		String primeNumbers = "";
		
		for(int i=0; i<=100; i++) 
		{
			int c=0;
			for(int j=i; j>=1; j--) {
				if(i%j==0) {
					c=c+1;
				}
			}
		
		if(c<=2) {
			//System.out.println("prime numbers are "  + i + " "); //either ways u can write this one just print 
			  //Appended the Prime number to the String
			primeNumbers = primeNumbers + i + " ";
		}
			
		}
		System.out.println("prime numbers from 1 to 100 are ");
		System.out.println(primeNumbers);
	}
}
