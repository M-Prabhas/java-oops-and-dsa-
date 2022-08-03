package dsa;

import java.util.Arrays;

public class hashTable {
     public int hash[];
     int len;
	
	hashTable(int len){
		hash=new int[len];
		this.len=len;
	}
	
	public int[] hashby1(int element) {
		int n=len;
		int sement=element;
		int tokeep=element%len;
		if(hash[tokeep] != 0) {
			
			while(hash[tokeep] != 0) {
			 tokeep=(element)%len;
			 element=element+1;
			}
			
			hash[tokeep]=sement;
		}else {
			hash[tokeep]=element;
		}
	
		return hash;
		
	}
	
	public static void main(String[] args) {
		// please insert values greater than 0
		
		hashTable h=new hashTable(10);
		
		h.hashby1(34);
		System.out.print(Arrays.toString(h.hashby1(44)));
		
		

	}

}
