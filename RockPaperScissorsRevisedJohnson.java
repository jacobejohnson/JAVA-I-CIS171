//Jacob Johnson
import java.util.Scanner;
public class RockPaperScissorsRevisedJohnson {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Player 1, please type either r for rock, p for paper, s for scissors, l for lizard, or sp for spock: ");
		String player1 = in.next().toLowerCase();
		
		System.out.print("Player 2, please type either r for rock, p for paper, s for scissors, l for lizard, or sp for spock: ");
		String player2 = in.next().toLowerCase();
		
		switch (player1)
		{
			case "r":
				{
				player1 = "r";
				break;
				}
			case "p":
				{
				player1 = "p";
				break;
				}
			case "s":
				{
				player1 = "s";
				break;
				}
			case "l":
				{
				player1 = "l";
				}
			case "sp":
				{
				player1 = "sp";
				}
			default:
			{
				player1 = "will not happen";
			}	
		}
		
		
		if (player1.equals(player2)) {
			System.out.println("It's a tie!");
		} else if (player1.equals("r")) {
			if (player2.equals("s"))
				System.out.println("Rock crushes scissors, player 1 wins!");
			else if (player2.equals("l"))
				System.out.println("Rock crushes lizard, player 1 wins!");
			else if (player2.equals("p"))
				System.out.println("Paper covers rock, player 2 wins!");
			else if (player2.equals("sp"))
				System.out.println("Spock vaporizes rock, player 2 wins!");
		} else if (player1.equals("p")) {
			if (player2.equals("s"))
				System.out.println("Scissors cuts paper, player 2 wins!");
			else if (player2.equals("l"))
				System.out.println("Lizard eats paper, player 2 wins!");
			else if (player2.equals("r"))
				System.out.println("Paper covers rock, player 1 wins!");
			else if (player2.equals("sp"))
				System.out.println("Paper disproves Spock, player 1 wins!");		
		} else if (player1.equals("s")) {
			if (player2.equals("p"))
				System.out.println("Scissors cuts paper, player 1 wins!");
			else if (player2.equals("l"))
				System.out.println("Scissors decapitates lizard, player 1 wins!");
			else if (player2.equals("r"))
				System.out.println("Rock crushes scissors, player 2 wins!");
			else if (player2.equals("sp"))
				System.out.println("Spock smashes scissors, player 2 wins!");
		} else if (player1.equals("l")) {
			if (player2.equals("p"))
				System.out.println("Lizard eats paper, player 1 wins!");
			else if (player2.equals("s"))
				System.out.println("Scissors decapitates lizard, player 2 wins!");
			else if (player2.equals("r"))
				System.out.println("Rock crushes lizard, player 2 wins!");
			else if (player2.equals("sp"))
				System.out.println("Lizard poisons Spock, player 1 wins!");
		} else if (player1.equals("sp")) {
			if (player2.equals("p"))
				System.out.println("Paper disproves Spock, player 2 wins!");
			else if (player2.equals("s"))
				System.out.println("Spock crushes scissors, player 1 wins!");
			else if (player2.equals("r"))
				System.out.println("Spock vaporizes rock, player 1 wins!");
			else if (player2.equals("l"))
				System.out.println("Lizard poisons Spock, player 2 wins!");
		}
		in.close();
	}	

}