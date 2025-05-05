package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class AppFrutas {

	private static String[] NOMBRES_FRUTAS = {"fresas","mango","sandia","melon","uva"};
	
	private static char DELIMITADOR = ';';
	
	Random r = new Random();
	
	public static void main(String[] args) {
		
		
		Frutas frutas = new Frutas();
		
		
	
		ArrayList<Frutas> lista = new ArrayList<>();
		
		/* lista.add(new Frutas("fresa",10,2.0));
		lista.add(new Frutas("mango",20,5.0));
		lista.add(new Frutas("fresa",8,8.0));
		lista.add(new Frutas("sandia",9,9.0));
		lista.add(new Frutas("melon",3,2.0));
		*/
		
		guardarLista(lista);
		

	}
	
	/*private static List<Frutas> leerFicheros(String nombresFichros){
		List<Frutas> frutas = new ArrayList<>();
		
		
		
	}
	*/
	
	private static void generarFrutas() {
		
		//int numFile = r.nextInt(4)+2;
		
		
		
	}
	private static void guardarLista(ArrayList<Frutas>list) {
		
		int numFicheros = 3 ;
				
		String linea1 = "**********Reportes de frutas**********" + "\n";
		
		
			
		
		Path file = Paths.get("ficheros/ReporteFrutas.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
			System.out.println("inicio de la escritura del fichero externo");
			
			bw.write(linea1);
			bw.write("Lista de Frutas" + "\n");
			for(Frutas f : list) {
				bw.write("nombre de la Fruta: " + f.getNombre() + " -> Precio : "+ f.getPrecio() +"\n");
			}
			bw.write("fin del fichero....");
			System.out.println(" fichero externo creado con exito");
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("  error al crear fichero externo...");

		}
		}
		
}
	

