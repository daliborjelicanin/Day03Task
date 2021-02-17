package task04;

/*
Napisati metodu koja najveci el. niza zamenjuje sa brojem -1.
Ukoliko ih ima vise svim elementima (najvecim) postavlja vrednost -1.
*/

class Array {

	static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	static int max(int[] x) {
		int max = x[0];

		for (int i = 1; i < x.length; i++) {
			if (x[i] > max)
				max = x[i];
		}
		return max;
	}

	static void replaceMaxNumberWithMinusOne(int[] x, int requestedNumber, int newNumber) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == requestedNumber)
				x[i] = newNumber;
		}
	}
}

public class Task04DaliborJelicanin {

	public static void main(String[] args) {

		int[] x = { 1, 5, 4, 7, 5, 1, 7 };
		Array.print(x);
		Array.replaceMaxNumberWithMinusOne(x, Array.max(x), -1);
		Array.print(x);
	}
}
