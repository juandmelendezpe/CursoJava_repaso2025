package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class T5_SetComparator implements Comparator<Persona> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Un Comparator es una interfaz que permite definir un orden personalizado
		 *  para los objetos de una clase.
		 *  - Se utiliza para comparar dos objetos y determinar su orden relativo.
		 *  - Los comparadores son utiles cuando queremos ordenar objetos de una manera
		 *    diferente a la proporcionada por el metodo compareTo de la clase Comparable.
		 *  - La interfaz Comparator tiene dos metodos principales:
		 *  * compare -> Compara dos objetos y devuelve un valor entero que indica su
		 *    orden relativo.
		 *  * equals -> Comprueba si dos comparadores son iguales.
		 */
		// Ejemplo de uso de Comparator
		// Crear un comparador para ordenar personas por nombre
		
		Comparator<Persona> comparadorPorNombre = new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre());
			}
		};
		// Crear un comparador para ordenar personas por sueldo
		Comparator<Persona> comparadorPorSueldo = new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return Double.compare(p1.getSueldo(), p2.getSueldo());
			}
		};
		// Crear un objeto Persona
		Persona persona1 = new Persona("Juan", 3000);
		Persona persona2 = new Persona("Ana", 2500);
		Persona persona3 = new Persona("Pedro", 1000);
		// Comparar personas por nombre
		int resultadoNombre = comparadorPorNombre.compare(persona1, persona2);
		if (resultadoNombre < 0) {
			System.out.println(persona1.getNombre() + " es menor que -> utilizando compare : " + persona2.getNombre());
		} else if (resultadoNombre > 0) {
			System.out.println(persona1.getNombre() + " es mayor que -> utilizando compare : " + persona2.getNombre());
		} else {
			System.out.println(persona1.getNombre() + " es igual a " + persona2.getNombre());
		}
		
		// Comparar personas por sueldo
		int resultadoSueldo = comparadorPorSueldo.compare(persona1, persona2);
		if (resultadoSueldo < 0) {
			System.out.println(persona1.getNombre() + " tiene un sueldo menor que " + persona2.getNombre());
		} else if (resultadoSueldo > 0) {
			System.out.println(persona1.getNombre() + " tiene un sueldo mayor que " + persona2.getNombre());
		} else {
			System.out.println(persona1.getNombre() + " tiene el mismo sueldo que " + persona2.getNombre());
		}
		// Comparar personas en metodos 
		System.out.println("------------------");
		
		Set<Persona> personas = new TreeSet<>(comparadorPorNombre);
		personas.add(persona1);
		personas.add(persona2);
		
		personas.add(persona3);
		System.out.println("Personas ordenadas por nombre:");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		System.out.println("------------------");
		Set<Persona> personasSueldo = new TreeSet<>(comparadorPorSueldo);
		personasSueldo.add(persona1);
		personasSueldo.add(persona2);
		personasSueldo.add(persona3);
		System.out.println("Personas ordenadas por sueldo:");
		personasSueldo.forEach(System.out::println);
		/*for (Persona persona : personasSueldo) {
			System.out.println(persona);
		}
		*/
		System.out.println("------------------");

	}

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this == obj;
	}
	

}
