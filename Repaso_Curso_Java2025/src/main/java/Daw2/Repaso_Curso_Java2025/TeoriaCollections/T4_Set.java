package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class T4_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Un Set es una coleccion de elementos unicos,
		 *  lo que significa que no puede contener elementos duplicados.
		 *  - Los Sets son utiles cuando queremos almacenar un conjunto de elementos
		 *  sin preocuparnos por el orden o la duplicacion.
		 *  - Java proporciona diferentes implementaciones de Set:
		 *  * HashSet
		 *  * LinkedHashSet
		 *  * TreeSet
		 *  * EnumSet
		 *  * CopyOnWriteArraySet
		 *  - Las interfaces Set tiene una serie de metodos que podemos utilizar.
		 *  * add -> Agrega un elemento al Set
		 *  * remove -> Elimina un elemento del Set
		 *  *  * contains -> Comprueba si el Set contiene un elemento especifico
		 *  *  * size -> Devuelve el numero de elementos en el Set
		 *  *  * isEmpty -> Comprueba si el Set esta vacio
		 *  *  *  * clear -> Elimina todos los elementos del Set
		 *  *  *  *  * iterator -> Devuelve un iterador para recorrer los elementos del Set
		 *  *  *  *  *  * forEach -> Permite aplicar una accion a cada elemento del Set
		 *  *  *  *  *  *  * toArray -> Convierte el Set en un array
		 *  *  *  *  *  *  *  * stream -> Permite realizar operaciones de flujo en el Set
		 *  *  *  *  *  *  *  *  * spliterator -> Permite dividir el Set en partes para procesamiento paralelo
		 *  		 *  *  *  *  *  *  *  *  *  * forEachRemaining -> Aplica una accion a los elementos restantes del Set
		 *  		 *  *  *  *  *  *  *  *  *  *  * removeIf -> Elimina los elementos que cumplen una condicion
		 */
		// Ejemplo de uso de Set
		Set<String> frutas = new HashSet<>();
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Naranja");
		frutas.add("Uva");
		frutas.add("Pera");
		frutas.add("Manzana"); // No se agregará porque ya existe
		frutas.add("Sandía");
		
		System.out.println("Frutas en el Set: " + frutas);
		System.out.println("Tamaño del Set: " + frutas.size());
		System.out.println("¿El Set está vacío? " + frutas.isEmpty());
		System.out.println("¿El Set contiene 'Uva'? " + frutas.contains("Uva"));
		frutas.remove("Plátano");
		System.out.println("Frutas después de eliminar 'Plátano': " + frutas);
		frutas.forEach(System.out::println);
		
		// Iterar sobre el Set
		System.out.println("Iterando sobre el Set:");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		System.out.println("--------Iterar Set con foreach -----------------");
		frutas.forEach(fruta -> System.out.println(fruta));
		System.out.println("-------------------------");
		// Comprobar si el Set contiene un elemento
		if (frutas.contains("Naranja")) {
			System.out.println("El Set contiene 'Naranja'");
		} else {
			System.out.println("El Set no contiene 'Naranja'");
		}
		// Limpiar el Set
		frutas.clear();
		System.out.println("Frutas después de limpiar: " + frutas);
		
		// Ejemplo de uso de HashSet
		
		TeoriaHashSet();
		TeoriaLinkedHashSet();
		TeoriaTreeSet();
		
	}
	public static void imprimirSet(Set<String> set) {
		for (String elemento : set) {
			System.out.println(elemento);
		}
	}
	public static void imprimirSet2(Set<String> set) {
		set.forEach(elemento -> System.out.println(elemento));
	}
	
	public static void TeoriaHashSet() {
		// HashSet es una implementación de la interfaz Set
		// que utiliza una tabla hash para almacenar los elementos.
		// Permite operaciones rápidas de inserción, eliminación y búsqueda.
		// Sin embargo, no garantiza el orden de los elementos.
		// Ejemplo de uso de HashSet
		
		System.out.println("--Utilizar HashSet--");
		
		Set<String> frutas = new HashSet<>();
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Naranja");
		
		System.out.println("Frutas en el HashSet: " + frutas);
		
		frutas.remove("Plátano");
		
		System.out.println("Frutas después de eliminar 'Plátano': " + frutas);
		
	}	
	public static void TeoriaLinkedHashSet() {
		// LinkedHashSet es una implementación de la interfaz Set
		// que mantiene el orden de inserción de los elementos.
		// Permite operaciones rápidas de inserción, eliminación y búsqueda.
		// Ejemplo de uso de LinkedHashSet
		
		System.out.println("--Utilizar LinkedHashSet--");
		
		Set<String> frutas = new LinkedHashSet<>();
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Naranja");
		frutas.add("Uva");
		
		
		System.out.println("Frutas en el LinkedHashSet: " + frutas);
		
		frutas.remove("Plátano");
		
		System.out.println("Frutas después de eliminar 'Plátano': " + frutas);
		
	}
	public static void TeoriaTreeSet() {
		// TreeSet es una implementación de la interfaz Set
		// que almacena los elementos en orden natural o según un comparador.
		// Permite operaciones rápidas de inserción, eliminación y búsqueda.
		// Ejemplo de uso de TreeSet
		
		System.out.println("--Utilizar TreeSet--");
		
		Set<String> frutas = new TreeSet<>();
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Naranja");
		
		System.out.println("Frutas en el TreeSet: " + frutas);
		
		frutas.remove("Plátano");
		
		System.out.println("Frutas después de eliminar 'Plátano': " + frutas);
		
		// Ordenar el TreeSet en orden inverso
		Set<String> frutasOrdenadas = new TreeSet<>(frutas);
		frutasOrdenadas = ((TreeSet<String>) frutas).descendingSet();
		System.out.println("Frutas en orden inverso: " + frutasOrdenadas);
		
		String valor = "Naranja";
		if (frutas.contains(valor)) {
			System.out.println("El Set contiene :" + valor);
		} else {
			System.out.println("El Set no contiene :"+ valor);
		}
	}

}
