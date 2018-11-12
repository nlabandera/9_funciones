import java.util.*;
public class E933 {
	
	public static char primeraLetra(String palabra) {
		
		return palabra.charAt(0);
		
	}

	public static char ultimaLetra(String palabra) {
		
		return palabra.charAt(palabra.length()-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba una palabra: ");
		String p= teclado.nextLine();
	
	System.out.println(primeraLetra(p));
	System.out.println(ultimaLetra(p));


		
	}

}
