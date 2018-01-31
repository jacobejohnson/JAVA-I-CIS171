import java.util.Scanner;

//Jacob Johnson
//This program finds a vowel in a string
public class VowelFoundJohnson {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(
				"Please enter a string to find out if there is a vowel present. To exit the program please type 'exit': ");
		String word = in.nextLine().toLowerCase();

		boolean found = false;

		while (!(word.equals("exit"))) {
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					found = true;
					break;
				}
			}
			if (found) {
				System.out.println("There is a vowel present.");
			} else {
				System.out.print("No vowel present. Please enter a new string: ");
			}
			System.out.print(
					"Please enter a string to find out if there is a vowel present. To exit the program please type 'exit': ");
			word = in.nextLine().toLowerCase();
		}

		System.out.println("Goodbye!");

		in.close();
	}
}
