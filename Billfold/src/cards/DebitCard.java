package cards;
//Jacob Johnson
public class DebitCard extends Card{
	
	private String cardNumber;
	private String pin;
	
	public DebitCard() {
		
	}
	
	public DebitCard(String n, String cn, String p) {
		super(n);
		setCardNumber(cn);
		setPin(p);
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String format() {
		return super.format()+ ", Card Number: " + cardNumber + ", PIN: " + pin;
	}

}
