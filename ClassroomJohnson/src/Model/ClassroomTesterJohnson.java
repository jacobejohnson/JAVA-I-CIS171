//Jacob Johnson
package Model;

import java.time.LocalTime;

public class ClassroomTesterJohnson {
	
	public static void main(String[] args) {
		
		
		
		Classroom compSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 25);
		String class1 = compSciLab.toString();
		System.out.println(class1);
		
		Classroom bioLab = new Classroom("3", "28a", "Ankeny", "Science Lab", 22);
		String class2 = bioLab.toString();
		System.out.println(class2);
		
		Classroom litRoom = new Classroom("2", "12", "Urban", "Classroom", 18);
		String class3 = litRoom.toString();
		System.out.println(class3);
		
		Course bio101 = new Course("24680", "BIO101", LocalTime.of(11, 15), LocalTime.of(12, 55), "wsmith", "BioLab");
		String class4 = bio101.toString();
		System.out.println(class4);
		
		Course cis171 = new Course("23456", "CIS171", LocalTime.of(10, 10), LocalTime.of(12, 20), "wfitx", "CompSciLab");
		String class5 = cis171.toString();
		System.out.println(class5);
		
		Course lit105 = new Course("29876", "LIT105", LocalTime.of(15, 15), LocalTime.of(16, 30), "etheo", "LitRoom");
		String class6 = lit105.toString();
		System.out.println(class6);
	}

}
