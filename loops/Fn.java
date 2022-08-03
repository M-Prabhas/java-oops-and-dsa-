package loops;
import java.util.Scanner;
public class Fn {

	public static void main(String[] args) {
//		for(int j=1;j<=5;j++) {
			
		
//		for(int i=1;i<=10;i++) {
//			System.out.print(i +" ");}
//		}System.out.println();
		

//	}  
//		for(int j=1;j<=20;j++) {
//		for(int i=1;i<=20;i++) {
//			System.out.println(j*i );
//		}System.out.println();}
		
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int j=1;j<=n;j++) {
//		for(int i=1;i<=n;i++) {
//			System.out.print("* ");
//		}System.out.println();
//		}
		
		
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}
		
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++) {
//			System.out.print("   ");
//			}
//			for(int j=1;j<=i;j++) {
//			for(int j=1;j<=n-i;j++) 
			
				System.out.print("*  ");
			}
	System.out.println();}
		
		
		
		
		
		
		
		
		
		
	}
}
