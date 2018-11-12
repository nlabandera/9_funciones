import java.io.*;

class Ejemplo_2 { 
 
    public static double longCircunf( int radio ) { 
        double longitud = 2 * 3.1415926535 * radio;
        double longConDosDecimales = 
            Math.round(longitud * 100) / 100.0;
        return longConDosDecimales;
    }
 
    public static double superfCirculo( int radio ) { 
        double superf = 3.1415926535 * radio * radio;
        double superfConDosDecimales = 
            Math.round(superf * 100) / 100.0;
        return superfConDosDecimales;
    }
 
    public static void saludar( ) {         
        System.out.println( "Bienvenido"); 
        System.out.println( "Comenzamos..."); 
    }
 
    public static void escribirLongCircunf( int radio ) {       
        System.out.println( "La longitud de la circunferencia " +
            "de radio " + radio + " es " + longCircunf( radio )); 
    }
 
    public static void main( String args[] ) { 
        saludar();
        escribirLongCircunf(4);
        escribirLongCircunf(6);
        escribirLongCircunf(8);
        escribirLongCircunf(10);
        escribirLongCircunf(111);
        System.out.println( "La superficie del círculo " +
            "de radio 5 es " + superfCirculo(5)); 
    } 
} 