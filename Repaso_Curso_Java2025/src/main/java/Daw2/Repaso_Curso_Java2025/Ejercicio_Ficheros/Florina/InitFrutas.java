package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros.Florina;
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

public class InitFrutas {

	private static String DELIMITER = ";";

	private static String[] NOMBRE_FRUTAS = { "Manzana", "Banana", "Naranja", "Pera", "Uva", "Sandía", "Kiwi" };

	private static String CARPETA = "Ficheros";

	public static void main(String[] args) {
		// generarFicherosFrutas();
		String[] nombreFicherosLeer = { "frutas_0.txt", "frutas_4.txt" };
		fusionarFicherosFrutas(nombreFicherosLeer);

	}
	private static void fusionarFicherosFrutas(String[] nombreFicherosLeer) {
		// Primer paso, lectura de ficheros, para los cálculos
		Map<String, Fruta> mapaFrutas = new HashMap<>();
		for (String nombreFichero : nombreFicherosLeer) {
			List<Fruta> frutas = leerFrutasFichero(nombreFichero);
			for (Fruta fruta : frutas) {
				if(mapaFrutas.containsKey(fruta.getNombre())) {
					// Sumar cantidades y calcular precio medio
					Fruta fAlmacenada = mapaFrutas.get(fruta.getNombre());
					fAlmacenada.acumular(fruta.getCantidad(),fruta.getPrecio());
				} else {
					mapaFrutas.put(fruta.getNombre(), fruta);
				}
			}
		}
		// Segundo paso, escritura del fichero
		Path pathSalida = Paths.get(CARPETA, "frutasFusionProfesor.txt");
		try (BufferedWriter bw = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);) {
			System.out.println("Escribiendo el fichero de fusión frutasFusion.txt");
			for(Fruta f: mapaFrutas.values()) {
				bw.write(f.getNombre() + "?" +
						f.getCantidad() + "?" +
						f.getPrecio() + "?" + 
						f.getNumApariciones() + "\n");
			}
			System.out.println("Fin de la escritura de frutasFusion.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Fruta> leerFrutasFichero(String nombreFichero) {
		
		List<Fruta> frutas = new ArrayList<>();
		Path path = Paths.get(CARPETA, nombreFichero);
		
		try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
			System.out.println("Comienza la lectura de " + nombreFichero);
			String linea;
			
			while((linea = br.readLine()) != null ) {
				String[] partesLinea = linea.split(DELIMITER);
				if(partesLinea.length == 3) {
					frutas.add(new Fruta(partesLinea[0], 
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

		int numFicheros = r.nextInt(4) + 2; // De 2 a 5 ficheros

		for (int f = 1; f <= numFicheros; f++) {

			String nombreFichero = "frutas_" + f + ".txt";

			System.out.println("Escribiendo el fichero " + nombreFichero);

			Path path = Paths.get(CARPETA, nombreFichero);

			try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);) {

				int numLineas = r.nextInt(2) + 3;

				for (int i = 0; i < numLineas; i++) {
					String nombre = NOMBRE_FRUTAS[r.nextInt(NOMBRE_FRUTAS.length)];
					int cantidad = r.nextInt(20) + 1; // De 1 a 20
					double precio = r.nextDouble(10) + 1; // De 1 a 10

					bw.write(nombre + DELIMITER + cantidad + DELIMITER + precio + "\n");
				}

				System.out.println("Fin de la escritura de " + nombreFichero);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
