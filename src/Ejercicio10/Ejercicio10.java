package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Variables
		float iva = 0.21f;
		float precio;
		float preciof;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza un precio: ");
		precio = sc.nextFloat();
		
		preciof = precio - (precio * iva) ;
		System.out.println("Su precio final es: " + preciof);

	}

}
