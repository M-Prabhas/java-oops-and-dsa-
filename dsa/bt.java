package dsa;

import java.util.Scanner;
public class bt {

	static Scanner sc=null;
	public static void main(String[] args) {
	   sc=new Scanner(System.in);
		
      Node root= createTree();
      inOrder(root);
      System.out.println("the inorder completed");
      postOrder(root);
      System.out.println("the postorder completed");
      preOrder(root);
      System.out.println("the preorder completed");
      
      System.out.println(getheight(root));
      
      levelOrder(root,3);
	}
	
	static Node createTree() {
		Node root=null;
		System.out.println("enter data ....");
		int data=sc.nextInt();
		
		if(data==-1) return null;
		
		root= new Node(data);
		
		System.out.println("Enter left for: "+data);
		root.left=createTree();
		
		
		System.out.println("Enter rightt for: "+data);
		root.right=createTree();
		
		return root;
	}
	
	static void inOrder(Node root) {
		
		if(root==null)return;
		
		inOrder(root.left);
		int ret=root.data;
		System.out.println(ret);
		inOrder(root.right);
		
	}
static void preOrder(Node root) {
		
		if(root==null)return;
		
		int ret=root.data;
		System.out.println(ret);
		preOrder(root.left);
		preOrder(root.right);
		
	}

static void postOrder(Node root) {
	
	if(root==null)return;
	
	postOrder(root.left);
	postOrder(root.right);
	int ret=root.data;
	System.out.println(ret);
	
	
}

static int getheight(Node root) {
	
	if(root==null) {
		return 0;
	}
	
	return Math.max(getheight(root.left),getheight(root.right))+1;
	
}

static void levelOrder(Node root,int level) {
	if(root==null)return;
	else if(level==1)System.out.println(root.data+" ");
	else {
		levelOrder(root.left,level-1);
		levelOrder(root.right,level-1);
	}
}




}

class Node{
	Node left,right;
	int data; 
	
	public Node(int data) {
		this.data=data;
	}
}
