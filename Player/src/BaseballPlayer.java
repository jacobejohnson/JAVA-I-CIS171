//Jacob Johnson
public class BaseballPlayer extends Player{

	private double batting; //batting average
	
	public BaseballPlayer(int number, String name, String position, double batting) {
		super(number, name, position);
		this.batting=batting;
	}
	

	public double getBatting() {
		return batting;
	}

	public void setBatting(double batting) {
		this.batting = batting;
	}

	@Override
	public String toString() {
		return "BaseballPlayer - " + super.toString() + "Batting average=" + batting;
	}
	
	
	

}
