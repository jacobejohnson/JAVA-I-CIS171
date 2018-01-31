package Model;

public class Instructor {

	private String firstName;
	private String lastName;
	private String email;
	
	public Instructor() {
		
	}
	
	public Instructor(String f, String l, String e) {
		setFirstName(f);
		setLastName(l);
		setEmail(e);
	}
	
	public Instructor(String f, String l) {
		setFirstName(f);
		setLastName(l);
		this.email = makeEmailAddress(firstName, lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	public String makeEmailAddress(String firstName, String lastName) {
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		String newEmail = firstName.charAt(0) + lastName + "@dmacc.edu";
		return newEmail;
	}
	
	
}
