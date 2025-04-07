package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
		 */

		// Declarar e inicializar variables, en este caso todas son ints 
		int dia = 0;
		int mes = 0;
		int year = 0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los valores:
		System.out.println("Introduce el día:");
		dia = entrada.nextInt();
		
		System.out.println("Introduce el mes:");
		mes = entrada.nextInt();
		
		System.out.println("Introduce el año:");
		year = entrada.nextInt();

		/*
		 * Para que una fecha sea válida debe cumplirse que:
		 * 
		 *  - El día debe estar entre 1 y 30 (según el enunciado)
		 *  - El mes debe estar entre 1 y 12
		 *  - Asumiendo que sólo estamos teniendo en cuenta los años "después de Cristo", el año debería ser positivo
		 * 
		 * Evaluemos si se da todo eso al mismo tiempo
		 */
		
		if (dia > 0 && dia < 31 && mes > 0 && mes < 13 && year > 0) {
			
			System.out.println("La fecha es válida.");
			
		} else {
			
			System.out.println("La fecha no es válida.");
			
		}


	}

}