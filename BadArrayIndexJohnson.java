//Jacob Johnson
import java.util.Scanner;

public class BadArrayIndexJohnson {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// initialize array of names
		String names[] = {"Kara", "Dan", "Rob", "Jake", "Kim", "Tess", "Kyle", "Pam", "Paul", "Allison"};
		// try block
		try {
			System.out.print("Please enter a number 0-9 to display the matching name: ");
			int name = in.nextInt();
			System.out.println(names[name]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error! The number you entered is not 0-9");
		}
		in.close();
	}
}
