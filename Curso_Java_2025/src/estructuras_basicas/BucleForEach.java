package estructuras_basicas;

import java.util.Scanner;

public class BucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaramos una variable de tipo String
		String [] miArray = {"Quercus", "Pinus", "Betula", "Salix", "Populus", "Ulmus", "Laurus"};
		
		// Recorrer el array con un bucle for normal
		System.out.println("Recorriendo el array con un bucle for:\n");
		for (int i = 0; i < miArray.length; i++) {

			System.out.println("Planta " + i + ": " + miArray[i]);

		}
		System.out.println("\n");
		
		// Recorrer el array con un bucle for each
		System.out.println("Recorriendo el array con un bucle for each:\n");
		for(String elemento: miArray) {
			
			System.out.println("Planta: " + elemento);
			
		}
		
		// Rellenar un array con un bucle:
		String [] animales = new String [5];
		
		Scanner entrada = new Scanner(System.in); // Crear un scanner
		
		System.out.println("Rellenemos un array de 5 elementos con un bucle:\n");
		
		for (int i = 0; i < animales.length; i++) {

			System.out.println("Introduce el nombre de un animal:");
			animales[i] = entrada.nextLine();
			System.out.println("Posición " + i + " del array rellena.");

		}
		
		// Veamos si ha funcionado 
		System.out.println("\\n" + "Veamos si ha funcionado:");
		for(String elemento: animales) {

			System.out.println("Animal: " + elemento);

		}

	}

}
