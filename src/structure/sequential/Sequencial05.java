package structure.sequential;
import java.util.Locale;
import java.util.Scanner;

public class Sequencial05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// piece 1
		int cod1 = sc.nextInt();
		int numbOf1 = sc.nextInt();
		double unityValue1 = sc.nextDouble();
		double totalValue1 = valuePerPiece(numbOf1, unityValue1);
		// piece 2
		int cod2 = sc.nextInt();
		int numbOf2 = sc.nextInt();
		double unityValue2 = sc.nextDouble();
		double totalValue2 = valuePerPiece(numbOf2, unityValue2);
		
		//total value of pieces
		double total = totalValue1 + totalValue2;
		System.out.println("VALOR A PAGAR: " + String.format("%.2F", total));

		sc.close();
	}

	static double valuePerPiece(int num, double value) {
		return num * value;
	}

}
