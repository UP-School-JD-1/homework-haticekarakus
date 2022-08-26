package students;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {
	private String advisor;
	private String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	public void writeThesis() {
		System.out.println("Graduate student is writing thesis.");
	}

	public void meetWithAdvisor() {
		System.out.println("Graduate student meet his advisor:  " + getAdvisor());
	}

	public void study() {
		System.out.println("Graduate student is still studying.");
	}

	public void register() {
		System.out.println("Graduate student is registering life.");
	}

}
