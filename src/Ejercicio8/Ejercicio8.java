package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {
		// Variables
		// Variable donde guardar nombre
		String nombre;
		// Variable donde guardar edad
		int edad;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el nombre
		System.out.println("Introduzca su nombre: ");
		// Leemos el nombre del teclado
		nombre = sc.nextLine();
		// Pido la edad
		System.out.println("Introduzca su edad: ");
		// Leemos la edad del teclado
		edad = sc.nextInt();
		
		// Muestro el mensaje final
		System.out.println("Hola " + ANSI_RED + nombre + ANSI_RESET + ", tienes " + ANSI_RED + edad + ANSI_RESET + " años, ¡qué mayor eres!");

		// Cierro el Scanner
		sc.close();
		
	}

}
