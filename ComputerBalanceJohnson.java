//Jacob Johnson
import java.util.Scanner;
public class ComputerBalanceJohnson 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		// get starting balance
		System.out.print("Please enter the current balance of the account: ");
		double balance = in.nextDouble();
		// get interest rate
		System.out.print("Please enter the interest rate: ");
		double interest = in.nextDouble();
		// number of years
		System.out.print("Please enter how many years of compounded interest: ");
		int years = in.nextInt();
		// print total total
		double total = computeBalance(balance, interest, years);
		System.out.printf("Your total balance after " + years + " years will be $%.2f.", total);
	}
	//method that will calculate compounded total with compounded interst included
	public static double computeBalance(double balance, double interest, int years) 
	{
		double total = 0;
		
		for (int counter = 1; counter <= years; counter++) 
		{
			balance += (balance * interest);
		}
		total = balance;
		return total;
	}
}
