package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasaNoua {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);){
				while(true) {
					System.out.println("Introduceti paternul regex:");
					Pattern pattern = Pattern.compile(scanner.nextLine());
					System.out.println("Introduceti textul: ");
					Matcher matcher = pattern.matcher(scanner.nextLine());
					boolean gasit = false;
					while(matcher.find()) {
						System.out.println("Paternul regex "+matcher.group()+
								" identificat intre indexul "+matcher.start()+
								" si "+matcher.end());
						gasit = true;
					}
					if(!gasit) System.out.println("Patern inexistent in textul dat");
				}
		}
	}

}
