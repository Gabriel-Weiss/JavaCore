package thisKeyword;

class CevaTipClasa{
	
	void met1() {System.out.println("Printeaza ceva");}
	
	void met2() {
		met1();
		System.out.println("Printeaza altceva");
		this.met1();}
}

public class Tutorial6 {

	public static void main(String[] args) {
		new CevaTipClasa().met2();

	}

}
