package Dhruv_Java;
import java.util.*;
import java.lang.Math;
public class trees{
    /* 1.Binary tree-has only two nodes at each level possible 
        left node is called left child and right node is called right child
        and upper node is PARENT.
        Nodes with same parent is sibling
        Leaf-Nodes with no child.
        Ancestor- ALl parents and successive parents till root is reached
        Level/depth-from root to leaves all levels starting from either 0/1 depending on choice
        Subtree-all subsequent left and right trees are resp. called resp. side subtrees*/
       


//q1 Build tree preorder-some order of values where -1 rep null

//preorder traversal rules-1.root 2.left subtree 3.right subtree
static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
static class binarytree{
    static int idx=-1;
    public static Node buildtree(int nodes[]){
        idx++;
        if (nodes[idx]==-1) {
            return null;
        }
        Node newnode=new Node(nodes[idx]);
        newnode.left=buildtree(nodes);
        newnode.right=buildtree(nodes);
        return newnode;
    }
}

//q2 preorder traversal rules-1.root 2.left subtree 3.right subtree
public static void preorder(Node root){//O(n)
    if (root==null) {
        System.out.print(-1+" ");
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

//q3 Inorder traversal rules-1.left 2.root subtree 3.right subtree
public static void inorder(Node root){//O(n)
    if (root==null) {
        System.out.print(-1+" ");
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
    
}

//q4 Postorder traversal rules-1.left 2.right 3.root
public static void postorder(Node root){//O(n)
    if (root==null) {
        System.out.print(-1+" ");
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
    
}
//q5 Level order reversal-using queues and iteration only no other way-Bfs(breadth wise traversal)-time complexity-O(n)

public static void levelorder(Node root){
    if (root==null) {
        System.out.println("Empty Tree");
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
        Node currnode=q.remove();
        if (currnode==null) {
            System.out.println();
            if (q.isEmpty()) {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(currnode.data+" ");
            if (currnode.left!=null) {
                q.add(currnode.left);
            }
            if (currnode.right!=null) {
                q.add(currnode.right);
            }
        }
    }
}

//q6- Count of Nodes--O(n)
public static int countofnodes(Node root){
    if (root==null) {
        return 0;
    }
    int leftnodes=countofnodes(root.left);
    int righnodes=countofnodes(root.right);
    return leftnodes+righnodes+1;
}

//q7 sum of nodes-O(n)
public static int sumofnodes(Node root){
    if (root==null) {
        return 0;
    }
    int leftnodes=sumofnodes(root.left);
    int righnodes=sumofnodes(root.right);
    return leftnodes+righnodes+root.data;
}
//q8 height of tree-O(n)-distance of root from deepest node
public static int heightoftree(Node root){
    if (root==null) {
        return 0;
    }
    int lefttree=heightoftree(root.left);
    int rightree=heightoftree(root.right);
    return Math.max(lefttree,rightree)+1;
}
//q9 diameter of a tree-longest path including/non including the root in a tree-time complexity--O(n^2)
public static int diameteroftree(Node root){
if (root==null) {
    return 0;
}
int diam1=diameteroftree(root.left);
int diam2=diameteroftree(root.right);
int diam3=heightoftree(root.left)+heightoftree(root.right)+1;
return Math.max(diam1,Math.max(diam2,diam3));
}
//q10 optimised diameter of a tree-longest path including/non including the root in a tree-for time complexity--O(n)
static class treeinfo{
    int height;
    int diameter;
    treeinfo(int ht,int dia){
        this.height=ht;
        this.diameter=dia;
    }
}
public static treeinfo diameter2(Node root){
    if (root==null) {
        return new treeinfo(0,0);
    }
    treeinfo left=diameter2(root.left);
    treeinfo right=diameter2(root.right);
    int myheight=Math.max(left.height,right.height)+1;
    int diam1=left.diameter;
    int diam2=right.diameter;
    int diam3=left.height+right.height+1;
    int mydiam=Math.max(diam1,Math.max(diam2,diam3));
    treeinfo myinfo=new treeinfo(myheight,mydiam);
    return myinfo;
}


//q11 subtree of another tree-yes or no
/*first match root from given root and then go for left and right but if not then go left after that right*/
public static boolean isidentical(Node root,Node subroot){
    if (root==null && subroot==null) {
        return true;
    }
    if (root==null || subroot==null) {
        return false;
    }
    if (root.data==subroot.data) {
       return isidentical(root.left, subroot.left) && isidentical(root.right, subroot.right);
    }
    return false;
}
public static boolean issubtree(Node root,Node subroot){
    if (subroot==null) {
        return true;
    }
    if (root==null) {
        return false;
    }
    if (root.data==subroot.data) {
        if (isidentical(root,subroot)) {
            return true;
        }
        
    }
    return issubtree(root.left, subroot) || issubtree(root.right, subroot);
}

//q12 sum of nodes at kth level-levelorder approach just replace int sum=0;
            // sum+=currnode.data;
            // and display it
            

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//preorder sequence
    int subnode[]={1,2,4};
    binarytree tree=new binarytree();
     Node root=tree.buildtree(nodes);
    //  Node subroot=tree.buildtree(subnode);
     System.out.println(root.data);

     preorder(root);
     System.out.println();

     inorder(root);
     System.out.println();

     postorder(root);
     System.out.println();

     levelorder(root);

     System.out.println(countofnodes(root));

     System.out.println(sumofnodes(root));
     
     System.out.println(heightoftree(root));

     System.out.println(diameteroftree(root));

     System.out.println(diameter2(root).diameter);

    //  System.out.println(issubtree(root,subroot));
    }


 
}
