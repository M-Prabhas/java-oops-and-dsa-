package dsa;



public class minheap {
    public static int arr [] ;
    public static int pos=1;
    public int parent;
    
    public minheap() {
    	arr= new int[150];
    }
	public void insert(int value) {
		arr[pos]=value;
		pos++;
		int i=pos;
		
		while(i>1) {
			parent=(int) (Math.floor(i/2));
			if(arr[i]<arr[parent]) {
				int temp=arr[parent];
				arr[parent]=arr[i];
				arr[i]=temp;
				i=parent;
			}else {
				return;
			}
		}	
	}
	
	public void print() {

    for(int i=1;i<=pos;i++) {
    	System.out.print(arr[i]);
    	System.out.print(" ");
    }
	}
	
	public static void main(String [] args) {
		
		minheap h=new minheap();
		h.insert(10);
		h.insert(40);
		h.insert(60);
		h.insert(30);
		h.insert(20);
	    h.print();
	}

}
