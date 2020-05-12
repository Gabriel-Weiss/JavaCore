package comparator;

import java.util.Comparator;

public class ComparareNume implements Comparator<ObiectComparator> {

	@Override
	public int compare(ObiectComparator o1, ObiectComparator o2) {
		return o1.nume.compareTo(o2.nume);
	}
	

}
