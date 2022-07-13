package javaenum;

import java.util.Scanner;

public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		double numberone=sc.nextDouble();
		//Positive Number
		if(numberone>0) {
			if(numberone<1) {
				System.out.println("positive smaller number ");
			}
			else if(numberone>1000000) {
				System.out.println(" positive Larger number");
			}
			else {
				System.out.println("Positive number ");
			}
			
		}
		//Negative Number
		else if(numberone<0) {
			{
				if(numberone<1) {
					System.out.println("Negative small number");
				}
				else if(numberone>1000000) {
					System.out.println(" Negative Larger number");
				}
				else {
					System.out.println("Negative number ");
				}
			}
		}
			else {
				System.out.println("zero");
			
		}
		sc.close();
	}
	

}
