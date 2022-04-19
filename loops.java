package Dhruv_Java;
import java.util.*;
public class loops{
public static void main(String[] args) {
    // for (int i = 0; i < 11; i++) {
    //     System.out.println(i);
    // }
//     int i=0;
//     while (i<11) {
//         System.out.println(i);
//         i++;
//     }
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for (int i = 0; i <=n; i++) {
    sum+=i;    
}
for (int i = 1; i <=10; i++) {
    System.out.println(n+"*"+i+"="+(n*i));
}
System.out.println("sum :"+sum);
sc.close();

}
}