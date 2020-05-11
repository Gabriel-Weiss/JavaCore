package thisKeyword;
class CarevaClasa{
	int id;
	String nume;
	char gen;
	
	CarevaClasa(int id, String nume, char gen) {
		this.id = id;
		this.nume = nume;
		this.gen = gen;
	}
	
	void afisareDate() {System.out.println(id+" "+nume+" "+gen);}
}
public class Tutorial5 {

	public static void main(String[] args) {
		
		new CarevaClasa(01, "Nume", 'M').afisareDate();

	}

}
