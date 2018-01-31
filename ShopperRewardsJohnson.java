// Jacob Johnson
import java.util.Scanner;

public class ShopperRewardsJohnson {
	
	public static void main(String[] args) {
		
		final double LOW_GROCERY_PURCHASE_RANGE = 0;
		final double MEDIUM_LOW_GROCERY_PURCHASE_RANGE = .08;
		final double MEDIUM_GROCERY_PURCHASE_RANGE = .10;
		final double MEDIUM_HIGH_GROCERY_PURCHASE_RANGE = .12;
		final double HIGH_GROCERY_PURCHASE_RANGE = .14;
		final String LOW_GAS_RANGE = "You have earned a 1¢ discount per gallon of gas.";
		final String MEDIUM_GAS_RANGE = "You have earned a 2¢ discount per gallon of gas.";
		final String HIGH_GAS_RANGE = "You have earned a 3¢ discount per gallon of gas.";
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What was the cost of your groceries? ");
		float groceryCost = in.nextFloat();
		
			if (groceryCost < 10) {
				double coupon = groceryCost * LOW_GROCERY_PURCHASE_RANGE;
				System.out.println("You did not spend enough to earn a discount coupon.");
			} else if (groceryCost >= 10 && groceryCost <= 60) {
				double coupon = groceryCost * MEDIUM_LOW_GROCERY_PURCHASE_RANGE;
				System.out.printf("You receive a discount coupon of $%.2f.", coupon);
				System.out.println(" (8 percent of your purchase)");
			} else if (groceryCost > 60 && groceryCost <= 150) {
				double coupon = groceryCost * MEDIUM_GROCERY_PURCHASE_RANGE;
				System.out.printf("You receive a discount coupon of $%.2f." , coupon);
				System.out.println(" (10 percent of your purchase)");
			} else if (groceryCost >= 150 && groceryCost <= 210) {
				double coupon = groceryCost * MEDIUM_HIGH_GROCERY_PURCHASE_RANGE;
				System.out.printf("You receive a discount coupon of $%.2f.", coupon);
				System.out.println(" (12 percent of your purchase)");
			} else if (groceryCost >= 210) {
				double coupon = groceryCost * HIGH_GROCERY_PURCHASE_RANGE;
				System.out.printf("You receive a discount coupon of $%.2f.", coupon);
				System.out.println(" (14 percent of your purchase)");
			}
			
			if (groceryCost > 1 && groceryCost <= 49) {
				System.out.print(LOW_GAS_RANGE);
			} else if (groceryCost > 49 && groceryCost <= 99) {
				System.out.print(MEDIUM_GAS_RANGE);
			} else if (groceryCost > 99) {
				System.out.print(HIGH_GAS_RANGE);
			}
			in.close();
	}

}
