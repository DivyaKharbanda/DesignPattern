package wordCount.modules;

public class CounterNumberOfDistinctWords implements checkStrategy
{
	insertingValuesInTreeModule1 module1;
	String returnString;
	String temp;
	int countDistint;
	
	public CounterNumberOfDistinctWords(insertingValuesInTreeModule1 module1) 
	{
		this.module1 = module1;
	}

	@Override
	public void check() 
	{
		countDistict();
	}
	public void countDistict()
	{
		temp ="";
		traverseInOrderCountCharacter(module1.root);
		System.out.println("Number of Distinct words are: "+countDistint);
	}
	public void traverseInOrderCountCharacter(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrderCountCharacter(root.left);
			countDistint++;
			traverseInOrderCountCharacter(root.right);
		}
	}
}
