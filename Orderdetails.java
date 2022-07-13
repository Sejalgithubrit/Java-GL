package javaenum;

public class Orderdetails {
	int orderid;
	String ordname;
	String orderdes;
	int orprice;
	Orderdetails(int orderid,String ordname,String orderdes,int orprice){
		this.orderid=orderid;
		this.ordname=ordname;
		this.orderdes=orderdes;
		this.orprice=orprice;
	}
	void display() {
		System.out.println("order id"+orderid);
		System.out.println("order name"+ordname);
		System.out.println("order description"+orderdes);
		System.out.println("oder price"+orprice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Orderdetails order=new Orderdetails(1,"res","hhy",20);
order.display();
	}

}
