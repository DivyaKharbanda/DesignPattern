package wordCount.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
	private BufferedReader reader;
	private String file = "C:/Users/jimitmody/Documents/Jimit/wordCount/src/Input.txt";
	File File1 = new File(file);
	public FileProcessor(String fileIn) {
		this.file = fileIn;
		try{
			reader = new BufferedReader(new FileReader(File1));
		}catch(Exception e){
			System.err.println("Could not open file");
			e.printStackTrace();
			System.err.println("Exiting now");
			System.exit(1);
		}
	}
	public FileProcessor() {
		super();
	}
	
	public String readLine(){
		if(reader == null){
			System.err.println("No File found");
			return null;
		}
		try{
			String line = reader.readLine();
			return line;
		}catch(IOException e){
			System.err.println("Error reading from file");
			e.printStackTrace();
		}
		return null;
	}
	
}
