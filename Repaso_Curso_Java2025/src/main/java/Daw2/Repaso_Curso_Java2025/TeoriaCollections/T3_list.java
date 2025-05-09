package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.ArrayList;
import java.util.List;

public class T3_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * *  - La interfaz List es una coleccion ordenada de elementos
		 */
		
		// Ejemplo de uso de List
		List<String> listaFrutas = new ArrayList<>();
		listaFrutas.add("Manzana");
		listaFrutas.add("Plátano");
		
		listaFrutas.remove("Plátano");
		listaFrutas.add("Naranja");
		listaFrutas.add("Uva");
		String elemento = listaFrutas.get(0); // Acceder al primer elemento
		
		System.out.println ("El elemento nro 3 es : " +elemento); // Acceder al cuarto elemento
		
		// Mostrar la lista de frutas
		System.out.println("Lista de frutas:");
		for (String fruta : listaFrutas) {
			System.out.println("+ " + fruta);
		}
		System.out.println("-------------------------------------------------");
		// Mostrar la lista de frutas con un bucle for
		for (int i = 0; i < listaFrutas.size(); i++) {
			System.out.println("Elemento " + i + ": " + listaFrutas.get(i));
		}
		System.out.println("-------------------------------------------------");
		// Mostrar la lista de frutas con un bucle forEach
		listaFrutas.forEach(fruta -> {
			System.out.println("Fruta: " + fruta);
		});
		System.out.println("-------------------------------------------------");
		// Mostrar la lista de frutas con un bucle forEach y una referencia a un metodo
		listaFrutas.forEach(System.out::println);
		
		System.out.println("----------------------Acceder al último elemento---------------------------");
		String valor2 = listaFrutas.getLast(); // Acceder al último elemento
		System.out.println("El último elemento es: " + valor2);
		System.out.println("-------------------------------------------------");
		
	}

}
