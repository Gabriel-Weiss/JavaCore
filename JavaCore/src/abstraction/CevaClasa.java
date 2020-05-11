package abstraction;

abstract class UnuClasa{
	abstract void metAbstracta();
}

class DoiClasa extends UnuClasa{

	@Override
	void metAbstracta() {
		System.out.println("Printeaza ceva");
	}
	
}

class TreiClasa extends UnuClasa{
	@Override
	void metAbstracta() {
		System.out.println("Printeaza altceva");
	}
}


public class CevaClasa {

	public static void main(String[] args) {
		new DoiClasa().metAbstracta();
		new TreiClasa().metAbstracta();

	}

}
