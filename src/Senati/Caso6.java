package Senati;

public class Caso6 {
	public static void main(String[] args) {
		// Declaracion y asignacion de valores en la matriz 2x3
		String [][] datos = { {"Joe Castillo", "Rosa Alvarez", "Erika Flores"},
				              {"Callao", "Comas", "San Miguel"} };
		
		System.out.println("IMPRESION DE FILAS");
		System.out.println("=====================");
		// Recorrer la Matriz, iniciando por las filas
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++) {
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
			}
		    System.out.println();
		}
		System.out.println("\nIMPRESION DE COLUMNAS");
		System.out.println("=====================");
		// Recorrer la Matriz, iniciando por las columnas
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++) {
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
			}
		    System.out.println();
		}
	}

}
