package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int fatorial = 1;
		for (int i = N; i >= 1; i--) {
			fatorial *=  i;
		}
		System.out.println(fatorial);

		sc.close();
	}

}
