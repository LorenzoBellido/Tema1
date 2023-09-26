package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Variables
		// Variable donde guardar iva
		final int iva = 21;
		// Variable donde guardar precio
		float precio;
		// Variable donde guardar preciof
		float preciof;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un precio
		System.out.println("Introduza un precio: ");
		// Leemos el precio del teclado
		precio = sc.nextFloat();
		
		// Realizo la operación
		preciof = precio + (precio * iva/100) ;
		// Muestro el precio final
		System.out.println("Su precio final es: " + preciof);

	}

}
