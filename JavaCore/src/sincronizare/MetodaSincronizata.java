package sincronizare;

class AltaClasa{
	synchronized void metodaSincronizata(int n) {
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

public class MetodaSincronizata {
	

	public static void main(String[] args) {
		AltaClasa altaClasa = new AltaClasa();
		
		Thread thread1 = new Thread() {
			public void run() {
				altaClasa.metodaSincronizata(5);
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				altaClasa.metodaSincronizata(10);
			}
		};
		
		thread1.start();
		thread2.start();

	}

}
