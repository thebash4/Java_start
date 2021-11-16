package defaultpackage;

public class Strings {
	
	
//length of a string
	static String txt = "Hello";
		
		public static void main(String[] args) {
			System.out.println(txt.length());

//Convert the value of txt to upper case.
			System.out.println(txt.toUpperCase());
			
//concatenate two strings
			String firstName = "John ";
			String lastName = "Doe";
			System.out.println(firstName.concat(lastName));
			
//Return the index (position) of the first occurrence of "e" in the following string
			System.out.println(txt.indexOf("e"));
			
}
}


		
	