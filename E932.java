import java.util.*;
public class E932 {
	
	public static int numeroMenor (int x, int y) {
		
		if(x<y){
			return x;
		}
		
		else {
			return y;
		}
			
			
	}
	
	/*public static void saludar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Esbriba primer número: ");
		int x= teclado.nextInt();
		System.out.println("Esbriba segundo número: ");
		int y=teclado.nextInt();
		
		
	}*/

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Esbriba primer número: ");
		int x= teclado.nextInt();
		System.out.println("Esbriba segundo número: ");
		int y=teclado.nextInt();
		
		System.out.println("El numero menor es: "+numeroMenor(x,y)); 
		

	}

}
