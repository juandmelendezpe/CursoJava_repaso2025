package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros.Florina;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Init {

	private final static String PATH = "Ficheros";
	private final static char DELIMITER = ';';

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona("Fran", "70707070H", 35));
		lista.add(new Persona("Florina", "70707071Q", 22));
		lista.add(new Persona("Juan", "70707079H", 21));

		// escribirFicheroTexto();
		escribirFicheroTexto2(lista);

	}

	private static void escribirFicheroTexto2(List<Persona> lista) {
		Path fichero = Paths.get(PATH + "\\pruebaTexto3.txt");

		try (BufferedWriter bw = Files.newBufferedWriter(fichero, StandardCharsets.UTF_8);) {

			System.out.println("Comienzo de la escritura...");
			for (Persona p : lista) {
				bw.write(p.getNombre() + DELIMITER + p.getDni() + DELIMITER + p.getEdad() + "\n");
			}

			System.out.println("Fin de la escritura!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void escribirFicheroTexto(List<Persona> lista) {
		Path fichero = Paths.get(PATH + "\\pruebaTexto2.txt");

		BufferedWriter bw = null;
		try {
			bw = Files.newBufferedWriter(fichero, StandardCharsets.UTF_8);

			System.out.println("Comienzo de la escritura...");

			/*
			 * for (int i = 0; i < lista.size(); i++) { bw.write(lista.get(i).getNombre() +
			 * DELIMITER + lista.get(i).getDni() + DELIMITER + lista.get(i).getEdad() +
			 * "\n"); }
			 */

			for (Persona p : lista) {
				bw.write(p.getNombre() + DELIMITER + p.getDni() + DELIMITER + p.getEdad() + "\n");
			}

			System.out.println("Fin de la escritura!!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void escribirFicheroTexto() {
		Path fichero = Paths.get(PATH + "\\pruebaTexto.txt");

		BufferedWriter bw = null;
		try {
			bw = Files.newBufferedWriter(fichero, StandardCharsets.UTF_8);

			System.out.println("Comienzo de la escritura...");

			bw.write("Fran;Perez;35");

			System.out.println("Fin de la escritura!!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
