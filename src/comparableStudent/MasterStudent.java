package comparableStudent;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major, advisor);
		
	}

	@Override
	public void writeThesis() {
		System.out.println("Master student is writing thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Master student meet his advisor:  " +getAdvisor());
	}

	public void study() {
		System.out.println("Master student is studying");
	}

	public void register() {
		System.out.println("Master student is registering");
	}

}
