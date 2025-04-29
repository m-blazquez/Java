package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
		 */

		// Declarar e inicializar variables
		double sueldo = 0;
		double suma = 0;
		int contador = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		for (int i = 0; i < 10; i++) {

			// Pedir el sueldo
			System.out.println("\nIntroduce un sueldo:\n");
			sueldo = entrada.nextDouble();

			// Añadirlo a la suma
			suma += sueldo;

			// Determinar si es mayor de 1000 y, si lo es, incrementar el contador
			if (sueldo > 1000) {

				contador++;

			}

		}

		// Imprimir los resultados:
		System.out.println("Suma total: " + suma);
		System.out.println("Nº de sueldos superiores a 1000 €: " + contador);

	}
}