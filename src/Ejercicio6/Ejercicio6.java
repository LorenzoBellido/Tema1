package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variables
		int numero;
		int numero2;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		//Pido 2 números
		System.out.println("Introduzca 2 números: ");
		numero = sc.nextInt();
		numero2 = sc.nextInt();
		
		// Realizo las operaciones de suma, resta, multiplicación y división
		System.out.println("Suma: " + (numero + numero2));
		System.out.println("Resta: "+ (numero - numero2));
		System.out.println("Multiplicación: "+ (numero * numero2));
		System.out.println("División: "+ (numero / numero2));
	}

}
