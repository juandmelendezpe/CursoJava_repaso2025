package Daw2.Repaso_Curso_Java2025.Ejercicio4_1_Arrays;

import java.util.Scanner;

import Daw2.Repaso_Curso_Java2025.Ejercicio3_3_persona.Persona;

public class E3_AgendaPersonas {

	public static void main(String[] args) {
		/*Persona[] agenda = {
		new Persona("Fran", "C/Salamanca nº1, 1ºA"),
		new Persona("Manu", "C/Ávila nº2, 2ºA"),
		new Persona("Fitipaldi", "C/Gracias a Dios nº3, 3ºA"),
		new Persona("Madera", "C/Pino nº4, 4ºA"),
		new Persona("Fran", "C/Jaén nº5, 5ºA")
};*/

Persona[] agenda = new Persona[5];
agenda[0] = new Persona("Juan");
agenda[1] =  new Persona("Omar");


Scanner sc = new Scanner(System.in);
System.out.println("*******************************************************");

System.out.println("Introduzca el nombre de la persona a buscar: ");
 
String nombreBuscar = sc.nextLine();
sc.close();

for (int i = 0; i < agenda.length; i++) {
	if(agenda[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
		
		System.out.println("Su Nombre es: " + agenda[i].getNombre());
		//System.out.println("Su edad es: " + agenda[i].getedad());


	}
}

}

}
