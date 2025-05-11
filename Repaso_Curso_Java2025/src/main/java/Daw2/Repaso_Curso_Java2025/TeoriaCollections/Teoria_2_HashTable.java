package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.Hashtable;

public class Teoria_2_HashTable {

	public static void main(String[] args) {
		Teoria_2_HashTable();

	}
	public static void Teoria_2_HashTable() {
		/*
		 * Un HashTable es una implementacion de la interfaz Map que almacena los
		 * elementos en una tabla hash.
		 * 
		 * - Permite almacenar pares clave-valor, donde cada clave es unica y se utiliza
		 * para acceder al valor asociado.
		 * 
		 * - Los HashTable son utiles cuando necesitamos un acceso rapido a los elementos
		 * y no nos importa el orden de las claves.
		 */
		System.out.println("--Utilizar HashTable--");
		Hashtable<String, Integer> edades = new Hashtable<>();
		// Agregar elementos al HashTable
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Pedro", 28);
		edades.put("Maria", 22);
		// Imprimir el HashTable
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
		// Obtener el tamaño del HashTable
		int tamaño = edades.size();
		System.out.println("Tamaño del HashTable: " + tamaño);
		// Eliminar un elemento por su clave
		edades.remove("Pedro");
		System.out.println("Edades después de eliminar a Pedro: " + edades);
		// Iterar sobre las claves del HashTable
		System.out.println("Iterando sobre las claves:");
		for (String clave : edades.keySet()) {
			System.out.println(clave + ": " + edades.get(clave));
		}
		// Iterar sobre los valores del HashTable
		System.out.println("Iterando sobre los valores:");
		for (Integer valor : edades.values()) {
			System.out.println(valor);
		}
		// Iterar sobre las entradas (pares clave-valor) del HashTable
		System.out.println("Iterando sobre las entradas:");
		for (java.util.Map.Entry<String, Integer> entrada : edades.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
		// Limpiar el HashTable
		edades.clear();
		System.out.println("HashTable después de limpiar: " + edades);
		System.out.println("Tamaño del HashTable después de limpiar: " + edades.size());
		System.out.println("¿Está vacío el HashTable? " + edades.isEmpty());
		System.out.println("Fin del ejemplo de HashTable");
		
	}

}
