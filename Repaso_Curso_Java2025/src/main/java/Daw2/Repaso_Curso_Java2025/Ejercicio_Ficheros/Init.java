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
		private final static int MAX_FICHEROS = 3;
		private static String[] FRUTAS = {"Manzana", "Plátano", "Naranja", "Uva", "Pera", "Sandía", "Melón"};
		
		public static void main(String[] args) {
			
		//generarFicherosFrutas();
			
		String[] nombreFicherosLeer = {"frutas_3.txt", "frutas_4.txt"};
		fusionarFicherosFrutas(nombreFicherosLeer);
		//generarFicherosFrutas();
		
		
		
		}
		private static void fusionarFicherosFrutas(String[] nombreFicherosLeer) {
		    // Maps to store aggregated data
		    Map<String, Integer> mapaCantidades = new HashMap<>();
		    Map<String, Double> mapaPrecioTotal = new HashMap<>();

		    // Read and process each file
		    for (String nombreFichero : nombreFicherosLeer) {
		        List<Frutas> frutas = leerFrutasFichero(nombreFichero);
		        for (Frutas fruta : frutas) {
		            String nombre = fruta.getNombre();
		            int cantidad = fruta.getCantidad();
		            double precio = fruta.getPrecio();

		            // Update quantity
		            mapaCantidades.put(nombre, mapaCantidades.getOrDefault(nombre, 0) + cantidad);

		            // Update total price
		            mapaPrecioTotal.put(nombre, mapaPrecioTotal.getOrDefault(nombre, 0.0) + (precio * cantidad));
		        }
		    }

		    // Write the aggregated data to the output file
		    String nombreFicheroSalida = "frutasFusion3.txt";
		    Path pathSalida = Paths.get(CARPETA, nombreFicheroSalida);
		    try (BufferedWriter bw = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8,
		            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
		        System.out.println("Escribiendo el fichero de fusion " + nombreFicheroSalida);
		        bw.write("----------REPORTE---------\n");
		        bw.write("Nombre;Cantidad;Precio Medio\n");

		        for (String nombre : mapaCantidades.keySet()) {
		            int cantidad = mapaCantidades.get(nombre);
		            double precioMedio = mapaPrecioTotal.get(nombre) / cantidad;
		            bw.write(nombre + DELIMITER + cantidad + DELIMITER + String.format("%.2f", precioMedio) + "\n"); // Formato a 2 decimales
		        }

		        System.out.println("Fin de la escritura de :" + nombreFicheroSalida);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

		private static void fusionarFicherosFrutas2(String[] nombreFicherosLeer) {
		//Primer paso: lectura de ficheros, para los calculos
		Map<Integer, String> nombres = new HashMap<>();
		Map<String, Integer> mapaCantidades = new HashMap<>();
		Map<String, Double> mapaPrecioMedio = new HashMap<>();
		
		for (String nombreFichero : nombreFicherosLeer) {
		List<Frutas> frutas = leerFrutasFichero(nombreFichero);
		//frutas = nombres.containsValue();
		for (Frutas fruta : frutas) {
			//fruta = frutas.get();
		}
		
		}
		
		//Segundo paso: escritura del fichero
		
		Path pathSalida = Paths.get(CARPETA , "frutasFusion.txt");
		
		/*try (BufferedWriter bw = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8, 
				StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
		System.out.println("Escribiendo el fichero de fusion frutasFusion.txt" );
		bw.write("----------REPORTE---------");
		/for(Frutas f : nombres) {
			bw.write(f.getCantidad());
			
			//bw.write(NombreFruta + DELIMITER + cantidad + DELIMITER + precio + "\n");
		}
		
		System.out.println("Fin de la escritura de frutasFusion.txt");
		} catch (IOException e) {
		e.printStackTrace();
		}
		*/
		}
		private static List<Frutas> leerFrutasFichero(String nombreFichero) {
		
			List<Frutas> frutas = new ArrayList<>();
		    Path path = Paths.get(CARPETA , nombreFichero);
		    
		    try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
		    	System.out.println("Comienza la lectura de " + nombreFichero);
		    	String linea;
		    	while ((linea = br.readLine()) != null) {
		    		String[] partesLinea = linea.split(DELIMITER);
		    		if(partesLinea.length == 3) {
		    			frutas.add(new Frutas(partesLinea[0], Integer.valueOf(partesLinea[1]), Double.valueOf(partesLinea[2])));
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
			int numFicheros = r.nextInt(4) + 2; // de 2 a 5 ficheros
			for(int f = 0; f < numFicheros; f++) {
				String nombreFichero = "frutas_" + f + ".txt";
				System.out.println("Escribiendo el fichero " + nombreFichero);
				Path path = Paths.get(CARPETA , nombreFichero);
				try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, 
						StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);) {
					int numLineas = r.nextInt(2) + 3;
		
					for (int i = 0; i < numLineas; i++) {
						String nombre = FRUTAS[r.nextInt(FRUTAS.length)];
						int cantidad = r.nextInt(20) + 1; // de 1 a 20
						double precio = r.nextDouble(10) + 1; // de 1 a 10
						bw.write(nombre + DELIMITER + cantidad + DELIMITER + precio + "\n");
		}
		
		System.out.println("Fin de la escritura " + nombreFichero);
		} catch (IOException e) {
		e.printStackTrace();
		
			}
		
		}
		
	

			}
		}
