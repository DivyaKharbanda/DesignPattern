package wordCount.driver.modules;

import java.io.FileNotFoundException;
import wordCount.util.FileProcessor;

//http://www.baeldung.com/java-binary-tree
public class insertingValuesInTreeModule1 
{
	FileProcessor fp = new FileProcessor();
	String data; 
	nodeModule1 root;
	String returnString;
	
	public void fillTree(String input)
	{
		try 
		{
			while ((this.data=(fp.ReadLine(input)))!=null)
			{
				add(data);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		fp.close();	
	}
	
	public nodeModule1 addRecursive(nodeModule1 current, String value)
	{
		if(current == null)
		{
			return new nodeModule1(value);
		}
		if(value.compareTo(current.value) < 0)
		{
			current.left = addRecursive(current.left, value);
		}
		else if (value.compareTo(current.value) > 0)
		{
			current.right = addRecursive(current.right, value);
		}
		return current;	
	}
	
	public void add(String value)
	{
		root = addRecursive(root, value);
	}
	
	public void traverseInOrder(nodeModule1 node)
	{
		if(node != null)
		{
			traverseInOrder(node.left);
			System.out.println(" "+node.value);
			traverseInOrder(node.right);
		}
	}
}
