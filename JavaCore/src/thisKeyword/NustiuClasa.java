package thisKeyword;

class Oclasa{
	void met1(Oclasa obiect) {System.out.println("Printeaza ceva");}
	
	void met2() {
		met1(this);
		System.out.println("Printeaza altceva");}
}

public class NustiuClasa {

	public static void main(String[] args) {
		new Oclasa().met2();

	}

}
