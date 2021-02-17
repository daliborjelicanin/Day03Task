package task07;

public class Task07DaliborJelicanin {

	static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	// napisati metodu koja vrsi inverziju niza
	
	static void reverse(int[] x) {
		
		int j = x.length;
		int temp;
		
		for (int i = 0; i < x.length/2; i++) {
			temp = x[j-1];
			x[j-1] = x[i];
			x[i] = temp;
			j--;
		}
		
		print(x);
	}
	
	public static void main(String[] args) {
		
		int[] x = new int[] {1,2,3,4,5,6,7,8,9};
		print(x);
		reverse(x);
		//print(x);
		
	}

}
