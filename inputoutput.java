package Dhruv_Java;
import java.util.*;
public class inputoutput{
public static void main(String[] args) {
System.out.print("hello world\n");//\n for a new line with print
        System.out.println("hello world");//println for new line
        // taking inputs
        Scanner sc1= new Scanner(System.in);
       Scanner sc= new Scanner(System.in);
        String name=sc1.next();//only single word input
//        String name_full=sc.nextLine();//full line input
        System.out.println(name);
//        System.out.println(name_full);
//          for taking more inputs different types
//        nextInt()
//        nextFloat()
//        nextDouble()
sc.close();
sc1.close();

}
}