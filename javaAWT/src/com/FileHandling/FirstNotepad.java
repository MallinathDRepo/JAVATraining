package com.FileHandling;

import java.io.IOException;
import java.io.File;

public class FirstNotepad {
	 public static void main(String[] args) throws IOException
	    {
	      	File f = new File("F:/Training/javaAWT/src/com/FileHandling/FirstFile.txt");
	      	if(f.exists()) {
	      		System.out.println("File already exist..!! Hence deleting the file");
	      		f.delete();
	      	}else
	      	{
	      		try {
	      			f.createNewFile();
	      			System.out.println("File created successfully");
	      		}
	      		catch(IOException e) {
	      			e.printStackTrace();
	      		}
	      	}	      	
	    }
}