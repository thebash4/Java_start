package defaultpackage;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter a value");
        a = scan.nextInt();
        System.out.println("You entered "+a);
        
    }
}
