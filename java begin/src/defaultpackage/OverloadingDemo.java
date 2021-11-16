package defaultpackage;

public class OverloadingDemo {
	//Method overloading
	public int add(int a,int b) {  //behavior 1 of the class
	return a+b;
	}

	public float add(int a,int b,int c) {    //behavior 2 of the class
	return a+b+c;
	}


	public static void main(String args[]) {
	OverloadingDemo obj = new OverloadingDemo();   //create an object
	obj.add(10,20);
	obj.add(10,20,30);

	}
	}
