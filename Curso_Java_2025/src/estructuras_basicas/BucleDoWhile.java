package estructuras_basicas;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abrir un scanner
		Scanner entrada = new Scanner(System.in);
		
		// Variables necesarias
		String genero = "";
		int altura = 0;
		
		// Usar un do while para asegurarnos de que el valor que introducen es válido, y si no lo es que siga preguntando
		
		do {
			
			System.out.println("Introduce tu género (H/M):");
			
			genero = entrada.nextLine();
			
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		// Pedir altura en cm			
		System.out.println("Introduce tu altura en cm:");
			
		altura = entrada.nextInt();
		
		// Determinar el peso ideal en función del género
		
		int pesoideal = 0; // Declarar e inicializar variable
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoideal = altura - 110;
			
		} else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal = altura - 120;
			
		}
		
		System.out.println("Tu peso ideal es " + pesoideal + " kg");
		
		

	}

}
