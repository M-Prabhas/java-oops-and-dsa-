package dsa;


public class stack {
  
	list ll=new list();
	
	public void push(int e){
  	   ll.addatlast(e);
     }
     
    public int pop() throws Exception{
  	  if(ll.isEmpty()) {
  		  throw new Exception("popping empty stack is not possible");
  	  }else {
  	  return ll.removeatlast();
     }
    }
     
   public void printstack() {
    	ll.printlist();
    }
     
	
	  

}