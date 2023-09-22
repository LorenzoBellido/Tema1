package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {
		// Variables
		String nombre;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		System.out.println("Hola " + ANSI_RED + nombre + ANSI_RESET + ", tienes " + ANSI_RED + edad + ANSI_RESET + " años, ¡qué mayor eres!");

		
		sc.close();
		
	}

}
