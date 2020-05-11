package clase.interne;

public class StaticNestedClass {
	
	static int i = 1;
	static class Interior{
		void met1() {System.out.println(i);}
		static void met2() {System.out.println(i+i);}
	}

	public static void main(String[] args) {
		StaticNestedClass.Interior interior = new StaticNestedClass.Interior();
		interior.met1();
		StaticNestedClass.Interior.met2();

	}

}
