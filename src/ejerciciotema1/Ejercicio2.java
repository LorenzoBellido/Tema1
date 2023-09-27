package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde guardar un número
		int numero;
		
		// Variable donde guardar el resto
		int resto;
		
		// Variable donde guardar la cantidad a sumar
		int sumar;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número
		System.out.println("Número: ");
		
		// Leemos el número del teclado
		numero = sc.nextInt();
		
		// Realizo la operación del módulo y lo guardo en 
		resto = (numero%7);
		
		//resto != 0 
		
		// Muestro la solución
		System.out.println("Para ser multiplo de 7 le tienes que sumar: " + sumar);
	}

}
