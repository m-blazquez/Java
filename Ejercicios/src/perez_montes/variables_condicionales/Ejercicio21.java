package perez_montes.variables_condicionales;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO:  Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
		 */
		
		// Declarar e inicializar variables
		int nota = 0;
		
		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		
		// Pedir al usuario los valores (le he añadido bucles do while para asegurar que los valores son válidos):
		do {

			System.out.println("Introduce una nota del 0 al 10:");
			nota = entrada.nextInt();

		} while (nota < 0 || nota > 10);
		
		// Utilizar un switch de los modernos para almacenar la nota en texto
		String notaString = switch(nota) {

		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		case 10 -> "diez";
		default -> "(Algo raro ha pasado...)";

		};
		
		// Escribir el resultado
		System.out.println("Has sacado un " + notaString);

	}

}
