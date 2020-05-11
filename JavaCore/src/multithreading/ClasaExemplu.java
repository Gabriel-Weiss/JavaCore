package multithreading;

public class ClasaExemplu extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		ClasaExemplu clasaExemplu1 = new ClasaExemplu();
		ClasaExemplu clasaExemplu2 = new ClasaExemplu();
		ClasaExemplu clasaExemplu3 = new ClasaExemplu();
		
		System.out.println(clasaExemplu1.getId()+" "+clasaExemplu1.getName()+" "+clasaExemplu1.getPriority());
		
		clasaExemplu2.setDaemon(true); clasaExemplu2.setName("Thread tip Daemon");
		System.out.println(clasaExemplu2.getId()+" "+clasaExemplu2.getName()+" "+clasaExemplu2.getPriority());
		
		clasaExemplu1.start();
		try {
			clasaExemplu1.join(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		clasaExemplu2.start();
		clasaExemplu3.start();

	}

}
