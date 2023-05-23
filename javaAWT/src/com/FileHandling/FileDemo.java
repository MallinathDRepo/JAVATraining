package com.FileHandling;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 File f = new File("F:/Training/javaAWT/src/com/FileHandling/SecondFile.txt");
		 
		 try {
			 FileOutputStream fos = new FileOutputStream(f);
			 fos.write("I am first statement".getBytes());
			 fos.close();
		 }
		 catch(FileNotFoundException e) {
			 
		 }
		 catch(IOException e) {
		 }
		 
		 try {
				FileInputStream fis = new FileInputStream(f);
				int length = fis.read();
				byte b[] =  new byte[length+1];
				fis.read();
				String s = new String(b);
				FileReader reader = new FileReader(f);
				BufferedReader bfr=new BufferedReader(reader);
				String line = null;
				do {
					line=bfr.readLine();
					if(line!=null)
					System.out.println("You entered =-:  "+line);
				}while(line!=null);
		 } 	
		 catch(FileNotFoundException e) {  }
		 catch(IOException e) {  }
	}	
}
