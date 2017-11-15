
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
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

    public void addWord (String word, int num){    
	 //NOTE: consider helper method to find loc or desired loc for alphabetical organizing 
	    //adds num to the IndexEntry for word by calling
                                                    //that IndexEntry's add(num) method.
                                                    //if word is not yet in this DocumentIndex,
                                                    //the method first creates a new IndexEntry for word
                                                    //and inserts it into this list in alphabetical order
                                                    //ignoring the upper and lower case.

		ArrayList<String> sorted = new ArrayList<String>();
		for(IndexEntry e : this)
		{
			sorted.add(e.getWord());
		}
	    if(sorted.indexOf(word.toUpperCase()) == -1)//if the list does not yet contain this word
	{
		
		Collections.sort(sorted);//we sort the list

		int loc = sorted.indexOf(word);//Find the location of the word we are adding

		this.add(loc,check);//we add the corresponding IndexEntry to that location

			

	}
		this.get(indexOf(check)).add(num); //whether or not the element existed before that if statement, it does now
		//so we can add to it the num
    }
    
    public void addAllWords(String str, int num){
       //String[] punctuation = {"." , "," };
       //for(int p = 0; p< punctuation.length; p++) str = str.replaceAll(punctuation[p],""); //removes all punctuation listed
	Character space = new Character(' ');
       String[] wordlist = str.split("\\W+");//will skip any nonword regex that appears at least once
       for(String w : wordlist) {
	if(!( w.length() == 0 || space.equals(w.charAt(0)) ) ) this.addWord(w,num); //if the length is not 0 and the first char is not whitespace, add it!
       } //end of foreach loop
    }
    
    private int foundOrInserted(String word){
    return 8;    
    }


}
