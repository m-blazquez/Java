package perez_montes.variables_condicionales;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días
		 */

		/*
		 * Para introducir las fechas y ver si son válidas copio lo del ejercicio 15
		 */

		// Declarar e inicializar variables, en este caso todas son ints 
		int dia1 = 0;
		int mes1 = 0;
		int year1 = 0;
		boolean fecha1Bien = false;

		int dia2 = 0;
		int mes2 = 0;
		int year2 = 0;
		boolean fecha2Bien = false;

		// Crear un objeto de la clase scanner para ingresar los números
		Scanner entrada = new Scanner(System.in);

		// FECHA 1
		// Solicitar al usuario que introduzca los valores:
		System.out.println("PRIMERA FECHA");

		System.out.println("Introduce el día:");
		dia1 = entrada.nextInt();

		System.out.println("Introduce el mes:");
		mes1 = entrada.nextInt();

		System.out.println("Introduce el año:");
		year1 = entrada.nextInt();

		// Evaluar si la fecha es válida
		if (dia1 > 0 && dia1 < 31 && mes1 > 0 && mes1 < 13 && year1 > 0) {

			System.out.println("La fecha es válida.");
			fecha1Bien = true;

		} else {

			System.out.println("La fecha no es válida.");
			fecha1Bien = false;

		}

		// FECHA 2
		// Solicitar al usuario que introduzca los valores:
		System.out.println("SEGUNDA FECHA");

		System.out.println("Introduce el día:");
		dia2 = entrada.nextInt();

		System.out.println("Introduce el mes:");
		mes2 = entrada.nextInt();

		System.out.println("Introduce el año:");
		year2 = entrada.nextInt();

		// Evaluar si la fecha es válida
		if (dia2 > 0 && dia2 < 31 && mes2 > 0 && mes2 < 13 && year2 > 0) {

			System.out.println("La fecha es válida.");
			fecha2Bien = true;

		} else {

			System.out.println("La fecha no es válida.");
			fecha2Bien = false;

		}
		
		// Calcular el número total de días de cada fecha
		int diasTotalesFecha1 = year1 * 365 + mes1 * 30 + dia1;
		int diasTotalesFecha2 = year2 * 365 + mes2 * 30 + dia2;
		
		// Calcular la diferencia y ponerla en valor absoluto
		int diferencia = Math.abs(diasTotalesFecha1 - diasTotalesFecha2);
		
		// Si ambas fechas son válidas, mostrar el resultado, si no decir que hay fechas no válidas
		if (fecha1Bien == true && fecha2Bien == true) {
			
			System.out.println("Hay " + diferencia + " días entre las dos fechas.");
			
		} else {
			
			System.out.println("Se han introducido fechas inválidas.");
			
		}

	}

}
