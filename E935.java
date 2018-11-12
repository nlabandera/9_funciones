import java.util.*;
public class E935 {
	
	public static boolean esPrimo(int n) {
		
		if (n%2==0) {
			return false;
		}
		
		else return true;
			
		
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
