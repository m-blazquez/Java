package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
		 */

		// Declarar e inicializar variables, en este caso todas son ints 
		int dia = 0;
		int mes = 0;
		int year = 0;
		boolean diaBien = false;
		boolean mesBien = false;
		boolean yearBien = false;

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
		 *  - El día debe estar entre 1 y el número de días del mes especificado
		 *  - El mes debe estar entre 1 y 12
		 *  - Asumiendo que sólo estamos teniendo en cuenta los años "después de Cristo", el año debería ser positivo
		 * 
		 * Evaluemos si se da todo eso al mismo tiempo
		 */

		// Antes de nada, vamos a tener en cuenta el número máximo de días que puede tener cada mes con un swithc "de los modernos"
		int maximoDiasMes = switch(mes) {

		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		default -> 0;

		};

		// Ahora veamos si el día es correcto en función del mes con ifs y else ifs
		if (maximoDiasMes == 0) {

			System.out.println("ERROR: El mes introducido no es válido. No se puede evaluar si el día es válido.");
			diaBien = false;

		} else if (dia < 1 || dia > maximoDiasMes) {

			System.out.println("ERROR: El día no es válido.");
			diaBien = false;

		} else {

			diaBien = true;

		}

		// Ahora el mes
		if (mes > 0 && mes < 13) {

			mesBien = true;

		} else {

			System.out.println("ERROR: El mes no es válido.");
			mesBien = false;

		}

		// Y ahora el año
		if (year > 0) {

			yearBien = true;

		} else {

			System.out.println("ERROR: El año no es válido.");
			yearBien = false;

		}
		
		// Dar el veredicto final
		if (diaBien == true && mesBien == true && yearBien == true) {
			
			System.out.println("\nVEREDICTO FINAL: La fecha es válida.");
			
		} else {
			
			System.out.println("\nVEREDICTO FINAL: La fecha no es válida.");
			
		}


	}
}