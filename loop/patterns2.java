package loop;
import java.util.Scanner;
public class patterns2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("   ");
//			}for(int j=1;j<=i;j++) {
//				System.out.print("*   ");
//			}
//			System.out.println( );
//		}
		
		
		
	
//		int number=1;
//		for(int i=1;i<=n;i++) {
//		
//		for(int j=1;j<=n-i;j++) {
//				System.out.print("   ");
//			}for(int j=1;j<=i;j++) {
//				System.out.print(number +"  ");
//				number++;
//			}
//			System.out.println( );
//		}

	
//		int rows=2*n-1;
//		
//		for(int i=1;i<=rows;i++) {
//			if(i<=n) {
//				System.out.print("* ");
//			
//			
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");}
//		
//			}else {
//			for(int j=1; j<=rows-i+1;j++) {
//				System.out.print("*  ");
//			}
//		}
//		System.out.println( );
//	}
		
		
		
		System.out.println("*");	
		for(int i=2;i<=n-1;i++) {
			System.out.print("* ");
			
		
			for(int j=1;j<=i-2;j++) {
				System.out.print(" ");
			}System.out.print("*");
			
			System.out.println( );
		}

	for(int i=1;i<=n;i++) {
		System.out.print("*");
	}
	
	}
	}


