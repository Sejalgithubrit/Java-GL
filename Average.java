package javaenum;

import java.util.Scanner;

public class Average 
{
	//Method Declaration
	public static double average(double numberone,double numbertwo,double numberthree ) {
		return(numberone +numbertwo +numberthree)/3;
}

public static void main(String[] args)
{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//First number
System.out.println("enter first number");
double numberone=sc.nextDouble();
//Second Number
System.out.println("enter second number");
double numbertwo=sc.nextDouble();
//Third Number
System.out.println("enter third number");
double numberthree=sc.nextDouble();
// Find Average no 
System.out.println("average of three no is\t"+average(numberone,numbertwo,numberthree));
sc.close();

	}
	


}
