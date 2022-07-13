package filehandling;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  File file=new File("sejal.txt");
  boolean value=file.createNewFile();
  try {
	  if(value) {
		  System.out.println("file created");
	  }
	  else {
		  System.out.println("not created");
	  }
  }
  catch(Exception e) {
	  System.out.println("catch");
  }
	}

}
