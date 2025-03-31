package Daw2.Repaso_Curso_Java2025.Ejercicio3_3_persona;

import java.util.Scanner;

public class Init {
	 	private static final int BAJO_PESO = -1;
	    private static final int PESO_NORMAL = 0;
	    private static final int SOBREPESO = 1;
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Persona[] persona = new Persona[3];
		 
		 int opt = 0;
		 int contPersona = 0;
		 
		 
		 do {
				 System.out.println("-------------Menu---------------");
				 System.out.println("1. ----crear persona-----------------");
				 System.out.println("2. ----visualizar persona----------------");
				 System.out.println("1. ----salir ----------------");
				 System.out.println("Introduce un opcion :");
				 
				 System.out.println("\n\n");
					do {
						System.out.println("introduzca la opcion");
						opt = sc.nextInt();
					} while (opt < 1 || opt > 5);

					switch (opt) {
					case 1:
						
					// if(contPersona < 3) {
					 
					 System.out.println("Introduce un nombre");
					 String nombre = sc.next();
					 
					 System.out.println("introduce la edad");
					 int edad = sc.nextInt();
					 
					 System.out.println("introduce un sexo");
					 String sexo =sc.next();
					 
					 System.out.println("introduce el peso");
					 double peso = sc.nextDouble();
					 
					 System.out.println("introduce la altura");
					 double altura = sc.nextDouble();
					 
					 Persona imc = new Persona(peso,altura);
				     int resultadoIMC = imc.calcularIMC();
				     System.out.println("Resultado IMC: " + resultadoIMC);
				     
				     
				        
					 
					 
					 System.out.println("Datos Obtenidos-------");
					 System.out.println("Nombre:"+ nombre +"\n");
					 System.out.println("edad:"+ edad +"\n");
					 System.out.println("peso:"+ peso +"\n");
					 System.out.println("talla:"+ altura +"\n");
					 System.out.println("su imc = "+ resultadoIMC);


					 break;
					 
					 case 2:
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Opción incorrecta");
		                    break;
		                    

						}
					} while (opt != 5);
					sc.close();

				

	}

}
