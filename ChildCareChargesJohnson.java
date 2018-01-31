//Jacob Johnson
// this program uses 2d array to calculate the cost of day care.
import java.util.Scanner;
public class ChildCareChargesJohnson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 2d array
		int[][] rates = new int[][]{ {30, 60, 88, 115, 140}, {26, 52, 70, 96, 120}, {24, 46, 67, 89, 110}, {22, 40, 60, 75, 88}, {20, 35, 50, 66, 84} };
		
		System.out.print("Please enter your child's age in years (0-4) or enter '999' to quit: ");
		int age = in.nextInt();
		// sentinel value while loop
		while (age != 999) {
			System.out.print("Please enter how many days per week your child will attend (1-5): ");
			int days = in.nextInt();
			// calculation and output
			System.out.println("The cost will be $" + rates[age][days-1]);
			System.out.print("Please enter your child's age in years (0-4) or enter '999' to quit: ");
			age = in.nextInt();
			}
		System.out.println("Thank you.");
		in.close();
	}
}
