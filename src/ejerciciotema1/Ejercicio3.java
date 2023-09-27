package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Variable donde guardar el número 1
		int numero1;
		
		// Variable donde guardar el numero 2
		int numero2;
		
		// Variable donde guardar la cantidad a sumar
		int sumar;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el primer número
		System.out.println("Número 1: ");
		
		// Leemos el número del teclado
		numero1 = sc.nextInt();
		
		// Pido el segundo número
		System.out.println("Número 2: ");
				
		// Leemos el número del teclado
		numero2 = sc.nextInt();
		
		// Realizo la operación del módulo y lo guardo en sumar
		sumar = 7-(numero1%numero2);
		
		// Muestro la solución
		System.out.println("Para que " + numero1 + " sea multiplo de " + numero2 + " le tienes que sumar " + sumar);
	}

}
