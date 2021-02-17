package task02;

import java.util.Scanner;

public class Task02DaliborJelicanin {

	// napisati program koji od n unetih brojeva prikazuje najveci broj koji je
	// deljiv sa zbirom svojih cifara

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete? ");
		int n = scanner.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			int number = scanner.nextInt();
			int sumOfDigit = sumOfDigit(number);
			if (divisble(number, sumOfDigit)) {
				if (number > max) max = number;
			}
		}
		if (max == Integer.MIN_VALUE) System.out.println("Niste uneli broj koji je deljiv sa zbirom svojih cifara");
		else System.out.println("Najveci broj koji je deljiv sa zbirom svojih cifara: " + max);
		
		scanner.close();
	}

	static int sumOfDigit(int x) {
		int sum = 0;
		
		do {
			int digit = x % 10;
			sum += digit;
			x = x / 10;
		} while(x!=0);			
				
		return sum;
	}

	static boolean divisble(int divisor, int devider) {	
		if (devider == 0) return false;
		return divisor % devider == 0;
	}
	
}







