package structure.sequential;
import java.util.Scanner;

public class Sequencial03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int dif = diferenca(A, B, C, D);
		System.out.println("DIFERENCA = " + dif);

		sc.close();
	}

	static int diferenca(int a, int b, int c, int d) {
		return a * b - c * d;
	}

}
