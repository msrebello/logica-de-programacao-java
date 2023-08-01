package structure.sequential;
import java.util.Locale;
import java.util.Scanner;

public class Sequencial04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionarios = sc.nextInt();
		int horaTrabalhada = sc.nextInt();
		double valorHora = sc.nextDouble();

		System.out.println("NUMBER = " + numFuncionarios);
		double s = salary(horaTrabalhada, valorHora);
		System.out.println("SALARY = U$ " + String.format("%.2f", s));

		sc.close();
	}

	static double salary(int horaTrabalhada, double valorHora) {
		return horaTrabalhada * valorHora;
	}
}
