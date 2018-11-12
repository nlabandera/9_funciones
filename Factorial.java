import java.util.*;
public class Factorial {
	
	public static double factorial (double num) {
		
		 double factorial=1;
		
		 while (num!=0) {
			factorial = factorial*num;
			num--;
		 }

		return factorial;
		
	}

	public static void main(String[] args) {
		int n;
		
		do {
		
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca numero: ");
			n = teclado.nextInt();
			
			
			System.out.println("el factorial de "+n+" es: "+factorial(n));
		}
		while(n!=0);
		
		
		
	}

}
