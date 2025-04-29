package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir 15 números y escribir la suma total.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		int suma = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		
		for (int i = 0; i < 15; i++) {
			
			// Pedir el número
						System.out.println("\nIntroduce un número:\n");
						numero = entrada.nextInt();

						// Añadir número a la suma 
						suma = suma + numero;
			
		}
		
		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nLa suma de todos los números introducidos es: " + suma);

	}

}


