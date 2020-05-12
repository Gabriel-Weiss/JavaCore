package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ClasaComparator {

	public static void main(String[] args) {
		ArrayList<ObiectComparator> list = new ArrayList<ObiectComparator>();
		
		list.add(new ObiectComparator(1, "unuNume", 05));
		list.add(new ObiectComparator(2, "doiNume", 25));
		list.add(new ObiectComparator(3, "treiNume", 65));
		list.add(new ObiectComparator(4, "patruNume", 35));
		
		System.out.println("Comparare dupa text");
		Collections.sort(list, new ComparareNume());
		for(ObiectComparator comparator:list) System.out.println(comparator.id+" "+comparator.nume+" "+comparator.val);
		System.out.println();
		
		System.out.println("Comparare dupa valoare");
		Collections.sort(list, new ComparareVal());
		for(ObiectComparator comparator:list) System.out.println(comparator.id+" "+comparator.nume+" "+comparator.val);

	}

}
