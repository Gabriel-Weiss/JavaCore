package abstraction;

interface UnuClaOaltaClassa{
	void metAbstracta();
}

class TotAltaClasa implements UnuClaOaltaClassa{

	@Override
	public void metAbstracta() {
		System.out.println("Printeaza ceva");
	}
	
}

class NustiuClasa implements UnuClaOaltaClassa{
	@Override
	public void metAbstracta() {
		System.out.println("Printeaza altceva");
	}
}


public class AltaClasa {

	public static void main(String[] args) {
		new TotAltaClasa().metAbstracta();
		new NustiuClasa().metAbstracta();

	}

}