package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir un número y calcular su factorial.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		long factorial = 0L;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Pedir el número

		do {

			System.out.println("\nIntroduce un número mayor o igual a 1:\n");
			numero = entrada.nextInt();

			if (numero < 1) {

				System.out.println("El número introducido es menor que 1. Por favor, introduce un número mayor o igual a 1.");

			}

		} while (numero < 1);

		// Bucle for
		factorial = numero;
		
		for (int i = numero - 1; i > 0; i--) {

			// Añadir número al factorial
			factorial = factorial * i;

		}
		
		// Devolver el factorial
		System.out.println("El factorial de " + numero + " es " + factorial);



	}
}
