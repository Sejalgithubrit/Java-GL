package datastructure;

public class HeapSort {
	 public void heapsort(int arr[])
	    {
	        int n = arr.length;
	  
	       for (int i = n / 2 - 1; i >= 0; i--)
	            heapsorting(arr, n, i);
	  
	        // extracting element
	        for (int i = n - 1; i > 0; i--) {
	           
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	  
	           
	            heapsorting(arr, i, 0);
	        }
	    }
	  
	   
	    void heapsorting(int arr[], int n, int i)
	    {
	        int largest = i; 
	        int l = 2 * i + 1; 
	        int r = 2 * i + 2; 
	  
	        // left element is larger
	        if (l < n && arr[l] > arr[largest])
	            largest = l;
	  
	        // right element is larger
	        if (r < n && arr[r] > arr[largest])
	            largest = r;
	  
	        
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	  
	           
	            heapsorting(arr, n, largest);
	        }
	    }
	  
	   //print element
	     void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 78, 68, 29, 1, 5 };
	    int n = arr.length;
	    HeapSort object = new HeapSort();
        object.heapsort(arr);
  
        System.out.println("Sorted element of heap sort is");
       object.printArray(arr);
	}

}
