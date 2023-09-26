package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static void main(String[] args) {
		//Variables
		//Variable donde guardar el nombre
		String nombre;
		//Variable donde guardar la dirección
		String direccion;
		//Variable donde guardar el teléfono
		int telefono;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Instruccones
		//Pido el nombre
		System.out.print("Nombre: ");
		//Leemos el nombre del teclado
		nombre = sc.nextLine();
		// Pido la dirección
		System.out.print("Dirección: ");
		// Leemos la dirección
		direccion = sc.nextLine();
		// Pido el teléfono
		System.out.print("Teléfono: ");
		// Leemos el telefono del teclado
		telefono = sc.nextInt();
		
		// Muestro los datos recogidos
		System.out.println("Datos personales: ");
		System.out.println( "Nombre: "  +  ANSI_RED + nombre + ANSI_RESET );
		System.out.println("Dirección: " +ANSI_RED + direccion + ANSI_RESET);
		System.out.println("Teléfono: " + ANSI_RED + telefono + ANSI_RESET);
		
		
		// Cierro el Scanner
		sc.close();
	}

}
