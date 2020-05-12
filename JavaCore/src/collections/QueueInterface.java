package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueInterface {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
//		Dequeue<String> queue = new ArrayDequeue<String>();
		
		queue.add("unu");
		queue.add("doi");
		queue.add("trei");
		queue.add("patru");
		
		Iterator<String> listIterator = queue.iterator();
		while(listIterator.hasNext()) System.out.println(listIterator.next());
		System.out.println();

	}

}
