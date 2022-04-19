package Dhruv_Java;
import java.util.*;
public class bitwiseoperation{
    //get bit operation 
    // bitmask-(used for each operation) must be created in such a way that only the bit we need to find is 1 and rest of the bits are zero so for this we will left shift the number (1) towards the ith position the position we want to find the bit of a number and then we will (&)and those bits and if resultant answer is zero=then bit was zero and if resultant is non zero then  the bit is 1
    // OPERAION-AND 
    public static int getbit(int num,int pos){
        int bitmask=1<<pos;//left shift
        int ans=bitmask&num;
        if (ans==0) {
            return 0;
        } else {
            return 1;
        }
    }

//set bit operation 
// bitmask-must be created in such a way that hat only the bit we need to set is OR by 1 and rest of the bits are OR by zero so for this we will left shift the number (1) towards the ith position the position we want to set the bit of a number and then we will (|)OR those bits and if resultant answer is set by that bit
// OPERAION-OR
public static int setbit(int num,int pos){
    int bitmask=1<<pos;
    int ans=num|bitmask;
    return ans;
}

//clear bit operation
// Bit mask-must be created in such a way so that we need to set and shift one by a position in which we want to clear that bit and then we will complement(NOT(~)) that number, AND(&) that number with our original number
//OPERATION-NOT with AND



public static int clearbit(int num,int pos){
    int bitmask=1<<pos;
    int ans=(~bitmask)&num;
    return ans;
}
//Update bit operation
// For 0:-//clear
//For 1:-//set
public static int updatebit(int num,int pos,int bit){
    int ans=0;
    if (bit==1) {
        ans= setbit(num, pos);
    }
    else{
        ans= clearbit(num, pos);
    }
    return ans;
}
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int pos= sc.nextInt();
int bit=sc.nextInt();
// System.out.println(getbit(num, pos));
// System.out.println(setbit(4,0));
// System.out.println(clearbit(num,pos));
System.out.println(updatebit(num,pos,bit));
sc.close();
}
 
}