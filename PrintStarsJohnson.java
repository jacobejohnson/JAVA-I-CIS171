// Jacob Johnson
import java.util.Scanner;
public class PrintStarsJohnson {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int counter = 1;
		
		System.out.print("How many lines of ****** would you like to print? "); // ask for number of lines
		int num = in.nextInt(); // number of lines to be printed
		
		do 
		{
			System.out.println("******"); // statement
			counter++;
		}while (counter <= num); // condition
	
		in.close();	
	}

}
