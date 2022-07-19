package org.gemsco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileRead {
	public static void main(String args[]) {
		File file=new File("C://sunny1.txt");
		FileWriter fw;
		FileReader fr;
		int i=0;
		//
		try {
		fr= new FileReader(file);
		while((i=fr.read()) !=-1) {
			System.out.print((char)i);
		}
		}catch(IOException ie1) {
			System.out.print("File Not Found");
			try {
				fw=new FileWriter(file);
				fw.write("Sunny...........");
				fw.flush();
				System.out.print("File Created");
				fw.close();
			}catch(IOException io) {
				System.out.print("Not able to write");
			}
			
		}finally {
			System.out.println("Finally call");
		}
		
		
	}
}
