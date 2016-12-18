package interviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);   // getting input from console
		System.out.print("Enter a String: ");
		
		String str = scan.next();			// Store the given string in a sring string variable
		char c = getCharacter(str);				// will be implementing this method in this class, to get character
		
		System.out.println("First Character which is not repeating in a given String is : "+c);
		scan.close();
	}
	//implementing this method, which takes String as input and returns character	
	// also I need to store the characters in a HashMap, so that I can easily count the repetition of a character in a String
	
	private static Character getCharacter(String str) 
	{    
		// TODO Auto-generated method stub			  
		HashMap <Character, Integer> hMap = new HashMap<Character, Integer>();
		int i;
		Character c;
		
		for (i=0; i<str.length(); i++) 
		{
			c = str.charAt(i);       			// assign a character which is in i'th position in the String
			if (hMap.containsKey(c))			// finding whether the character(c) is stored in HashMap or not
			{
				hMap.put(c, hMap.get(c)+1);		// incrementing with 1 to the previous value
			}else
				hMap.put(c, 1);					// if the character is not available in HashMap, with else condition it'll store
			}	
			//now findout the first character which is not repeated
		for (i=0; i<str.length(); i++)
		{
			c = str.charAt(i);
			if (hMap.get(c) == 1)				// means if only 1st character is repeated 
			{
			return c;	
			}
		}
		return null;
	}

}
