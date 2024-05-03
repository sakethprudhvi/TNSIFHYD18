package Branch;

public class Ece {
	public String id;
	public String name;
	public int m1,m2,m3,m4,m5,m6;
	public int average() {
		return (m1+m2+m3+m4+m5+m6)/6;
	}
	public void displayinfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
		System.out.println("Student average marks: "+average());
	}
}
