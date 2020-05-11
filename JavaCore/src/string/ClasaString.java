package string;

public class ClasaString {

	static String s1 = "Nume";
	static String s2 = "Nume";
	static String s3 = new String("Nume");
	static String s4 = "Prenume";
	static String s5 = "NUME";
	
	public static void main(String[] args) {
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);

		System.out.println();
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
		System.out.println();
		
		System.out.println(s1.concat(s4));
		System.out.println(s1+s4);
	}

}
