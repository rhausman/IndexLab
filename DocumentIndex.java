
 public class DocumentIndex extends ArrayList<IndexEntry>
{
    // instance variables - replace the example below with your own
@ -40,10 +40,33 @@ public class DocumentIndex extends ArrayList<IndexEntry>

	IndexEntry check = new IndexEntry(word);  
	//Some notes on our constructors and how we should call them:
												//dont set this, call constructor from the other class
												// public DocumentIndex(){
													//super();
													//}
													//for the initial capacity one:
													//public DocumentIndex(int initialCapacity){
													//	super(initialCapacity);
												//	}

	if(this.contains(check))
	if(indexOf(check) == -1)//if the list does not yet contain this word
	{
		int s = 0;
		for(s = 0; s<
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
		sorted.add(e.getWord);
	}
	sorted.add(word);

	Collections.sort(sorted);

	int loc = sorted.instanceOf(word);

	this.add(check,loc);

		

	}
	 else //if it is already in the list
	{
		this.get(indexOf(check)).add(num);
	}
    }
    
    //Here is what our addAllWords class should look like (pretty much word for word)
    
    //public void addAllWords(String str, int num){
    //	String[]words = str.split("\\W+");
    //	for(String word: words){
	//		if(word.length>0){
	//			addWord(word, num);
	//		}
	//	}
    
    