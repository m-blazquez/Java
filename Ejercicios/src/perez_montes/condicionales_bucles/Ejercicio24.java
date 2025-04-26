package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
		 */

		// Declarar e inicializar variables. La declaro como double porque el enunciado no especifica que tengan que ser enteros
		double numero = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Pedir al usuario el número, elevarlo al cuadrado y mostrar el resultado. Todo dentro de un do while para controlar que el número sea positivo:
		do {

			// Pedir el número
			System.out.println("Introduce un número:\n");
			numero = entrada.nextDouble();

			// Si el número introducido es negativo salir del bucle
			if (numero == 0) {				
				break;		        
			}
			
			// Evaluar si es positivo o negatico
			if (numero > 0) {
				
				System.out.println("\nEl número que as introducido es positivo\n");
				
			} else if (numero < 0) {
				
				System.out.println("\nEl número que as introducido es negativo\n");
				
			}

		} while (numero != 0);

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nEl número introducido es 0. Fin del programa");

	}

}


