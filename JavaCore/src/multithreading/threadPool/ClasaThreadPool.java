package multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ClasaThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++) {
			Runnable runnable = new ClasaThread(" "+i);
			executor.execute(runnable);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {}
		System.out.println("Proces finisat");

	}

}
