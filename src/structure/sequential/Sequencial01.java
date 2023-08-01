package structure.sequential;
import java.util.Scanner;

public class Sequencial01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(), y = sc.nextInt();
		int z = sum(x, y);
		System.out.println("SOMA = " + z);

		sc.close();
	}

	static int sum(int x, int y) {
		return x + y;
	}

}
