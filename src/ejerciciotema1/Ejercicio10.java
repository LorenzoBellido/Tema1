package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Variable donde guardar los metros
		double metros;
		
		// Variable donde guardar los centimetros
		double centimetros;
		
		// Scanner para leer el teclado
		Scanner sc = new  Scanner(System.in);
		
		
		//Pido la distancia en metros
		System.out.println("La distancia en metros es: ");
		// Leemos metros en el teclado
		metros = sc.nextDouble();
		
		// Convertimos los metros en centimetros
		centimetros = metros*100;
		
		// Tomamos la parte entera de los centimetros
		centimetros = (int)centimetros;
		
		// Muestro el resultado
		System.out.println("La distancia es de: " + centimetros + "cm.");

	}

}
