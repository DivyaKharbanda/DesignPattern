package wordCount.driver;

import wordCount.treesForStrings.ObserverI;
import wordCount.treesForStrings.SubjectI;
import wordCount.treesForStrings.TreeBuilder;
import wordCount.util.FileProcessor;

public class Driver {

	public static void main(String[] args) 
	{
		TreeBuilder tb = new TreeBuilder();
		if(args.length<3){
			System.err.println("Insufficient arguments");
			System.exit(1);
		}
		
			FileProcessor f1 = new FileProcessor(args[0]);
			SubjectI Node_orig = null;
			ObserverI backup_Node_1 = null;
			ObserverI backup_Node_2 = null;
			
			while(true){
				String line = f1.readLine();
				if(line == null){
					break;
				}
	}
}
	public Driver() {
		super();
	}
}
