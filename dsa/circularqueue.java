package dsa;

import java.util.Arrays;

public class circularqueue {

	int a[];
	int n;
	int front=-1;
	int rear=-1;
	
	public circularqueue(int n){
		this.n=n;
		a=new int[n];
	}
	
	
	public void enque(int data) {
		if((rear+1)%n==front) {
			return;
		}
		if(front==-1)front=0;
		rear=(rear+1)%n;
		a[rear]=data;
	}
	
	public int dequeue() throws Exception {
		if(front==-1) {
			throw new Exception("the circular queue is empty");
		}
		int ret=a[front];
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else {
			front=(front+1)%n;
		}
		return ret;
	}
	
	public void print() {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		circularqueue cq=new circularqueue(4);
		cq.enque(10);
		cq.enque(8);
		cq.enque(1);
		cq.enque(7);
		cq.print();
       
	}

}
