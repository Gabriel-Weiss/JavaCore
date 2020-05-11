package clase.interne;

public class LocalInnerClass {
	
	private int i = 1;
	void met1() {
		class Local{
			void met2() {System.out.println(i);}
		}
		Local local = new Local();
		local.met2();
	}

	public static void main(String[] args) {
		
		new LocalInnerClass().met1();

	}

}
