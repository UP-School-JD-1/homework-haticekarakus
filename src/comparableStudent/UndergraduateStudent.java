package comparableStudent;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	private String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public void study() {
		System.out.println("Undergraduate student is studying.");
	}

	public void register() {
		System.out.println("Undergraduate student is registering.");
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [getMinor()=" + getMinor() + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getYear()=" + getYear() + ", getDob()=" + getDob() + ", getMajor()=" + getMajor() + "]";
	}

}
