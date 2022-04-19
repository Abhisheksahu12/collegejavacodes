package Dhruv_Java;
import java.util.*;
public class recursion{
    //printing numbers from n to 1
    public static void printnumbers(int n){
        if (n==0) {
            return;
        }
             System.out.println(n);
             printnumbers(n-1);
    }
    //printing numbers from 1 to n
    public static void printnumbersrev(int n){
        if (n==0) {
            return;
        }
        printnumbersrev(n-1);
        System.out.println(n);
    }
    //print sum of first n natural numbers 
    public static int sumn(int n){
        if (n==0) {
            return 0;
        }
        return n+sumn(n-1);
    }
    //print n factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    //print fibonacci with n terms
    public static void fibo(int n,int a,int b){
        if(n==0){
           return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibo(n-1, b, c);
    }
    //print x^n-stack height=n
    public static int expo(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*expo(x,n-1);
    }
     //print x^n-stack height=log(n)
     public static int expologn(int x,int n){
         if (n==0) {
             return 1;
         }
         if(x==0){
            return 0;
        }
         if (n%2==0) {
            return expologn(x, n/2)*expologn(x, n/2);
         }
         else{
            return expologn(x, n/2)*expologn(x, n/2)*x;
         }
     }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
// printnumbers(n); 
// printnumbersrev(n);
// System.out.println(sumn(n));
// System.out.println(fact(n));
// int secondlastterm_a=0;
// int lastterm_b=1;
// System.out.print(secondlastterm_a+" "+lastterm_b+" ");
// fibo(n-2,secondlastterm_a,lastterm_b);
// System.out.println(expo(x, n));
System.out.println(expologn(x, n));
sc.close();
}
 
}
