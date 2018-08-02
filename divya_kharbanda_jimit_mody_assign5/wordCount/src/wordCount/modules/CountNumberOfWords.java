package wordCount.modules;

public class CountNumberOfWords implements checkStrategy
{
	String returnString;
	int count;
	int temp;
	
	insertingValuesInTreeModule1 in;
	public CountNumberOfWords(insertingValuesInTreeModule1 module1) 
	{
		in=module1;
	}

	@Override
	public void check() 
	{
		write();
		System.out.println("Total number of words in Tree are: "+(count+in.tempCount));
	}
	public int traverseInOrder(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrder(root.left);
			count = count+1;
			System.out.println(" "+root.value+" "+(root.getCountDuplicates()+1));
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
