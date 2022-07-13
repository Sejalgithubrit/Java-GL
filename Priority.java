package javacollection;
import java.util.*;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<String> names=new PriorityQueue<String>();
			//adding element 
			names.add("sejal");
			names.add("raj");
			names.add("hy");
			names.add("java");
			//Print the element
			System.out.println("list of priority queue"+names);
			System.out.println(names.element());
			System.out.println(names.remove());
			System.out.println(names.peek());
			
			//Peek Method
	}

}
