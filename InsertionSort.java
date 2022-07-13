package datastructure;

public class InsertionSort {
	//Insertion sort
	void insertion(int arr[]) {
		int n=arr.length;									
		for(int j=1;j<n;j++) {
			int keys=arr[j];
			int i=j-1;
			while((i>-1)&& arr[i]>keys) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=keys;
		}
	}
	//print 
void print(int arr[]) {
	int n=arr.length;
	for(int j=1;j<n;j++) {
		System.out.println(arr[j]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort object=new InsertionSort();
		int arr[]= {9,14,23,12,34};
		object.insertion(arr);
		object.print(arr);
		
		
	}

}
