package mixedPractice;

public class Abbrevations {

	public static void main(String[] args) {            // write a program by taking abbrevations of countries like IN: India
		
		String countryCode = "IN";
		
		switch (countryCode) {
		case "IN":
			System.out.println(countryCode + " :This is India");
			break;
		case "USA":
			System.out.println(countryCode + " :This is United States of America");
			break;
		case "AE":
			System.out.println(countryCode + " :United Arab Emirates");
			break;
		case "AU":
			System.out.println(countryCode + " :Australia");
			break;
		default:
			System.out.println("Invalid Country Code");
		} 
	}
}
