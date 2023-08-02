package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			division(num1, num2);
		}

		sc.close();
	}

	static void division(int a, int b) {
		
		if (b == 0) {
			System.out.println("Division impossible!");
		} 
		else {
			double div = (double) a / b;
			System.out.println( String.format("%.1f", div));
		}
	}
}
