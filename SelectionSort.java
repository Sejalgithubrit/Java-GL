package datastructure;

	public class SelectionSort
	{
		void sorting(int arr[]) 
		{
			int n=arr.length;
			for(int i=0;i<n-1;i++) 
			{
				//minimum element in array
				int minimumindex=i;
				for(int j=i+1;j<n;j++) 
				
					if(arr[j]<arr[minimumindex]) 
					
						minimumindex=j;
						//swap
						int temp=arr[minimumindex];
						arr[minimumindex]=arr[i];
						arr[i]=temp;
					}
			}
			//Print Method
				void printarray(int arr[]) {
					int n=arr.length;
					for(int i=0;i<n;i++) {
						System.out.println(arr[i]);}
					
						
				
			
			
		}
		


public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSort object=new SelectionSort();
		int arr[]= {10,0,9,6,5};
		object.sorting(arr);
		
		object.printarray(arr);
	}

}
