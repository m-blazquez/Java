package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
		 * la cantidad de ceros.
		 */

		// Declarar e inicializar variables
		double numero = 0;
		double sumaPositivos = 0;
		double contadorPositivos = 0;
		double sumaNegativos = 0;
		double contadorNegativos = 0;
		double contadorCeros = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		for (int i = 0; i < 10; i++) {

			// Pedir el número
			System.out.println("\nIntroduce un número mayor o igual a 1:\n");
			numero = entrada.nextDouble();

			// Evaluar si es positivo, negativo o 0. 
			//Si es positivo o negativo añadir a las sumas respectivas, y en cualquier caso incremtnar el contador pertinente
			if (numero > 0) {
				
				sumaPositivos += numero;
				contadorPositivos++;
				
			} else if (numero < 0) {
				
				sumaNegativos += numero;
				contadorNegativos++;
				
			} else {
				
				contadorCeros++;
				
			}


		}
		
		// Imprimir los resultados:
		if (contadorPositivos > 0) {

			System.out.println("Media números positivos: " + (sumaPositivos/contadorPositivos));

		} else {

			System.out.println("Media números positivos: NA (no se han introducido números positivos)");

		}

		if (contadorNegativos > 0) {

			System.out.println("Media números negativos: " + (sumaNegativos/contadorNegativos));

		} else {

			System.out.println("Media números negativos: NA (no se han introducido números negativos)");

		}
		
		System.out.println("Cantidad de ceros: " + contadorCeros);

	}
}