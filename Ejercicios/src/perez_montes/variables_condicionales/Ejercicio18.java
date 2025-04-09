package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).
		 */
		
		/*
		 * El primer paso es asegurarse de que la fecha es válida, copio lo del ejercicio 16.
		 * El siguiente paso es calcular la siguiente fecha, lo hago prácticamente igual que en el número 17.
		 * La única diferencia es que donde se decía 30 ahora se utiliza la variable maximoDiasMes
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
		
		// Ahora, si la fecha no es válida que el programa no haga nada más, pero si es válida que devuelva el día siguiente
		if (diaBien == false || mesBien == false || yearBien == false) { // Con cualqueira de estas condiciones la fecha ya sería inválida, por eso || (o) en vez de && (y) 
			
		} else {
			
			if (dia < maximoDiasMes) {
				
				dia++; // Esto es igual que dia = dia + 1
				System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + year);
				
			} else if (dia == maximoDiasMes && mes < 12) {
				
				dia = 1;
				mes++;
				System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + year);
			} else if (dia == maximoDiasMes && mes == 12) {
				
				dia = 1;
				mes = 1;
				year++;
				System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + year);
				
			}
			
		}


	}

}