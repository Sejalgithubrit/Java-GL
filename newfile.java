package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class newfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Read the file
		File f=new File("sejal.txt");
		if(f.canRead()) {
			System.out.println("can be read");
		}
		else {
			System.out.println("cannot read the file");
		}
		//Creating a file
		File file=new File("raj.txt");
		try {
			boolean r=file.createNewFile();
			if(r) {
				System.out.println("file created");
			}
			else {
				System.out.println("not created");
			}
		}
		catch(Exception e)
		{  e.getStackTrace();
			}
		
	//Write in file
	
	if(file.canWrite()) {
		System.out.println("can write in file");
	}
	else {
		System.out.println("not write in file");
	}
	//Length of file
	System.out.println("length of file"+file.length());
 //File exists or not
	try {
		File ile=new File("sejal.txt");
	if(ile.exists()) {
		System.out.println("file exists");
		
	}
	else {
		System.out.println("not file exists");
	}}
	catch(Exception e){
		e.getStackTrace();
	}
	//Delete Method
	try {
		File input=new File("sejal.txt");
		if(input.delete()) {
			System.out.println("file deleted");
		}
		else {
			System.out.println("not deleted");
		}
		
	}
	catch(Exception e) {
		e.getStackTrace();
	}
	//Get absolute path
	try {
		File f1=new File("raj.txt");
		String a=f1.getAbsolutePath();
		System.out.println("original path"+f1.getPath());
	}
	catch(Exception e) {
		e.getMessage();
	}
	//list[] string method
	String arr[]=new String[5];
	FileWriter m=new FileWriter("sejal.txt");
	for(String str:arr)
	{
	m.write(str+System.lineSeparator());
	}
	m.close();
	//Directory created
	File q=new File("sejal.txt");
	if(q.mkdir()) {
		System.out.println("Directory craeted");
	}
	else {
		System.out.println("Directory not created");
	}
}
	
}
