package Encapsulation;


public class EncapsulationDemo {

public static void main(String[] args) {
Encapsulation eobj = new Encapsulation();

System.out.println(eobj.getA());
System.out.println(eobj.getB());
eobj.setA(30);
eobj.setB(40);

System.out.println(eobj.getA());
System.out.println(eobj.getB());
}

}
