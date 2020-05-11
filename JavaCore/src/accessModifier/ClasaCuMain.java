package accessModifier;

public class ClasaCuMain {

	public static void main(String[] args) {
		ClasaFaraMain n = new ClasaFaraMain();
		
		n.setVar1(1); n.setVar2("doi");
		System.out.println(n.getVar1()+" "+n.getVar2());

	}

}
