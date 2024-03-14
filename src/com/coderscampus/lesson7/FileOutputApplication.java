package com.coderscampus.lesson7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputApplication {

	public static void main (String[] args) throws IOException {
		
		BufferedWriter writer = null; 
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write ("This is a test string that will be output to file.\n");
			// a backslash n "\n" creates a new line on the file 
			writer.write ("is this text in the right place?");
		} finally {
			if (writer != null) writer.close();
		} 
		
		BufferedReader reader = null; 
		
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(reader.readLine());
		} finally {
			if (reader != null) reader.close();
			
			
		}
}
}




		
		
		
 