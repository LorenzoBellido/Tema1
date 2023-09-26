package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Variables
		// Variable donde guardar pesetas
		int pesetas;
		// Variable donde guardar euro
		int euro;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido las pesetas
		System.out.println("Valor en pesetas: ");
		// Leemos las pesetas del teclado
		pesetas = sc.nextInt();
		// Realizo la operación de conversión
		euro = pesetas / 166;
		// Muestro el valor en euros
		System.out.println("Valor en euros: " + euro);
		
		// Cierro el Scanner
		sc.close();
	}

}
