package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.TreeMap;

public class Teoria_6_TreeMap {
	public static void main(String[] args) {
		ejemploTreeMap();
		
	}
	public static void ejemploTreeMap() {
		/*
		 * Un TreeMap es una implementacion de la interfaz Map que almacena los elementos
		 * en orden ascendente segun las claves.
		 * 
		 * - Permite almacenar pares clave-valor, donde cada clave es unica y se utiliza
		 * para acceder al valor asociado.
		 * 
		 * - Los TreeMap son utiles cuando necesitamos mantener un orden natural de las
		 * claves o cuando queremos realizar busquedas eficientes.
		 */
		System.out.println("--Utilizar TreeMap--");
		TreeMap<String, Integer> edades = new TreeMap<>();
		// Agregar elementos al TreeMap
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Pedro", 28);
		edades.put("Maria", 22);
		// Imprimir el TreeMap
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
		// Obtener el tamaño del TreeMap
		int tamaño = edades.size();
		System.out.println("Tamaño del TreeMap: " + tamaño);
		// Eliminar un elemento por su clave
		edades.remove("Pedro");
		System.out.println("Edades después de eliminar a Pedro: " + edades);
		// Iterar sobre las claves del TreeMap
		System.out.println("Iterando sobre las claves:");
		for (String clave : edades.keySet()) {
			System.out.println(clave + ": " + edades.get(clave));
		}
		// Iterar sobre los valores del TreeMap
		System.out.println("Iterando sobre los valores:");
		for (Integer valor : edades.values()) {
			System.out.println(valor);
		}
		// Iterar sobre las entradas (pares clave-valor) del TreeMap
		System.out.println("Iterando sobre las entradas:");
		for (java.util.Map.Entry<String, Integer> entrada : edades.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
		// Limpiar el TreeMap
		edades.clear();
	}

}
