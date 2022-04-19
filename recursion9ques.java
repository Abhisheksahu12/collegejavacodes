package Dhruv_Java;
import java.util.*;
import java.util.HashSet;
public class recursion9ques{
    //q1 tower of hanoi
    public static void towerofhanoi(int n,String source,String helper,String destination){
        if (n==1) {
            System.out.println("Transfer Disk "+n+" from "+source+" to "+destination);
            return;
        }
     towerofhanoi(n-1, source, destination, helper);
     System.out.println("Transfer Disk "+n+" from "+source+" to "+destination);
     towerofhanoi(n-1, helper,source, destination);
    }
    //q2 string in reverse
    public static void reversestring(String s,int n){
        if(n==0){
            return;
        }
     System.out.print(s.charAt(n-1));
     reversestring(s, n-1);
    }

//q3 first and last occurence of a char in a string 
public static  int first=-1;//values not changing
public static int last=-1;//val not changing
public static void firstlast(String s,int n,char a){
    if (n==s.length()) {
        System.out.println(first);
        System.out.println(last);
        return;
    }
   
    if (s.charAt(n)==a) {
        if (first==-1) {
            first=n;
        }
        else{
            last=n;
        }
    }
    firstlast(s, n+1, a);
}
//q4 check if array sorted 
public static boolean sortcheck(int a[],int idx){
        if (idx==a.length-1) {
          return true;
        }
        if (a[idx]<=a[idx+1]){
            return sortcheck(a, idx+1);
        }
        else{
            return false;
        }
}
//q5 move all x to end of string
public static void addx(String s,int idx,int count,String newstString){
if (idx==s.length()) {
    for (int i = 0; i < count; i++) {
        newstString+='x';
    }
    System.out.print(newstString);
    return;
}

if(s.charAt(idx)=='x'){
    count++;
    addx(s, idx+1,count,newstString);
    
}
else{
    newstString+=s.charAt(idx);
    addx(s, idx+1,count,newstString);
}
}
//q6 remove duplicates 
public static boolean map[]=new boolean[26];
public static void removedupli(String s,int idx,String newstString){
    if (idx==s.length()) {
        System.out.println(newstString);
        return;
    }
char currchar=s.charAt(idx);
if (map[currchar-'a']==true){
     removedupli(s,idx+1,newstString);
}
else{
    newstString+=currchar;
    map[currchar-'a']=true;
    removedupli(s, idx+1, newstString);
}
}

//Very important-q7 print all subsequences of a string
public static void subsequences(String s,int idx,String newstString){
if (idx==s.length()) {
    System.out.println(newstString);
    return;
}
    char currchar=s.charAt(idx);
    //to be
subsequences(s, idx+1, newstString+currchar);
//not to be
subsequences(s, idx+1, newstString);
}

//Very important-q8 print all UNIQUE subsequences of a string
public static void subsequencesunique(String s,int idx,String newstString,HashSet <String> set){
    if (idx==s.length()) {
       if (set.contains(newstString)) {//check if string already in hashset or not
            return;
       }
       else{
        System.out.println(newstString);
        set.add(newstString);//adding the substr to hashset
        return;
       }
    }
        char currchar=s.charAt(idx);
        //to be
    subsequencesunique(s, idx+1, newstString+currchar,set);
    //not to be
    subsequencesunique(s, idx+1, newstString,set);
    }

    //q9 print keypad combination//input type=23-shows key possible combinations
//     ( 0 -> .; // 1 -> abc // 2 -> def // 3 -> ghi // 4 -> jkl // 5 -> mno // 6 -> pqrs // 7 -> tu // 8 -> vwx // 9 -> yz // )

public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};//map created for each key combo
public static void printcombo(String s,int idx,String combination){
    if (idx==s.length()) {
        System.out.println(combination);
        return;
    }
    char currchar=s.charAt(idx);
    String mapping=keypad[currchar-'0'];
    for (int i = 0; i <mapping.length(); i++) {
        printcombo(s, idx+1, combination+mapping.charAt(i));
        
    }
}

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
// int n=sc.nextInt();
// String source="1st";
// String helper="2nd";
// String destination="3rd";
// towerofhanoi(n, source, helper, destination);


// String s=sc.next();
// reversestring(s,s.length());
// char alphabet=sc.next().charAt(0);//char input
// firstlast(s,0, alphabet);


// int n=sc.nextInt();
// int a[]=new int[n];
// for (int i = 0; i < a.length; i++) {
//     a[i]=sc.nextInt();
// }
// System.out.println(sortcheck(a,0));


// String s=sc.next();
// int count=0;
// String newstString="";
// addx(s,0,count,newstString);

// String s=sc.next();
// String newstString="";
// removedupli(s,0, newstString);

// String s=sc.next();
// String newstString="";
// subsequences(s,0, newstString);

// String s=sc.next();
// String newstString="";
// HashSet<String> set=new HashSet<>();
// subsequencesunique(s,0, newstString,set);

String s=sc.next();
String combination="";
printcombo(s,0,combination);

System.out.println();
sc.close();
} 
}
