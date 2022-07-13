package javaenum;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter  first number");
		Scanner sc=new Scanner(System.in);//input 1 no
		int numberone=sc.nextInt();
		int operation=0,result=0;//Variable Decalration
		//while loop initialization
		while(operation!=5) {
			System.out.println("Click 1 for Addition");
			System.out.println("click 2 for mutiplication");
			System.out.println("click 3 for subtraction");
			System.out.println("click 4 for division");
			operation=sc.nextInt();
			//if statement
			if(operation!=5) {
				System.out.println("enter second no");
				int numbertwo=sc.nextInt();
				//switch case
				switch(operation) {
				case 1:
					result=numberone+numbertwo;
					System.out.println("Addition is\t"+result);
					break;
				case 2: 
					result=numberone*numbertwo;
					System.out.println("Multiplication is\t"+result);
					break;
				case 3: 
					result=numberone-numbertwo;
					System.out.println("Subtraction is\t"+result);
					break;
				case 4: 
					result=numberone/numbertwo;
					System.out.println("Division is\t"+result);
					break;
				
				}
				sc.close();
			}
		}

	}
}