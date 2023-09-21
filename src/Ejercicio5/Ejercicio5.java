package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables 
		int radio;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.print("Introduzca el radio: ");
		radio = sc.nextInt();
		System.out.println("La longitud de la circunferencia es: " + 2*Math.PI*radio);
		System.out.print("El área de la circunferencia es: " + Math.PI*Math.pow(radio, 2));
		// Cierre
				sc.close();
	}

}


// Math.pow(base, exponente)