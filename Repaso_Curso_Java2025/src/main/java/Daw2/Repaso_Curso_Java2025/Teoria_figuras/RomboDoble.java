package Daw2.Repaso_Curso_Java2025.Teoria_figuras;
import java.util.Scanner;

public class RomboDoble {
	
	private static final int LIM = 9;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int altura;
		do {
			System.out.print("Introduce la altura: ");
			altura = sc.nextInt();
			
		} while (altura < LIM);
		
		sc.close();


		for (int numFila = 1; numFila <= altura; numFila++) {
			for (int j = 1; j <= altura - numFila; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2*numFila)-1; k++) {
				if(k == 1 || k == (2*numFila)-1 || k == 3 || k == (2*numFila)-3) {
					System.out.print("*");
				} else {					
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		for (int numFila = altura - 1; numFila >= 1; numFila--) {

			for (int j = 1; j <= altura - numFila; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2*numFila)-1; k++) {
				if(k == 1 || k == (2*numFila)-1 || k == 3 || k == (2*numFila)-3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
