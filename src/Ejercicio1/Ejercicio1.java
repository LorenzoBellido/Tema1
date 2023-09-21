package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		//Declaro el número como entero
		int numero;
		Scanner sc = new Scanner(System.in);
		
		// Instrucciones
		//Pido un número
		System.out.println("Introduzca un número:"); 
		numero = sc.nextInt();
		//Devuelvo el mismo número que ha introucido
		System.out.println("Su número es: " + numero);

		// Cierre
		sc.close();
	}

}
