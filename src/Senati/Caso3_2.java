package Senati;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3_2 {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//int          Integer
		//double       Double
		//float        Float
		//boolean      Boolean
		//String       String 
		
		Integer [] numero = new Integer[5];
		
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Ingrese numero" + (x + 1) + ": ");
			numero [x] = scn.nextInt();
			
		}
		
		// Ordenar el array de forma Ascendente
		Arrays.sort(numero);
		
		System.out.println("\n------------------------------------------------");
		System.out.println("      Numero Ordenados en Forma Ascendente     ");
		System.out.println("------------------------------------------------");
		
		for (int x = 0; x < numero.length; x++) {
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);	
		}
		// Ordenar el array de forma Descendente
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\n------------------------------------------------");
		System.out.println("     Numero Ordenados en Forma Desscendente    ");
		System.out.println("------------------------------------------------");
		for (int x = 0; x < numero.length; x++) {
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);	
		}
		
		


	}

}
