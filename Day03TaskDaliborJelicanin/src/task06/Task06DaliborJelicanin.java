package task06;

/*
 * napisati metodu koja pomera sve el.niza za jedno mesto u desno.
 * 1 2 3 -> 3 1 2
 * 
 * napisati metodu koja pomera sve el.niza za N mesta u levo
 */

public class Task06DaliborJelicanin {

	static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	// napisati metodu koja pomera sve elemente niza za jedno mesto u desno
	
	static void shiftRight(int[] x) {
		int pom = x[x.length-1];
		
		for (int i = x.length-1; i > 0; i--) {
			x[i] = x[i-1];
		}
		x[0] = pom;
	}
	
	// jedno mesto u levo
	
	static void shiftLeft(int[] x) {
		int pom = x[0];
		
		for (int i = 0; i < x.length-1; i++) {
			x[i] = x[i+1];
		}
		x[x.length-1] = pom;
	}
	
	// napisati metodu koja pomera sve el niza za N mesta u levo
		
	static void shiftLeftByN(int[] x, int n) {
		for (int i = 0; i < n; i++) {
			shiftLeft(x);
		}
	}
	
	public static void main(String[] args) {
		
		int[] x = new int[] {1,2,3,4,5};
		print(x);
		//shiftLeft(x);
		//shiftRight(x);
		shiftLeftByN(x, 2);
		print(x);
	}

}
