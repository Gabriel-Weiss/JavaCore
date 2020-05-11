package multithreading.threadPool;

public class ClasaThread implements Runnable {
	private String mesaj;

	public ClasaThread(String mesaj) {
		this.mesaj = mesaj;
	}
	
	private void procesareMesaj() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Mesajul de start nr.: "+mesaj);
		procesareMesaj();
		System.out.println(Thread.currentThread().getName()+" Mesaj de stop nr.:    "+mesaj);
	}
}
