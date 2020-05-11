class SomeClass{
	int id;
	String nume;
	static char gen='M';
	
	public SomeClass(int id, String nume) {
		this.id = id;
		this.nume = nume;
	}
	
	void afisareDate() {System.out.println(id+" "+nume+" "+gen);}
	
}
public class Tutorial2 {

	public static void main(String[] args) {
		SomeClass someClass = new SomeClass(01,"Nume");
		someClass.afisareDate();
	}

}
