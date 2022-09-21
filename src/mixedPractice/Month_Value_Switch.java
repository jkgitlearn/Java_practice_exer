package mixedPractice;

public class Month_Value_Switch {

	public static void main(String[] args) {      // print based on the month value like 1 means january,12 means february
		
		int monthnumber=11;
		System.out.println("Enter any number between 1-12 to display the name of the month");
  
		switch(monthnumber) 
		{
		
		case 1:
			System.out.println("The name of the month number 1 is January");
			break;
		case 2:
			System.out.println("The name of the month number 2 is february");
			break;
		case 3:
			System.out.println("The name of the month number 3 is March");
			break;
		case 4:
			System.out.println("The name of the month number 4 is April");
			break;
		case 5:
			System.out.println("The name of the month number 5 is MAy");
			break;
		case 6:
			System.out.println("The name of the month number 6 is June");
			break;
		case 7:
			System.out.println("The name of the month number 7 is July");
			break;
		case 8:
			System.out.println("The name of the month number 8 is August");
			break;
		case 9:
			System.out.println("The name of the month number 9 is September");
			break;
		case 10:
			System.out.println("The name of the month number 10 is October");
			break;
		case 11:
			System.out.println("The name of the month number 11 is November");
			break;
		case 12:
			System.out.println("The name of the month number 12 is December");
			break;	
			default:
			System.out.println("you have entered invalid number");				
		}
	}

}
