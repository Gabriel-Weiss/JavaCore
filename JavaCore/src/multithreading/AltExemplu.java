package multithreading;

public class AltExemplu {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Sarcina shutdown hook-ului indeplinita");
			}
		});
		System.out.println("Apasati tastele ctrl+C pentru a iesi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
