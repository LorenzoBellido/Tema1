package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variables
		//Varaible donde guardar el numero 1
		int numero;
		//Varaible donde guardar el numero 2
		int numero2;
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		//Pido 2 números
		System.out.println("Introduzca 2 números: ");
		// Leemos el radio del teclado
		numero = sc.nextInt();
		// Leemos el radio del teclado
		numero2 = sc.nextInt();
		
		// Realizo las operaciones de suma, resta, multiplicación y división
		System.out.println("Suma: " + (numero + numero2));
		System.out.println("Resta: "+ (numero - numero2));
		System.out.println("Multiplicación: "+ (numero * numero2));
		System.out.println("División: "+ (numero / numero2));
	// Cierro el Scanner
	sc.close();
	
	}
	
}
