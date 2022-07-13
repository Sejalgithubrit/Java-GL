package javaenum;

public class ProductDetails {
	int pid;
	String pname;
	
	String pdescription;
	String pstate;
	ProductDetails(int pid,
	String pname,
	String pdescription,
	String pstate){
		this.pid=pid;
		this. pname=pname;
		
		 this.pdescription=pdescription;
		this. pstate=pstate;
	}
	void display() {
		System.out.println("Product id"+pid);
		System.out.println("product name"+pname);
		System.out.println("product description"+pdescription);
		System.out.println("product state"+pstate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductDetails p=new ProductDetails(1,"shampoo","myntra","rajasthan");
p.display();
	}

}
