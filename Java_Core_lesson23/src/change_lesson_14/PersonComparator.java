package change_lesson_14;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getFirstName().compareTo(o2.getFirstName()) > 0) {
			return 1;
		}else if (o1.getFirstName().compareTo(o2.getFirstName()) < 0) {
			return -1;
		}else {
			if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
				return 1;
			}else if (o1.getLastName().compareTo(o2.getLastName()) < 0) {
				return -1;
			}else {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}else if (o1.getAge() < o2.getAge()) {
					return -1;
				}else {
					return 0;
				}
			}
		}
		
	}

}
