package Dhruv_Java;
import java.util.*;
public class array2d{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
// int rows=sc.nextInt();
// int columns=sc.nextInt();
// int numbers[][]=new int[rows][columns];
//  for (int i = 0; i < rows; i++) {
//      for (int j = 0; j < columns; j++) {
//          numbers[i][j]=sc.nextInt();
//      }
//  }
//  for (int i = 0; i < rows; i++) {
//      for (int j = 0; j <columns; j++) {
//         System.out.print(numbers[i][j]+" ");
//      }
//      System.out.println("");
//  }
 

 //q1 take a matrix input and search for a given number and print it's indices
 int rows=sc.nextInt();
int columns=sc.nextInt();
int numbers[][]=new int[rows][columns];
 for (int i = 0; i < rows; i++) {
     for (int j = 0; j < columns; j++) {
         numbers[i][j]=sc.nextInt();
     }
 }
 for (int i = 0; i < rows; i++) {
     for (int j = 0; j <columns; j++) {
        System.out.print(numbers[i][j]+" ");
     }
     System.out.println("");
 }
 System.out.print("Enter a number to search : ");
 int num=sc.nextInt();
 boolean flag=false;
 for (int i = 0; i < rows; i++) {
    for (int j = 0; j <columns; j++) {
       if (numbers[i][j]==num) {
           System.out.println("INDEX : ("+i+" "+j+")");
           flag=true;
       }
    }
}
if (flag==false) {
    System.out.println("Number not found");
}
sc.close();
}
 
}