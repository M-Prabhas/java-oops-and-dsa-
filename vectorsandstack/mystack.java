package vectorsandstack;

import datastructures.linkedlistexamplemadebyme;

public class mystack<E> {
	
	private linkedlistexamplemadebyme<E> ll=new linkedlistexamplemadebyme<E>();
       void push(E e){
    	   ll.add(e);
       }
       
       E pop()throws Exception{
    	  if(ll.isEmpty()) {
    		  throw new Exception("popping empty linkedlist is not possible");
    	  }
    	  return ll.removeLast();
       }
       
       E peek()throws Exception {
    	   if(ll.isEmpty()) {
     		  throw new Exception("popping empty linkedlist is not possible");
     	  }
		return ll.getLast();
    	   
       }
}
