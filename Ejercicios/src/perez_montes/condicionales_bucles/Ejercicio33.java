package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Diseñar un programa que muestre el producto de los 10 primeros números impares.
		 */

		// Declarar e inicializar variables
		int producto = 1;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		
		System.out.println("Números de los que se hace el producto:\n");
		for (int numero = 1; numero < 20; numero += 2) {
			
			System.out.println(numero);

			// Añadir número a la suma 
			producto = producto * numero;

		}

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nEl producto de los 10 primeros números impares es: " + producto);

	}

}
