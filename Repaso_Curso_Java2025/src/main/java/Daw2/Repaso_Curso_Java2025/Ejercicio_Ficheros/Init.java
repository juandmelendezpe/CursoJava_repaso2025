package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Init {

	private final static String CARPETA = "Ficheros";
	private final static String DELIMITER = ";";
	private final static int CANT_FICHEROS = 2;
	private final static String[] FRUTAS = { "Manzana", "Plátano", "Naranja", "Uva", "Pera", "Sandía", "Melón" };

	public static void main(String[] args) {
		// generarFicherosFrutas();
		String[] nombreFicherosLeer = {"lista_0.txt","lista_1.txt" };
		 //generarFicherosFrutas();
		fusionarFicheros(nombreFicherosLeer);
	}
	private static void fusionarFicheros(String[] nombreFicherosLeer) {
		Map<String,Frutas> mapaFrutas = new HashMap<>();
		for (String nombreFichero : nombreFicherosLeer) {
			List<Frutas> frutas = leerFrutasFichero(nombreFichero);
			for (Frutas fruta : frutas) {
				if(mapaFrutas.containsKey(fruta.getNombre())) {
					// Sumar cantidades y calcular precio medio
					Frutas fAlmacenada = mapaFrutas.get(fruta.getNombre()); // Fruta almacenada
					int cantidadTotal = fAlmacenada.getCantidad() + fruta.getCantidad(); // Sumar cantidades
					double precioTotal = fAlmacenada.getPrecio() + fruta.getPrecio(); // Sumar precios
					double precioMedio = precioTotal / cantidadTotal; // Calcular precio medio
					fAlmacenada.setCantidad(cantidadTotal); // Actualizar cantidad
					fAlmacenada.setPrecio(precioMedio); // Actualizar precio medio
				} else {
					mapaFrutas.put(fruta.getNombre(), fruta);
				}
			}
		}
		// Segundo paso, escritura del fichero
		Path pathSalida = Paths.get(CARPETA, "frutasFusionjd4.txt");
		try (BufferedWriter bw = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);) {
			System.out.println("Escribiendo el fichero de fusión frutasFusion.txt");
			bw.write("----------REPORTE---------\n");
			bw.write("Nombre;Cantidad;Precio Medio\n");
			for(Frutas f: mapaFrutas.values()) {
				bw.write(f.getNombre() + DELIMITER +
						f.getCantidad() + DELIMITER +
						String.format("%.2f", f.getPrecio()) + "\n");
			}
			System.out.println("Fin de la escritura de frutasFusion.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	private static void fusionarFicherosFrutas(String[] nombreFicherosLeer) {

		Map<String, Integer> mapaCantidades = new HashMap<>();
		Map<String, Double> mapaPrecioTotal = new HashMap<>();

		for (String nombreFichero : nombreFicherosLeer) {
			List<Frutas> Listfrutas = leerFrutasFichero(nombreFichero);
			for (Frutas fruta : Listfrutas) {
				//String nombre = fruta.getNombre();
				int cantidad = fruta.getCantidad();
				double precio = fruta.getPrecio();

				// actualiza cantidad
				mapaCantidades.put(fruta.getNombre(), mapaCantidades.getOrDefault(fruta.getNombre(), 0) + cantidad);
				//mapaCantidades.put(fruta.getNombre(), cantidad += cantidad);

				// actualiza el precio total
				mapaPrecioTotal.put(fruta.getNombre(), mapaPrecioTotal.getOrDefault(fruta.getNombre(), 0.0) + (precio * cantidad));
				//mapaPrecioTotal.put(fruta.getNombre(), precio += precio ); // 

			}
		}

		String nombreFicheroSalida = "frutasFusionjd.txt";
		Path pathSalida = Paths.get(CARPETA, nombreFicheroSalida);
		try (BufferedWriter bw = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING)) {
			System.out.println("Escribiendo el fichero de fusion " + nombreFicheroSalida);
			bw.write("----------REPORTE---------\n");
			bw.write("Nombre;Cantidad;Precio Medio\n");

			for (String nombre : mapaCantidades.keySet()) {
				int cantidad = mapaCantidades.get(nombre);
				double precioMedio = mapaPrecioTotal.get(nombre) / cantidad; // precio medio 
				bw.write(nombre + DELIMITER + cantidad + DELIMITER +
						String.format("%.2f", precioMedio) + "\n"); // Formato a 2 decimales																											// decimales
			}

			System.out.println("Fin de la escritura de :" + nombreFicheroSalida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void fusionarFicherosFrutas2(String[] nombreFicherosLeer) {
		// Primer paso: lectura de ficheros, para los calculos
		Map<Integer, String> nombres = new HashMap<>();
		Map<String, Integer> mapaCantidades = new HashMap<>();
		Map<String, Double> mapaPrecioMedio = new HashMap<>();

		for (String nombreFichero : nombreFicherosLeer) {
			List<Frutas> frutas = leerFrutasFichero(nombreFichero);
			// frutas = nombres.containsValue();
			for (Frutas fruta : frutas) {
				/**
				 * if(frutas
				 */
			}

		}

		// Segundo paso: escritura del fichero

		Path pathSalida = Paths.get(CARPETA, "frutasFusion.txt");

		/*
		 * try (BufferedWriter bw = Files.newBufferedWriter(pathSalida,
		 * StandardCharsets.UTF_8, StandardOpenOption.CREATE,
		 * StandardOpenOption.TRUNCATE_EXISTING)) {
		 * System.out.println("Escribiendo el fichero de fusion frutasFusion.txt" );
		 * bw.write("----------REPORTE---------"); /for(Frutas f : nombres) {
		 * bw.write(f.getCantidad());
		 * 
		 * //bw.write(NombreFruta + DELIMITER + cantidad + DELIMITER + precio + "\n"); }
		 * 
		 * System.out.println("Fin de la escritura de frutasFusion.txt"); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	}

	private static List<Frutas> leerFrutasFichero(String nombreFichero) {

		List<Frutas> frutas = new ArrayList<>();
		Path path = Paths.get(CARPETA, nombreFichero);

		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
			System.out.println("Comienza la lectura de " + nombreFichero);
			String linea;
			while ((linea = br.readLine()) != null) { // Leer línea por línea
				String[] partesLinea = linea.split(DELIMITER); // Separar por el delimitador
				if (partesLinea.length == 3) { // Comprobar que hay 3 partes
					frutas.add(new Frutas(partesLinea[0], 
							Integer.valueOf(partesLinea[1]),
							Double.valueOf(partesLinea[2])));
				}
			}
			System.out.println("Fin de la lectura de " + nombreFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return frutas;

	}

	private static void generarFicherosFrutas() {

		Random r = new Random();
		//int numFicheros = r.nextInt(4) + 2; // de 2 a 5 ficheros
		for (int f = 0; f < CANT_FICHEROS; f++) {
			String nombreFichero = "lista_" + f + ".txt";
			System.out.println("Escribiendo el fichero " + nombreFichero);
			Path path = Paths.get(CARPETA, nombreFichero);
			try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);) {
				//int numLineas = r.nextInt(2) + 3; // de 3 a 5 lineas

				for (int i = 0; i < CANT_FICHEROS; i++) {
					String nombre = FRUTAS[r.nextInt(FRUTAS.length)];
					int cantidad = r.nextInt(20) + 1; // de 1 a 20
					double precio = r.nextDouble(10) + 1; // de 1 a 10
					bw.write(nombre + DELIMITER + cantidad + DELIMITER + precio + "\n");
				}

				System.out.println("Fin de la escritura " + nombreFichero);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error al escribir el fichero " + nombreFichero);

			}
		}
	}
}
