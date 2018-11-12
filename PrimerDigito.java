import java.util.Scanner;

public class PrimerDigito {
	
		public static int primerNumero(int numero) {
			
		
			return numero;
		}
		
		public static int primerNum(int num) {
		
			int resto=0;
			while (num>0) {
				
				resto=num%10;
				num=num/10;
			}
		return resto;
			
		}
		
		public static int ultimoNum(int num) {
			
			return num%10;
			
		}
		

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba número: ");
		int n= teclado.nextInt();
		

		//primerNum(n);
		System.out.println(primerNum(n));
		System.out.println(ultimoNum(n));
		

	}

}
