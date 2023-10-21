package change_lesson_14_max;

import java.util.Comparator;

public class sortByWeightComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getWeight() > o2.getWeight())
			return 1;
		else if(o1.getWeight() < o2.getWeight())
			return -1;
		else
			return 0;
	}

}
