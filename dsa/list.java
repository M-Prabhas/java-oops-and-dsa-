package dsa;



public class list {
   public int val;
   public Node head;

	public void addatfirst(int data) {
		
		Node newnode=new Node(data);
				
		if(isEmpty()) {
			head=newnode;
		}else {
			newnode.next=head;
			head=null;
			head=newnode;
		}
		
	}
	
	public void addatlast(int data) {
		Node newnode=new Node(data);
		
		if(isEmpty()) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	
	public int removeatfirst() throws Exception{
		if(isEmpty()) {
			throw new Exception("cannot remove the element from the last since the linked list is empty");
		}else {
			val=head.data;
			head=head.next;
			return val;
		}
	}
	
   public int removeatlast() throws Exception{
	   if(isEmpty()) {
			throw new Exception("cannot remove the element from the last since the linked list is empty");
		}else {
		   Node temp=head;
		   Node prev=head;
		   while(temp.next != null) {
			   prev=temp;
			   temp=temp.next;
		   }
		   val=temp.data;
		   prev.next=null;
		   return val;
		}
   }
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}

	 public void printlist() {
		Node temp=head;
		 while(temp.next != null) {
			 System.out.println(temp.data);
			 temp=temp.next;
			
		 } 
	 }
	
	public class Node{
	public	int data;
		public Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String [] args) throws Exception{
         list hou=new list();
		 
	   for(int i=0;i<10;i++) {
		   hou.addatfirst(i+1);
	   }
		
		
	}
	}



