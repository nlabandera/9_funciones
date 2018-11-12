
import java.util.Scanner;
public class E921 {
	
	
	
	public static void rectangulo(/*int x, int y*/) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige el tamaño del rectangulo.");
		
		System.out.println("Escriba altura:");
		int alto = teclado.nextInt();
		
		System.out.println("Escriba anchura:");
		int ancho = teclado.nextInt();
		
		
		for(int x=1; x<=alto; x++) {
			for(int y=1; y<=ancho; y++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
	}


	public static void main(String[] args) {
		
		int alto=0;
		int ancho=0;
		
		rectangulo (/*alto, ancho*/);
		rectangulo (/*alto, ancho*/);
	}

}
