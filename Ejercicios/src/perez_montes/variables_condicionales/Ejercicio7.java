package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir dos números y decir cual es el mayor.
		 */

		// Declarar e inicializar variables, seran doubles porque no se especifica que tengan que ser enteros
		double numero1 = 0.0;
		double numero2 = 0.0;
		double mayor = 0.0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce el valor del primer número:");
		numero1 = entrada.nextDouble();

		System.out.println("Introduce el valor del segundo número:");
		numero2 = entrada.nextDouble();

		// Determinar cuál es el mayor y devolver el resultado
		mayor = Math.max(numero1, numero2);
		System.out.println("Entre " + numero1 + " y "+ numero2 + ", el mayor número es " + mayor);

	}
}
