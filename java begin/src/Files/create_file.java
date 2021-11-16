package Files;
import java.io.*;

public class create_file { // createConnection throws SQLEXception

public static void main(String[] args) throws Exception{
File f = new File("C:\\JavaFiles\\Javafile.txt");

if (f.createNewFile()) {
System.out.println("Sucessful");
} else {
System.out.println("Failed");
}

}
}