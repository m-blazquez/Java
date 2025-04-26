package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		 */

		// Declarar e inicializar variables
		int numero = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Pedir al usuario el número, elevarlo al cuadrado y mostrar el resultado. Todo dentro de un do while para controlar que el número sea positivo:
		do {

			// Pedir el número
			System.out.println("Introduce un número:\n");
			numero = entrada.nextInt();

			// Si el número introducido es negativo salir del bucle
			if (numero == 0) {				
				break;		        
			}

			// Evaluar si es par o impar
			if (numero % 2 == 0) {

				System.out.println("\nEl número que as introducido es par\n");

			} else if (numero % 2 != 0) {

				System.out.println("\nEl número que as introducido es impar\n");

			}

		} while (numero != 0);

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nEl número introducido es 0. Fin del programa");

	}

}


