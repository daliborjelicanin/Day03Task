package task08;

/*
 * Napisati metodu koja dodaj el.u niz tako da niz ostane sortiran.
 */

class Array {

	static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	static int[] addInSort(int[] x, int number) {
		int y[] = new int[x.length + 1];
        int i;
        
        for (i = 0; i < x.length; i++) {
            if (x[i] < number) y[i] = x[i];                
            else             	
            	break;
        }
        
        for (int j = i; j < x.length; j++) {
        	y[j+1] = x[j];
        }
        
        y[i] = number;
        return y;
	}
}

public class Task08DaliborJelicanin {

	public static void main(String[] args) {

		int[] y = {1,2,5};

		Array.print(y);
		y = Array.addInSort(y, 5);
		y = Array.addInSort(y, 3);
		y = Array.addInSort(y, -10);
		Array.print(y);
	}

}
