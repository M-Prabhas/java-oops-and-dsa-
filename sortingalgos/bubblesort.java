package sortingalgos;
import java.util.Arrays;

public class bubblesort {

	
	public static void main(String [] args) {
		
		/// bubble sort
		int arr []= {1,6,4,2,7,8,9,3,2,5,0};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	// selection sort	
		
		int arr1 []= {1,6,8,9,3,2,5,0};	
		
	for(int i=0;i<arr1.length;i++) {
		int min=i;
		for (int j=i+1;j<arr1.length;j++) {
			if(arr1[min]>arr1[j]) {
				min=j;
			}
			int temp=arr1[min];
			arr1[min]=arr1[i];
			arr1[i]=temp;
		}
		
		
	}
		System.out.println(Arrays.toString(arr1));
		
		
   // insertion sort
		
		int a[]= {2,8,6,3,9,4,5};
		
		for(int i=1;i<a.length;i++) {
			int temp1=a[i];
			int j=i-1;
			
			while(a[j]>temp1 && j>=0) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp1;
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	
}
