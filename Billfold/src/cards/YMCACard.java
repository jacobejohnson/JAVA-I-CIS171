package cards;
//Jacob Johnson
public class YMCACard extends Card {
	
	private String idNumber;
	
	public YMCACard() {
		
	}
	
	public YMCACard(String n, String id) {
		super(n);
		setIdNumber(id);
	}

	
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String format() {
		return super.format() + ", ID: " + idNumber;
	}

}
