package polymorphism;

public class dog extends pet {
	
	public void walk() {
		System.out.println("dog is walking");
		
	}
	
	public static void main(String [] args) {
		
		dog dog=new dog();
		dog.walk();

		
		
		
	}

}
