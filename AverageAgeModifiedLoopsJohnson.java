import java.util.Scanner;

public class AverageAgeModifiedLoopsJohnson {
	// Jacob Johnson
		public static void main(String[] args)
		{
			int people = 1;
			double total = 0;
			
			Scanner in = new Scanner(System.in);
				
			System.out.print("How many ages would you like to enter? ");
				
			final int TARGET = in.nextInt(); // number of people
					
			while (people <= TARGET)
			{
				
				System.out.print("Please enter the age of person " + people + ": ");
				int age = in.nextInt(); // age
				total += age;
				people++;	
			}
			
			System.out.print("The average age of the " + TARGET + " people is " + total/TARGET + " years old.");
			    
			in.close();
		}

}
