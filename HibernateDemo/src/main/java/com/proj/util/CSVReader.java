package com.proj.util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CSVReader {

	public static ArrayList<String[]> read(String fileName, int linesToSkip){
		ArrayList<String[]> al = new ArrayList<String[]>() ;
		
		String line;
		int counter = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while( (line = br.readLine()) != null) {
				
				System.out.println(line);
				//Skip the initial number of lines as requested
				counter++;
				if (counter <= linesToSkip) continue;
				
				
				al.add(line.split(","));
				
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error in CSVReader.read");
		} finally {
			// TODO: 
		}
		
		
		return al;
		
	}
}
