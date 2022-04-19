package Dhruv_Java;
import java.util.*;


public class advancepattern{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("hello");
//q10 butterfly pattern
// int n=sc.nextInt();
// for (int i = 0; i<n; i++) {
//     for (int j = 0; j <=i; j++) {
//         System.out.print("*"); 
//     }
//     for (int k=0; k <(n-i-1)*2 ; k++) {
//         System.out.print(" "); 
//     }
//     for (int l = 0; l <=i ; l++) {
//         System.out.print("*");  
//     }
//     System.out.println(" ");
// }
// for (int i = n-1; i>=0; i--) {
//     for (int l = 0; l <=i ; l++) {
//         System.out.print("*");  
//     }
//     for (int k=0; k <(n-i-1)*2 ; k++) {
//         System.out.print(" "); 
//     }
//     for (int j = 0; j <=i; j++) {
//         System.out.print("*"); 
//     }
//     System.out.println(" ");
// }
// q11  Solid Rhombus
// int n=sc.nextInt();
// for (int i = 0; i < n; i++) {
//     for (int j =n-i; j>0; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 0; k < n; k++) {
//         System.out.print("*");;
//     }
//     System.out.println(" ");
// }
//q12 Number pyramid
// int n=sc.nextInt();
// for (int i = 1; i <=n; i++) {
//     //spaces
//     for (int j = 1; j <=n-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print(i);
//         System.out.print(" ");
//     }
//     System.out.println(" ");
    
// }
// q13 palindromic pyramid
// int n=sc.nextInt();
// for (int i = 1; i <=n; i++) {
//     //spaces
//     for (int j = 1; j <=n-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j =i; j>=1; j--) {
//         System.out.print(j);
//     }
//     for (int j = 2; j <=i; j++) {
//         System.out.print(j);
//     }
// System.out.println(" ");
// }
//q14 diamond pattern 
int n=sc.nextInt();
for (int i = 1; i <=n; i++) {
    //spaces
    for (int j = 1; j <=n-i; j++) {
        System.out.print(" ");
    }
    for (int j =i; j>=1; j--) {
        System.out.print("*");
    }
    for (int j = 2; j <=i; j++) {
        System.out.print("*");
    }
System.out.println(" ");
}
for (int i = n; i >=1; i--) {
    //spaces
    for (int j = 1; j <=n-i; j++) {
        System.out.print(" ");
    }
    for (int j =i; j>=1; j--) {
        System.out.print("*");
    }
    for (int j = 2; j <=i; j++) {
        System.out.print("*");
    }
System.out.println(" ");
sc.close();
}

}

}
