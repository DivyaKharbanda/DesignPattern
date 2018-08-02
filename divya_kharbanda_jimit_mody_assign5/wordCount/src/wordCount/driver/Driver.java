package wordCount.driver;

import wordCount.modules.CountNumberOfWords;
import wordCount.modules.CounterNumberOfDistinctWords;
import wordCount.modules.checkStrategy;
import wordCount.modules.countNumberOfCharacters;
import wordCount.modules.insertingValuesInTreeModule1;

public class Driver 
{
	public static void main(String[] args) 
	{
		String fileName = args[0];
		insertingValuesInTreeModule1 module1 = new insertingValuesInTreeModule1();
		module1.fillTree(fileName);
		
		checkStrategy countWords = new CountNumberOfWords(module1);
		checkStrategy countCharacters = new countNumberOfCharacters(module1);
		checkStrategy countDistinctWords = new CounterNumberOfDistinctWords(module1);
		countWords.check();
		countCharacters.check();
	}
}
