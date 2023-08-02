package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			
			int square = (int) Math.pow(i, 2);
			int cubed = (int) Math.pow(i, 3);
			System.out.println(i + " " + square + " " + cubed);
			
		}
		sc.close();

	}

}
