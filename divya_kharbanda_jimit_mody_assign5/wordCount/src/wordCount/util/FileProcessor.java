package wordCount.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor 
{
	/**
	 * this method is used to read the input file and return each value
	 * one by one. In this method, I also take care of the exception 
	 * handling
	 */
	
	Scanner input;
	int i=1;
	String line;
	
	public String ReadLine(String file_name) throws FileNotFoundException 
	{
		String file = file_name;
		if (i == 1) 
		{
			input = new Scanner(new File(file));
			i++;
		}
			try 
			{
				if (input.hasNext()) 
					{
						String line;
						line = input.next();
						return line;
					}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		return null;
	}
	public void close()
	{
		this.i = 1;
		input.close();
	}
}
