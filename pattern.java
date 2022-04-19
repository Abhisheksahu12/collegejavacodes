package Dhruv_Java;
import java.util.*;
public class pattern{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
//q1 rectangle pattern
// int rows=sc.nextInt();
// int column=sc.nextInt();
// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < column; j++) {
//         System.out.print("*");
//     }
//     System.out.println("");
// }

//q2 hollow rectangle
// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < column; j++) {
//         if ((i==0 || i==rows-1) || (j==0 || j==column-1)) {
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println("");
// }
//q3 pyramid
// int n=sc.nextInt();
// for (int i = 0; i < n; i++) {
//     for (int j = 0; j <=i; j++) {
//         System.out.print("*");
//     }
//     System.out.println("");
// }
//q4 inverted pyramid 
// int n=sc.nextInt();
// for (int i = n-1; i>=0; i--) {
//     for (int j = 0; j <=i; j++) {
//         System.out.print("*");
//     }
//     System.out.println("");
// }
// q5 laterally inverted half pyramid(180 degree rotated)
// int n=sc.nextInt();
// for (int i =0; i<n; i++) {

//     for (int j=0; j<n-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j=0; j <i; j++) {
//         System.out.print("*");
//     }
//     System.out.println("*");
// }
//q6 numbers pyramid
// int n=sc.nextInt();
// for (int i =1; i <=n; i++) {
//     for (int j =1; j <=i; j++) {
//         System.out.print(j+" ");
//     }
//     System.out.println("");
// }
//q7 inverted half pyramid with numbers
// int n=sc.nextInt();
// for (int i =n; i>0; i--) {
//     for (int j =1; j <=i; j++) {
//         System.out.print(j+" ");
//     }
//     System.out.println("");
// }
//q8 floyd's triangle
// int n=sc.nextInt();
// int t=1;
// for (int i =1; i <=n; i++) {
//     for (int j =1; j <=i; j++) {
//         System.out.print(t+" ");
//         t++;
//     }
//     System.out.println("");
// }
//q9 0-1 triangle
int n=sc.nextInt();
for (int i =1; i <=n; i++) {
    for (int j =1; j <=i; j++) {
        int sum=i+j;
        if (sum%2==0) {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    System.out.println("");
    sc.close();
}
}
 
}
