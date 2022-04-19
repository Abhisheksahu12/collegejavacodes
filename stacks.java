package Dhruv_Java;
import java.util.*;
public class stacks{
    //in form of a linked list

    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data=data;
    //         next=null;

    //     }
    // }
    // static class Stack{
    //     public static Node head;
    //     public static boolean isempty(){
    //         return head==null;
    //     }
    //     public static void push(int data){
    //         Node newnode=new Node(data);
    //         if (isempty()) {
    //             head=newnode;
    //             return;
                
    //         } 
    //         else{
    //             newnode.next=head;
    //             head=newnode;
    //         }
    //     }
    //     public static int pop(){
    //         if (isempty()) {
    //             return -1;
    //         }
    //         int top=head.data;
    //         head=head.next;
    //         return top;

    //     }
    //     public static int peek(){
    //         if (isempty()) {
    //             return -1;
    //         }
    //         int top=head.data;
    //         return top;
    //     }
    // }

    //in form of arraylist

    // static class Stack{
    //     static ArrayList<Integer>  list=new ArrayList<>();
    //     public static boolean isempty(){
    //         return list.size()==0;
    //     }
        
    //     //push
    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     //pop
    //     public static int pop(){
    //         if (isempty()) {
    //             return -1;
    //         }
    //         int top=list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return  top;
    //     }

    //     //peel
    //     public static int peek(){
    //         if (isempty()) {
    //             return -1;
    //         }
    //         int top=list.get(list.size()-1);
    //         return  top;
    //     }
        
    // }
// public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
// Stack s=new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);
// s.push(5);
// while (!s.isempty()) {
//     System.out.println(s.peek());
//     s.pop();
// }


// Stack s=new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);
// s.push(5);
// while (!s.isempty()) {
//     System.out.println(s.peek());
//     s.pop();
// }
 
//using stack java inbuilt collection framework
// Stack<Integer> s=new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);
// s.push(5);
// while (!s.isEmpty()) {
//     System.out.println(s.peek());
//     s.pop();
// }


// }



//q1 push at the bottom of the stack
public static void pushbottom(int data,Stack<Integer> s){
    if (s.size()==0) {
        s.push(data);
        return;
    }
    int top=s.pop();
    pushbottom(data,s);
    s.push(top);
}


//q2 Reverse a stack
public static void reverse(Stack<Integer> s){
    if (s.size()==0) {
        return;
    }
    int top=s.pop();
    reverse(s);
    pushbottom(top,s);
}
public static void main(String[] args) {
    // Stack<Integer> s=new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // pushbottom(5,s);
    // while (!s.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    // }

    //reverse
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    reverse(s);
    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
    
    
}


}
