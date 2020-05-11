class AltaClasa{
	public AltaClasa() {
		System.out.println("Constructorul super clase se executa al doilea");
	}
}
public class Tutorial4 extends AltaClasa {
	
	public Tutorial4() {
//		super();
		System.out.println("Constructorul sub clase se executa al treilea");
	}
	
	static {System.out.println("Blocul static se executa inainte de main()");}
	
	public static void main(String[] args) {
		new Tutorial4();
		
		System.out.println("main() se executa dupa blocul static");
	}

}
