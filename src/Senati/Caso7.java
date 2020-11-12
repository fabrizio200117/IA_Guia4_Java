package Senati;

import java.util.Scanner;

public class Caso7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int [][] numeros = new int[3][4];
		int numero_mayor = 0, numero_menor = 1;
		float sumatoria = 0, promedio = 0;
		
		System.out.println("INGRESO DE VALORES");
		System.out.println("====================");
		
		for(int f = 0; f < numeros.length; f++) {
			System.out.println("\nFila: " + f);
			System.out.println("===============");
			for(int c = 0; c < numeros[0].length; c++) {
				// System.out.print("Numero F" + f + ",C" + c + ": ");
				System.out.print("Columna " + c + ": ");
				numeros [f][c] = scn.nextInt(); 
				
				sumatoria += numeros[f][c];
				
				if (f == 0 & c == 0) {
					numero_mayor = numeros[0][0];
					numero_menor = numeros[0][0];
				}else { 
					if (numeros[f][c] > numero_mayor) {
						numero_mayor = numeros[f][c];
					}
					if(numeros[f][c] < numero_menor) {
						numero_menor = numeros[f][c];
					}
				}
			}
		}
		promedio = sumatoria / (numeros.length * numeros[0].length);
		 
        System.out.println("\n==================");
        System.out.println("   RESULTADOS   ");
        System.out.println("==================");
        System.out.println("Numero mayor....: " + numero_mayor);
        System.out.println("Numero menor....: " + numero_menor);
        System.out.println("Sumatoria.......: " + sumatoria);
        System.out.println("Promedio........: " + promedio);



	}

}
