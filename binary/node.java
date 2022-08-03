package binary;
 class node {

	int key;
	node left;
	node right;
	
	
	public node(int item) {
		
	  key=item;
	  right=left=null;
	}
 }
	class binarytree{
	
		node root;
		
	binarytree(int key){
			root=new node(key);
		}
	binarytree(){
		root=null;
	}
	
	
public  void main(String[] args) {
       
		binarytree tree=new binarytree();
		
		tree.root=new node(1);
		root.right=new node(2);
		root.left=new node(3);

		

	
	}
}
