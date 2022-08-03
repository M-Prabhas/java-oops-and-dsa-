package sortingalgos;

import java.util.Arrays;

public class mergesort {

	public static void mergesortalgo(int arr [],int l,int h){
		if(l<h) {
			int mid=(l+h)/2;
			mergesortalgo(arr,l,mid);
			mergesortalgo(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	
	static void merge(int arr [],int l,int mid,int h) {
		int i=l;
		int j=mid+1;
		int k=l;
		int b[]=new int[arr.length];
		while(i<=mid && j<=h) {
			if(arr[i]<arr[j]) {
				b[k]=arr[i];
				i++;
			}else {
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=h) {
				b[k]=arr[j];
				k++;
				j++;
			}
		}else {
			while(i<=mid) {
				b[k]=arr[i];
				k++;
				i++;
			}
		}
		
		for(k=l;k<=h;k++) {
			arr[k]=b[k];
			
		}
		System.out.println(arr);
	}
	
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {6,8,9,10,4,5,3,87,95};
		int l=0;
		int h=arr.length;
		
		mergesortalgo(arr,l,h);
		
	    System.out.println(Arrays.toString(arr));

	}

}
