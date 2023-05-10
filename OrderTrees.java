import java.util.Scanner;

public class OrderTrees{

static Scanner sc = null;

public static void main(String args[]){
sc = new Scanner(System.in);

//-------------------------------------------------------------
// call Functions
Node root = createTree();
inOrder(root);
System.out.println();
preOrder(root);
System.out.println();
postOrder(root);
System.out.println();
}
//--------------------------------------------------------------
//Creating a Tree
static Node createTree(){     // Tree creation
Node root = null;
System.out.println("Enter data: ");
int data = sc.nextInt();
if(data == -1) return null;
root = new Node(data);
System.out.println("Enter left for "+ data);
root.left = createTree();

System.out.println("Enter right for "+ data);
root.right = createTree();
return root;
}

//---------------------------------------------------------------

//inOrder Tree

static void inOrder(Node root){
if(root == null) return;
inOrder(root.left);
System.out.print
(root.data+ " ");
inOrder(root.right);
}

//---------------------------------------------------------------

//preOrder Tree

static void preOrder(Node root){
if(root == null) return;
System.out.print(root.data+ " ");
preOrder(root.left);
preOrder(root.right);
}
//---------------------------------------------------------------

//postOrder Tree

static void postOrder(Node root){
if(root == null) return;
postOrder(root.left);
postOrder(root.right);
System.out.print(root.data+ " ");
 }
}
//---------------------------------------------------------------
// Node creating
class Node{
Node left,right;
int data;
public Node(int data){
this.data = data;
}
}

