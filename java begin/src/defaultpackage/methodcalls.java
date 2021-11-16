package defaultpackage;

public class methodcalls { //object definition
int a; // object state= variables definition
int b;
    
    public int add() { //object behavior= method1
        return a+b;
    }
    
    public int multiply() {  //object behavior= method2
        return a*b;
    }
    
    public static void main(String[] args) {  //main method
        methodcalls mc = new methodcalls(); // call the object
        mc.a = 10;
        mc.b =20;
        int sum = mc.add();
        int product = mc.multiply();
        System.out.println(" Sum :"+sum);
        System.out.println(" Product :"+product);
        
        methodcalls mc1 = new methodcalls(); // call the object
        mc1.a =5;
        mc1.b= 6;
        System.out.println(" Sum :"+mc1.add());
        System.out.println(" Product :"+mc1.multiply());
    }
    
}
