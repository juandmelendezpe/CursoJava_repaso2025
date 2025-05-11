package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

public class C2_ClaseArrays {

	public static void main(String[] args) {
		TeoriaClaseArrays();
		TeoriaClaseArrays2();

	}
	
	/*
	 * Un array es una estructura de datos que permite almacenar una coleccion de
	 * elementos del mismo tipo.
	 * 
	 * - Los arrays son utiles cuando necesitamos almacenar un conjunto de elementos
	 * y acceder a ellos de manera eficiente.
	 * 
	 * - Permiten almacenar, manipular y acceder a los elementos de la coleccion.
	 * 
	 * - Los arrays son utiles cuando necesitamos trabajar con grupos de elementos y
	 * realizar operaciones como agregar, eliminar o buscar elementos.
	 * -Metodos
	 * - Arrays.toString(array) - Convierte un array en una cadena de texto
	 * - Arrays.sort(array) - Ordena un array
	 * - Arrays.copyOf(array, newLength) - Crea una copia de un array con una nueva longitud
	 * - Arrays.fill(array, value) - Rellena un array con un valor especifico
	 * - Arrays.equals(array1, array2) - Compara dos arrays para ver si son iguales
	 * - Arrays.binarySearch(array, value) - Busca un valor en un array ordenado
	 * - Arrays.asList(array) - Convierte un array en una lista
	 * - Arrays.stream(array) - Convierte un array en un flujo (stream)
	 * - Arrays.parallelSort(array) - Ordena un array en paralelo
	 * 	 * - Arrays.deepToString(array) - Convierte un array multidimensional en una cadena de texto
	 * 	 * - Arrays.deepEquals(array1, array2) - Compara dos arrays multidimensionales para ver si son iguales
	 * 	 * 	 * - Arrays.deepHashCode(array) - Calcula el hash de un array multidimensional
	 * 	 * 	 * - Arrays.deepCopyOf(array, newLength) - Crea una copia de un array multidimensional con una nueva longitud
	 * 	 * 	 * - Arrays.deepFill(array, value) - Rellena un array multidimensional con un valor especifico
	 * 	 * 	 * - Arrays.deepEquals(array1, array2) - Compara dos arrays multidimensionales para ver si son iguales
	 * 	 * 	 * - Arrays.deepHashCode(array) - Calcula el hash de un array multidimensional
	 * 	 * 	 * - Arrays.deepCopyOf(array, newLength) - Crea una copia de un array multidimensional con una nueva longitud
	 * 	 * 	 * - Arrays.deepFill(array, value) - Rellena un array multidimensional con un valor especifico
	 * 	 * 	 * - Arrays.deepEquals(array1, array2) - Compara dos arrays multidimensionales para ver si son iguales
	 * 	 * 	 * - Arrays.deepHashCode(array) - Calcula el hash de un array multidimensional
	 * 	 * 	 * - Arrays.deepCopyOf(array, newLength) - Crea una copia de un array multidimensional con una nueva longitud
	 * 	 * 	 * - Arrays.deepFill(array, value) - Rellena un array multidimensional con un valor especifico
	 * 	 * 	 * - Arrays.deepEquals(array1, array2) - Compara dos arrays multidimensionales para ver si son iguales
	 */
	public static void TeoriaClaseArrays() {
		
		System.out.println("--Utilizar Arrays--");
		System.out.println("Los arrays son utiles cuando necesitamos almacenar un conjunto de elementos y acceder a ellos de manera eficiente.");
		
		// Ejemplo de uso de un array
		int[] numeros = new int[5]; // Crear un array de enteros con 5 elementos
		// Agregar elementos al array
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		// Imprimir el array
		System.out.print("Numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		// Obtener el tamaño del array
		int tamaño = numeros.length;
		System.out.println("Tamaño del array: " + tamaño);
		// Comprobar si un elemento existe
		boolean existe30 = false;
			
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 30) {
				existe30 = true;
				break;
			}
		}
		System.out.println("¿Existe 30? " + existe30);
		// Eliminar un elemento
		int[] nuevoArray = new int[numeros.length - 1];
		int j = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != 30) {
				nuevoArray[j] = numeros[i];
				j++;
			}
		}
		numeros = nuevoArray;
		System.out.print("Numeros después de eliminar 30: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		// Iterar sobre los elementos del array
		System.out.println("Iterando sobre los elementos:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		// Limpiar el array
		numeros = new int[0];
		System.out.println("Numeros después de limpiar el array: " + numeros.length);
		// Comprobar si el array esta vacio
		boolean estaVacio = numeros.length == 0;
		System.out.println("¿El array esta vacio? " + estaVacio);
		// Obtener el tamaño del array
		tamaño = numeros.length;
		System.out.println("Tamaño del array: " + tamaño);
		// Comprobar si el array esta vacio
		estaVacio = numeros.length == 0;
		System.out.println("¿El array esta vacio? " + estaVacio);
		// Comprobar si el array contiene un elemento
		boolean contiene20 = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 20) {
				contiene20 = true;
				break;
			}
		}
		System.out.println("¿El array contiene 20? " + contiene20);
		// Obtener el tamaño del array
		tamaño = numeros.length;
		System.out.println("Tamaño del array: " + tamaño);
		// Comprobar si el array esta vacio
		estaVacio = numeros.length == 0;
		System.out.println("¿El array esta vacio? " + estaVacio);
		// Comprobar si el array contiene un elemento
		boolean contiene10 = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 10) {
				contiene10 = true;
				break;
			}
		}
		

}
	public static void TeoriaClaseArrays2() {
		// Crear un array de enteros con 5 elementos
		int[] numeros = { 10, 20, 30, 40, 50 };
		// Imprimir el array
		System.out.print("Numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
