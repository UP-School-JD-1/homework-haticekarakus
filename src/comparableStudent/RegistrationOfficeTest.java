package comparableStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;



public class RegistrationOfficeTest {

	public static void main(String[] args) {
		RegistrationOffice regOffice = new RegistrationOffice();
		
		AbstractStudent s1 = regOffice.getAStudent();
		AbstractStudent s2 = regOffice.getAStudent();
		
		System.out.println(s1.getNo()+ " " + s2.getNo());
		
		Comparator<Student> ec = new StudentComparator();

		System.out.println("Compare e1 to e2: " + ec.compare(s1, s2));
		System.out.println("Compare e2 to e1: " + ec.compare(s2, s1));
		System.out.println("Compare e1 to e1: " + ec.compare(s1, s1));
		
		
		List<AbstractStudent> studentList= new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		Collections.sort(studentList, new StudentComparator());
		for (AbstractStudent s : studentList) {
			System.out.println(s);
		}


	}

}
