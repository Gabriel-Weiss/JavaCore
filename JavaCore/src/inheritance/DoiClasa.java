package inheritance;

public class DoiClasa {

	String var3,var4;
	UnuClasa unuClasa;
	
	
	DoiClasa(UnuClasa unuClasa, String var3, String var4) {
		this.unuClasa = unuClasa;
		this.var3 = var3;
		this.var4 = var4;
	}

	void afisareDate() {
		System.out.println(unuClasa.var1+" "+unuClasa.var2+" "
				          +var3+" "+var4);
	}


	public static void main(String[] args) {
		
		new DoiClasa(new UnuClasa("unu","doi"), "trei", "patru").afisareDate();
		

	}

}
