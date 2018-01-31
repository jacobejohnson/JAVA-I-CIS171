//Jacob Johnson
public class BasketballPlayer extends Player {

	private double ft; //free throw percentage
	
	public BasketballPlayer(int number, String name, String position, double ft) {
		super(number, name, position);
		this.ft=ft;
	}

	@Override
	public String toString() {
		return "BasketballPlayer - " + super.toString() + "Free throw percentage=" + ft + "%";
	}

	public double getFt() {
		return ft;
	}

	public void setFt(double ft) {
		this.ft = ft;
	}

	

}
