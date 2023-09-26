package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {

		// Variables
		// Variable donde guardar el numero
		int numero;
		// Variable boolean
		boolean espar;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un numero
		System.out.println("Pon un número: ");
		// Leemos el numero del teclado
		numero = sc.nextInt();
		// Realizo la operación
		espar = true && (numero % 2 == 0);
		// Muestro el resultado
		System.out.println("Es par: " + espar);
		
		// Cierro el Scanner
		sc.close();
	}

}
