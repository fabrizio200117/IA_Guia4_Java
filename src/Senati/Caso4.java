package Senati;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Caso4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Integer[] numero = new Integer[5];
		
		for(int x = 0; x < numero.length; x++) {
			System.out.print("\nIngrese numero " + (x + 1) + ": ");
			numero[x] = scn.nextInt();
		}
		
		
		// Ordenar el array de forma Ascendente;
		Arrays.sort(numero);
		

		System.out.println("\n------------------------------------");
		System.out.println("Numeros ordenados de forma ascendente");
		System.out.println("-------------------------------------");
		
		for(int x=0;x<numero.length;x++) {
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
		}
		
		
		
		
		
		// Ordenar el array de forma Descendente;
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\n------------------------------------");
		System.out.println("Numeros ordenados de forma Descendente");
		System.out.println("-------------------------------------");
		
		for(int x=0;x<numero.length;x++) {
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
		}

	}
}
