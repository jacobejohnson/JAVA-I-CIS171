//Jacob Johnson
package Model;

public class Classroom {
	
	String building;
	String roomNumber;
	String campus;
	String type;
	int capacity;
	String location;
	
	public Classroom() {
		
	}
	
	public Classroom(String b, String rn, String c, String t, int cy) {
		setBuilding(b);
		setRoomNumber(rn);
		setCampus(c);
		setType(t);
		setCapacity(cy);
	}
	
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Classroom [building=" + building + ", roomNumber=" + roomNumber + ", campus=" + campus + ", type="
				+ type + ", capacity=" + capacity + "]";
	}
	
	

}
