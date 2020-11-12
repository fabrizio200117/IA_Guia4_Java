package Senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] numero = new int [5];
		
		for (int x = 0; x <  numero.length; x++) {
			System.out.print("Ingrese número " + (x + 1) + ": ");
			numero[x] = scn.nextInt();
		}
		
		int aux = 0;
			
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length - 1; j++) {
				if (numero[j] < numero [j + 1]) {
					aux = numero[j];
					numero [j] = numero [j + 1];
					numero [j + 1] = aux;
				}
			}
		}
		
		System.out.println("\n==============================================");
		System.out.println("    Números Ordenados en Forma Descendente	");
		System.out.println("==============================================");
		for (int x = 0; x < numero.length; x++) {
			System.out.println("Número " +(x + 1) + ": " + numero[x]);
	
		}

	}

}