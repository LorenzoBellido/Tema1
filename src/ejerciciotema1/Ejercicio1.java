package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Variable donde guardar un numero
		float numero;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número para redondear
		System.out.println("Número con decimales: ");
		
		// Leemos el numero del teclado
		numero = sc.nextFloat();
		
		// Realizamos la operacion de redondeo
		numero = numero + 0.5f;
		
		// Mostraos el numero redondeado
		System.out.println("Su numero redondeado es: " + (int)numero);

	}

}
