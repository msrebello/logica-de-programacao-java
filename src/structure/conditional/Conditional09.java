package structure.conditional;

import java.util.Scanner;

public class Conditional09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		int h = higher(a, b, c);
		output(h);

		sc.close();
	}

	static int higher(int a, int b, int c) {
		int max = 0;
		if (a > b && a > c) {
			max = a;
		} else if (b > a) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}

	static void output(int result) {
		System.out.println("Higher = " + result);
	}
}