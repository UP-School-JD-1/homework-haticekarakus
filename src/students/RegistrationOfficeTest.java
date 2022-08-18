package students;

public class RegistrationOfficeTest {

	public static void main(String[] args) {
		RegistrationOffice regOffice=new RegistrationOffice();
		
		Student s1=regOffice.getAStudent();
		Student s2=regOffice.getAStudent();

		regOffice.RegisterStudent(s1);
		regOffice.RegisterStudent(s2);
		System.out.println(s1.toString());
		System.out.println(s1.getName()+"-"+s1.getMajor()); 
	}

}
