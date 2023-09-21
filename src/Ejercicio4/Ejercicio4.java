package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		// Declaro las notas como enteras
		int nota1, nota2;
		// Declaro la media como float porque puede tener decimales
		float media;
		Scanner sc = new Scanner(System.in);
		// Instrucciones
		// Pido las dos notas
		System.out.print("Introduzca 2 notas: ");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		// Realizo la media aritmética con el cast float para que sea en decimal
		media = (float) (nota1+nota2)/2;
		System.out.println(media);
		// Cierre
				sc.close();
	}

}
