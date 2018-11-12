/**
 * 
 * Programa que borra 5 líneas de pantalla
 *
 */
public class E911 {
	
	public static void borrarPantalla() {
		
		int i;
		
		for(i=1 ; i<=5 ; i++) {
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hola");
		borrarPantalla();
		System.out.println("Agur");

	}

}
