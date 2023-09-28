package ejerciciotema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Variable donde guardar numero
		int numero;
				
		// Variable donde guardar los segundos
		int segundos;
		
		// Variable donde guardar los minutos
		int minutos;
		
		// Variable donde guardar los horas
		int horas;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		// Pido un número para convertir
		System.out.println("Número para convertir: ");
		// Leemos los segundos del teclado
		numero = sc.nextInt();
		
		//Realizo las operaciones para obtener las horas
		horas = numero/3600;
		
		// Muestro las horas
		System.out.print( horas + "h: ");
		
		//Realizo las operaciones para obtener los minutos
		minutos = numero%3600;
		
		//Realizo las operaciones para obtener los segundos
		segundos = minutos%60;
		
		// Paso los minutos a enteros
		minutos = minutos/60;
		
		// Muestro los minutos
		System.out.print( minutos + "min: ");
		
		//Muestro los segundos
		System.out.print( segundos + "s. ");
		
		
		// Cierro el Scanner
		sc.close();
		

	}

}
