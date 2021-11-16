package Inheritance;


//super class or parent class
class Animal{
                                //int =feature

void totallimbs(int limbs){
	System.out.println("Limbs:"+limbs);
}
void makeNoise() {                          //void= method=behavior
System.out.println("Makes noise!!!");       //behavior=makes noise
}


public static void main(String[] args) {
Cat cobj = new Cat();                       //making a cat object
cobj.limbs = 4;
cobj.totallimbs(4);
cobj.makeNoise();
cobj.eatFood();

Animal a = new Cat();
a.makeNoise();	                            // Runtime polymorphism


Animal a1 = new Animal();
a1.makeNoise();
}
}