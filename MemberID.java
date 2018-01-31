import java.util.Scanner;
// this program will format 14 character member id's correctly	
public class MemberID {
	
	//Jacob Johnson
	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		
		// user to enter a 14 char string
		
		System.out.print("Please enter the 14 character MemberID: ");
		String name = string.next().toUpperCase(); // this will make all letters caps
		
		String sub1 = name.substring(0, 1); // substring 1
		String sub2 = name.substring(1, 4); // substring 2
		String sub3 = name.substring(4, 8); // substring 3
		String sub4 = name.substring(8, 10); // substring 4
		String sub5 = name.substring(10,13); // substring 5
		String sub6 = name.substring(13); // substring 6
		
		// output member id in correct format
		System.out.println("Member ID: " + sub1 + "-" + sub2 + " " + sub3 + " " + sub4 + "-" + sub5 + " " + "(" + sub6 + ")");
		
		string.close();
		
	}
}
