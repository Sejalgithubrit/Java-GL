package javacollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque<String> names=new ArrayDeque<String>();
     	names.add("Sejal");
		names.add("Raj");
		names.add("Hy");
		names.add("Java");
		
		//Displaying the element
		System.out.println("array deueue"+names);
		
		//Adding element at first
		names.addFirst("Ramu");
		names.addFirst("Bhanu");
		System.out.println("arraydeque first adding"+names);
		
		//Adding element to last
		names.addLast("Priya");
		names.addLast("akshat");
		System.out.println("Arraydeque  adding element at last"+names);
		
		//Check contains
		System.out.println("Does deuque contains element or not\t"+names.contains("Priya"));
		
		//get first
		System.out.println("First element is\t"+names.getFirst());
		
		//Get Last
		System.out.println("Last elemet is\t"+names.getLast());
		
		// Peek method using first
		System.out.println("Peek mathod at first"+names.peekFirst());
		
		//Peek Method using last
		System.out.println("Peek method at last"+names.peekLast());
		
		//poll First
		System.out.println("Poll method at first"+names.pollFirst());
		
		//Poll Last
		System.out.println("Poll method at last"+names.pollLast());
		
		//size of dequeue
		System.out.println("Size of dequeue is"+names.size());
		
		
		
     
     
	}

}
