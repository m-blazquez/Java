package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir un número N, y mostrar todos los números del 1 al N.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		int contador = 1;

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

		// Bucle do-while
		System.out.println("Números entre el 1 y el " + numero + ":\n");
		
		do {

			// Devolver el valor del contador
			System.out.println(contador);
			
			// Si desde el principio contador == numero romper el bucle
			if (contador == numero) {
				
				break;
				
			}

			// Incrementar el contador
			contador++;

		} while (contador != numero);


	}

}
