package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition11 {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char response;
		// EX: temperature converter (celsius > fahrenheit) using 'do While'
		do {
			double celsius = sc.nextDouble(), fahrenheit = 0.0;
			fahrenheit = (9 * celsius)/5 + 32;
			System.out.println("Equivalent in Fahrenheit: " + String.format("%.1f", fahrenheit));
			
			System.out.print("Do you want to repeat? (y/n) ");
			response = sc.next().charAt(0);
			
		} while (response != 'n');
		sc.close();
	}

}
