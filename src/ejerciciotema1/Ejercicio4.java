package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable donde guardar el área
		float base;
		
		// Variable donde guardar la altura
		float altura;
		
		// Variable donde guardar el área
		float area;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido la base del triangulo
		System.out.println("Base del triángulo: ");
		
		// Leemos la base del teclado
		base = sc.nextFloat();
		
		// Pido la altura del triangulo
		System.out.println("Altura del triángulo: ");
		
		// Leemos las altura del teclado
		altura = sc.nextFloat();
		
		
		// Realizo la operación del área
		area = (base*altura)/2;
		
		// Muestro la solución
		System.out.println("El área del triangulo es: " + area);
		
		// Cerramos el Scanner
		sc.close();
	}

}
