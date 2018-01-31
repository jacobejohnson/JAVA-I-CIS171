//Jacob Johnson
public class Player {
	
	private int number;
	private String name;
	private String position;
	
	public Player(int n, String na, String p) {
		setNumber(n);
		setName(na);
		setPosition(p);
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Player number=" + number + ", Name=" + name + ", Position=" + position + ", ";
	}
	
	

}
