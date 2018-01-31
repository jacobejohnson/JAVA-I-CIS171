// Jacob Johnson
import java.util.Scanner;
public class EFScaleJohnson {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the miles per hour of the three second wind gust: ");
		
		if (in.hasNextInt()) {
		
		int mph = in.nextInt();
		
		if (mph <= 65) {
			System.out.println("Error: This number is too low to register on the EF Scale.");
		} else if (mph >= 65 && mph <= 85) {
			System.out.println("Wind gust registers as 0 on the EF Scale." );
		} else if (mph >= 86 && mph <= 110) {
			System.out.println("Wind gust registers as a 1 on the EF Scale." );
		} else if (mph >= 111 && mph <= 135) {
			System.out.println("Wind gust registers as a 2 on the EF Scale.");
		} else if (mph >= 136 && mph <= 165) {
			System.out.println("Wind gust registers as a 3 on the EF Scale.");
		} else if (mph >= 166 && mph <= 200) {
			System.out.println("Wind gust registers as a 4 on the EF Scale.");
		} else if (mph > 200) {
			System.out.println("Wind gust registers as a maximum 5 on the EF Scale.");
		}
		} else {
			System.out.println("Error! Please input only whole numbers.");
		}
			
		in.close();
		
	}
	
	

}
