//Jacob Johnson
import java.util.Scanner;
public class PasswordValidationJohnson 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Password must be at least 8 characters.");
		System.out.println("Password must have at least 1 uppercase letter.");
		System.out.println("Password must have at least 1 lowercase letter.");
		System.out.println("Password must have at least 1 digit.");
		
		System.out.print("Please enter a password: ");
		String attempt1 = in.next();
		
		System.out.print("Please enter your password again to confirm: ");
		String attempt2 = in.next();
		
		if (passwordCheck(attempt1, attempt2));
		System.out.println("Password changed.");
		in.close();
		
	}
	
	public static boolean passwordCheck(String attempt1, String attempt2) 
	{
		boolean validated = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
		while (attempt1.equals(attempt2)) 
		{
			if (attempt1.length() >= 8) 
			{
				for (int i = 0; i < attempt1.length(); i++) 
				{
					char x = attempt1.charAt(i);
					if (Character.isUpperCase(x)) 
					{
						hasUpper = true;
					}
					else if (Character.isLowerCase(x)) 
					{
						hasLower = true;
					}
					else if (Character.isDigit(x)) 
					{
						hasDigit = true;
					}
					if (hasUpper && hasLower && hasDigit) 
					{
						return true;
					}
				}
			}
			else 
			{
				System.out.println("Must have at least 8 characters.");
			}
		}
		while (!(attempt1.equals(attempt2))) 
		{
			System.out.println("The two passwords entered do not match. ");
		}
		return false;
	}
}

