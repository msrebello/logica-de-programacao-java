package structure.sequential;
import java.util.Locale;
import java.util.Scanner;

public class Sequencial06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

		System.out.println("TRIANGLE: " + String.format("%.3f", triangleArea(A, C)));
		System.out.println("CIRCLE: " + String.format("%.3f", circleArea(C)));
		System.out.println("TRAPEZE: " + String.format("%.3f", trapezeArea(A, B, C)));
		System.out.println("SQUARE: " + String.format("%.3f", squareArea(B)));
		System.out.println("RETANGLE: " + String.format("%.3f", retangleArea(A, B)));

		sc.close();
	}

	static double retangleArea(double a, double b) {
		return a * b;
	}

	static double squareArea(double b) {
		return Math.pow(b, 2);
	}

	static double trapezeArea(double a, double b, double c) {
		return ((a + b) * c) / 2;
	}

	static double circleArea(double c) {
		return Math.pow(c, 2) * Math.PI;
	}

	static double triangleArea(double a, double c) {
		return (a * c) / 2;
	}

}
