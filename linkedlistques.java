package Dhruv_Java;
// import java.util.LinkedList;
public class linkedlistques{
// defining a single linked list
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
//q1 find nth node from last and delete
// public ListNode removenthfromEnd(ListNode head,int n){
// if (head.next==null) {
//     return null;
// }
// //size of list
// int size=0;
// ListNode curr=head;
// while(curr!=null){
//     curr=curr.next;
//     size++; 
// }
// if (n==size) {
//     return head.next;
// }
// //prev node
// int indextosearch=size-n;//prev node of respective node
// ListNode prev=head;
// int i=0;
// while (i<indextosearch) {
//     prev=prev.next; 
//     i++;
// }
// prev=prev.next.next;
// return head;
// }

//q2 linked list palindrome or not--method--reverse it and check--very storage usage 
// 2.method- go to middle of ll,,reverse second half,check if first half equal second
// public ListNode reverse2ndhalf(ListNode head){
//     ListNode prev=null;
//     ListNode curr=head;
//     while (curr!=null) {
//         ListNode next=curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr=next;
//     }
//   return prev;
// }
// public ListNode findmiddle(ListNode head){
//     ListNode hare=head;
//     ListNode turtle=head;
//     while (hare.next !=null && hare.next.next !=null) {
//         hare=hare.next.next;
//         turtle=turtle.next;
//     }
//     return turtle;

// }
// public boolean ispalindrome(ListNode head){
// if (head==null || head.next==null) {
//     return true;
// }
// ListNode middle=findmiddle(head);//1st half ka end
// ListNode secondhalfstart=reverse2ndhalf(middle.next);//2nd half ka start
// ListNode firsthalfstart=head;
// while (secondhalfstart!=null) {
//     if (firsthalfstart.val!=secondhalfstart.val) {
//         return false;
//     }
//     firsthalfstart=firsthalfstart.next;
//     secondhalfstart=secondhalfstart.next;
// }
// return true;
// }


//q3-detecting a cycle/loop in a linkedlist
// 1.floyd's algo or hare turtle method
/*2.hare-move 2 steps
turtle -move 1 step
when hare and turtle meet then loop exist otherwise not*/

public boolean hasCycle(ListNode head){
    if (head==null) {
        return false;
    }
    ListNode hare=head;//fast
    ListNode turtle=head;//slow
    while (hare.next !=null && hare.next.next !=null) {
                hare=hare.next.next;
                turtle=turtle.next;

                if(hare==turtle){
                    return true;
                }
    }
    return false;
}

//remove the cycle
// 1.turtle and hare both move towards head with same speed and they will meet at start again

public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);

 
}
 
}
