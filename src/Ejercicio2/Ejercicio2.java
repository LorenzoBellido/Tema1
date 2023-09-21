package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		int edad;//,edad2
		
		Scanner sc = new Scanner(System.in);
		
		// Intrucciones
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
		edad++;
		//edad2 = edad + 1;
		
		System.out.print("Su edad el año que viene será: " + edad);
		
		// Cierre
		sc.close();

	}

}
