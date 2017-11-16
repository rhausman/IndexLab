import java.util.*; 
public class ColTest{ 

public static ArrayList<String> arr = new ArrayList<String>();


public static void main(String[]args)
{
	String[] words = 
	{
		"zee",
		"bee" , 
		"ayy" , 
		"cee"
	};

	for(String w:words)
	{
		arr.add(w);
	}
String zee = "zee";
	System.out.println("ORIGINAL: z @ " + arr.indexOf(zee));
	for(int p = 0; p < arr.size(); p++) 
		System.out.println(arr.get(p));

	Collections.sort(arr);
	System.out.println("FINAL: z @ "+ arr.indexOf(zee)); 
	for(int p = 0; p < arr.size(); p++) 
		System.out.println(arr.get(p));


}









}
