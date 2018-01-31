package cards;
import java.time.LocalDate;

//Jacob Johnson
public class DriverLicense extends Card{
	
	private String dlNumber;
	private LocalDate expirationDate;
	LocalDate current = LocalDate.now();
	LocalDate expires = this.getExpirationDate(); 
	
	public DriverLicense() {
		
	}
	
	public DriverLicense(String n, String dln, LocalDate e) {
		super(n);
		setDlNumber(dln);
		setExpirationDate(e);
	}

	public String getDlNumber() {
		return dlNumber;
	}

	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String format() {
		return super.format() + ", Driver License Number: " + dlNumber + ", Expiration Date: " + expirationDate;
	}
	
	public boolean isExpired(LocalDate current, LocalDate expires) {
		
		if(expires.isBefore(current)){
			return true;
		} else {
			return false;
		}

		
	}


	
}
