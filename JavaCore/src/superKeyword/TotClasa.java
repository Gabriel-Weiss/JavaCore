package superKeyword;

class AltaClasa{
	String var1 = "valoare1";
	
	void met1() {System.out.println("Printeaza ceva");}
	
	public AltaClasa() {
		System.out.println("Afisare ceva");
	}
}

class AltaClasa2 extends AltaClasa{
	String var1 = "valoare2";
	
	void met1() {
		super.met1();
		System.out.println("Printeaza altceva");
		}
	
	public AltaClasa2() {
		super();
		System.out.println("Afisare altceva");
	}

	void afisareDate() {
		System.out.println(var1+" "+super.var1);
	}
}



public class TotClasa {

	public static void main(String[] args) {
		new AltaClasa2().afisareDate();
		
		new AltaClasa2().met1();
		

	}

}
