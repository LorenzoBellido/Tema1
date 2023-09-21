package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable
		int añoac;
		int añobr;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		// Instrucciones
		System.out.print("¿En qué año estamos? ");
		añoac = sc.nextInt();
		
		System.out.print("¿En qué año naciste? ");
		añobr = sc.nextInt();
		
		edad = añoac - añobr;
		
		System.out.print("Tu edad es: " + edad);
		// Cierre
		sc.close();
	}

}
