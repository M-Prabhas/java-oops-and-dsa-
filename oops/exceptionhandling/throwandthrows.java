package oops.exceptionhandling;

public class throwandthrows {

	public static void main(String[] args) {
		fun1();
	}public static void fun1() {
			int a=5;
			int d=4;
			
			int v=a/d;
			
			System.out.println(v);
			fun2();
//			boolean isdanger=true;
//			if(isdanger) {
//				throw new ArrayIndexOutOfBoundsException("danger in progress");
		
	try {
		fun2();}
	catch(Exception e) {
		System.out.println(e.getMessage()+"occured");
	
	}
	
	
	
	
	}static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isdanger=true;
		if(isdanger) {	
			throw new ArrayIndexOutOfBoundsException("danger in progress");
		}
	
		}

	

}
