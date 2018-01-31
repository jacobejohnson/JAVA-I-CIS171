import java.util.Scanner;

public class BookOrderJohnson {
	
	// Jacob Johnson
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter number of books purchased: ");
		
		int bookNumber = in.nextInt(); // ask user for number of books
		
		System.out.print("Please enter the total cost of books purchased: ");
		
		double bookSubtotal = in.nextDouble(); // ask user for book cost subtotal
		
		double tax = .065; // Sales tax
		
		
		
		double shippingCost = 2.95; // Shipping cost per book
		double totalTax = bookSubtotal * tax;
		double totalShipping = bookNumber * shippingCost;
		
		
		System.out.printf("Sales tax: $%.2f\n" , totalTax);
		System.out.printf("Shipping and handling: $%.2f\n" , totalShipping);
		System.out.printf("Total amount due: $%.2f\n" , bookSubtotal + totalTax + totalShipping);
		
		in.close();
		
	}

}
