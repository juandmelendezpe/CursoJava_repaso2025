package Daw2.Repaso_Curso_Java2025.Ejercicio4_1_Arrays;

import java.util.Scanner;

public class E1_contadorNumeros {

	public static void main(String[] args) {
		// CREACION DE VARIABLES Y DECLARACION DEL ARRAY
				// INGRESA UN NUMERO DEL 1 AL 20 Y VERIFICA CUANTAS VECES SE REPITE
				Scanner sc = new Scanner(System.in);
				
				int numerointro;
				int contador = 0;
				
				int[] numeros = { 1, 2,10, 2, 4, 5, 6, 7, 2, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
				
				// EJERCICIO--en este ejercicio se pide un numero y se filtra que sea del 1 al 20, y 
				// si es correcto recorre el bucle for con al condicion que el numero
				// ingresado sea comparado en el recorrido y guardara como contador++ de  ese numero >
				//  al final se imprime cuantas veces se ha encontrado el numero en el array
				do {
					System.out.println("introduce el numero que quieres comprobar: ");
					numerointro = sc.nextInt();
				} while (numerointro < 1 || numerointro > 20);

				for (int i = 0; i < numeros.length; i++) {
					if (numerointro == numeros[i]) {
						contador++;
					}
				}
				System.out.println("el numero introducido se repite: " + contador + " --> veces");
				sc.close ();
			}

}
