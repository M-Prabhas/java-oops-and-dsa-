package oops;

public class finalkeyword {
 
	 int rollno; // if they are wreitten in final then we cant give without initialisation since they are global
	 String name;
	
	{
		rollno=4;  //generally used to initialise the variables
	}
	
public finalkeyword(){
	name="prabhas";
		
	}
	
	public void getdescription() {
		System.out.println("the student name is  "+name);
		
	}
}
