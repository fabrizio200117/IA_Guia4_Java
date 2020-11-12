package Senati;

public class Caso1 {
	public static void main(String[] args) {
		// Declaracion y asignacion de valores al arreglo nombre
		String [] nombre = {"Joe Castillo", "Rosa Garcia", "Pedro Alvarez", "Catherine Vela"};
		
		// Declaracion del arreglo
		
		int[] edad;
		edad = new int[4];
		
		// Asignar valores al arreglo edad
		
		edad [0] = 25;
		edad [1] = 17;
		edad [2] = 28;
		edad [3] = 14; 
	    
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Datos del Registro " + (i + 1));
			System.out.println("======================");
			System.out.println("Nombre.........: " + nombre[i]);
			System.out.println("Edad...........: " + edad[i]);
			// Operador incondicional
			// System.out.println("Estado...........: " + (edad[i] >= 25 ? "Adulto" : edad[i] >= 18 ? "Mayor de edad" : "Menor de edad"));

			if (edad[i] >= 18)
				System.out.println("Estado.........: " + "Mayor de edad");
			else 
				System.out.println("Estado.........: " + "Menor de edad");
			System.out.println("");
			


			
		}	
		
		    
			

	}

}
