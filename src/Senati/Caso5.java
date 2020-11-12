package Senati;

import java.util.Scanner;

public class Caso5 {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] arr_codigo = {"A-123", "A-534", "A-259", "A-476"};
		String[] arr_nombre = {"Joe Castillo", "Rosa Flores", "Veronica Vilchez", "Carlos Morales"};
		int[] arr_nota = {15, 8, 18, 11};
		
		String codigo = "";
		System.out.println("=================================");
		System.out.println("Colegio Sena - Modulo de busqueda");
		System.out.println("=================================");
		
		System.out.print("Ingrese codigo a buscar: ");
		codigo = scn.nextLine();
		
		
		int posicion = -1;
		
		for (int i = 0; i < arr_codigo.length; i++) {
			if(arr_codigo[i].equals(codigo)) {
				posicion = i;
				break;	
			}
		}
		if (posicion == -1) 
			System.out.println("Codigo no encontrado......");
		    
		else {
			System.out.println("=================================");
			System.out.println("\n=================================");
			System.out.println("D A T O S  D E L  A L U M N O");
			System.out.println("=================================");
			System.out.println("Codigo..........: " + arr_codigo[posicion]);
			System.out.println("Alumno..........: " + arr_nombre[posicion]);
			System.out.println("Calificacion....: " + arr_nota[posicion]);
		}
		String estado = "";
		
		if (arr_nota[posicion] > 11) {
			estado = "Aprobado";
		}
		else{
			estado = "Desaprobado";
		}	
		System.out.println("Estado..........: " + estado);
		System.out.println("=================================");
	}
}
