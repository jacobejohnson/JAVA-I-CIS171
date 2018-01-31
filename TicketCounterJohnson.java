import java.util.Scanner;
//Jacob Johnson
// This program will 
public class TicketCounterJohnson {
	
		public static void main(String[] args)
		{
			final int MAX = 6; // maximum ticket order
			final int MIN = 1; // minimum ticket order
			int remaining = 75; // Tickets remaining after purchase
			int counter = 0; // number of buyers			
		
			while (remaining > 0)
			{	
				System.out.print("How many tickets would you like to purchase? ");
				Scanner in = new Scanner(System.in);
				int tickets = in.nextInt(); // ticket order
				
				if (tickets < MIN || tickets > MAX)
				{
					System.out.println("You may only purhcase 1-6 tickets.");
					break;
				}
				else if (tickets >= MIN && tickets <= MAX)
				{
					remaining -=tickets;
					System.out.println("Thank you for your order of " + tickets + " tickets. There is " + remaining + " tickets remaining.");
					counter++;
				}
				if (remaining >= MAX)
				{
					continue;
				}
				else if (remaining > 0 && remaining < MAX)
				{
					System.out.println("Please note, there is only " + remaining + " tickets remaining.");
					continue;
				}
				else if (remaining == 0)
				{
					System.out.println("SOLD OUT. A total of 75 tickets have been purchased by " + counter + " buyers.");
					break;
				}
				in.close();
		}
		
		
	}

}
