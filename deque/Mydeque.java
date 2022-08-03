package deque;

public class Mydeque<E> {
     
	Node<E>  head,tail;
	
	public void addtohead(E data) {
		
		Node<E> toadd=new Node(data);
		
		if(head==null) {
			head=tail=toadd;
			return;
			
		}
		
		head.next=toadd;
		toadd.prev=head;
		head=toadd;
		
	}
	
	public E removelast() {
		if(head==null) {
			
		
		return null;
		}
		Node<E> toremove=tail;
		tail=tail.next;
		tail.prev=null;
		
		if(tail==null) {
			head=null;
		}
		
		return toremove.data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static class Node<E>{
		E data;
		Node<E>  next,prev;
		
		public Node(E data) {
			this.data=data;
			this.next=this.prev=null;
		}
	}
}
