import java.util.Scanner;
public class OnlineBookOrderModifiedJohnson 
{
// Jacob Johnson
	
	public static void main(String[] args)
	{
		double tax = .065; // Sales tax
		double shippingCost = 2.95; // Shipping cost per book
		double subtotal = 0;
		
		Scanner in = new Scanner(System.in);
			
		System.out.print("Please enter number of books purchased: ");
		int bookNumber = in.nextInt(); // number of books
		
		for (int counter = 1; counter <= bookNumber; counter++) 
		{
			//int tempCounter = counter + 1;
			System.out.print("Please enter the price of book " + counter + ": ");
			double tempSubtotal = in.nextDouble(); // book price
			subtotal += tempSubtotal;
		}
		System.out.println("Number of books purchased: " + bookNumber);
		System.out.printf("Book Subtotal: $%.2f\n" , subtotal);
		System.out.printf("Sales tax: $%.2f\n" , subtotal * tax);
		System.out.printf("Shipping & Handling: $%.2f\n" , bookNumber * shippingCost);
		System.out.println("---------------------------");
		System.out.printf("Total amount due: $%.2f\n" , subtotal + (subtotal * tax) + (bookNumber * shippingCost));
			
		in.close();
			
	}
}



	
	
