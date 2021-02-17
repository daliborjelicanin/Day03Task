package task01;

import java.util.Scanner;

public class Task01DaliborJelicanin {

	// napisati program koji od N untih brojeva pronalazi najveci
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = scanner.nextInt();
		int number, max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Unesite %d. broj: \n", i+1);
			number = scanner.nextInt();
			if (number > max) max = number;
		}
		
		System.out.printf("Najveci broj je: %d", max);
		
		scanner.close();
	}

}
