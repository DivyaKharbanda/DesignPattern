package wordCount.treesForStrings;

import java.util.ArrayList;

public class Node implements ObserverI, SubjectI 
{
	private ArrayList<ObserverI> observers;
	private ArrayList<String> words;
	private Node left;
	private Node right;
	
		
	public Node(String wordIn) {
		words = new ArrayList<String>();
		words.add(wordIn);
	}

	public Node(){
		observers = null;
		left = null;
		right = null;
		words = new ArrayList<String>();
	}
	
	public Node(Node nodeIn){
		left = null;
		right = null;
		setWords(nodeIn.getWords());
		setObservers(nodeIn.getObservers());
	}
	
	public void addWords(String word){
		if(words == null){
			words = new ArrayList<String>();
		}
		words.add(word);
		
	}
	public ArrayList<ObserverI> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<ObserverI> observers) {
		this.observers = observers;
	}
	
	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public void register(ObserverI obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(ObserverI obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notify(String update) {
		if(observers == null){
			return;
		}
		try{
			for(ObserverI obj:observers){
				obj.update(update);
			}
		}catch(NullPointerException n){
			System.err.println("Failed to notify");
			n.printStackTrace();
		}
		
	}

	@Override
	public void update(String update) {
		addWords(update);		
	}
}
