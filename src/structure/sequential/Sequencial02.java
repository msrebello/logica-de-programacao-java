package structure.sequential;
import java.util.Locale;
import java.util.Scanner;

public class Sequencial02 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double radios = sc.nextDouble();
		double a = area(radios);
		System.out.println("A = " + String.format("%.4f", a));

		sc.close();
	}

	static double area(double radios) {
		return Math.pow(radios, 2) * PI;
	}

}
