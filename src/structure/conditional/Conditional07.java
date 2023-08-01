package structure.conditional;

import java.util.Locale;
import java.util.Scanner;

public class Conditional07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble(), Y = sc.nextDouble();

		quadrante(X, Y);

		sc.close();
	}

	static void quadrante(double x, double y) {

		if (x == 0 && y == 0) {
			System.out.println("Origem.");
		}

		else if (x == 0) {
			System.out.println("Eixo Y.");
		}

		else if (y == 0) {
			System.out.println("Eixo X.");
		}

		else if (x > 0 && y > 0) {
			System.out.println("Q1.");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2.");
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Q3.");
		}		
		else {
			System.out.println("Q4.");
		}

	}

}
