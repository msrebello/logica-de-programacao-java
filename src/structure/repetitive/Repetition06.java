package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			media(num1, num2, num3);
		}

		sc.close();
	}

	static void media(double a, double b, double c) {

		double media = (a * 2 + b * 3 + c * 5) / 10;
		System.out.println(String.format("%.1f", media));

	}

}
