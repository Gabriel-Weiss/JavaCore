class AnyClass{
	int id;
	String nume;
	static char gen='M';
	
	static void modificareStatica() {
		gen='S';
	}

	AnyClass(int id, String nume) {
		this.id = id;
		this.nume = nume;
	}
	
	void afisareDate() {System.out.println(id+" "+nume+" "+gen);}
}
public class Tutorial3 {

	public static void main(String[] args) {
		AnyClass anyClass1 = new AnyClass(01,"Nume");
		
		anyClass1.afisareDate();
		
		AnyClass.modificareStatica();
		
		anyClass1.afisareDate();

	}

}
