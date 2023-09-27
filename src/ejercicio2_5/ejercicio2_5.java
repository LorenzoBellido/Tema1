package ejercicio2_5;

import java.util.Scanner;

public class ejercicio2_5 {

	public static void main(String[] args) {

		// Variable donde guardar el primer trimestre
		int primerTrimestre;
		
		// Variable donde guardar el segundo trimestre
		int segundoTrimestre;
		
		// Variable donde guardar el tercer trimestre
		int tercerTrimestre;
		
		// Variable donde guardar la nota final
		float notaFinal;
		
		// Variable donde guardar la nota académica
		float notaAcademica;

		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		// Pido la nota del primer trimestre
		System.out.println("Nota del primer trimestre: ");
		
		// Leemos primerTrimestre del teclado
		primerTrimestre = sc.nextInt();
		
		// Pido la nota del segundo trimestre
		System.out.println("Nota del segundo trimestre: ");
		
		// Leemos segundoTrimestre del teclado
		segundoTrimestre = sc.nextInt();
		
		// Pido la nota del tercer trimestre
		System.out.println("Nota del tercer trimestre: ");
		
		// Leemos tercerTrimestre del teclado
		tercerTrimestre = sc.nextInt();
		
		// Calculamos la nota academica
		notaAcademica = (float)(primerTrimestre + segundoTrimestre + tercerTrimestre)/3;
		
		// Mostramos la nota académica
		System.out.println("Su nota académica es: " + notaAcademica);
		
		// Calculamos la nota final
		notaFinal = notaAcademica + 0.5f;
		
		// Mostramos la nota final
		System.out.println("Su nota académica es: " + (int)notaFinal);
		
		
		// Cerrar Scanner
		sc.close();
	}

}
