package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Init_prueba {
	
	public static final String []FRUTAS = {"manzana","mango","sandia"};
	private final static int CANT_ = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []nombreFicheroLeer = {"file1","file2"};
		
		
		generarFicheros();
		fusionarFicheros(nombreFicheroLeer);

	}
	private static void fusionarFicheros(String[] nombreFicheroLeer) {
		// TODO Auto-generated method stub
		
		
	}
	private static void generarFicheros() {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i = 0; i <CANT_ ;i++) {
			String nombresFile = ("file_"+i+".txt");
			Path ruta = Paths.get("Ficheros/"+nombresFile);
			System.out.println("escribir fichero"+nombresFile);
			try(BufferedWriter bw = Files.newBufferedWriter(ruta, StandardCharsets.UTF_8)) {
				for(int j =0;j<CANT_;j++) {
				String nombreFruta = FRUTAS[r.nextInt(FRUTAS.length)];
				int cantidad = r.nextInt(5)+1;
				Double precio = r.nextDouble(10)+1;
				bw.write(nombreFruta+":"+cantidad+":"+precio+"\n");
				}
				System.out.println("fichero  creado con exito");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("error al crear ficheros");
			}
			
		}
		
	}
	private static List<Frutas> lecturaFicheros(String ficherolectura) {
		List<Frutas>listFrutas = new ArrayList<Frutas>();
		Path ruta = Paths.get("Ficheros/"+ficherolectura);
		try(BufferedReader br = Files.newBufferedReader(ruta,StandardCharsets.UTF_8)) {
			System.out.println("inicio de lectura");
			String linea ;
			while((linea = br.readLine())!=null) {
				String[] partesLinea = linea.split(":");
				if(partesLinea.length ==3) {
					listFrutas.add(new Frutas(partesLinea[0],Integer.valueOf(partesLinea[1]),Double.valueOf(partesLinea[2])));
					
				}
			}
			System.out.println("lectura del fichero con exito");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error al leer fichero");
		}
		
		return listFrutas;
		
		
	}

}
