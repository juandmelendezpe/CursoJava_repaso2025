package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

public class C1_TeoriaCollections {

	public static void main(String[] args) {
		Teoria_1_Collection();

	}
	public static void Teoria_1_Collection() {
		/*
		 * Una Collection es una interfaz que representa un grupo de objetos, conocida
		 * como coleccion.
		 * 
		 * - Permite almacenar, manipular y acceder a los elementos de la coleccion.
		 * 
		 * - Las colecciones son utiles cuando necesitamos trabajar con grupos de
		 * elementos y realizar operaciones como agregar, eliminar o buscar elementos.
		 */
		System.out.println("--Utilizar Collection--");
		System.out.println("Las colecciones son utiles cuando necesitamos trabajar con grupos de elementos y realizar operaciones como agregar, eliminar o buscar elementos.");
		
		// Ejemplo de uso de una Collection
		java.util.Collection<String> nombres = new java.util.ArrayList<>();
		// Agregar elementos a la coleccion
		nombres.add("Juan");
		nombres.add("Ana");
		nombres.add("Pedro");
		nombres.add("Maria");
		// Imprimir la coleccion
		System.out.println("Nombres: " + nombres);
		// Obtener el tamaño de la coleccion
		int tamaño = nombres.size();
		System.out.println("Tamaño de la coleccion: " + tamaño);
		// Comprobar si un elemento existe
		boolean existeJuan = nombres.contains("Juan");
		System.out.println("¿Existe Juan? " + existeJuan);
		// Eliminar un elemento
		nombres.remove("Pedro");
		System.out.println("Nombres después de eliminar a Pedro: " + nombres);
		// Iterar sobre los elementos de la coleccion
		System.out.println("Iterando sobre los elementos:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		// Limpiar la coleccion
		nombres.clear();
		System.out.println("Nombres después de limpiar la coleccion: " + nombres);
		// Comprobar si la coleccion esta vacia
		boolean estaVacia = nombres.isEmpty();
		System.out.println("¿La coleccion esta vacia? " + estaVacia);
		// Obtener el tamaño de la coleccion
		tamaño = nombres.size();
		System.out.println("Tamaño de la coleccion: " + tamaño);
		// Comprobar si la coleccion esta vacia
		estaVacia = nombres.isEmpty();
		System.out.println("¿La coleccion esta vacia? " + estaVacia);
		// Comprobar si la coleccion contiene un elemento
		boolean contieneMaria = nombres.contains("Maria");
		System.out.println("¿La coleccion contiene a Maria? " + contieneMaria);
		// Obtener el tamaño de la coleccion
		tamaño = nombres.size();
		System.out.println("Tamaño de la coleccion: " + tamaño);
		// Comprobar si la coleccion esta vacia
		estaVacia = nombres.isEmpty();
		System.out.println("¿La coleccion esta vacia? " + estaVacia);
		// Comprobar si la coleccion contiene un elemento
		boolean contieneAna = nombres.contains("Ana");
		System.out.println("¿La coleccion contiene a Ana? " + contieneAna);
		
		// iterar sobre los elementos de la coleccion
		System.out.println("Iterando sobre los elementos:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		// iterar sobre los elementos de la coleccion con un bucle while
		System.out.println("Iterando sobre los elementos con un bucle while:");
		java.util.Iterator<String> iterator = nombres.iterator();
		while (iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println(nombre);
		}
		// iterar sobre los elementos de la coleccion con un bucle foreach
		System.out.println("Iterando sobre los elementos con un bucle foreach:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		// iterar sobre los elementos de la coleccion con un bucle for	
		System.out.println("Iterando sobre los elementos con un bucle for:");
		for (int i = 0; i < nombres.size(); i++) {
			String nombre = nombres.toArray()[i].toString();
			System.out.println(nombre);
		}
		// iterar sobre los elementos de la coleccion con un bucle for each
		System.out.println("Iterando sobre los elementos con un bucle for each:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
	}
	

}
