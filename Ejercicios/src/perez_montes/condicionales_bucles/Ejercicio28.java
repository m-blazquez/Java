package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		int suma = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle do-while
		do {

			// Pedir el número
			System.out.println("\nIntroduce un número:\n");
			numero = entrada.nextInt();

			// Si el número introducido es negativo salir del bucle
			if (numero == 0) {				
				break;		        
			}

			// Añadir número a la suma 
			suma = suma + numero;

		} while (numero != 0);

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nEl número introducido es 0.\n" + "\nLa suma de todos los números introducidos es: " + suma);

	}

}
