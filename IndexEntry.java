class IndexEntry{
	private String word;
	private ArrayList<Integer> numsList;

	public IndexEntry(String initial)
		{
			word = initial.toUpperCase();
			numsList = new ArrayList<Integer>();
		}

public int add(int n)
{
	if(!numsList.contains(n)){numsList.add(n);}
}

public String getWord(){return word;} 

public String toString()
{
	String temp = "";
	for(Integer c:numsList)
	{
		temp += c;
		temp += ", ";
	}
	temp = temp.substring(0,temp.length()-2);
	return temp;
}



}
