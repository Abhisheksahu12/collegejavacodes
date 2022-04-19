package Dhruv_Java;
import java.util.*;
public class functions{
    // syntax of function public static returnType functionName{
        // Body
    // }
    public static int SUM(int a,int b){
        return a+b;
    }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
 System.out.println(SUM(a, b));
 sc.close();
}
 

}