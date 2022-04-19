package Dhruv_Java;

import java.util.*;
public class strings{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
//strings declaration-NOTE-"S"is capital in strings here
// String name= sc.next();
String full_name=sc.next();
// System.out.println("Name "+name+" full name"+full_name);
// NOTE- to create a new string use "new String(string_name)"
// string concatenation 
// String cancat=name+full_name;
// System.out.println(cancat);

//string length
// System.out.println(cancat.length());

//charAt
// for (int i = 0; i < cancat.length(); i++) {
//        System.out.println(cancat.charAt(i));
// }
 //compare
// if(name.compareTo(full_name)==0){
// System.out.println("strings are equal");
// }
// else{
//     System.out.println("strings are not equal");
// }
//substring
// String substr=full_name.substring(11,full_name.length());//end limit not inclusive-by default ending index is the last index if not passed 
// System.out.println(substr);
//string to int
String number="123";
int number1=123;

System.out.println(Integer.parseInt(number));
System.out.println(Integer.toString(number1));
System.out.println(Integer.parseInt(full_name));//error if fullname doesn't contain only numbers
sc.close();

}
 
}
