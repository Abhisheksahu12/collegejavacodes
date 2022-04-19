package Dhruv_Java;
import java.util.*;
public class mergesort{
    //time complexity-nlogn
    public static void conquer(int arr[],int start,int mid ,int end){
        int merged[]=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2 <=end) {
            if (arr[idx1]<=arr[idx2]) {
             merged[x++]=arr[idx1++]; 
            }
            else{
                merged[x++]=arr[idx2++];
            }
            
        }
        while (idx1<=mid) {
            merged[x++]=arr[idx1++];
        }
        while(idx2<=end){
            merged[x++]=arr[idx2++];
        }
        for (int i = 0,j=start; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int start,int end){
        if (start>=end) {
            return;
        }
        int mid=start+(end-start)/2;//for mid use this to not let space complexity escape
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);
    }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for (int i = 0; i < size; i++) {
    arr[i]=sc.nextInt();
}
divide(arr,0,size-1); 

//print
for (int i = 0; i < size; i++) {
    System.out.print(arr[i]);
}
System.out.println();
sc.close();
}
 
}
