package filehandling;

import java.io.FileReader;

public class filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []array=new char[1000];
  try {
	  FileReader input=new FileReader("sejal.txt");
	  input.read(array);
	  System.out.println("Data in file");
	  System.out.println(array);
	  input.close();
  }
  catch(Exception e){
	  e.getStackTrace();
	  
  }
	}

}
