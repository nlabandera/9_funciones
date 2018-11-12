import java.util.Scanner;

public class E935bis {

	public static boolean esPrimo(int n) {
		
		boolean esPrimo=true;
		int i;
		
		for (i=2 ; i<n ; i++) {
			if (n%i==0) {
				return false;
				
			}
			break; 
		}
		return true;
		


			
		
	}
	public static void main(String[] args) {

		System.out.println("Conoce si el numero que introduces es primo o no. \n"
				+"Si quieres salir, pulsa 0. \n");
		int n;
		
		do {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca numero: ");
			n = teclado.nextInt();
			
			
			System.out.println(esPrimo(n));
		
		}
		while(n!=0);

	}

}
