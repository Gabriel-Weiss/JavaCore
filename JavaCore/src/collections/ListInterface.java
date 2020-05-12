package collections;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.Stack;
//import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		
		list.add("unu");
		list.add("doi");
		list.add("trei");
		list.add("patru");
		
		Iterator<String> listIterator = list.iterator();
		while(listIterator.hasNext()) System.out.println(listIterator.next());
		System.out.println();

		Stack<String> stack = new Stack<String>();
		
		stack.push("unu");
		stack.add("doi");
		stack.add("trei");
		stack.add("patru");
		
		Iterator<String> stackIterator = list.iterator();
		while(stackIterator.hasNext()) System.out.println(stackIterator.next());
		
	}

}
