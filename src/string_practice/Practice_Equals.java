package string_practice;

public class Practice_Equals {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		String myStr= "Hello";
		String str1 = "hello";
		String str2 = "Another String";
		String str3 = "HELLO";
		String str4 = "Hello planet earth, you are a great planet.";
		String str5 = "";
		String str6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // instead of str6 u can write txt 
		String str7 = "       Hello World!       ";
		
		
 //equals()--->Compares two strings. Returns true if the strings are equal, and false if not.
// equals()---> method to compare two strings without consideration of Unicode values.
//retrurn type boolean
//syntax--->public boolean equals(Object anotherObject)
		
		System.out.println("EQUALS()");
		System.out.println(str.equals(str1)); //false                
		System.out.println(str.equals(str2)); //false
		System.out.println(str1.equals(str2));//false
		
	
//EqualsIgnoreCase()---->The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
//return type boolean
//syntax--->public boolean equalsIgnoreCase(String anotherString)
		
		System.out.println("EQUALSWITHIGNORECASE()");
		System.out.println(str.equalsIgnoreCase(str3));// true      
		System.out.println(str.equalsIgnoreCase(str2));//false 
		
//endsWith()---->The endsWith() method checks whether a string ends with the specified character(s).
//return type boolean
// syntax--->public boolean endsWith(String chars)
		
		System.out.println("ENDSWITH()");
		System.out.println(str.endsWith("Hel"));   // false
		System.out.println(str.endsWith("llo"));   // true
		System.out.println(str.endsWith("o"));     // true
		
		
//The startsWith() method checks whether a string starts with the specified character(s).
//return type boolean
// syntax--->public boolean startsWith(String chars)
		
		System.out.println("STARTSWITH()");
		System.out.println(str.startsWith("Hel"));   // true
		System.out.println(str.startsWith("llo"));   // false
		System.out.println(str.startsWith("o"));     // false

		
//Contains---->The contains() method checks whether a string contains a sequence of characters.
//Returns true if the characters exist and false if not.
// return type boolean
//syntax--->public boolean contains(CharSequence chars)		
		
		System.out.println("CONTAINS()");
		System.out.println(str.contains("Hel"));   // true
		System.out.println(str.contains("e"));     // true
		System.out.println(str.contains("Hi"));    // false

		
//indexOf()---->The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
// Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.
//return type int
// syntax--->There are 4 indexOf() methods:
//public int indexOf(String str)
//public int indexOf(String str, int fromIndex)
//public int indexOf(int char)
//public int indexOf(int char, int fromIndex)
		
		System.out.println("INDEXOF()");
		System.out.println(str4.indexOf("planet"));  //Search a string for the first occurrence of "planet":
		System.out.println(str4.indexOf("e", 5));    //Find the first occurrence of the letter "e" in a string, starting the search at position 5:
		
//isEmpty()---->The isEmpty() method checks whether a string is empty or not.
//This method returns true if the string is empty (length() is 0), and false if not.
//return type boolean
//syntax--->public boolean isEmpty()
		
		System.out.println("ISEMPTY()");
		System.out.println(str1.isEmpty());
		System.out.println(str5.isEmpty());
		
//length()---->The length() method returns the length of a specified string.
// The length of an empty string is 0.
// return type int
// syntax--->public int length()
		
		System.out.println("LENGTH()");
		System.out.println(str6.length());
		
//trim()---->The trim() method removes whitespace from both ends of a string.
//This method does not change the original string.
//return type string
//syntax--->public String trim()
		
		System.out.println("TRIM()");
		System.out.println(str);
		System.out.println(str7.trim());   //Remove whitespace from both sides of a string
		
//compareTO()---->The compareTo() method compares two strings lexicographically.
//The comparison is based on the Unicode value of each character in the strings.
//The method returns 0 if the string is equal to the other string. A value less than 0 is returned
//if the string is less than the other string (less characters) and a value greater than 0 if the 
//string is greater than the other string (more characters).
//return type int
//syntax--->public int compareTo(String string2)
		  //public int compareTo(Object object)
		
		System.out.println("COMPARETO()");
		System.out.println(str.compareTo(str1)); 
		System.out.println(str.compareTo(myStr)); // Returns 0 because they are equal
		
		
		
//compareToIgnoreCase()---->The compareToIgnoreCase() method compares two strings lexicographically, ignoring lower case and upper case differences.
//The comparison is based on the Unicode value of each character in the string converted to lower case.
//The method returns 0 if the string is equal to the other string, ignoring case differences.
//A value less than 0 is returned if the string is less than the other string (less characters) 
//and a value greater than 0 if the string is greater than the other string (more characters).
//return type int
//syntax--->public int compareToIgnoreCase(String string2)
				
				System.out.println("COMPARETOIGNORECASE()");
				System.out.println(str.compareToIgnoreCase(str1));
						
		
	
		
		
		
	}

}
