import java.util.Scanner;
// this program will calculate an average age and utilize a sentinel value to signal loop termination

public class AverageAgeJohnsonSentinel {
	// Jacob Johnson
	public static void main(String[] args) {
		int age;
		double total = 0.0; 
		int counter = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("This program will calculate the average age.");
		System.out.println("When you are finished adding ages, type '999'.");
		System.out.println(" ");
		System.out.print("Please enter the age for a person: ");
		age = in.nextInt(); // age

		while (age != 999) 
		{
			total += age; // running total
			counter++; // counter increase by 1
			System.out.print("Please enter the age for a person: "); // ask for age
			age = in.nextInt(); // age
		}

		System.out.print("The average age is " + total/counter + " years."); // calculate and print avg age

		in.close();
	}

}
