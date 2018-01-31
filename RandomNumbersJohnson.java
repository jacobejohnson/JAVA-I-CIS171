// Jacob Johnson
import java.util.Scanner;
public class RandomNumbersJohnson 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many random numbers would you like to see? ");
		int total = in.nextInt();
		System.out.print("Highest number: ");
		int high = in.nextInt();
		System.out.print("Lowest number: ");
		int low = in.nextInt();
		
		int counter = 1;
		
		while (counter <= total) 
		{
			for (int i = 1; i <= total; i++);
			{
				int r = (int)(Math.random() * high) + low;
				System.out.println(r);
				counter++;
			}
		}
		
	}

}
