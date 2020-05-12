package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterareElemente {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("unu");
		list.add("doi");
		list.add("trei");
		list.add("patru");
		
		System.out.println(list);
		System.out.println();
		
		System.out.println("Iterare prin interfata Iterator");
		Iterator<String> listIterator = list.iterator();
		while(listIterator.hasNext()) System.out.println(listIterator.next());
		System.out.println();

		System.out.println("Iterare prin for-each loop");
		for(String i:list) System.out.println(i);
		System.out.println();
		
		System.out.println("Iterare prin for loop");
		for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		System.out.println();
		
		System.out.println("Iterare prin interfata ListIterator");
		ListIterator<String> listIterator2 = list.listIterator(list.size());
		while(listIterator2.hasPrevious()) System.out.println(listIterator2.previous());
		System.out.println();
		
		System.out.println("Iterare prin metoda forEach");
		list.forEach(action->{System.out.println(action);});
		System.out.println();
		
		System.out.println("Iterare prin metoda forEachRemaining");
		Iterator<String> listIterator3 = list.iterator();
		listIterator3.forEachRemaining(action->{System.out.println(action);});
	}

}
