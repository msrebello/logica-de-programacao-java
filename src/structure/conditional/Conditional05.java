package structure.conditional;

import java.util.Locale;
import java.util.Scanner;

public class Conditional05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// cod and quantity of item
		int cod = sc.nextInt(), quantity = sc.nextInt();
		total(cod, quantity);

		sc.close();
	}

	static void total(int cod, int quantity) {
		double account = 0;
		switch (cod) {
		case 1:
			account = quantity * 4.00;
			break;

		case 2:
			account = quantity * 4.50;
			break;

		case 3:
			account = quantity * 5.00;
			break;

		case 4:
			account = quantity * 2.00;
			break;

		case 5:
			account = quantity * 1.00;
			break;

		default:
			System.out.println("Invalid code! Try again.");
			break;
		}

		System.out.println("Total: R$ " + String.format("%.2f", account));

	}

}
