package Dhruv_Java;
import java.util.*;
public class recursionadvance{
//q1 all permutations of a string
public static void printpermutation(String s,String permutation){
    if (s.length()==0) {
        System.out.println(permutation);
        return;
    }
    for (int i = 0; i < s.length(); i++) {
        char currchar=s.charAt(i);
        String newstring=s.substring(0,i)+s.substring(i+1);
        printpermutation(newstring, permutation+currchar);
    }
}

//q2 count total paths on a maize to move from (0,0) to (n,m)
// condition- move right,move down;
public static int countpaths(int i,int j,int n,int m){
    if (i==n || j==m) {
        return 0;
    }
        if (i==n-1 && j==m-1){
        return 1;
    }
    //move downwards
     int downpaths=countpaths(i+1, j, n, m);
     //move right
     int rightpaths=countpaths(i, j+1, n, m);
     return downpaths+rightpaths;
}

//q3 place tiles of size 1xm in a floor of size nxm
public static int tiles(int n,int m){
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;

    }
    //vertically
    int verticalplacements=tiles(n-m,m);
    //horizontally
    int horizontalplacements=tiles(n-1,m);

    return horizontalplacements+verticalplacements;
}

//q4 find the number of ways in which you cant invite n people to a party,single or pairs

public static int guests(int n){
    if (n<=1) {
        return 1;
    }
    //single
    int single=guests(n-1);
    //pairs
    int pairs=(n-1)*guests(n-2);

    return pairs+single;
}

//q5 print all the subsets of a given set of first n natural numbers
public static void printsubset(ArrayList<Integer> subset){
    for (int i = 0; i < subset.size(); i++) {
        System.out.print(subset.get(i)+"  ");
    }
    System.out.println();
}
public static void findsubset(int n,ArrayList<Integer> subset){
    if (n==0) {
        printsubset(subset);
        return;
    }
    //gets added to subset
    subset.add(n);
    findsubset(n-1, subset);
    //not gets added to subset
    subset.remove(subset.size()-1);
    findsubset(n-1, subset);
}

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
// String s=sc.next();
// String permutation="";
// printpermutation(s, permutation);


// int n=sc.nextInt();
// int m=sc.nextInt();
// System.out.println( countpaths(0, 0, n, m));


// int n=sc.nextInt();
// int m=sc.nextInt();
// int totalways=tiles(n, m);
// System.out.println(totalways);

// int n=sc.nextInt();
// System.out.println(guests(n));


int n=sc.nextInt();
ArrayList<Integer> subset=new ArrayList<>();
findsubset(n, subset);
sc.close();
}
 
}
