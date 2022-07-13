package datastructure;

public class QuickSort {
	
	 void quick(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 public int partitionelement(int[] arr, int lowelemnt, int highelement)
	 {
	      int pivot = arr[highelement];
	      int i = (lowelemnt - 1);
	  
	     for(int j = lowelemnt; j <= highelement - 1; j++)
	     {
	          
	        //cureent eleemnt smaller than pivot eleemnt
	         if (arr[j] < pivot)
	         {
	             i++;
	             quick(arr, i, j);
	         }
	     }
	     quick(arr, i + 1, highelement);
	     return (i + 1);
	 }
	  
	
	  void quickSort(int[] arr, int lowelement, int highelement)
	 {
	     if (lowelement < highelement)
	     {
	        
	         int pi = partitionelement(arr, lowelement, highelement);
	  
	        
	         quickSort(arr, lowelement, pi - 1);
	         quickSort(arr, pi + 1, highelement);
	     }
	 }
	  
	 // print an array
	  void printArray(int[] arr, int size)
	 {
	     for(int i = 0; i < size; i++)
	         System.out.print(arr[i] + " ");
	          
	     System.out.println();
	 }
	  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 78, 68, 29, 1, 5 };
	    int n = arr.length;
	     QuickSort o=new QuickSort();
	    o.quickSort(arr, 0, n - 1);
	    System.out.println("Sorted  eleemt of array ");
	    o.printArray(arr, n);

	}

}
