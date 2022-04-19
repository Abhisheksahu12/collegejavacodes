package Dhruv_Java;
// import java.util.*;
public class sorting{
public static void printarr(int a[])
{
 for (int i = 0; i < a.length; i++) {
     System.out.print(a[i]+" ");
     
 }
}
public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
int arr[]={7,8,3,1,2};
//bubble sort
// for (int i = 0; i < arr.length-1; i++) {
//     for (int j = 0;j < arr.length-i-1;j++) {
//        if (arr[j]>arr[j+1]) {
//            //swap
//            int temp=arr[j];
//            arr[j]=arr[j+1];
//            arr[j+1]=temp;
//         } 
//     }
//     printarr(arr);
// System.out.println();
// }

//selection sort
// for (int i = 0; i < arr.length-1; i++) {
//     int smallest=i;
//     for (int j = i+1; j <arr.length; j++) {
//         if (arr[smallest]>arr[j]){
//             smallest=j;
//         }
//     }
//     int temp=arr[smallest];
//     arr[smallest]=arr[i];
//     arr[i]=temp;
//     printarr(arr);
//     System.out.println();
// }

//Insertion Sort
for (int i = 1; i < arr.length; i++) {
    int current=arr[i];
    int j=i-1;
    while (j >=0 && current<arr[j]) {
        arr[j+1]=arr[j];
        j--;
    }
    //placement
    arr[j+1]=current;
    printarr(arr);
    System.out.println();
    
}


 
}
 
}