package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.LinkedHashMap;

public class Teoria_4_LinkedHashMap {

	public static void main(String[] args) {
		ejemploLinkedHashMap();

	}
	public static void ejemploLinkedHashMap() {
		/*
		 * Un LinkedHashMap es una implementacion de la interfaz Map que almacena los
		 * elementos en una tabla hash y mantiene el orden de insercion.
		 * 
		 * - Permite almacenar pares clave-valor, donde cada clave es unica y se utiliza
		 * para acceder al valor asociado.
		 * 
		 * - Los LinkedHashMap son utiles cuando necesitamos un acceso rapido a los
		 * elementos y queremos mantener el orden de insercion.
		 */
		System.out.println("--Utilizar LinkedHashMap--");
		LinkedHashMap<String, Integer> edades = new LinkedHashMap<>();
		// Agregar elementos al LinkedHashMap
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Pedro", 28);
		edades.put("Maria", 22);
		// Imprimir el LinkedHashMap
		System.out.println("Edades: " + edades);
		// Obtener un valor por su clave
		int edadJuan = edades.get("Juan");
		System.out.println("Edad de Juan: " + edadJuan);
		// Comprobar si una clave existe
		boolean existeAna = edades.containsKey("Ana");
		System.out.println("¿Existe Ana? " + existeAna);
		// Comprobar si un valor existe
		boolean existeEdad30 = edades.containsValue(30);
		System.out.println("¿Existe edad 30? " + existeEdad30);
		// Obtener el tamaño del LinkedHashMap
		int tamaño = edades.size();
	}
	

}
