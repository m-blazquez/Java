package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
		 */

		// Declarar e inicializar variables
		int numero = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Pedir el numero
		do {

			System.out.println("Introduce un número del 1 al 10.\n");
			numero = entrada.nextInt();

			if (numero < 1 || numero > 10) {

				System.out.println("El número introducido no es válido. Por favor, introduce un número del 1 al 10.\n");

			}

		} while (numero < 1 || numero > 10);

		// Bucle for para sacar la tabla
		System.out.println("\nTabla de muliplicar del " + numero + ":\n");
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero + " x " + i + " = " + (numero*i));

		}

	}
}