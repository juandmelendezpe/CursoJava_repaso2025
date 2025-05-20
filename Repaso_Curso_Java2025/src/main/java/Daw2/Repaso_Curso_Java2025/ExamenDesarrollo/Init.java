package Daw2.Repaso_Curso_Java2025.ExamenDesarrollo;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce la altura para la letra A (debe ser impar y mayor a 5): ");
		if (scanner.hasNextInt()) {
			int alturaIngresada = scanner.nextInt();
			dibujarA(alturaIngresada);
		} else {
			System.out.println("Entrada no válida. Por favor, introduce un número entero.");
		}
		
		scanner.close();
		
		// Ejemplos de prueba adicionales (puedes descomentarlos para probar rápidamente)
		/*
	        System.out.println("\n--- Prueba con altura 7 ---");
	        dibujarA(7);

	        System.out.println("\n--- Prueba con altura 9 ---");
	        dibujarA(9);

	        System.out.println("\n--- Prueba con altura 5 (inválida por ser <= 5) ---");
	        dibujarA(5);

	        System.out.println("\n--- Prueba con altura 6 (inválida por ser par) ---");
	        dibujarA(6);

	        System.out.println("\n--- Prueba con altura 4 (inválida por ser par y <= 5) ---");
	        dibujarA(4);
		 */
	}

	

	    /**
	     * Imprime la letra 'A' con asteriscos.
	     *
	     * @param altura La altura deseada para la letra 'A'. Debe ser un número impar mayor a 5.
	     */
	    public static void dibujarA(int altura) {
	        // 1. Validar la altura
	        if (altura % 2 == 0 || altura <= 5) {
	            System.out.println("Error: La altura ingresada no es válida. Debe ser un número impar y mayor a 5.");
	            return; // Termina la ejecución del método si la altura no es válida
	        }

	        // Calcular el ancho máximo y la posición del pico/centro
	        // El ancho de la base será 2 * altura - 1, pero para el pico necesitamos el punto medio.
	        // El pico estará en la columna 'altura - 1' (indexado desde 0)
	        int puntoMedioColumna = altura - 1;
	        int anchoTotal = 2 * altura - 1; // Aunque no lo usemos directamente en el bucle anidado, es bueno saberlo.

	        // 2. Dibujar la letra A
	        for (int i = 0; i < altura; i++) { // i representa la fila actual
	            for (int j = 0; j < anchoTotal; j++) { // j representa la columna actual
	                // Condición para la barra horizontal (en la fila del medio)
	                // La fila del medio es altura / 2 (división entera)
	                if (i == altura / 2) {
	                    // Imprimir asteriscos desde la pata izquierda hasta la pata derecha en esa fila
	                    if (j >= puntoMedioColumna - i && j <= puntoMedioColumna + i) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                // Condición para las patas de la A (incluyendo el pico superior)
	                else {
	                    if (j == puntoMedioColumna - i || j == puntoMedioColumna + i) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println(); // Nueva línea al final de cada fila
	        }
	    }

	}
