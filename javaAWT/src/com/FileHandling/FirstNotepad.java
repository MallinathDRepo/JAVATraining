package com.FileHandling;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;



public class FirstNotepad {
	 public static void main(String[] args) throws IOException
	    {
		 File f = new File("F:/Training/javaAWT/src/com/FileHandling/FirstFile.txt");

		 if(f.exists()) {
	      		System.out.println("File already exist..!!");
	      		f.delete();
	      	}else
	      	{
	      		try {
		      			f.createNewFile();
		      			f.canWrite();
		      			FileWriter fw = new FileWriter(f);
		      			fw.write("Welcome to javaTpoint.");
		      			fw.close(); 
		      	}
	      		catch(Exception e) {
	      			e.printStackTrace();
	      		}
	      	}}
}