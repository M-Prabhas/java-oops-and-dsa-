package practise;

import oops.inheritance;

public class a extends inheritance {
	
	public a(String name) {
		super(name);
		System.out.println("techer constructor");
	}
     
   public void teach() {
	System.out.println(name+"  is teaching");
}
   public void eat() {
	   super.eat();
	   System.out.println(name +"  teacher is eating");
   }
   public static void laugh() {
		System.out.println("  teacher  is laughing");
}}
