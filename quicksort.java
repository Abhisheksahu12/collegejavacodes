package Dhruv_Java;
import java.util.*;
public class quicksort{
    //time complexity-worst(O(n^2))-occurs when pivot is always the smallest or largest element
    // average-O(nlogn)
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <high; j++) {
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i]; 
                arr[i]=arr[j];
                arr[j]=temp; 
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    public static void Quicksort(int arr[],int low,int high){
        if (low<high) {
            int pivotidx=partition(arr,low,high);
            Quicksort(arr, low,pivotidx-1);
            Quicksort(arr,pivotidx+1,high);
        }
    }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for (int i = 0; i < size; i++) {
    arr[i]=sc.nextInt();
}
Quicksort(arr,0,size-1);
for (int i = 0; i < size; i++) {
    System.out.print(arr[i]+" ");
}
System.out.println();
 sc.close();
}
 
}
