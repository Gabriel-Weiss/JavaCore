package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		TreeSet<String> list = new TreeSet<String>();
		
		set.add("unu");
		set.add("doi");
		set.add("trei");
		set.add("patru");
		
		Iterator<String> listIterator = set.iterator();
		while(listIterator.hasNext()) System.out.println(listIterator.next());
		System.out.println();

	}

}
