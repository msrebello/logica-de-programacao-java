package structure.conditional;

import java.util.Locale;
import java.util.Scanner;

public class Conditional08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();

		if (salary <= 2000.00) {
			System.out.println("Isento.");
		}
		else {		
			System.out.println("R$ " + String.format("%.2f", incomeTax(salary)));
		}

		sc.close();
	}

	static double incomeTax(double salary) {
		double tax = 0.0;

		if (salary <= 3000.0) {
			tax = (salary - 2000.0) * 0.08;
		} 
		else if (salary <= 4500.0) {
			tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		} 
		else {
			tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		return tax;
	}
}