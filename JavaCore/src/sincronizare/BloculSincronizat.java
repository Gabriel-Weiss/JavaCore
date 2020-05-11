package sincronizare;

class AltaClasa2{
	void metodaNeSincronizata(int n) {
		synchronized (this) {	
			for(int i=0;i<=5;i++) {
					System.out.print(n*i+" ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
			}
		}
	}
}

public class BloculSincronizat {

	public static void main(String[] args) {
AltaClasa2 altaClasa = new AltaClasa2();
		
		Thread thread1 = new Thread() {
			public void run() {
				altaClasa.metodaNeSincronizata(5);
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				altaClasa.metodaNeSincronizata(10);
			}
		};
		
		thread1.start();
		thread2.start();


	}

}
