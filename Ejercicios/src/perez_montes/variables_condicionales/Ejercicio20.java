package perez_montes.variables_condicionales;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO:  Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
		 */
		
		// Declarar e inicializar variables
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		
		// Pedir al usuario los valores (le he añadido bucles do while para asegurar que los valores son válidos):
		do {

			System.out.println("Introduce la hora:");
			hora = entrada.nextInt();

		} while (hora < 0 || hora > 23);
		
		do {

			System.out.println("Introduce los minutos:");
			minuto = entrada.nextInt();

		} while (minuto < 0 || minuto > 59);
		
		do {

			System.out.println("Introduce los segundos:");
			segundo = entrada.nextInt();

		} while (segundo < 0 || segundo > 59);

		// Imprimir la hora actual
		System.out.println("Hora actual: " + hora + " h, " + minuto + " m y " + segundo + " s.");
		
		// Calcular nueva hora con ifs anidados
		segundo++; // Sumar un segundo
		if (segundo >= 60) { // Si llegamos a 60 s, actualizar el minuto y dejar segundos a 0
			segundo = 0;
			minuto++;
			
			if (minuto >= 60) { // Si al actualizar el minuto llegamos a los 60, actualizar la hora y dejar los minutos a 0
				minuto = 0;
				hora++;
				
				if (hora >= 24) { // Si al actualizar la hora llegamos a 24, dejarla a 0
					hora = 0;
				}
			}
			
		}
		
		// Imprimir la nueva hora
		System.out.println("Hora 1 segundo después: " + hora + " h, " + minuto + " m y " + segundo + " s.");
		
		
		

	}

}
