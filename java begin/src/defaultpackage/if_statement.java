package defaultpackage;

public class if_statement {
	static int x = 50;
	static int y = 10;
	
	
	
  public static void main(String[] args) {
	  
//Print "Hello World" if x is greater than y.
	  if (x > y) {
	  System.out.println("Hello World");}
	  
//Print "Yes" if x is equal to y, otherwise print "No".	  
	 
	  if(x == y) {System.out.println("Yes");} 
	  else{System.out.println("No");}  
	  
//Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
  
	  if(x ==y) {System.out.println("1");} 
	  else if(x > y) {System.out.println("2");} 
	  else{System.out.println("3");} 
	  
	  
	  
	}
  

}