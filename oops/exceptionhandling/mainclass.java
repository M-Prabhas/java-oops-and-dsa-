package oops.exceptionhandling;

public class mainclass {

	public static void main(String[] args) {
		try {
			int a=7;
		 int b=0;
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + "occured,please reset your code block");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index should not cross length of a string in its forward coumt with respect to the string");	
		}finally {
			System.out.println("sorry for our mistake"); //it runs always means in each and every case even if we dont catch the exception
		}
          
         
		System.out.println("note-now it can run even in the errpor of the above part");
	}

}
