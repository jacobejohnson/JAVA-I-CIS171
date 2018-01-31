//Jacob Johnson
import java.util.Scanner;
public class MidtermJohnson 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		final float ALLSTAR = 0.03f;
		final float NONALLSTAR = 0.02f;
		
		
		System.out.print("Enter your first name or type 'ZZZ' to exit: ");
		String firstName = in.next();
		String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		
		
		
		while (!(firstName.equals("ZZZ"))) 
		{
			System.out.print("Enter your last name: ");
			String lastName = in.next();
			String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
			
			System.out.print("Please enter your total sales amount: ");
			float amount = in.nextFloat();
			
			System.out.print("All-Star? Type Y for Yes and N for No: ");
			String allstar = in.next().toUpperCase();
			if (allstar.equals("Y")) 
			{
				float bonus = amount * ALLSTAR;
				if (bonus > 100.00) 
				{
					System.out.printf(last + ", " + first + " ****" + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
				else if (bonus > 50.00 && bonus <100.00) 
				{
					System.out.printf(last + ", " + first + " **" + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
				else if (bonus <= 50.00) 
				{
					System.out.printf(last + ", " + first + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
			}
			if (allstar.equals("N")) 
			{
				float bonus = amount * NONALLSTAR;
				if (bonus > 100.00) 
				{
					System.out.printf(last + ", " + first + " ****" + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
				else if (bonus > 50.00 && bonus <100.00) 
				{
					System.out.printf(last + ", " + first + " **" + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
				else if (bonus <= 50.00) 
				{
					System.out.printf(last + ", " + first + " - ");
					System.out.printf("$%.2f.", bonus);
					System.out.println();
				}
			}
			System.out.print("Enter a first name or enter 'ZZZ' to exit: ");
			firstName = in.next();
			first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
				
		}
		System.out.println("Goodbye!");

		in.close();
			
	}
}
