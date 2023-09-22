package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Variables
		int pesetas;
		int euro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor en pesetas: ");
		pesetas = sc.nextInt();
		euro = pesetas / 166;
		System.out.println("Valor en euros: " + euro);
		
		
		sc.close();
	}

}
