package defaultpackage;

public class ArraysDemo {
    public static void main(String[] args) {
        //int marks = 100;
        
        // Arrays - variable that stores group of values
        
//        int marks[] = {100,90,80,60,50};
//        System.out.println(marks[0]); // 100
//        System.out.println(marks[1]); // 90
//        System.out.println(marks[2]); //80....
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        
        int marks1[] = new int[6];
        marks1[0] =99;
        marks1[1]  = 98;
        marks1[2] =77;
        marks1[3]  = 66;
        marks1[4] =88;
        marks1[5]  = 44;
        
//        for(int index=0; index<marks1.length; index++ ) {
//            System.out.println(marks1[index]);
//        }
        
        //enhanced for loop or for each loop
        
        for(int a: marks1) {
            System.out.println(a);
        }
        
        
        String[] studentNames = {"AAA","BBB","CCC","DDD"};
        
        for(String name: studentNames) {
            System.out.println(name);
        }
    }
}
