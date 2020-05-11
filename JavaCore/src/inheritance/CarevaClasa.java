package inheritance;

class AltaClasa {
	int var1 = 1;
}

public class CarevaClasa extends AltaClasa {

	int var2 = 2;
	
	public static void main(String[] args) {
		
		System.out.println(new CarevaClasa().var1);
		System.out.println(new CarevaClasa().var2);
		
	}

}
