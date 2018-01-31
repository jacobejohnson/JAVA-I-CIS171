package billfold;
import cards.Card;

//Jacob Johnson
public class Billfold {
	
	private Card card1;
	private Card card2;
	
	
	void addCard(Card n) {
		if (card1 == null) {
			this.card1=card1;
		}else if (card2 == null){
			this.card2=card2;
		}
	}
	
	public String formatCards() {
		return card1.format() + card2.format();
	}
	

}
