//Jacob Johnson
public class PizzaTesterJohnson implements PizzaConstants{
	public static void main(String[] args) {
		System.out.println("Welcomes to " + COMPANY);
		System.out.println(getSpecial());
		
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		String order1 = myPizza.repeatOrder();
		System.out.println("Pizza 1 info: " + order1);
		
		
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		String order2 = yourPizza.repeatOrder();
		System.out.println("Pizza 2 info:  " + order2);
		
		//Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		//String order3 = thirdPizza.repeatOrder();
		//System.out.println(order3);
		
		Pizza mikePizza = Pizza.quickOrder("mushroom");

		System.out.println("Mike's pizza: " + mikePizza.repeatOrder());
		
		Order kelli = new Order();
		kelli.addToOrder(myPizza);
		kelli.addToOrder(yourPizza);
		System.out.println(kelli.getTotalPrice());
		
	}
	public static String getSpecial() {
		return "Today's special is a large 1-topping pizza for $7.99";
	}

}
