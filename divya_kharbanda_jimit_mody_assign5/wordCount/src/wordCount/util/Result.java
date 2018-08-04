package wordCount.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import wordCount.modules.checkStrategy;
import wordCount.modules.insertingValuesInTreeModule1;

public class Result implements FileDisplayInterface, StdoutDisplayInterface
{

	String output;
	checkStrategy countWords;
	checkStrategy countCharacters;
	checkStrategy countDistinctWords;
	insertingValuesInTreeModule1 mod;
	
	public Result(String outputFile, checkStrategy countWords, checkStrategy countCharacters,
			checkStrategy countDistinctWords, insertingValuesInTreeModule1 module1) 
	{
		this.output = outputFile;
		this.countWords = countWords;
		this.countCharacters = countCharacters;
		this.countDistinctWords = countDistinctWords;
		this.mod = module1;
	}

	@Override
	public void writeToStdout() 
	{
		
	}

	@Override
	public void writeToFile() 
	{
		try 
		{
			PrintStream console = System.out; 
			File file = new File(output);
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
			countWords.check();
			countCharacters.check();
			countDistinctWords.check();
		} 
		catch (IOException e) 
		{
		}
	}
	
}
