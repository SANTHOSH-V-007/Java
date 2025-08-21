package org.FileHandling;

import java.io.File;

class FileNotFoundException extends Exception{
	FileNotFoundException(String s){
		super(s);
	}
}
 
class FileRead{
	void readFile(String path) throws FileNotFoundException {
		File file = new File(path);
		if(!file.exists()) {
			throw new FileNotFoundException("File not found!!");
		}else {
			System.out.println("File is there!!");
		}
	}
}
 
public class Task_2 {
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		String path = "myFolder/sample.txt";
		try {
			fr.readFile(path);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
 
 