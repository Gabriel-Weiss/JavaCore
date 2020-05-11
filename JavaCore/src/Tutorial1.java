class FirstClass{
	int id;
	String nume;
	
	void metInserare(int i,String n) {
		id=i;
		nume=n;
	}
	
	public FirstClass() {}
	
	FirstClass(int id,String nume) {
		this.id=id;
		this.nume=nume;
		
	}
}

public class Tutorial1 {
	public static void main(String[] args) {
		FirstClass firstClass1 = new FirstClass();
		firstClass1.id=01;
		firstClass1.nume="Nume1";
		System.out.println(firstClass1.id+" "+firstClass1.nume);
		
		
		FirstClass firstClass2 = new FirstClass();
		firstClass2.metInserare(02, "Nume2");
		System.out.println(firstClass2.id+" "+firstClass2.nume);
		
		FirstClass firstClass3 = new FirstClass(03,"Nume3");
		System.out.println(firstClass3.id+" "+firstClass3.nume);
	}

}
