import java.util.Scanner;

// this program will compare two numbers

public class CompareNumbers {
	
// Jacob Johnson
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Choose a number: "); 
		double number1 = in.nextDouble(); // user enters a number
		
		System.out.print("Choose a number to compare: "); 
		double number2 = in.nextDouble(); // user enters another number
		
		boolean greaterthan = number1 > number2;
		boolean lesserthan = number1 < number2;
		boolean equalto = number1 == number2;
		
		System.out.println(number1 + " is greater than " + number2 + ": " + greaterthan);
		System.out.println(number1 + " is less than " + number2 + ": " + lesserthan);
		System.out.println(number1 + " is equal to " + number2 + ": " + equalto);
		
		
		
		
}
	
	
	
}
