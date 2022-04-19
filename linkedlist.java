package Dhruv_Java;
import java.util.*;//--linkedlist inbuilt usage
public class linkedlist{
    Node head;
    private int size;
    linkedlist(){
        size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    } 
    // add-first and last
public  void addfirst(String data){
    Node newnode=new Node(data);
    if (head==null) {
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
}

//add-last
public  void addlast(String data){
Node newnode=new Node(data);
if (head==null) {
    head=newnode;
    return;
}
Node currnode=head;
while (currnode.next!=null) {
    currnode=currnode.next;  
}
currnode.next=newnode;
}
//print
public  void printlist(){
    if (head==null) {
        System.out.print("list is empty");
        return; 
    }
    Node currnode=head;
while (currnode!=null) {
    System.out.print(currnode.data+"->");
    currnode=currnode.next;  
}
System.out.println("Null");
}

//delete first 
public void deletefirst(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    size--;
        head=head.next;
}
//delete last
public void deletelast(){
    if(head==null){
        System.out.println("this list is empty");
        return;
    }
    size--;
    if (head.next==null) {
        head=null;
        return;
    }
    Node secondlast=head;
    Node lastnode=head.next;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
        secondlast=secondlast.next;
    }
    secondlast.next=null;
}

//size
public int getsize(){
    return size;
}

//reversing a linked list
// 1.iterative method 
public void reverseiterate(){
    if (head==null || head.next==null) {
        return;
    }
    Node prevNode=head;
    Node currnNode=head.next;
    while (currnNode!=null) {
        Node nextnode=currnNode.next;
        currnNode.next=prevNode;
        //update
        prevNode=currnNode;
        currnNode=nextnode;
    }
    head.next=null;
    head=prevNode;
}

//2.recursive method
public Node reverserecursive(Node head){
    if (head==null || head.next==null) {
        return head;

    }
    Node newhead=reverserecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newhead;
}
// public static void main(String[] args) {
// // Scanner sc= new Scanner(System.in);
// linkedlist list=new linkedlist();
// list.addfirst("a");
// list.addfirst("is");
// list.printlist(); 
// list.addlast("list");
// list.addfirst("this");
// list.printlist();

// list.deletefirst();
// list.printlist();
// list.deletelast();
// list.printlist();
// System.out.println(list.getsize()); 
// list.addfirst("this");
// System.out.println(list.getsize()); 


//REVERSING 

// list.addlast("1");
// list.addlast("2");
// list.addlast("3");
// list.addlast("4");
// list.printlist();
// list.reverseiterate();
// list.printlist();


//RECURSIVE 

// list.addlast("1");
// list.addlast("2");
// list.addlast("3");
// list.addlast("4");
// list.printlist();
// list.head=list.reverserecursive(list.head);
// list.printlist();
// }
 
//using pre stored collection framework linked list

public static void main(String[] args) {
LinkedList<String> list=new LinkedList<String>();
list.addFirst("a");
list.addFirst("is");
list.addFirst("this");
list.add("list");//by default add adds to the last part of list
System.out.println(list);
System.out.println(list.size());
for (int i = 0; i < list.size(); i++) {
System.out.print(list.get(i)+"->");
}
System.out.println("null");
// list.removeFirst();
// list.removeLast();
System.out.println(list);
// list.remove(1);//index
Collections.reverse(list);//reverse using collection
System.out.println(list);
}
}