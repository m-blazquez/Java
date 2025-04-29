package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
		 */

		// Declarar e inicializar variables
		int nota = 0;
		int contadorAprobados = 0;
		int contadorCondicionados = 0;
		int contadorSuspensos = 0;
		
		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		for (int i = 0; i < 6; i++) {
			
			// Pedir la nota, asegurándose de que está entre 0 y 10
			do {

				System.out.println("\nIntroduce la nota del alumno " + (i+1) + " (del 0 al 10).\n");
				nota = entrada.nextInt();

				if (nota < 0 || nota > 10) {

					System.out.println("\nLa nota no es válida. Por favor, introduce un número del 0 al 10.\n");

				}

			} while (nota < 0 || nota > 10);
			
			// Evaluar si esa nota es un aprobado, condicionado o suspenso e incrementar el contador correspondiente
			if (nota == 10 || nota == 9 || nota == 8 || nota == 7 || nota == 6 || nota == 5) {
				contadorAprobados++;
			} else if (nota == 4) {
				contadorCondicionados++;
			} else {
				contadorSuspensos++;
			}

		}
		
		// Imprimir los resultados
		System.out.println("\nNº alumnos aprobados: " + contadorAprobados);
		System.out.println("Nº alumnos condicionados: " + contadorCondicionados);
		System.out.println("Nº alumnos suspensos: " + contadorSuspensos);
	}
}