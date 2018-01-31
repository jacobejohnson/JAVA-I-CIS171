import cards.*;
import billfold.Billfold;
import java.time.LocalDate;

import cards.DriverLicense;
import cards.YMCACard;

//Jacob Johnson
public class BillfoldTesterJohnson {
	
	public static void main(String[] args) {
		
		YMCACard ymca = new YMCACard("Jacob Johnson", "123987");
		DriverLicense dl = new DriverLicense("Jacob Johnson", "987654321", LocalDate.of(2022, 10, 11));
		YMCACard ymca2 = new YMCACard("Jake Johnson", "987123");
		DriverLicense dl2 = new DriverLicense("Jake Johnson", "123456789", LocalDate.of(2016, 10, 11));
		
		
		String card1 = ymca.format();
		String card2 = dl.format();
		String card3 = ymca2.format();
		String card4 = dl2.format();
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
	}

}
