package bst;
import java.util.Scanner;


public class binarysearchtree {
	
		static Scanner sc=null;
		public static void main(String[] args) {
			   sc=new Scanner(System.in);
		 // create a root node;	 
			node root=null;  
			
			root=insert(root, 10);
			insert(root, 11);
			System.out.println(search(root, 11));
			
		}
		
		
		
		static node insert(node root,int d) {
			node add=new node(d);
			if(root==null) {
				root=add;
			}
			else {
				if(root.data>d) {
					root.right=insert(root.right,d);
				}else {
					root.left=insert(root.left,d);
				}
			}
			System.out.println("node inserted successfully");
			return root;
			
		}
	
		
		
		static boolean search(node root,int x) {
			
			if(root==null)return false;
			if(root.data==x)return true;
			if(root.data>x) {
				return search(root.right,x);
			}
			return search(root.left,x);
			
			
		}
		
		static node delete(node root,int key) {
			if(root==null)
				return root;
			
		 if(key<root.data) {
			 root.left=delete(root.left,key);
			 
		 }else if(key>root.data) {
			 root.right=delete(root.right,key);
		 }
		 else {
			 if(root.left==null)
				 return root.right;
			 else if(root.right==null) {
				 return root.left;
				 
			 }
			 
			 root.data=minvalue(root.right);
			 
			 root.right=delete(root.right,root.data);
		 }
		 
		 return root;
		}
		
		static int minvalue(node root) {
			int min=root.data;
			while(root.left != null) {
				min=root.left.data;
				root=root.left;
			}
			
			return min;
		}
		

		
}

	class node{
		node left,right;
		int data; 
		
		public node(int data) {
			this.data=data;
		}
	}


