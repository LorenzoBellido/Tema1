package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		// y=ax2+bx+c
		// Variable donde guardar a
		double a;
		
		// Variable donde guardar b
		double b;
		
		// Variable donde guardar c
		double c;
		
		// Variable donde guardar x
		double x;
		
		// Variable donde guardar y
		double y;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el número a
		System.out.println("Número a: ");
		
		// Leemos el a del teclado
		a = sc.nextFloat();
		
		// Pido el número a
		System.out.println("Número b: ");
				
		// Leemos el b del teclado
		b = sc.nextFloat();
				
		// Pido el número c
		System.out.println("Número c: ");
				
		// Leemos el x del teclado
		c = sc.nextFloat();
	
		// Pido el número y
		System.out.println("Número x: ");
				
		// Leemos el a del teclado
		x = sc.nextFloat();
		
		// Realizo la operación
		y = (a*Math.pow(x, 2))+(b*x)+c;
		
		// Muestro el resultado
		System.out.println("La Y es; " + y);
		
		// Cierro el scanner
		sc.close();
	}

}
