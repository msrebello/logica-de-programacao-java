package structure.repetitive;

import java.util.Scanner;

public class Repetition05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i < x; i++) {
			int num = sc.nextInt();
			if (num < 10 || num > 20) {
				out++;
			}
			else {
				in++;
			}
		}
		
		System.out.println(in + " in" + "\n" + out +" out" );
		

		sc.close();

	}

}
