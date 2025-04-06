package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir un número e indicar si es positivo o negativo.
		 */

		// Declarar e inicializar una variable para almacenar el número, sera double porque no se especifica que tenga que ser enteros
		double numero = 0.0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca el número:
		System.out.println("Introduce el número:");
		numero = entrada.nextDouble();

		// Evaluar si los números son iguales y devolver el resultado a pantalla

		if (numero > 0) {

			System.out.println("El número es positivo");

		} else if (numero == 0) {

			System.out.println("El número es 0"); // Esto no se contemplaba en el enunciado, pero el 0 no sería ni positivo ni negativo

		} else {
			
			System.out.println("El número es negativo");
			
		}


	}

}
