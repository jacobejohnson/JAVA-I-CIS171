
public class Pizza {
//Jacob Johnson
	
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	
	public Pizza(String t, String s, double p) {
		setTopping(t);
		setSize(s);
		setPrice(p);
		
		nextOrderNumber++;
		orderNumber = nextOrderNumber;
		
		if (size.equals("error")){
			throw new IllegalArgumentException();
		}
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size = size.toLowerCase();
		if (size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("extra large") ) {
			this.size = size;
		}else {
			this.size = "error";
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public static Pizza quickOrder(String topping){
		Pizza p = new Pizza(topping, "large", 9.99);
		return p;
	}

	public String repeatOrder() {
		return "Order number: " + getOrderNumber() + ", Topping: " + getTopping() + ", Size: " + getSize() + ", Price: $" + getPrice();
	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	
	
}
