//Jacob Johnson
public class Course {
	
	private int crn;
	private String courseID;
	private String courseName;
	private int credits;
	private String instructor = "staff";
	private static int nextCrn = 25000;
	
	
	
	
	
	public Course (String ci, String cn, int c){
		
		setCourseID(ci);
		setCourseName(cn);
		setCredits(c);
		
		nextCrn++;
		crn = nextCrn;
		
		if (ci == null){
			throw new IllegalArgumentException();
		}
		if (cn == null){
			throw new IllegalArgumentException();
		}
		if (c < 1){
			throw new IllegalArgumentException();
		}
		
	}
	
	public int getCrn() {
		return crn;
	}
	
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		if (credits <= 5) {
			this.credits = credits;
		}
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [crn=" + crn + ", courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits
				+ ", instructor=" + instructor + "]";
	}
	public String printCourse() {
		return courseID + ", " + crn + ", " + courseName + ", " + credits + " credits, " + "Instructor: " + instructor;
	}
	public String printInstructor(){
		return courseID + ", " + crn + ", " + courseName + ", " + credits + " credits, ";
	}
	public static Course duplicateCourse(String ci, String cn, int crn) {
		Course c = new Course(ci, cn, crn);
		return c;

	}
	

}
