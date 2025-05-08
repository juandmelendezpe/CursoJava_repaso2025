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
		
		// Mostrar la lista de frutas
		System.out.println("Lista de frutas:");
		for (String fruta : listaFrutas) {
			System.out.println(fruta);
		}
	}

}
