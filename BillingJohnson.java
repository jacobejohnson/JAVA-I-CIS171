
//Jacob Johnson
import java.util.Scanner;

public class BillingJohnson {
	//main
	public static void main(String[] args) {
		double photoPrice;
		int quantity;
		double coupon;
		
		double a = computePhotoBill(19.99);//calls method with one double
		double b = computePhotoBill(19.99, 2);// calls method with two doubles
		double c = computePhotoBill(19.22, 2, .1);// calls method with two doubles and integer
		
		System.out.printf("Total cost is $%.2f.\n" , a);//output results
		System.out.printf("Total cost is $%.2f.\n" , b);// output results
		System.out.printf("Total cost is $%.2f.\n" , c);// output results
	}
	// method for one photo
	public static double computePhotoBill(double photoPrice) {
		double result = photoPrice + (photoPrice * .08);
		return result;
	}
	// method for multiple photos
	public static double computePhotoBill(double photoPrice, int quantity) {
		double result = quantity * (photoPrice + (photoPrice * .08));
		return result;
	}
	// method for multiple photos and discount 
	public static double computePhotoBill(double photoPrice, int quantity, double coupon) {
		double result = (1 - coupon) * (quantity * (photoPrice + (photoPrice * .08)));
		return result;
	}
}
