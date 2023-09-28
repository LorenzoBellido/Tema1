package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variable donde guardar los milimetros
		float a;
		
		// Variable donde guardar los centimetros
		float b;
		
		// Variable donde guardar los metros
		float c;
		
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		
		// Pido la distancia en milimetros
		System.out.println("Distancia en milimetros: ");
		// Leemos a del teclado
		a = sc.nextFloat();
		
		// Pido la distancia en centimetros
		System.out.println("Distancia en centimetros: ");
		// Leemos b del teclado
		b = sc.nextFloat();
		
		// Pido la distancia en metros
		System.out.println("Distancia en metros: ");
		// Leemos c del teclado
		c = sc.nextFloat();
		
		// Realizo las operaciones de conversion de milimetros a centimetros
		a = a / 10;
		
		// Realizo las operaciones de conversion de metros a centimetros
		c = c * 10;
		
		// Muestro la suma total en centimetros
		System.out.println("La distancia total es: " + (a+b+c));
		
		// Cierro el Scaner
		sc.close();

	}

}
