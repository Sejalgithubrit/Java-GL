package javacollection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet Creating
			HashSet<String>h=new HashSet<String>();
			//Adding an element
		  h.add("Lion");
		  h.add("Tiger");
		  h.add("Wolf");
		  h.add("Deer");
    
		    System.out.println("elements are\t"+h);
		    //Traversing
		     Iterator<String>i=h.iterator();
		     while(i.hasNext()) 
		     {
		    	 System.out.println(i.next());
		     }
		     
		     //Remove Method
		     h.remove("Deer");
		     System.out.println("remove elemnt is"+h);
		     
			     //Clone method
			     HashSet m=new HashSet();
			     m=(HashSet)h.clone();
			     System.out.println("new set"+m);
		     
		     //Contains or not
		     System.out.println("Conatins or not\t"+h.contains("Wolf"));
		     
		     //HashSet 2
		     HashSet<String>hash=new HashSet<String>();
		     //Adding an element
		     	hash.add("Germany");
		     	hash.add("Russia");
		     	hash.add("China");
		     	hash.add("India");
		     	//Displaying element
		     	System.out.println("Second hasset"+hash);
		     	
		     	//Checking equals or not
		     	boolean value=h.equals(hash);
		     	System.out.println("value is equals or not\t"+value);
		     	
		     	//Empty method
		     	System.out.println("is the set empty or not\t"+h.isEmpty());
		     	
		     	//Clear Method
		     	hash.clear();
		    	System.out.println("is the set empty or not\t"+hash.isEmpty());
		    	System.out.println();
		    	System.out.println();
		    	
    	
		    	
		    	//TreeSet
		     	TreeSet<Integer> tree=new TreeSet<Integer>();
		     	//Adding element in TreeSet
		     	tree.add(10);
		     	tree.add(20);
		     	tree.add(30);
		     	tree.add(40);
		     	tree.add(50);
		     	
		     	//Display element
		     	System.out.println("TreeSet"+tree);
		     	
		     	//Creating iterator
			     	Iterator value1=tree.iterator();
			     	System.out.println("iterator value are");
			     	while(value1.hasNext()) 
			     	{
			     		System.out.println(value1.next());
			     	}
			     	
		     	//Clone Method
		     	TreeSet cloned= new TreeSet();
		     	cloned=(TreeSet)tree.clone();
		     	System.out.println("cloned treeset\t"+cloned);
     	
		     	//Check for Empty Set
		     	System.out.println("is empty or not\t"+tree.isEmpty());
		     	
		     	//size of treeset
		     	System.out.println("Size of tree set\t"+tree.size());
		     	
		     	//Remove Method
		     	
		     	System.out.println("remove eleemnt\t"+tree.remove(30));
		     	System.out.println("new Treeset"+tree);
		     	
		     	//Another TreeSet
    	
		     	TreeSet<Integer> tree1=new TreeSet<Integer>();
			     	//Adding element in TreeSet
			     	tree1.add(30);
			     	tree1.add(20);
			     	tree1.add(10);
			     	tree1.add(90);
			     	tree1.add(80);
     	
		     	//Check equals or not
		     	 System.out.println("Tree Set equals or not\t"+tree.equals(tree1));
		     	 System.out.println();
     	 
		     	 //Tree Map
		     	 TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		     	 treemap.put(1, "Ship");
		     	 treemap.put(2, "Goat");
		     	 treemap.put(3, "Deer");
		     	 treemap.put(4, "Horse");
     	 
		     	 System.out.println("elemnt of "+treemap);
		     	 //Empty or not
		     	 System.out.println("empty or not\t"+treemap.isEmpty());
		     	 
		     	 //Geeting the value of 3
		     	 System.out.println("the value is\t"+treemap.get(3));
		     	 
		     	 //Displaying the clone
		     	 
		     	 System.out.println("clone method"+treemap.clone());
		     	 
		     	//Key present or not
		     	 System.out.println("is key 4 present\t"+treemap.containsKey(3));
		     	 
		     	 
		     	 //Values present or not
		     	 System.out.println("is the value deer present\t"+treemap.containsValue("Deer"));
		     	 
		     	 //Printing one by one
     	        for(Integer key:treemap.keySet()) {
     	        	System.out.println(key+" :"+treemap.get(key));
     	        }
     	
     	
     
	}

}
