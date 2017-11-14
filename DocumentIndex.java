
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

    public void addWord (String word, int num){    //adds num to the IndexEntry for word by calling
                                                    //that IndexEntry's add(num) method.
                                                    //if word is not yet in this DocumentIndex,
                                                    //the method first creates a new IndexEntry for word
                                                    //and inserts it into this list in alphabetical order
                                                    //ignoring the upper and lower case.
       	/*
	for(int i = 0; i<this.length(); i++)
	{

	}
	*/

	IndexEntry check = new IndexEntry(word);

	if(indexOf(check) == -1)//if the list does not yet contain this word
	{
	//we need to insert in alphabetical location. We can compare charvals with arithmetic comparison
	/*	int loc = 0;
		for(int ch = 0; ch < word.length(); ch++)
		{
			for(loc = loc; loc<this.length(); loc++)
			{
				if(word.charAt(ch) > this.get(loc).charAt(ch)) loc++;
			}	
		}		
	*/
/*
 * for(int len = 1; len < word.length(); len++)
	{
		for(int now = 0; now< this.size(); now++)
		{
			//we are glancing at the element ahead, then insert behind
			for(int s = 0; s<len; s++)
			{
				if(this.get(now).charAt(s) < word.charAt(s) )
			}

		}
		*/

	//	int first = 0;
	//	int last = this.size();
	//	int mid = last/2;

	ArrayList<String> sorted = new ArrayList<String>();
	for(IndexEntry e : this)
	{
		sorted.add(e.getWord());
	}
	sorted.add(word);//We now have a list of all the words

	Collections.sort(sorted);//we sort the list

	int loc = sorted.indexOf(word);//Find the location of the word we are adding

	this.add(loc,check);//we add the corresponding IndexEntry to that location

		

	}
//	else
//	{
		this.get(indexOf(check)).add(num); //whether or not the element existed before that if statement, it does now
		//so we can add to it the num
//	}
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
