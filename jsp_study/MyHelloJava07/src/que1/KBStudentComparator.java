package que1;

import java.util.Comparator;

public class KBStudentComparator implements Comparator<KBStudent>{

	@Override
	public int compare(KBStudent o1, KBStudent o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() > o2.getAge()) {
			return 1;
		} else if(o1.getAge() < o2.getAge()){
			return -1;
		}
		return 0;
	}
	
}
