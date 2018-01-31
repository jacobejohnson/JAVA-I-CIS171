//Jacob Johnson
public class PlayerTesterJohnson {
	
	public static void main (String[] args) {
		
		BaseballPlayer player1 = new BaseballPlayer(12, "Johnson", "Right field", 0.355);
		String display1 = player1.toString();
		System.out.println(display1);
		
		BaseballPlayer player2 = new BaseballPlayer(15, "Fieldsend", "Left field", 0.371);
		String display2 = player2.toString();
		System.out.println(display2);
		
		BasketballPlayer player3 = new BasketballPlayer(6, "Morris", "Point guard", 86);
		String display3 = player3.toString();
		System.out.println(display3);
		
		BasketballPlayer player4 = new BasketballPlayer(21, "White", "Forward", 71);
		String display4 = player4.toString();
		System.out.println(display4);
		
		Roster tigers = new Roster("Tigers", 12, "Johnson", "Right field");
		tigers.addToTeam(player1);
		tigers.addToTeam(player2);
		Roster cyclones = new Roster("Cyclones", 6, "Morris", "Point guard");
		cyclones.addToTeam(player3);
		cyclones.addToTeam(player4);
		System.out.println(tigers.displayRoster());
		System.out.println(cyclones.displayRoster());
		
		
		
		
	}

}
