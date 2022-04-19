package Dhruv_Java;
import java.util.*;
import java.util.ArrayList; //for arraylist
// import java.util.Collection;//-for collection
public class Arraylist{
public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
// Note-array list contains only class objects not any datatypes
// int-class-Integer
// float-class-Float
// string-class-String
// boolean-class-Boolean

//creating a list
ArrayList<Integer> l1=new ArrayList<Integer>();
 
//add elements
l1.add(0);
l1.add(2);
l1.add(3);
System.out.println(l1);

//add element in between
// l1.add(index, element);
l1.add(0,21);
System.out.println(l1);

//get elements
// l1.get(index)
System.out.println(l1.get(0));

//set element-change value of an element
// l1.set(index, element)
l1.set(0,12);
System.out.println(l1);

//delete element
// l1.remove(index)
l1.remove(1);
// l1.remove(121);//error
System.out.println(l1);

//size of arraylist
System.out.println(l1.size());

//looping here
for (int i = 0; i < l1.size(); i++) {
    System.out.println(l1.get(i));
}

//sorting here
// Collections.sort(list);--only for arraylists
System.out.println(l1);
Collections.sort(l1);
System.out.println(l1);
}

 
}