package comparableStudent;

import java.util.Comparator;

public class StudentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		AbstractStudent s1=(AbstractStudent) o1;
		AbstractStudent s2=(AbstractStudent) o2;
			if(s1.getNo()>s2.getNo()) { 
				return 1;
			}
			else if(s1.getNo()<s2.getNo())
				return -1;
			else
				return 0;
	}

}
