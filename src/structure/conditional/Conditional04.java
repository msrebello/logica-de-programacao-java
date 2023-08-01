package structure.conditional;

import java.util.Scanner;

public class Conditional04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// hours game
		int start = sc.nextInt(), finish = sc.nextInt();

		// duration method
		duration(start, finish);

		sc.close();
	}

	static void duration(int s, int f) {
		int duration = 0;
		if (s >= f) {
			duration = 24 - (s - f);
		} else {
			duration = f - s;
		}

		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
	}

}
