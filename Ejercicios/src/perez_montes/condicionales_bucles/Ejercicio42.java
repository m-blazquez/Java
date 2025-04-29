package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * ENUNCIADO: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		 */

		// Declarar e inicializar variables
		int numeroN = 0;
		int sueldo = 0;
		int sueldoMayor = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Introducir número N
		System.out.println("Introduce el número de sueldos a evaluar.\n");
		numeroN = entrada.nextInt();

		// Declarar un array de ints que va a almacenar los N sueldos
		int [] arraySueldos = new int[numeroN];

		// Rellenar el array con un bucle for
		for (int i = 0; i < numeroN; i++) {
			
			// Pedir sueldo
			System.out.println("\nIntroduce un sueldo (" + (i+1) + " de " + numeroN + ")\n");
			sueldo = entrada.nextInt();
			
			// Almacenar ese valor en la posición i del array
			arraySueldos[i] = sueldo;
		}
		
		// Recorrer el array con otro bucle for y retener el sueldo más alto
		for (int i = 0; i < numeroN; i++) {

			// Evaluar si el valor de la posición i es mayor que el almacenado en sueldoMayor y, si lo es, actualizar el valor de esta variable
			if (arraySueldos[i] > sueldoMayor) {
				
				sueldoMayor = arraySueldos[i];
				
			}
		}
		
		// Imprimir el resultado
		System.out.println("\nEl sueldo más alto es de " + sueldoMayor + " €");
	}

}
