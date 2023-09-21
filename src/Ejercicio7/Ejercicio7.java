package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static void main(String[] args) {
		//Variables
		//Declaro las variables de nombre, direccion y telefono
		String nombre;
		String direccion;
		int telefono;
		
		
		Scanner sc = new Scanner(System.in);
		
		//Instruccones
		//Pido el nombre, la direccion y el telefono
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dirección: ");
		direccion = sc.nextLine();
		System.out.print("Teléfono: ");
		telefono = sc.nextInt();
		
		System.out.println("Datos personales: ");
		System.out.println( "Nombre: "  +  ANSI_RED + nombre + ANSI_RESET );
		System.out.println("Dirección: " +ANSI_RED + direccion + ANSI_RESET);
		System.out.println("Teléfono: " + ANSI_RED + telefono + ANSI_RESET);
		
	}

}
