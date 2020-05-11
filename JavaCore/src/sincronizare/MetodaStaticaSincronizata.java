package sincronizare;

class AltaClasa3{
	synchronized static void metodaStaticSincronizata(int n) {
		for(int i=1;i<=10;i++) {
			System.out.print(n*i+" ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MetodaStaticaSincronizata {

	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				AltaClasa3.metodaStaticSincronizata(1);
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				AltaClasa3.metodaStaticSincronizata(1);
			}
		};
		
		thread1.start();
		thread2.start();

	}

}
