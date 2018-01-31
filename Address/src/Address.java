//Jacob Johnson
public class Address {
	
	private String number;
	private String street;
	private String apartment;
	private String city;
	private String state;
	private String zip;
	
	public Address(String n, String s, String a, String c, String st, String z) {
		setNumber(n);
		setStreet(s);
		setApartment(a);
		setCity(c);
		setState(st);
		setZip(z);
		
		if ((getState() == null) || (getZip() == null)){
			throw new IllegalArgumentException();
		}
	}
	public Address(String n, String s, String c, String st, String z) {
		setNumber(n);
		setStreet(s);
		setCity(c);
		setState(st);
		setZip(z);
		
		if ((getState() == null) || (getZip() == null)){
			throw new IllegalArgumentException();
		}
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		state = state.toUpperCase();
		if (state.length() == 2) {
			this.state = state;
		}
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		if (zip.length() == 5);{
			this.zip = zip;
		}
	}
	public void print() {
		System.out.println(getNumber() + " " + getStreet() + " " + getApartment());
		System.out.println(getCity() + " " + getState() + " " + getZip());
	}
	
	
	

}
