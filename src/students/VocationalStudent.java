package students;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	public void study() {
		System.out.println("Vocational student is studying.");
	}

	public void register() {
		System.out.println("Vocational student is registering.");
	}

	@Override
	public String toString() {
		return "VocationalStudent [getNo()=" + getNo() + ", getName()=" + getName() + ", getYear()=" + getYear()
				+ ", getDob()=" + getDob() + ", getMajor()=" + getMajor() + "]";
	}

}
