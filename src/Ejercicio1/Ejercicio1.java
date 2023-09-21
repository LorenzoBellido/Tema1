package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		// Instrucciones
		System.out.println("Introduzca un número:");
		numero = sc.nextInt();
		
		System.out.println("Su número es: " + numero);

		// Cierre
		sc.close();
	}

}
