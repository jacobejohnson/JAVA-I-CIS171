// Jacob Johnson
import java.util.Scanner;
public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		String rock;
		String paper;
		String scissors;
		String lizard;
		String spock;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Player 1, please type either paper, rock, scissors, lizard, or spock: ");
		String player1 = in.next().toLowerCase();
		
		System.out.print("Player 2, please type either paper, rock, scissors, lizard, or spock: ");
		String player2 = in.next().toLowerCase();
		
		if (player1.equals(player2)) {
			System.out.println("It's a tie!");
		} else if (player1.equals("rock")) {
			if (player2.equals("scissors"))
				System.out.println("Rock crushes scissors, player 1 wins!");
			else if (player2.equals("lizard"))
				System.out.println("Rock crushes lizard, player 1 wins!");
			else if (player2.equals("paper"))
				System.out.println("Paper covers rock, player 2 wins!");
			else if (player2.equals("spock"))
				System.out.println("Spock vaporizes rock, player 2 wins!");
		} else if (player1.equals("paper")) {
			if (player2.equals("scissors"))
				System.out.println("Scissors cuts paper, player 2 wins!");
			else if (player2.equals("lizard"))
				System.out.println("Lizard eats paper, player 2 wins!");
			else if (player2.equals("rock"))
				System.out.println("Paper covers rock, player 1 wins!");
			else if (player2.equals("spock"))
				System.out.println("Paper disproves Spock, player 1 wins!");		
		} else if (player1.equals("scissors")) {
			if (player2.equals("paper"))
				System.out.println("Scissors cuts paper, player 1 wins!");
			else if (player2.equals("lizard"))
				System.out.println("Scissors decapitates lizard, player 1 wins!");
			else if (player2.equals("rock"))
				System.out.println("Rock crushes scissors, player 2 wins!");
			else if (player2.equals("spock"))
				System.out.println("Spock smashes scissors, player 2 wins!");
		} else if (player1.equals("lizard")) {
			if (player2.equals("paper"))
				System.out.println("Lizard eats paper, player 1 wins!");
			else if (player2.equals("scissors"))
				System.out.println("Scissors decapitates lizard, player 2 wins!");
			else if (player2.equals("rock"))
				System.out.println("Rock crushes lizard, player 2 wins!");
			else if (player2.equals("spock"))
				System.out.println("Lizard poisons Spock, player 1 wins!");
		} else if (player1.equals("spock")) {
			if (player2.equals("paper"))
				System.out.println("Paper disproves Spock, player 2 wins!");
			else if (player2.equals("scissors"))
				System.out.println("Spock crushes scissors, player 1 wins!");
			else if (player2.equals("rock"))
				System.out.println("Spock vaporizes rock, player 1 wins!");
			else if (player2.equals("lizard"))
				System.out.println("Lizard poisons Spock, player 2 wins!");
		}
		in.close();
	}	

}
