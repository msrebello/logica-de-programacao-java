package structure.repetitive;

import java.util.Scanner;

public class Repetition03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcohol = 0, gasoline = 0, diesel = 0;
		int cod = sc.nextInt();

		while (cod != 4) {
			
				if (cod == 1) {
					alcohol++;
				} 
				else if (cod == 2) {
					gasoline++;
				} 
				else if (cod == 3) {
					diesel++;
				}
				
				cod = sc.nextInt();
			}

		output(alcohol, gasoline, diesel);

		sc.close();
	}

	static void output(int a, int g, int d) {
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
	}

}
