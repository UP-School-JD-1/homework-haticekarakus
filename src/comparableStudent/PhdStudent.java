package comparableStudent;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	private boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor);
		this.qualifyingExamTaken = qualifyingExamTaken;

	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public void writePaper() {
		System.out.println("Phd student is wirting paper");
	}

	@Override
	public void writeThesis() {
		System.out.println("Phd student is writing thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd student met his advisor:  " + getAdvisor());
	}

	public void study() {
		System.out.println("Phd student is studying");
	}

	public void register() {
		System.out.println("Phd student is registering");
	}

}
