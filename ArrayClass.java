package datastructure;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=60;
		arr[4]=50;
		for(int display:arr) {
			System.out.println("element of array are\t"+display);
		}
		//declare
		int arr1[]= {2,3,4,5,6};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("length of array\t"+arr1[i]);
		}
		//string
		
		String arr2[]=new String[5];
		arr2[0]="ram";
		arr2[1]="karan";
		arr2[2]="sanju";
		for(String displa:arr2) {
			System.out.println("element of array are\t"+displa);
		}
		//string
		String arr3[]={"fish","snake","rbbit"};
		for(int i=0;i<arr3.length;i++) {
			System.out.println("string are"+arr3[i]);
		}
		
	}

}
