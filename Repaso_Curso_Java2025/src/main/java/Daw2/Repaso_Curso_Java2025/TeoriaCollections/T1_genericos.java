package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

public class T1_genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Un generico es una clase o interfaz que permite definir un tipo de dato
		 *  parametrico, lo que significa que podemos especificar el tipo de dato
		 *  que queremos utilizar en tiempo de compilacion.
		 *  
		 *  - Los genericos son utiles para crear clases y metodos que pueden trabajar
		 *    con diferentes tipos de datos sin necesidad de duplicar el codigo.
		 *    
		 *  - Los genericos se definen utilizando los simbolos <T> o <E> donde T o E
		 *    representan el tipo de dato parametrico.
		 */
		// Ejemplo de uso de genericos
		
		Integer[] arrayEnteros = {1, 2, 3, 4, 5};
		String[] arrayCadenas = {"Hola", "Mundo", "Genericos"};
		
		// Llamada al metodo generico para imprimir los arrays
		imprimirArray(arrayCadenas);
		// llamada al metodo generico para imprimir los arrays
		System.out.println("-------------------------------------------------");
		elementoAleatorio(arrayCadenas);
		System.out.println("-------------------------------------------------");
		elementoAleatorio(arrayEnteros);
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < arrayCadenas.length; i++) {
			System.out.println("Elemento " + i + ": " + arrayCadenas[i]);
		}
				
		

	}
	public static <T> void imprimirArray(T[] array) {
		for (T elemento : array) {
			System.out.println(elemento);
		}
	}
	public static <T> void  elementoAleatorio ( T[] array) {
		int indiceAleatorio = (int) (Math.random() * array.length);
		T elementoAleatorio = array[indiceAleatorio];
		System.out.println("Elemento aleatorio: " + elementoAleatorio);
	}

}
