package Exceptions;

public class ArrayIndexOutOfBounds {
public static void main(String[] args) {
int x[] = {10,20,30,40};
for(int i=0; i< x.length;i++) {
System.out.println(x[i]);
}

System.out.println(x[4]);

}}
