package clase.interne;

public class MembruInnerClass {
	private int i = 1;
	class Interior{
		void met() {System.out.println(i);}
	}

	public static void main(String[] args) {
		MembruInnerClass membruInnerClass = new MembruInnerClass();
		MembruInnerClass.Interior interior = membruInnerClass.new Interior();
		interior.met();
		

	}

}
