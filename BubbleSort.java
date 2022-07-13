package datastructure;
class Bubble{
	void bubble(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
	void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;++i) {
			System.out.println(arr[i]);
		}
	}
	
}
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bubble b=new Bubble();
int arr[]= {10,20,40,12,34};
b.bubble(arr);
b.print(arr);
	}

}
