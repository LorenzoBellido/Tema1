package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Variable donde guardar las entradas infantiles
		float infantiles;
		
		// Variable donde guardar las entradas adultas
		float adultas;
		
		// Constante donde guardar el precio de infantiles
		final float PRECIO_INFANTILES = 15.50f;
		
		// Constante donde guardar el precio de adultas
		final float PRECIO_ADULTAS = 20f;
		
		// Constante donde guardar el descuento
		final float DESCUENTO = 0.05f;
		
		// Variable donde guardar el precio final
		float precio;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el número de entradas infantiles
		System.out.println("Entradas infantiles: ");
		
		// Leemos infantiles del teclado
		infantiles = sc.nextInt();
		
		// Pido el número de entradas adultas
		System.out.println("Entradas adultas: ");
				
		// Leemos adultas del teclado
		adultas = sc.nextInt();
		
		// Precio de las entradas infantiles
		infantiles = infantiles * PRECIO_INFANTILES;
		
		// Precio de las entradas adultas
		adultas = adultas * PRECIO_ADULTAS;
		
		// Precio total 
		precio = infantiles + adultas;
		
		// Reviso si se puede añadir el descuento
		precio = precio>=100? precio - (precio * DESCUENTO): precio;
		
		// Muestro el precio final
		System.out.println("El precio total es: " + precio + "€");
		
		// Cierro el Scanner
		sc.close();
	}
	
}
