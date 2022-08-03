package datastructures;



public class linkedlistexamplemadebyme<E> {
     Node<E>  head;
	
	public void add(E data) {
		Node<E> toadd=new Node<E>(data);
		
		if(isEmpty()) {
			head=toadd;
			return;
		}
		
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		
		temp.next=toadd;
	}
	
	void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
	}}
	
	
	
	
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public E removeLast() throws Exception {
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("cannot remove the element from the last since the linked list is empty");
		}
		
		if(temp.next==null) {
			Node<E> toremove=head;
			head=null;
			return toremove.data;
		}
		
		while(temp.next.next!=null) {
			temp=temp.next;
			}
		Node<E> toremove=temp.next;
		temp.next=null;
		return  toremove.data;
	}
	
	public E getLast() throws Exception {
    Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("cannot get peek - element from the last since the linked list is empty");
		
		}
		
		while(temp.next!=null) {
			temp=temp.next;
			}
		
		
		return temp.data ;
	
	
	}
	
	
    public	static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
	}
    
    public static void main(String [] args) {
    	
    	linkedlistexamplemadebyme<Integer> ll=new linkedlistexamplemadebyme<Integer>();
    	
    	for(int i=0;i<10;i++) {
    		ll.add(i);
    	}
    	
    	ll.print();
    	
    }
}


