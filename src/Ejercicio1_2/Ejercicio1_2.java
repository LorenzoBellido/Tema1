package Ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1_2 {

	public static void main(String[] args) {
		float manzanas;
		float peras;
		final float preciomanzana = 2.35f;
		final float preciopera = 1.95f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kilos de manzanas: ");
		manzanas = sc.nextFloat();
		
		System.out.println("Kilos de peras: ");
		peras = sc.nextFloat();
		
		System.out.println("Precio final: " + (manzanas*preciomanzana + peras*preciopera));
		
	}

}
