
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DocumentIndex extends ArrayList<IndexEntry>
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DocumentIndex
     */
    public DocumentIndex()
    {
        //ArrayList<String>name = new ArrayList<String>();
	super();
    }

    public DocumentIndex(int c)
    {
	super(c);
    }

    public void addWord (String word, int num){    //adds num to the IndexEntry for word by calling
                                                    //that IndexEntry's add(num) method.
                                                    //if word is not yet in this DocumentIndex,
                                                    //the method first creates a new IndexEntry for word
                                                    //and inserts it into this list in alphabetical order
                                                    //ignoring the upper and lower case.
        
    }
    
    public void allAddWords(String str, int num){
        
        
    }
    
    private int foundOrInserted(String word){
    return 8;    
    }
}
