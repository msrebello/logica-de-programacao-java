package structure.repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Repetition01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Invalid password");
			password = sc.nextInt();
			
		}
		System.out.println("Access Allowed");
		sc.close();
	}

}
