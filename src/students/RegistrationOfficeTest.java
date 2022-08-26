package students;

public class RegistrationOfficeTest {

	public static void main(String[] args) {
		RegistrationOffice regOffice = new RegistrationOffice();

		AbstractStudent s1 = regOffice.getAStudent();
		AbstractStudent s2 = regOffice.getAStudent();

		regOffice.RegisterStudent(s1);
		regOffice.RegisterStudent(s2);
	}

}
