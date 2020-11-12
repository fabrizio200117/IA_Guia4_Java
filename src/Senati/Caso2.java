package Senati;

import java.util.Scanner;

public class Caso2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] numero = new int[5];
		
		int num_mayor = 0, num_menor = 0, suma = 0;
			
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Ingrese numero: " + (x + 1) + ": ");
			numero[x] = scn.nextInt();
			
			if (x ==0) {
				num_mayor = numero[0];
				num_menor = numero[0];
			}
			if (numero[x] > num_mayor) 
				num_mayor = numero[x];
		    
			if (numero[x] < num_menor)
				num_menor = numero[x];
			
			suma += numero[x];		
		} 
		System.out.println("\n======================");
		System.out.println("R E S U L T A D O S");
		System.out.println("Numero mayor.....: " + num_mayor);
		System.out.println("Numero menor.....: " + num_menor);
	}


}
