package oops.abstraction;

public class abstraction{  //repairshop
	
	public static void repaircar( car car) {
		
		System.out.println("car is repeated");
		}
	
	
	
	public static void main(String[]args) {
       
		wagonr wagonr=new wagonr();
		audi audi =new audi();
		
		
		repaircar(audi);
		repaircar(wagonr);
		
		
		
		
		
		
		
		
}}
