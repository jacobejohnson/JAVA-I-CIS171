// Jacob Johnson
// Word counter program
import java.util.Scanner;
public class WordCounterJohnson 
{
	//main 
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = in.nextLine();
		// call in method and print out how many words are in string
		int totalCount = countWords(str);
		System.out.print("There are " + totalCount + " words in the string.");
		in.close();
	}
	// method to calculate words in string
	public static int countWords(String str) 
	{
		int totalCount = 1;
		for (int i = 1; i < str.length(); i++) 
		{
			String sub = str.substring(i, i+1);
			if (sub.equals(" ")) 
			{
				totalCount++;
			}
		}
		return totalCount;
	}
}
