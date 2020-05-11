package clase.interne;

abstract class Anonimul{
	abstract void met();
}

public class AnonimInnerClass {

	public static void main(String[] args) {
		Anonimul anonimul = new Anonimul() {
			void met() {
				System.out.println("Printare ceva");
			}
		};
		
		anonimul.met();
	}

}
