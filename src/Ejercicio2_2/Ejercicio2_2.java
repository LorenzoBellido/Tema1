package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		
		//Variables
		// Variable donde guardar edad
		int edad;
		// Variable boolean
		boolean mayor;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pregunto su edad
		System.out.println("Su edad: ");
		// Leemos la edad del teclado
		edad = sc.nextInt();
		
		// Condición para ser mayor de edad
		mayor = true && edad>=18;
		// Muestro si es mayor de edad o no
		System.out.println("Eres mayor de edad: " + mayor);
		
		// Cierro el Scanner
		sc.close();

	}

}
