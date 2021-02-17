package task03;

import java.util.Scanner;

public class Task03DaliborJelicanin {

	// napisati program (metoda) koja racuna n-ti element fibonacijevog niza
	// F: 0, 1, 1, 2, 3, 5, 8, 13, 21...
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int n;
		do {
			System.out.println("Unesite n-ti element fibonacijevog niza: ");
			n = scanner.nextInt();
			if (n > 0) flag = true;
			else System.out.println("Uneli ste neispravan broj, pokusajte ponovo ");
		} while (!flag);
		
		
		System.out.printf("%d-ti element fibonacijevog niza je: %d", n, fibonaci(0, 1, n));
		
		scanner.close();
	}

	static int fibonaci(int el1, int el2, int n) {					
		int sum = 0;
		
		for (int i = 2; i < n; i++) {
			sum = el1 + el2;
			el1 = el2;
			el2 = sum;
		}
		
		if (n == 2) return 1;
		
		return sum;
	}
}
