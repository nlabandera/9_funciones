import java.util.*;

public class Sumatorio {
	public static int sumatorio (int num) {
		
		 int sumatorio=1;
		
		 while (num!=0) {
			sumatorio = sumatorio+num;
			num--;
		 }

		return sumatorio;
	}

	public static void main(String[] args) {
		
		int n;
		
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca numero: ");
			n = teclado.nextInt();
			
			System.out.println("El sumatorio de "+n+" es: " +sumatorio(n));
		}
		while (n!=0);
		

	}

}
