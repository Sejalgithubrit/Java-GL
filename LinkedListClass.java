package arrayclass;

import java.util.LinkedList;
public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedList 1
		LinkedList<String> countries=new LinkedList<String>();
		countries.add("Germany");
		countries.add("Africa");
		countries.add("India");
		countries.add("Nepal");
		System.out.println(" elements of list 1 are"+countries);
		
//LinkedList 2
		LinkedList<String> country=new LinkedList<String>();
		country.add("France");
		country.add("China");
		country.add("Belgium");
		country.add("Georgia");
		
		System.out.println(" elements of list 2 are"+country);
	
//Adding an element at particular index
		countries.add(3,"Kannada");
		
//After adding at specified index
		System.out.println("specified index"+countries);
		System.out.println();
		

//Joining two LinkedList
				countries.addAll(country);

//Print after joining two LinkedList
				System.out.println("joining array list"+countries);
				System.out.println();
				
//Appending collection to LinkedList
				countries.addAll(1,country);
				System.out.println("new linked list"+countries);
				System.out.println();
					
				
//adding the new element at starting
				countries.addFirst("Russia");
				System.out.println("new linked list"+countries);
				System.out.println();
				
//adding the new element at last
				countries.addLast("Arabia");
				System.out.println("new linked list"+countries);
				System.out.println();
				
//Empty LinkedList
				countries.clear();
				System.out.println("clear namelist"+countries);
				System.out.println();
				
//Clone LinkedList
				LinkedList<String> countrys=new LinkedList<String>();
				countrys=(LinkedList)countries.clone();
				System.out.println("after cloning countrys to countries"+countrys);
				System.out.println();
				//Sub List method
			       System.out.println("the sublist is"+ country.subList(1,3));
			       System.out.println();
			       //iterate a linked list
			     
				
//Contains Method
				System.out.println("france present in the list\t"+country.contains("France"));
				System.out.println();

//Finding specific element in the LinkedList
				System.out.println("Element is\t\t"+country.get(3));
				System.out.println();
				
//Finding first element from the list
				System.out.println("First Element is\t"+country.getFirst());
				System.out.println();
	
//Finding Last element from the List
				System.out.println("Last Element is\t\t"+country.getLast());
				System.out.println();
				
//Find the position of the element
				System.out.println("Last Element is\t\t"+country.indexOf("China"));
				System.out.println();
	
//Remove first element from LinkedList
				System.out.println("remove first element from linked list\t"+country.removeFirst());
				System.out.println("Final linkedList\t"+country);
				System.out.println();

//Remove Last element from Linked List
				System.out.println("remove Last element from linked list\t"+country.removeLast());
				System.out.println("Final linkedList\t"+country);
				System.out.println();

//Display the size of the LinkedList
				System.out.println("Size of Linked List is\t\t"+country.size());
				System.out.println();

				//push element in list
				country.push("Pakisthan");
				System.out.println("linked list"+country);
				System.out.println();
				
//pop element in list
				
				country.pop();
				System.out.println("linked list"+country);
				System.out.println();
				
//Poll Method
				System.out.println("linked list head"+country.poll());
				System.out.println("after removal"+country);
				System.out.println();
//Poll First
				System.out.println("linked list head"+country.pollFirst());
				System.out.println("after removal"+country);
				System.out.println();
	
				//poll Last
				System.out.println("linked list head"+country.pollLast());
				System.out.println("after removal"+country);
				System.out.println();
				
				//Peek Method
				System.out.println("Peek  after"+country.peek());
				System.out.println("after peek list"+country);
				System.out.println();
				
				//Peek First
				System.out.println("linked list peek first"+countries.peekFirst());
				System.out.println();
				
				//Peek Last
				System.out.println("linked list peek last"+country.peekLast());
				System.out.println();
				
				//find element
				 LinkedList<Integer> l1=new LinkedList<Integer>();
				l1.add(2);
				
				l1.add(4);
								
				//Search element in linked list
				int element=4;
				int ans=-1;
				for(int i=0;i<l1.size();i++)
				{
					int l1element=l1.get(i);
					if(l1element==element) 
					{
						ans=i;
					 break;
				}
				
	}
				if(ans==-1) {
					System.out.println("element not found");
				}
				else {
					System.out.println("elemnt found\t"+ans);
				}
				System.out.println();
//Linked list 4
				 LinkedList<String> name = new LinkedList<String>();
			        // Appending elements at the end of the list
			        name.add("Sejal");
			        name.add("Manali");
			        name.add("Vikas");
			        System.out.println("Elements before reversing: " + name);
			        
			        name = reverseLinkedList(name);
			        
			        System.out.println("Linked ListElements after reversing: " + name);
			    }
			  
			 
	
			    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
			    {
			        LinkedList<String> reverse = new LinkedList<String>();
			        for (int i = llist.size() - 1; i >= 0; i--) {
			  
			            // Append the LinkedList in reverse order
			            reverse.add(llist.get(i));
			        }
			        // Return the reversing LinkedList
			        return reverse;
			        
	
			        
			      
			     
}
}