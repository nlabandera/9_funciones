import java.io.*;

public class Ejemplo_1 {

	public static void escribirLongCircunf( int radio ) { 
        double longCircunf = 2 * 3.1415926535 * radio;
        double longConDosDecimales = 
            Math.round(longCircunf * 100) / 100.0;
        System.out.println( "La longitud de la circunferencia de radio " 
            + radio + " es " + longConDosDecimales); 
    }
 
    public static void main( String args[] ) { 
        escribirLongCircunf(4);
        escribirLongCircunf(6);
        escribirLongCircunf(8);
        escribirLongCircunf(10);
        escribirLongCircunf(111);
    } 
} 
 