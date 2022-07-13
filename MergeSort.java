package datastructure;

public class MergeSort 
{
	public void merge(int arr[], int beg, int mid, int end) {
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[beg + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		int k = beg;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,1,3,5,67};
System.out.println("Given element ofArray");
printArray(arr);

MergeSort ob = new MergeSort();
ob.sort(arr, 0, arr.length - 1);

System.out.println("Sorted element of array");
printArray(arr);



	}

}
