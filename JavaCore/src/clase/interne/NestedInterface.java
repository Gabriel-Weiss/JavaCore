package clase.interne;

interface PrimaInterfata{
	void met1();
	
	interface DoiInterfata{
		void met2();
		}
}

public class NestedInterface implements PrimaInterfata.DoiInterfata {
	public void met2() {System.out.println("Printeaza ceva");}
	public static void main(String[] args) {
		PrimaInterfata.DoiInterfata interfata = new NestedInterface();
		interfata.met2();

	}

}
