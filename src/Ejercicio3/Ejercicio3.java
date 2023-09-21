package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable
		// Declaro como enteras las variables de los años y edad
		int añoact;
		int añonac;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		// Instrucciones
		// Pido el año actual
		System.out.print("¿En qué año estamos? "); //Muestro un mensaje en la consola
		añoact = sc.nextInt();
		
		//Pido el año de nacimiento
		System.out.print("¿En qué año naciste? "); //Muestro un mensaje en la consola
		añonac = sc.nextInt();
		// Calculo la edad restando el año actual con el año de nacimiento
		edad = añoact - añonac;
		
		// Muestro su edad actual
		System.out.print("Tu edad es: " + edad);
		// Cierre
		sc.close();
	}

}
