package logic;

public class NestedIFElse {

	public static void main(String[] args) {
		int a=40,b=80,c=90;
		int result=0;
		
		if(a>b) {
			if(a>c) {
				result =a;}
			else 
			{result=c;}
		}else 
		{if(b>c) {
			result=b;}else
			{result=c;
			}
		}
		System.out.println("largest of the three numbers is" + result);
	}

}
