package thisKeyword;

class AltaClasa{
	int var1;
	String var2;
	float var3;
	
	AltaClasa(int var1, String var2, float var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	String var4;

	AltaClasa(int var1, String var2, float var3, String var4) {
		this(var1,var2,var3);
		this.var4 = var4;
	}
	
	void afisareDate() {System.out.println(var1+" "+var2+" "+var3+" "+var4);}
}

public class Tutorial7 {

	public static void main(String[] args) {
		new AltaClasa(1, "doi", 3.0f, "patru").afisareDate();

	}

}
