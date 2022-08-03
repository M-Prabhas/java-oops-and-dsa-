package arrays;
import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
	
//		int a[][]=new int [5][3];
////		System.out.println(a[4][2]);
//		int b[][]= {
//				{3,1,5,2,7}
//				,{4,1,7},
//				{12,5,6,7,8},
//		};
//		
//		System.out.println(b[0][2]);

		Scanner sc=new Scanner(System.in);
//		System.out.println("enter dimensions");
//		 int rows=sc.nextInt();
//		 int cols=sc.nextInt();
//		 
//		 int a[][]=new int[rows][cols];
//		 int b[][]=new int[rows][cols];
//		 System.out.println("enter array a");
//		 for(int i=0;i<rows;i++) {
//			 for(int j=0;j<cols;j++) {
//				  a[i][j]=sc.nextInt();
//				 
//			 }
//		 }
//		 System.out.println("enter array b");
//		 for(int i=0;i<rows;i++) {
//			 for(int j=0;j<cols;j++) {
//				  b[i][j]=sc.nextInt();
//				 
//			 }
//		 }
//		 int c[][]=new int[rows][cols];
//		 
//		 for(int i=0;i<rows;i++) {
//			 for(int j=0;j<cols;j++) {
//				  c[i][j]=a[i][j]+b[i][j];
//				  
//				 
//			 }
//		 }
//		 
//		 System.out.println("result is");
//		 for(int i=0;i<rows;i++) {
//			 for(int j=0;j<cols;j++) {
//				  System.out.println(c[i][j]+ "");
//				 
//			 }
//		 }System.out.println();
		
		System.out.println("enter the value of array width: ");
		int n=sc.nextInt();
	int a[]= new int [n];
	
	
			
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		int m=a[0];
			if(a[i]>m) {
		   	m=a[i];
			}System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}