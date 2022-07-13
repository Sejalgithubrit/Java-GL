package javaenum;

public class EmployeeDetails {
//Variable declaration
	int empid;
	String empfirstname;
	String emplastname;
	String empcity;
	String empstate;
	EmployeeDetails(int empid,
	String empfirstname,
	String emplastname,
	String empcity,
	String empstate){
		this.empid=empid;
		this. empfirstname=empfirstname;
		 this.emplastname=emplastname;
		 this.empcity=empcity;
		this. empstate=empstate;
	}
	void display() {
		System.out.println("employee id"+empid);
		System.out.println("employee first name"+empfirstname);
		System.out.println("employee city"+empcity);
		System.out.println("employee state"+empstate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 EmployeeDetails e=new EmployeeDetails(1,"sejal","udaipur","Rajsthan", "udaipur");
 e.display();
	}

}
