package comparableStudent;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

	public void RegisterStudent(AbstractStudent s2) {
		if (s2 instanceof PhdStudent) {
			PhdStudent phd = (PhdStudent) s2;
			System.out.println("Phd student " + phd.getName() + " has registered");
		} else if (s2 instanceof MasterStudent) {
			MasterStudent master = (MasterStudent) s2;
			System.out.println("Master student " + master.getName() + " has registered.");
		} else if (s2 instanceof GraduateStudent) {
			GraduateStudent grd = (GraduateStudent) s2;
			System.out.println("Graduate student " + grd.getName() + " has registered.");
		} else if (s2 instanceof UndergraduateStudent) {
			UndergraduateStudent ugrd = (UndergraduateStudent) s2;
			System.out.println("Undergraduate student " + ugrd.getName() + " has registered.");
		} else if (s2 instanceof VocationalStudent) {
			VocationalStudent voc = (VocationalStudent) s2;
			System.out.println("vocational student " + voc.getName() + " has registered.");
		} else {
			System.out.println("Student " + s2.getName() + " has registered.");
		}
	}

	@SuppressWarnings("deprecation")
	public AbstractStudent getAStudent() {
		AbstractStudent student = null;
		Random r = new Random();
		int i = r.nextInt(6);
		switch (i) {
		case 1:
			student = new VocationalStudent(112, "Ayhan", 1999, new Date(1966, 05, 5), "Computer Science");
			break;
		case 2:
			student = new GraduateStudent(245, "Ece", 2000, new Date(1970, 12, 1), "Engineer", "Kemal Tez");
			break;
		case 3:
			student = new UndergraduateStudent(123, "Semih", 1998, new Date(1980, 05, 2), "Physics", "Biolog");
			break;
		case 4:
			student = new MasterStudent(2220, "Esin", 2000, new Date(1980, 11, 3), "Engineer", "Sila Kara");
			break;
		default:
			student = new PhdStudent(345, "Derin", 1999, new Date(1975, 11, 6), "Engineer", "Burcu Cicek", true);
			break;
		}

		return student;
	}


}
