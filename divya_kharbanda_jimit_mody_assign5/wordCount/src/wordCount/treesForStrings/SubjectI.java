package wordCount.treesForStrings;

public interface SubjectI 
{
	public void register(ObserverI obj);
	
	public void remove(ObserverI obj);
	
	public void notify(String update);
}
