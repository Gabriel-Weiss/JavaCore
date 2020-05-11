package polymorphism;

class CarevaClasa{
	static int met1(int a, int b) {return a+b;}
	static double met1(double a, double b) {return a+b;}
	
	static int met2(int a, int b) {return a+b;}
	static int met2(int a, int b, int c) {return a+b+c;}
}

public class ClasaCareva {

	public static void main(String[] args) {
		System.out.println(CarevaClasa.met1(789, 657));
		System.out.println(CarevaClasa.met2(23, 4, 45));

	}

}
