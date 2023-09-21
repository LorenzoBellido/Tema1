package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		//Declaro la edad como entera
		int edad;//,edad2
		
		Scanner sc = new Scanner(System.in);
		
		// Intrucciones
		//Pido una edad
		System.out.print("Introduzca su edad: "); 
		edad = sc.nextInt();
		//Sumo 1 a la edad
		edad++;
		//edad2 = edad + 1;
		
		//Devuelvo la edad que me ha escrito +1
		System.out.print("Su edad el año que viene será: " + edad);
		
		// Cierre
		sc.close();

	}

}
