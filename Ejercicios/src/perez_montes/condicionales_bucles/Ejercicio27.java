package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
         * números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
         * cuando el usuario acierta.
		 */

		// Declarar e inicializar variables
		int numeroObjetivo = 0;
		int numeroUsuario = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Pedir el número objetivo:
		System.out.println("Introduce el número que se pretende adivinar.\n");
		numeroObjetivo = entrada.nextInt();

		// Bucle do-while para evaluar las condiciones:
		do {

			// Pedir un número
			System.out.println("\nIntroduce un número:\n");
			numeroUsuario = entrada.nextInt();

			// Averiguar si el número es mayor o menor
			if (numeroUsuario < numeroObjetivo) {
				
				System.out.println("El número introducido es menor que el objetivo.");	
				
			} else if (numeroUsuario > numeroObjetivo) {
				
				System.out.println("El número introducido es mayor que el objetivo.");
				
			}
			
		} while (numeroUsuario != numeroObjetivo);

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\n¡Éxito!");

	}

}
