package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.ArrayList;

public class T2_arraysList {

	public static void main(String[] args) {
		ArrayList<String> listaFrutas = new ArrayList<>();

		/*
		 * *  - La clase ArrayList es una implementacion
		 *  de la interfaz List
		 */
		
		// Ejemplo de uso de ArrayList
		listaFrutas.add("Manzana");
		listaFrutas.add("Plátano");
		listaFrutas.add("Naranja");
		listaFrutas.add("Uva");
		listaFrutas.add("Pera");
		listaFrutas.add("Sandía");
		
		
		mostrarFrutas(listaFrutas);
		System.out.println("-------------------------------------------------");
		eliminarFruta(listaFrutas,"Naranja");
		listaFrutas.add("Melón");
		listaFrutas.add("Kiwi");
		listaFrutas.remove("Plátano");
		mostrarFrutas(listaFrutas);
		
		System.out.println("-Mostra con foreach ----------------------------------------");
		listaFrutas.forEach(fruta -> {
			System.out.println("Fruta: " + fruta);
		});
		
	}
		// Ejemplo de uso de ArrayList
		
		public static void eliminarFruta(ArrayList<String> listaFrutas,String fruta) {
			listaFrutas.remove(fruta);
			System.out.println("Fruta eliminada: " + fruta);
			System.out.println("Lista de frutas actualizada:");
			for (String f : listaFrutas) {
				System.out.println(f);
			}
			System.out.println("++++++++++++++++++++++++++++++++");
		}
		public static void mostrarFrutas(ArrayList<String> listaFrutas) {
			System.out.println("Lista de frutas:");
			for (String fruta : listaFrutas) {
				System.out.println(fruta);
			}
			
		}
		
}


