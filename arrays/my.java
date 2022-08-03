package arrays;
import java.util.Scanner;
public class my {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		
		String ven[]=new String[n];
		
		for(int i=0;i<n;i++) {
			ven[i]=sc.nextLine();
		}
		System.out.println(ven[0]);
		
		
	int a[]= {2,1,8,-3,6,4,12};
	int s=a.length;
//		
//		for(int i=0;i<s-1;i++) {
//			boolean sorted=true;
//			for(int j=0;j<s-1-i;j++) {
//				if(a[j+1]<a[j]) {
//					int t=a[j+1];
//					a[j+1]=a[j];
//					a[j]=t;
//					
//			   sorted=false;
//			   
//			   
//				}
//			}if(sorted) break;
//		}
//		
//		for(int item:a) {
//			System.out.println(item);
//		}
//		
//		for(int i=0;i<s-1;i++) {
//			
//			int minind=i;
//			for(int j=i;j<s;j++) {
//				
//				if(a[j]<a[minind]) {
//					
//				
//				minind=j;
//				
//			}
//		}
//		    int t=a[i];
//		    a[i]=a[minind];
//		    a[minind]=t;
//		}
//		for(int item:a) {
//			System.out.print(item+" ");
//		}
		
	}

}
