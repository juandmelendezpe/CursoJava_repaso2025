package Daw2.Repaso_Curso_Java2025.ExamenDesarrollo;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		crearMatriz();
		crearA(3);
		letraA(7);

	}
	public static void crearMatriz() {
		Random random = new Random();
		int fila = random.nextInt(6)+6; // Genera un número aleatorio entre 6 y 11
		int[][] matriz = new int[fila][8];
		// Llamar al método para crear la matriz
		System.out.println("Número de filas: " + fila);
		// Rellenar la matriz con números aleatorios
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(9)+1; // Números aleatorios entre 1 y 9
			}
		}
		// Mostrar la matriz
		System.out.println("Matriz generada:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	public static void crearA(int altura) {
		
		if(altura > 5 && altura % 2 == 0) {
			System.out.println("La altura debe ser un número impar mayor que 5.");
		} else {
			int base = altura + 1;
			int[][] matriz = new int[altura][base];
			// Rellenar la matriz con números aleatorios
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = 0;
				}
			}
			// Mostrar la matriz
			System.out.println("Matriz generada:");
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	 public static void letraA(int altura) {
	        // Validación
	        if (altura < 5 && altura % 2 == 0) {
	            System.out.println("La altura debe ser impar y mayor o igual que 5.");
	            return;
	        }

	        int mitad = (altura / 2) + 1;

	        for (int fila = 0; fila < altura; fila++) {
	           
	    }
			
	 }
}


