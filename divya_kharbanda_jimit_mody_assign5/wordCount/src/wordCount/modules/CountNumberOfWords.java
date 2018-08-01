package wordCount.modules;

public class CountNumberOfWords implements checkStrategy
{
	//nodeModule1 root;
	String returnString;
	int count;
	
	insertingValuesInTreeModule1 in;
	public CountNumberOfWords(insertingValuesInTreeModule1 module1) 
	{
		in=module1;
	}

	@Override
	public void check() 
	{
		write();
		System.out.println("Total number of words in Tree are: "+count);
	}
	public int traverseInOrder(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrder(root.left);
			count = count+1;
			System.out.println(" "+root.value);
			traverseInOrder(root.right);
		}
		return count;
	}

	public String write() 
	{
		returnString = "";
		traverseInOrder(in.root);
		return returnString;
	}
}
