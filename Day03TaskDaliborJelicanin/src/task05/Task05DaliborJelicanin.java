package task05;

public class Task05DaliborJelicanin {

	//napisati metodu koja ispituje da li je niz palindrom
	
	static void isArrayAPalindrome(int x[]) {  
        boolean flag = true; 
        for (int i = 0; i <= x.length / 2; i++) { 
  
            if (x[i] != x[x.length - i - 1]) { 
            	flag = false; 
                break; 
            } 
        } 
  
        if (flag == false) 
        	System.out.println("Niz NIJE palindrom"); 
        else 
        	System.out.println("Niz JE palindrom"); 
    } 
	
	public static void main(String[] args) {
		
		int[] x = new int[] {1,3,5,5,3,1,1};
		isArrayAPalindrome(x);

	}

}
