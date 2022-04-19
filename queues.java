package Dhruv_Java;
import java.util.*;
public class queues{
//Note- in queue
/*front-peek.
enque-add
dequeue-delete*/

//using array
// static class Queue{
//     static int arr[];
//     static int size;
//     static int rear=-1;
//     Queue(int size){
//         arr=new int[size];
//         this.size=size; 
//     }
//     public static boolean isempty(){
//         return rear==-1;
//     }

//     //enqueue-O(1)
//     public static void add(int data){
//         if (rear==size-1) {
//             System.out.println("queue is full now can't add more");
//         }
//         rear++;
//         arr[rear]=data;
//     }
//     //dequeue-O(n)
//     public static int delete(){
//         if (isempty()) {
//             System.out.println("Empty queue");
//             return -1;
//         }
//         int front=arr[0];
//         for (int i = 0; i < rear; i++) {
//             arr[i]=arr[i+1];
//         }
//         rear--;
//         return front;
//     }

     //front-O(n)
//     public static int peek(){
//         if (isempty()) {
//             System.out.println("Empty queue");
//             return -1;
//         }
//         return arr[0];
//     }
// }

//circular queue using array
/*enqueu-add-O(1)
dequeue-delete-O(1)
front-peek-O(1)*/

// static class circularQueue{
//     static int arr[];
//     static int size;
//     static int rear=-1;
//     static int front=-1;//needed
//     circularQueue(int size){
//         arr=new int[size];
//         this.size=size; 
//     }
//     public static boolean isempty(){
//         return rear==-1 && front==-1;
//     }
//     public static boolean isfull(){
//         return (rear+1)%size==front;//very imp for circular queue
//     }
//     //enqueue-O(1)
//     public static void add(int data){
//         if (isfull()) {
//             System.out.println("queue is full now can't add more");
//             return;
//         }
//         //1st element add
//         if (front==-1) {
//             front=0;
//         }
//         rear=(rear+1)%size;
//         arr[rear]=data;
//     }
    // //dequeue-O(1)
    // public static int delete(){
    //     if (isempty()) {
    //         System.out.println("Empty queue");
    //         return -1;
    //     }
    //     int result=arr[front];
    //     if (rear==front) {
    //         rear=front=-1;
    //     }
    //     else{
    //         front=(front+1)%size;
    //     }
    //     return result;
    // }

    // //  front-O(1)
    // public static int peek(){
    //     if (isempty()) {
    //         System.out.println("Empty queue");
    //         return -1;
    //     }
    //     return arr[front];
    // }
// }


//Queue using linked lists
/*enqueu-add-O(1)
dequeue-delete-O(1)
front-peek-O(1)*/


// static class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }

// static class Queue{
//     static Node head=null;
//     static Node tail=null;

//     public static boolean isempty(){
//         return head==null && tail==null;
//     }

//     //enqueue-O(1);
//     public static void add(int data){
//         Node newnode=new Node(data);
//         if (tail==null) {
//             tail=head=newnode;
//             return;
//         }
//         tail.next=newnode;
//         tail=newnode;
//     }

//     //dequeue-O(1)
//     public static int delete(){
//         if (isempty()) {
//             System.out.println("Empty queue");
//             return -1;
//         }
//         int front=head.data;
//         if (head==tail) {
//             tail=null;
//         }
//         head=head.next;
//         return front;
//     }


//     //  front-O(1)
//     public static int peek(){
//         if (isempty()) {
//             System.out.println("Empty queue");
//             return -1;
//         }
//         return head.data;
//     }
// }
// public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
// Queue q=new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// while (!q.isempty()) {
//     System.out.println(q.peek());
//     q.delete();
// }

//circular queue using array
// circularQueue q=new circularQueue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// System.out.println(q.delete());
// q.add(6);
// System.out.println(q.delete());
// q.add(7);
// while (!q.isempty()) {
//     System.out.println(q.peek());
//     q.delete();
// }

//queue using linked lists

// Queue q=new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// while (!q.isempty()) {
//     System.out.println(q.peek());
//     q.delete();
// }

 
//queue in java collection framework
// Queue<Integer> q=new LinkedList<>();//since queue is a interface therefore linkedlist written here
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// while (!q.isEmpty()) {
//     System.out.println(q.peek());
//     q.remove();
// }

// using array Deque
// Queue<Integer> q=new ArrayDeque<>();//since queue is a interface therefore array deque written here
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// while (!q.isEmpty()) {
//     System.out.println(q.peek());
//     q.remove();
// }

// }
 


//q1 Queues using two different stacks
// add-O(n)
//remove-O(1)
//peek-O(1)
static class Queue{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public static boolean isempty(){
        return s1.isEmpty();
    }

    //enqueue
    public static void add(int data){
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    //dequeue-O(1)
    public static int remove(){
        if (isempty()) {
            System.out.println("Empty queue");
            return -1;
        }
       return s1.pop();
    }

    //front-O(1)
    public static int peek(){
        if (isempty()) {
            System.out.println("Empty queue");
            return -1;
        }
       return s1.peek();
    }
    
}
public static void main(String args[]){
Queue q=new Queue();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
while (!q.isempty()) {
    System.out.println(q.peek());
    q.remove();
}
}
}
