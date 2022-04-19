package Dhruv_Java;
// import java.util.*;
class Shape{
String color;
public void area(){
    System.out.println("displays area");
}
}

class Triangle extends Shape{//extends- inherits shape to triangle
public void area(Double l,Double h){
    System.out.println((0.5)*l*h);
}
}
class circle extends Shape{//extends- inherits shape to triangle
public void area(int r,int h){
    System.out.println((3.14)*r*r*h);
}
}
public class inheritance{
public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
Triangle t1=new Triangle();
t1.color="red";
System.out.println(t1.color); 
t1.area(3.0,4.0);

 
}
 
}