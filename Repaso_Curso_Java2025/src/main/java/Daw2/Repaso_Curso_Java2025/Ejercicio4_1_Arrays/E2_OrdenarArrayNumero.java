package Daw2.Repaso_Curso_Java2025.Ejercicio4_1_Arrays;

public class E2_OrdenarArrayNumero {

		public static void main(String[] args) {
			
//			int[] datos = {2, 3, 4, 5, 6}; // Prueba ordenado
//			int[] datos = {8, 3, 4, 5, 6}; // Prueba no ordenado
//			int[] datos = {3, 3, 4, 5, 6}; // Prueba ordenado con iguales
			
			int[] datos = {3, 9, 8, 5, 6}; // Prueba NO ordenado entre medias
			
			boolean ordenado = true;
			
			// en este bucle se verifica si los elementos de array estan ordenados 
			for (int i = 0; i < datos.length; i++) {
				if(datos[i] < datos[i]) {
					ordenado = false;
					// break  - se pone este valor para que una vez compruebe que es menor salga del bucle
				}
				System.out.println("item: " + i +" elementos del arrays : "+ datos[i]);
			}
			System.out.println(ordenado ? "Está ordenado." : "NO está ordenado.");
			
		}

}
