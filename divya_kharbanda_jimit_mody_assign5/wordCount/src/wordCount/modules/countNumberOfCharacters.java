package wordCount.modules;

public class countNumberOfCharacters implements checkStrategy
{
	insertingValuesInTreeModule1 module1;
	int countChar=0;
	String temp;
	char number;
	
	public countNumberOfCharacters(insertingValuesInTreeModule1 module12) 
	{
		module1 = module12;
	}

	@Override
	public void check() 
	{
		countCharacters();
	}
	
	public void countCharacters()
	{
		temp ="";
		traverseInOrderCountCharacter(module1.root);
		System.out.println("Number of Characters are: "+countChar);
	}
	
	public void traverseInOrderCountCharacter(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrderCountCharacter(root.left);
			temp=root.value;
			for( int i = 0; i < temp.length( ); i++ )
			{
			    number = temp.charAt( i );
			    countChar++;
			}
			traverseInOrderCountCharacter(root.right);
		}
	}

}
