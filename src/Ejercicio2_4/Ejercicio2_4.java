package Ejercicio2_4;

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
		
	
		
		System.out.println("Biblioteca: ");
		biblioteca = sc.nextBoolean();
		
		System.out.println("Llueve: ");
		llueve = sc.nextBoolean();
		
		System.out.println("Tareas finalizadas: ");
		tareasfin = sc.nextBoolean();
		
		salir = biblioteca || !llueve && tareasfin;
		
		System.out.println(salir);

	}

}
