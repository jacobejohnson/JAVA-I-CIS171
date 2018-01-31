import java.util.Scanner;
//Jacob Johnson
//This program counts the vowels in a word
public class VowelCountJohnson {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = in.next().toLowerCase();
		
		int vowel = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
				
			} else if (ch != 'a' || ch != 'e' || ch!= 'i' || ch != 'o' || ch != 'u') {
				if (ch == 'y')
					vowel++;	
				} 
	   }
		if (vowel >= 1) {
			System.out.println("There are " + vowel + " vowels in " + word + ".");
		}else if (vowel < 1) {
			System.out.println("You must have made a spelling mistake somewhere.");
		}
		in.close();
	}
}
