package Que;

import java.util.*;

public class mainclass {

	public static void main(String[] args) {
		myqueue<Integer> s=new  myqueue<>();
		
		s.enqueue(78);
		s.enqueue(34);
		s.enqueue(56);
		s.enqueue(23);
		
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.Element());
			}
}
