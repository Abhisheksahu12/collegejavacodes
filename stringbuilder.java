package Dhruv_Java;
import java.util.*;
public class stringbuilder{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

// declaring stringbuilder
// StringBuilder sb=new StringBuilder("Dhruv");
// System.out.println(sb);

//character at index
// System.out.println(sb.charAt(0));

//replace character
// sb.setCharAt(0, 's');
// sb.setCharAt(4, 't');
// sb.append('i');
// System.out.println(sb);

//delete extra char
// sb.delete(start, end)
// sb.delete(0, 2);//end not iclusive
// System.out.println(sb);

//reversing a string new logic
StringBuilder s=new StringBuilder("Dhruv");
for (int i = 0; i < s.length()/2; i++) {
    int front=i;
    int back=s.length()-i-1;
    char frontchar=s.charAt(front);
    char backchar=s.charAt(back);
    s.setCharAt(front, backchar);
    s.setCharAt(back, frontchar);
}
System.out.println(s);
sc.close();
}
}