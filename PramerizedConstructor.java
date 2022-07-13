package javaenum;


public class PramerizedConstructor 
{   //Variable Initialization
	int userid;
	String  fname;
	String lname;
	String city;
	//constructor
	PramerizedConstructor(int userid,String fname, String lanme,String city)
	{
	this.userid=userid;
	this.fname=fname;
	this.lname=lanme;
	this.city=city;
	}
	//Method decalration
	void display()
	{
	System.out.println("user id"+userid);
	System.out.println("user first name"+fname);
	System.out.println("user last name"+lname);
	System.out.println("user city"+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PramerizedConstructor p=new PramerizedConstructor(1,"sejal","mirani","udaipur");
		p.display();//Method calling
		
	}

}
