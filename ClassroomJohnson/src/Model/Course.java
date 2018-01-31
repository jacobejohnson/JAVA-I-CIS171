//Jacob Johnson
package Model;

import java.time.LocalTime;

public class Course {
	
	String crn;
	String courseName;
	LocalTime startTime;
	LocalTime endTime;
	String teacher;
	String location;
	
	public Course() {
		
	}
	
	public Course(String c, String cn, LocalTime st, LocalTime et, String t, String l) {
		setCrn(c);
		setCourseName(cn);
		setStartTime(st);
		setEndTime(et);
		setTeacher(t);
		setLocation(l);
	}
	
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Course [crn=" + crn + ", courseName=" + courseName + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", teacher=" + teacher + ", location=" + location + "]";
	}
	
	
	
	

}
