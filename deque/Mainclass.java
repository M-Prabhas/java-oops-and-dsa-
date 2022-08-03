package deque;

import java.util.ArrayDeque;

public class Mainclass {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		ad.push(34);
		ad.push(4);
		ad.push(40);
		
       ad.pop();
       
       System.out.println(ad.pop());
       
	}

}
