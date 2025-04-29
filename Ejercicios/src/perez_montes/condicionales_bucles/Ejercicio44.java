package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * ENUNCIADO: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		 */

		// Declarar e inicializar variables
		int nota = 0;
		int contadorSuspensos = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Declarar un array de ints que va a almacenar los N sueldos
		int [] arrayNotas = new int[5];

		// Rellenar el array con un bucle for
		for (int i = 0; i < 5; i++) {
			
			// Pedir nota
			System.out.println("\nIntroduce una nota (" + (i+1) + " de 5)\n");
			nota = entrada.nextInt();
			
			// Almacenar ese valor en la posición i del array
			arrayNotas[i] = nota;
		}
		
		// Recorrer el array con otro bucle for 
		for (int i = 0; i < 5; i++) {

			// Evaluar si el valor de la posición i es un suspenso y, si lo es, incrementar el contador
			if (arrayNotas[i] < 5) {
				
				contadorSuspensos++;
				
			}
		}
		
		// Imprimir el resultado
		if (contadorSuspensos > 0) {
			
			System.out.println("\nSí hay suspensos.\n");
			
		} else {
			
			System.out.println("\nNo hay suspensos.\n");
			
		}
		
	}

}
