package defaultpackage;

public class StudentDemo {

int studentID;
String studentName;

public StudentDemo(int id, String name) { //general object
studentID = id;                           //object's feature1
studentName =name;                        //object's feature 2
}

public static void main(String[] args) {
StudentDemo demo = new StudentDemo(100,"AAA");  //create an object
System.out.println(demo.studentID);             //define its feature
System.out.println(demo.studentName);           //define its feature 

StudentDemo demo1 = new StudentDemo(200,"BBB");
System.out.println(demo1.studentID);
System.out.println(demo1.studentName);


StudentDemo demo2 = new StudentDemo(102,"CCC");
System.out.println(demo2.studentID);
System.out.println(demo2.studentName);
}
}