package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// coordinates
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		while (X != 0 && Y != 0) {

			if (X > 0 && Y > 0) {
				System.out.println("First.");
			}
			
			else if (X < 0 && Y > 0) {
				System.out.println("Second.");
			}
			
			else if (X < 0 && Y < 0) {
				System.out.println("Third.");
			}		
			else {
				System.out.println("Fourth.");
			}
			
			X = sc.nextDouble();
			Y = sc.nextDouble();
		}
		
		sc.close();
	}

}
