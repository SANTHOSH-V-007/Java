package org.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("myFolder/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		char ch[];
		String words[];
		int lineNum=1;
		while((data=br.readLine())!=null) {
			ch = data.toCharArray();
			
			words=data.split(" ");
			System.out.println("No of words present on line="+lineNum+" = "+ words.length +" No of words presented on line: "+ch.length);
			lineNum++;
		}
		
		

	}

}
