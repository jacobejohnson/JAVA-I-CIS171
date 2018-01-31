//Jacob Johnson
public class CourseTesterJohnson {
	
	public static void main(String[] args) {
		
		Course course1 = new Course("BIO152", "Botany", 3);
		String botany = course1.printCourse();
		System.out.println(botany);
		
		Course course2 = new Course("MTH150", "Math", 3);
		String math = course2.printCourse();
		System.out.println(math);
		
		Course course3 = new Course("ENG105", "English", 3);
		String english = course3.printInstructor();
		System.out.println(english + "Instructor: Johnson");
		
		Course course4 = new Course("CIS172", "Java", 3);
		String java = course4.printInstructor();
		System.out.println(java + "Instructor: Ruse");
		
		Course course5 = new Course("CIS169", "C++", 3);
		String cPlusPlus = course5.printInstructor();
		System.out.println(cPlusPlus + "Instructor: Struss");
		
		Course course6 = Course.duplicateCourse("ENG105", "English", 3);
		System.out.println(course6.printInstructor() + "Instructor: Johnson");
		
		Course course7 = Course.duplicateCourse("CIS172", "Java", 3);
		System.out.println(course7.printInstructor() + "Instructor: Ruse");
		
		Course course8 = Course.duplicateCourse("CIS169", "C++", 3);
		System.out.println(course8.printInstructor() + "Instructor: Struss");
		
		
		
		
		
	}

}
