package Daw2.Repaso_Curso_Java2025.Teoria_figuras;

import java.util.Scanner;


public class Rombo {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduce la altura: ");
	int altura = sc.nextInt();

	for (int i = 1; i <= altura; i++) {
		for (int j = 1; j <= altura - i; j++) {
			System.out.print(" ");				
		}

		for (int k = 1; k <= (2*i)-1; k++) {
			if(k==1 || k ==(2*1)-1) {
				System.out.print("*");
			}else {
				
				System.out.print(" ");
			}
		}
		
		System.out.println();	
	}
	
	for (int i = altura - 1; i >= 1; i--) {
		for (int j = 1; j <= altura - i; j++) {
			System.out.print(" ");				
		}

		for (int k = 1; k <= (2*i)-1; k++) {
			System.out.print("*");
		}
		
		System.out.println();	
	}
	// parte de abajo
	/*
	 * for(int i = 1;i<=altura;i++) {
	 
		System.out.println("");
	}
	*/
	
}

}
