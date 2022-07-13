package javaenum;
//Parent class
 class Person{
	String personname;
	//Constructor of parent class
	Person(String n)
	{
		personname=n;
	}
}
//Child Class

public class Employee extends Person {
	//Variable declaration
	String employeename;
	int JoiningYear;
	double empannualsalary;
	String InsuranceNum;
	//Constructor of Child class
	Employee(String n,String ename,int Year,double salary,String InsuranceNum)
	{
	 	super(n);
		this.employeename=ename;
		this.JoiningYear=Year;
		this.empannualsalary=salary;
		this.InsuranceNum=InsuranceNum;
		 
	}
	//Method declaration
	public  void print() {
		System.out.println("person name\t\t\t"+personname);
		System.out.println("employee name\t\t\t"+employeename);
		System.out.println("Joining year of employee\t"+JoiningYear);
		System.out.println("Employee salary\t\t\t"+empannualsalary);
		System.out.println("employee Insurance Number\t"+InsuranceNum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object of child class
	
		Employee e=new Employee("ravi","aditya",2018,20000,"QQ1234C");
		e.print();
		

	}

}
