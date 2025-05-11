package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.HashMap;

public class Teoria_3_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teoria_3_HashMap();
	}
	public static void Teoria_3_HashMap() {
		/*
		 * Un HashMap es una implementacion de la interfaz Map que almacena los elementos
		 * en una tabla hash.
		 * 
		 * - Permite almacenar pares clave-valor, donde cada clave es unica y se utiliza
		 * para acceder al valor asociado.
		 * 
		 * - Los HashMap son utiles cuando necesitamos un acceso rapido a los elementos
		 * y no nos importa el orden de las claves.
		 */
		System.out.println("--Utilizar HashMap--");
		HashMap<String, Integer> edades = new HashMap<>();
		// Agregar elementos al HashMap
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Pedro", 28);
		edades.put("Maria", 22);
		// Imprimir el HashMap
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
		// Obtener el tamaño del HashMap
		int tamaño = edades.size();
		System.out.println("Tamaño del HashMap: " + tamaño);
		
	}

}
