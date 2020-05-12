package comparator;

import java.util.Comparator;

public class ComparareVal implements Comparator<ObiectComparator> {

	@Override
	public int compare(ObiectComparator o1, ObiectComparator o2) {
		if(o1.val==o2.val)
			return 0;
		else if(o1.val>o2.val)
			return 1;
		else
			return -1;
	}

}
