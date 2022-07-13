package filehandling;

import java.io.FileWriter;

public class filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="new created file";
try {
FileWriter output=new FileWriter("sejal.txt");
output.write(data);
System.out.println("data return to file");
output.close();
}
catch(Exception e) {
	e.getStackTrace();
}
	}

}
