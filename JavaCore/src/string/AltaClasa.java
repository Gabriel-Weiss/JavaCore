package string;

class CarevaClasa{
	int id;
	String nume;
	char gen;
	
	CarevaClasa(int id, String nume, char gen) {
		this.id = id;
		this.nume = nume;
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "CarevaClasa [id=" + id + ", nume=" + nume + ", gen=" + gen + "]";
	}
	
	
}

public class AltaClasa {

	public static void main(String[] args) {
		
		System.out.println(new CarevaClasa(01, "nume", 'm'));
		
		System.out.println();
		
		String str = "Nume";
		System.out.println(str.hashCode());
		str= str+" Prenume";
		System.out.println(str.hashCode());
		
		System.out.println();
		
		StringBuffer stringBuffer = new StringBuffer("Nume");
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append(" Prenume");
		System.out.println(stringBuffer.hashCode());
		
		System.out.println();
		
		StringBuilder stringBuilder = new StringBuilder("Prenume");
		System.out.println(stringBuilder.reverse());
		

	}

}
