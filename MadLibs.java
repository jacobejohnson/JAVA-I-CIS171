import java.util.Scanner;

// this program creates a madlib by asking the user for words then
// inserting those words into a story

public class MadLibs {
	
//Jacob Johnson

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Choose a name: "); 
		String name = in.next(); // user enters name
		
		System.out.print("Choose an object: "); 
		String object1 = in.next(); // user enters an object
		
		System.out.print("Choose an object: "); 
		String object2 = in.next(); // user enters another object
		
		System.out.print("Choose an object: "); 
		String object3 = in.next(); // user enters another object
		
		System.out.print("Choose a past tense verb: "); 
		String pastTenseVerb = in.next(); // user enters a past tense verb
		
		System.out.print("Choose an adjective: ");
		String adjective = in.next(); // user enters an adjective
		
		
		
		
		// compute and display the madlib
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println(name + " had a giant " + object1);
		System.out.println("Its " + object2 + " was " + adjective + " as water");
		System.out.println("And every time that " + name + " " + pastTenseVerb);
		System.out.println("The " + object3 + " was its favorite food.");
		
		in.close();
		
	}

}

	



