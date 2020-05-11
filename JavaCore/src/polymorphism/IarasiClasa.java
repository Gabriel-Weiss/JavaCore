package polymorphism;

class AltaClasa{
	void met1() {System.out.println("Printeaza ceva");}
}

class AltaClasa2 extends AltaClasa {
	void met1() {System.out.println("Printeaza altceva");}
}

public class IarasiClasa {

	public static void main(String[] args) {
		new AltaClasa2().met1();

	}

}
