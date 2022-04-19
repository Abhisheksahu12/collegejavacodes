package Dhruv_Java;
import java.util.*;
class Students{
    String name;
    int age;
    public void display(String name,int age){
        System.out.println(name+ " "+age); 
    }
    public void display(String name){
        System.out.println(name);
    }
    public void display(int age){
        System.out.println(age);
    }
  
}
public class polymorphism{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
Students s1=new Students();
s1.name="Dhruv";
s1.age=18;
s1.display(s1.name,s1.age);
s1.display(s1.age);
s1.display(s1.name);
sc.close();
 
}
 
}
