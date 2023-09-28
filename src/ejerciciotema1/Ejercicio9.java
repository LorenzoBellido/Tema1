package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Variable donde guardar numero1
		int numero1;
		
		// Variable donde guardar numero2
		int numero2;
		
		// Variable donde guardar el resultado
		boolean resultado;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		// Pido un numero
		System.out.println("Numero 1: ");
		// Leemos el numero1 del teclado
		numero1 = sc.nextInt();
		
		// Pido otro numero
		System.out.println("Numero 2: ");
		//Leemos el numero 2 del teclado
		numero2 = sc.nextInt();
		
		// Realizo la condicional
		resultado = numero1==numero2? true:false;
		
		// Muestro el resultado final
		System.out.println(resultado);
	}

}
