package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.SortedMap;
import java.util.TreeMap;

public class Teoria_5_SortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejemploSortedMap();

	}
	public static void ejemploSortedMap() {
		/*
		 * Un SortedMap es una interfaz que extiende la interfaz Map y garantiza que los
		 * elementos se almacenen en orden ascendente según las claves.
		 * 
		 * - Permite almacenar pares clave-valor, donde cada clave es única y se utiliza
		 * para acceder al valor asociado.
		 * 
		 * - Los SortedMap son útiles cuando necesitamos mantener un orden natural de las
		 * claves o cuando queremos realizar búsquedas eficientes.
		 */
		System.out.println("--Utilizar SortedMap--");
		SortedMap<String, Integer> edades = new TreeMap<>();
		// Agregar elementos al SortedMap
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Pedro", 28);
		edades.put("Dan", 29);
		edades.put("Maria", 22);
		// Imprimir el SortedMap
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
			// Obtener el tamaño del SortedMap
			int tamaño = edades.size();
			System.out.println("Tamaño del SortedMap: " + tamaño);
			
			// Eliminar un elemento por su clave
			edades.remove("Pedro");
			System.out.println("Edades después de eliminar a Pedro: " + edades);
			// Iterar sobre las claves del SortedMap
			System.out.println("Iterando sobre las claves:");
			for (String clave : edades.keySet()) {
				System.out.println(clave + ": " + edades.get(clave));
			}
			// Iterar sobre los valores del SortedMap
			System.out.println("Iterando sobre los valores:");
			for (Integer valor : edades.values()) {
				System.out.println(valor);
			}
			// Iterar sobre las entradas (pares clave-valor) del SortedMap
			System.out.println("Iterando sobre las entradas:");
			for (java.util.Map.Entry<String, Integer> entrada : edades.entrySet()) {
				System.out.println(entrada.getKey() + ": " + entrada.getValue());
			}
			// Obtener la primera y última clave
			String primeraClave = edades.firstKey();
			String ultimaClave = edades.lastKey();
			System.out.println("Primera clave: " + primeraClave);
			System.out.println("Última clave: " + ultimaClave);
			// Obtener un subconjunto del SortedMap
			java.util.SortedMap<String, Integer> subMapa = edades.subMap("Ana", "Pedro");
			System.out.println("Subconjunto del SortedMap: " + subMapa);
			// Obtener la clave menor y mayor
			String claveMenor = edades.firstKey();
			String claveMayor = edades.lastKey();
			System.out.println("Clave menor: " + claveMenor);
			System.out.println("Clave mayor: " + claveMayor);
			// Obtener un rango de claves
			java.util.SortedMap<String, Integer> rango = edades.subMap("Ana", "Maria");
			System.out.println("Rango de claves: " + rango);
			
			// Limpiar el SortedMap
			edades.clear();
			System.out.println("SortedMap después de limpiar: " + edades);
	}

}
