package dsa;

import java.util.Arrays;

public class mergesort {

public static void conquer(int arr[],int s ,int mid,int e) {
	int merger[]=new int[e-s+1];
	
	int ind1=s;
	int ind2=mid+1;
	int x=0;
	
	while(ind1<=mid && ind2<=e) {
		if(arr[ind1] <= arr[ind2]) {
			merger[x++]=arr[ind1++];
		}else {
			merger[x++]=arr[ind2++];
		}
	}
	
	while(ind1<=mid) {
		merger[x++]=arr[ind1++];
	}
	
	while(ind2<=e) {
		merger[x++]=arr[ind2++];
	}
	
	for(int i=0,j=s;i<merger.length;i++,j++) {
		arr[j]=merger[i];
	}
}

public static void divide(int arr[],int s ,int e) {
	if(s>=e) {
		return ;
	}
	
  int	mid=s+(e-s)/2;
	divide(arr,s,mid);
	divide (arr,mid+1,e);
    conquer(arr,s,mid,e);
	
}
   
	
	
	public static void main(String[] args) {
		
   int arr[]= {3,6,4,8,9,2,1,6};
   int n=arr.length;
   
   divide(arr,0,n-1);
   System.out.println(Arrays.toString(arr));
  
}

}
