package Senati;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String> arr_nombre = new ArrayList<String>();
		ArrayList<Integer> arr_edad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "", estado = "";
		int nr = 0, edad = 0;
		
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			System.out.println("REGISTRO " + nr + ": ");
			System.out.println("==========");
			
			System.out.print("Nombre: ");
			nombre = scn.nextLine();
			System.out.print("Edad: ");
			edad = scn.nextInt();
			
			arr_nombre.add(nombre);
			arr_edad.add(edad);
			
			scn.nextLine();
			
			rp = "";
			
			while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
				System.out.print("¿Continuar?[S|N]: ");
				rp = scn.nextLine();
				System.out.println("====================");

				if (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
					System.out.println("Solo escriba S o N");
					
				}
			
			}
			
		
		}
		
		System.out.println("\n====================");
		System.out.println("DATOS REGISTRADOS");
		System.out.println("====================");
		
		System.out.println("Alumno(a)    \tEdad   \t\tEstado");
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < arr_nombre.size(); i++) {
			System.out.println(arr_nombre.get(i) + "\t \t" + arr_edad.get(i) + " años\t   " + VerEstado(arr_edad.get(i)));                          
		}
		
	}
	
	
	//Funciones ( Metodos que devuelven un valor)
	public static String VerEstado(int edad) {
		String estado = "";
		if(edad >= 18)
			estado = "Mayor de edad";
		else 
			estado = "Menor de edad";
			
		
				
		
		return estado;
	}
}