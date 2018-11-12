import java.util.*;
public class Factorial2 {
	public static double factorial (double num) {
		
		 //double factorial;
		 if(num==0)
			 return 1;
		 else
			 return num*(factorial(num-1));
		
	}

	public static void main(String[] args) {
		int n;
		
		do {
		
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca numero: ");
			n = teclado.nextInt();
			
			
			System.out.println("El factorial de "+n+" es: "+factorial(n));
		}
		while(n!=0);
		
		
		
	}

}