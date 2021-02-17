import java.net.URL;
import java.util.Scanner;
public class Codestuff 
{
	public static void main(String[] args) 
	{
		// passes values to driver
		drive T = new drive("Turkey Bacon", 60, 4, 1); 		
		
		// passes values to driver													
		drive P = new drive("Pork Bacon", 82, 6, 2);		
		
		// displays T
		T.display();
		
		// displays P
		P.display();
		
		String cardJson = Codestuff.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		System.out.println(cardJson);
		// I could not find any Json code for anything that i could possibly write code about...
		
	}
	
	//open a URL and read its contents as a String
	static String getJSON(String urlString)
	{	    
		String line = "";
		try
		{
			URL url = new URL(urlString);
		    Scanner input = new Scanner(url.openStream());
		    // open the url stream, wrap it an a few "readers"
		    //BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		    //keep reading from the scanner as long as their is something to read
		    while (input.hasNext())
		    {
		    	line += input.nextLine();
		    }

		    // close our reader
		    input.close();
		    
		    //reader.close();
		}
	    catch(Exception e)
		{
	    	e.printStackTrace();
	    	line = "Can't Connect";
		}
		return line;
	
	
	
	}







}
