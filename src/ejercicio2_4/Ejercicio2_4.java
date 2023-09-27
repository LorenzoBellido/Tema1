package ejercicio2_4;

import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {

		//Variables
		// Variable boolean salir
		boolean salir;
		// Variable boolean biblioteca
		boolean biblioteca;
		// Variable boolean llueve
		boolean llueve;
		// Variable boolean tareasfin
		boolean tareasfin;
		
		// Scanner para leer teclado
		Scanner sc = new Scanner(System.in);
		
		// Pregunto si voy a la biblioteca
		System.out.println("Voy a la biblioteca: ");
		// Leemos biblioteca del teclado
		biblioteca = sc.nextBoolean();
		
		// Pregunto si está lloviendo
		System.out.println("Está lloviendo: ");
		// Leemos llueve del teclado
		llueve = sc.nextBoolean();
		
		// Pregunto si voy he hecho las tareas
		System.out.println("He acabado las tareas: ");
		// Leemos tareas del teclado
		tareasfin = sc.nextBoolean();
		
		// Realizo las operaciones lógicas
		salir = biblioteca || (!llueve && tareasfin);
		
		// Muestro el resultado
		System.out.println("Puedo salir: " + salir);
		
		// Cierro el Scanner
		sc.close();

	}

}
