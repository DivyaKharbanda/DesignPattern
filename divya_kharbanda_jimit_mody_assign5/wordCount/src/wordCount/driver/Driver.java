package wordCount.driver;

import wordCount.modules.insertingValuesInTreeModule1;

public class Driver 
{
	public static void main(String[] args) 
	{
		String fileName = args[0];
		insertingValuesInTreeModule1 module1 = new insertingValuesInTreeModule1();
		module1.fillTree(fileName);
	}
}
