import java.util.Scanner;
// this program will compare two names and tell us if they are the same name
// Jacob Johnson
public class CompareNamesJohnson {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// user to enter name 1
		System.out.print("Enter a name: ");
		String name1 = in.next().toUpperCase();
		
		// user to enter name 2
		System.out.print("Enter another name: ");
		String name2 = in.next().toUpperCase();
		
		// compare name 1 and name 2 to see if they are the same
		if (name1.equals(name2)) {
			// output answer if names are the same
			System.out.println("These two names are the same: True"); 
		} else {
			// output answer if names are not the same
			System.out.println("These two names are the same: False");
		}

		
		
	}


}
