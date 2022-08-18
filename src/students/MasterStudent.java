package students;

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

	@Override
	public void study() {
		System.out.println("Master student is studying");
	}

	@Override
	public void register() {
		System.out.println("Master student is registering");
	}

}
