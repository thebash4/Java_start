package defaultpackage;


/* class {
 *      main method { define variables;
 *                    different methods ();
 *                    call out other objects; }
 *    }                  
 */


public class LearnJava { //class definition

	public static void main(String[] args) { //main method
		
		int a=5;  //instance variables
		char b= 'i';
		long c= 400;
		double d=3.2;
		String x = "i am dog";
		String name = "susan";
		killer();
		System.out.println (abc (2,4));
		 
		
		Student r1= new Student (); // using objects that are created in another class e.g student.java
		r1.name = "Tom";
		r1.color = "Red";
		r1.weight= 30;
		r1.introduce(); // this is a method within an object (behavior of the object)
		
		
	
		
		System.out.println(a);
		System.out.println(name.toUpperCase());
	 }
	
	
		public static void killer() {  //different method definition
			System.out.println("hi"); //method body
		}

		public static int abc(int a, int b) { //another method definition
			return a+b;
		} 

}





// method = behavior eg. add, multiply
// instance variables= states