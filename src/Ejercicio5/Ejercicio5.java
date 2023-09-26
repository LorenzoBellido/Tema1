package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables 
		// Variable donde guardar el radio
		float radio;
		// Variable donde guardar la longitud
		double longitud;
		// Variable donde guardar la área
		double area;
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		// Pido el radio del círculo
		System.out.print("Introduzca el radio: ");
		
		// Leemos el radio del teclado
		radio = sc.nextFloat();
		
		// Calculo la longitud
		longitud = 2*Math.PI*radio;
		
		// Muestro la longitud
		System.out.println("La longitud de la circunferencia es: " + 2*Math.PI*radio);
		
		//Calculo el área
		area = Math.PI*Math.pow(radio, 2);
		
		// Muestro el área
		System.out.print("El área de la circunferencia es: " + Math.PI*Math.pow(radio, 2));
		
		// Cerramos el scanner
				sc.close();
	}

}


