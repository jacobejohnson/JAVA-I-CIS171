//Jacob Johnson
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
public class TimedResponseJohnson {
	
	public static void main(String[] args) {
		LocalDateTime time1 = LocalDateTime.now();
		int secs1 = time1.getSecond();
		
		JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");
		LocalDateTime time2 = LocalDateTime.now();
		int secs2 = time2.getSecond();
		int mins2 = time2.getSecond();
		
		int difference = mins2 - secs1;
		JOptionPane.showMessageDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + "\nIt took " + difference + 
				" seconds for you to answer.\nWas it a difficult decision?");
		
	}

}
