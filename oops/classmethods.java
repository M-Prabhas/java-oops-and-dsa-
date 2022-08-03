package oops;

//class Cat{
//	boolean hasFur;
//	String color,breed;
//	int legs,eyes;
//	
//	public void walk() {
//		System.out.println("Cat is Walking");
//	}
//	
//	public void eat() {
//		System.out.println("Cat is Eating");
//	}
//	
//	public void description(){
//		System.out.println("my cat has"+ legs +"legs and" + eyes + "eyes");
//	}
//	
//}


public class classmethods {

	public static void main(String[] args) {
//	   Cat cat1=new Cat();
//	   Cat cat2=new Cat();
//	   
//	   cat1.walk();   
//	   cat2.eat();
//	   
//	   cat1.legs=3;
//	   cat1.eyes=2;
//	   
//	   cat2.legs=32;
//	   cat2.eyes=4;
//	   
//	   
//	   cat1.description();
//	   cat2.description();
		
		int firstnumber=34;
		int secondnumber=23;
		
		int result=maxOf(firstnumber,secondnumber);
		
		
		
		
		
//		System.out.println("greatest is");
//		System.out.println(result);
//		System.out.println(maxOf(100,340));
//		Sayhi();
//		
//		Sayhi();
//		
		
	   }
	
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}}
	
}