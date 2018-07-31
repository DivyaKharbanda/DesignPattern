package wordCount.treesForStrings;

public class TreeBuilder 
{
	public Node insertNode(Node n){
		Node obj = new Node();
		TreeBuilder t = new TreeBuilder();
		if(obj.getWords() == null){
			obj.setWords(n.getWords());
			obj.setObservers(n.getObservers());
		}
		else if(obj.getWords().size()> n.getWords().size()){
			if(obj.getLeft() == null){
				obj.setLeft(n);
			}
			else{
				obj.setLeft(t.insertNode(n));
			}
		}
		else if(obj.getWords().size()< n.getWords().size()){
			if(obj.getRight()== null){
				obj.setRight(n);
			}
			else{
				obj.setRight(t.insertNode(n));
			}
		}
		else if(obj.getWords().size() == n.getWords().size()){
			if(n.getWords()!= null){
				for(String word: n.getWords()){
					obj.addWords(word);
				}
			}
		}
		return null;	
	}
}
