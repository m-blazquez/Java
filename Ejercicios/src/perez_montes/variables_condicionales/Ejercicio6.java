package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir dos números y decir si uno es múltiplo del otro.
		 */

		// Declarar e inicializar variables, seran doubles porque no se especifica que tengan que ser enteros
		double numero1 = 0.0;
		double numero2 = 0.0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce el valor del primer número:");
		numero1 = entrada.nextDouble();

		System.out.println("Introduce el valor del segundo número:");
		numero2 = entrada.nextDouble();

		// Evaluar si un número es múltiplo del otro, viendo si el resto de dividir uno entre el otro es 0 o no
		if (numero1%numero2 == 0) {

			System.out.println(numero1 + " es múltiplo de " + numero2);

		} else if (numero2%numero1 == 0) {

			System.out.println(numero2 + " es múltiplo de " + numero1);

		} else {

			System.out.println("Ninguno de los números es múltiplo del otro.");

		}

	}
}
