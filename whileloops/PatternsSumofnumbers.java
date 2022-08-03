package whileloops;
import java.util.Scanner;
public class PatternsSumofnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
//		int temp = n;
//		int sum=0;
//		
//		while (temp>0) {
//			
//			int lastdigit = temp%10;
//			temp /=10;
//			
//			sum +=lastdigit;
//			System.out.println(lastdigit+" "+temp+" "+sum);
//			
//			 
//		}System.out.println("the sum is"+n+"is"+sum);

		
//		int noofdigits =(int)Math.log10(n) +1;
//		
//System.out.println(noofdigits);
		
		int temp=n;
		int reverse=0;
		while (temp>0) {
			int lastdigit=temp%10;
			reverse=reverse*10 +lastdigit;
			temp/=10;
		}
		if (reverse==n) {
			System.out.println(n+"palindrome");
		}else {
		System.out.println(n+"not a palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
