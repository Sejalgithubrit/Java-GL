package javacollection;

import java.util.LinkedList;
import java.util.Queue;

public class JavaCollection_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding element in Queue
		Queue<String> names=new LinkedList<String>();
		names.add("sejal");
		names.add("raj");
		names.add("hy");
		names.add("java");
		System.out.println("Queue element are\t"+names);
		
		//after removing
		System.out.println("remove first element\t"+names.remove());
		//head element remove from queue
		
		System.out.println("head element\t\t"+names.element());
		
		//Poll Method
		System.out.println("Poll Method\t\t"+names.poll());
		
		
		//Peek Method
		System.out.println("peek method\t\t"+names.peek());

	}

}
