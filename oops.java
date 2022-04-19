package Dhruv_Java;
// import java.util.*;
// class Pen{
//     String color;
//     String type;//ball/gel
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void display(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }
// class Student{
//     // NOTE:- Java doesn't require a destructor as it has automated garbage collector which deletes the unused elements
//     String name;
//     int age;
//     public void display(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(){//java creates a default constructor by default even if we don't define 
//         System.out.println("constructor called");
//     }
//     Student(String name ,int age){//paremeterised constructor 
//         this.name=name;
//         this.age=age;
//     }
//     Student(Student s2){//copy constructor
//         this.name=s2.name;
//         this.age=s2.age;
//     }
// }

//Abstraction 
// Abstract Class
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method

// abstract class Animal{
//     abstract void walk();//this func available to all but no code here
//     public void eat(){
//         System.out.println("Animal eats");
//     }
//     Animal(){
//         System.out.println("a new animal constructor");
//     }
// }
// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Horse Walking");
//     }
//     Horse(){
//         System.out.println("a new Horse constructor");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Chicken Walking");
//     }
//     Chicken(){
//         System.out.println("a new Chicken constructor");
//     }
// }

// Interfaces
// NOTE:- MULTIPLE INHERITENCE CAN ONLY BE DONE BY INTERFACES IN JAVA NOT CLASSES
// All the fields in interfaces are public, static and final by default.
// All methods are public & abstract by default.
// A class that implements an interface must implement all the methods declared in the interface.
// Interfaces support the functionality of multiple inheritance.

// interface Animal{
//     void walk();
// }
// interface Herbivore{
//     void eats();
// }
// class Horse implements Animal,Herbivore{//implement word used
//     public void walk(){
//         System.out.println("horse walking");
//     }
//     public void eats(){
//         System.out.println("Eats Grass");
//     }
// }

// Static Keyword 
// Static can be : 
// Variable (also known as a class variable)
// Method (also known as a class method)
// Block
// Nested class

class  Student{
    String name;
    static String school;//properties common for all objects-only once memory given to them
}

public class oops{
public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
// Pen pen1= new Pen();
// pen1.color="red";
// pen1.type="ballpoint";
// // System.out.println(pen1);
// pen1.write();
// pen1.display();
// Student s1=new Student();
// Student s2=new Student("Shruti",18);
// Student s3=new Student(s2);
// s1.name="Dhruv";
// s1.age=18;
// s1.display();
// s2.display();
// s3.display();
// Horse horse= new Horse();
// horse.walk();
// horse.eat();
// Chicken chicken= new Chicken();
// chicken.walk();
// chicken.eat();
 Student.school="BVM";
 Student s1=new Student();
 s1.name="dhruv";
System.out.println(s1.name);
//  System.out.println(s1.school);
 
}
 
}
