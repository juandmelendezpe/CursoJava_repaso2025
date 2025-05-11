package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Teoria_1_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Un Map es una colleccion de pares clave - valor
		    cada está asociada a un unico valor.
		  - Map en Java no puede contener claves duplicadas
		  - Permite acceso rapido atravez de las claves
		  - Java proporciona diferentes implementaciones de Map:
		  * HashMap
		  * Treemap
		  * LinkedHashMap
		  * Entre otras
		 
		 - Las interfaces Map tiene una serie de metodos que podemos utilizar.
		 	* Put -> Agrega un par clave -valor
		 	* get -> devuelve el valor asociado a la clave especifica
		 	* constainsValue -> comprueba si el mapa tiene el valor especifico
		 	* remove -> Elimina el registro asosciado a la clave en el Map
		 	* values -> Devuelve una coleccion de todos los valores que contiene el map
		 	* keySet -> Devuelve un conjunto de todas las claves en el map
		 	*
		*/
		
		Map<Integer,String>mapaFrutas = new HashMap<>();
		mapaFrutas.put(1, "fresa");
		mapaFrutas.put(2, "Sandia");
		mapaFrutas.put(3, "melon");
		mapaFrutas.put(8, "Hello word");
		
	 boolean id =	mapaFrutas.containsKey(1);
		if(id == true) {
			 String valor = mapaFrutas.get(1);
			
			System.out.println("el valor buscado esta  -> : " + valor);
		} else {
			System.out.println("el valor buscado no esta");
		}
		System.out.println("Estos son los valore del mapa -> "+mapaFrutas.values());
		System.out.println("Estos son los ids del mapa -> "+mapaFrutas.keySet());
		System.out.println("------------------------------------");
		mapaFrutas.remove(8);
		System.out.println("Estos son los ids del mapa -> "+mapaFrutas.keySet());
		
		String valor2 = "Sandia";
		
		System.out.println("Se verifica si existe el valor en el mapa ->:  "+ valor2 +"->"+ mapaFrutas.containsValue(valor2));
		System.out.println("--------------------------------");
		for (int i = 0; i < 10; i++) {
			mapaFrutas.put(i, "fruta"+i);
		}
		
		/* 
		 * La interfaz Set representa una coleccion de elementos unicos
		 */
		Set<Integer> ids = mapaFrutas.keySet();
		for (Integer key : ids) {
			String valor = mapaFrutas.get(key);
			System.out.println("ID: " + key + ", Valor: " + valor);
		}
		// mostrar el mmapa con foreach
		System.out.println("Mostrando el mapa con foreach");
		for (Map.Entry<Integer, String> entry : mapaFrutas.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("ID: " + key + ", Valor: " + value);
		}
		// mostrar el mapa con lambda
		System.out.println("Mostrando el mapa con lambda");
		mapaFrutas.forEach((key, value) -> {
			System.out.println("ID: " + key + ", Valor: " + value);
		});
		// mostrar el mapa con stream
		System.out.println("Mostrando el mapa con stream");
		mapaFrutas.entrySet().stream()
			.forEach(entry -> {
				Integer key = entry.getKey();
				String value = entry.getValue();
				System.out.println("ID: " + key + ", Valor: " + value);
			});
		// mostrar el mapa con stream y filter
		System.out.println("Mostrando el mapa con stream y filter");
		mapaFrutas.entrySet().stream()
			.filter(entry -> entry.getKey() > 2)
			.forEach(entry -> {
				Integer key = entry.getKey();
				String value = entry.getValue();
				System.out.println("ID: " + key + ", Valor: " + value);
			});
		// mostrar el mapa con stream y filter y map
		System.out.println("Mostrando el mapa con stream y filter y map");
		mapaFrutas.entrySet().stream()
			.filter(entry -> entry.getKey() > 2)
			.map(entry -> entry.getValue())
			.forEach(value -> {
				System.out.println("Valor: " + value);
			});
		
	}

}
