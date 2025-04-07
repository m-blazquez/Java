package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir tres números y mostrarlos ordenados de mayor a menor.
		 */

		// Declarar e inicializar variables, seran doubles porque no se especifica que tengan que ser enteros
		double numero1 = 0.0;
		double numero2 = 0.0;
		double numero3 = 0.0;
		double mayor = 0.0;
		double menor = 0.0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce el valor del primer número:");
		numero1 = entrada.nextDouble();

		System.out.println("Introduce el valor del segundo número:");
		numero2 = entrada.nextDouble();
		
		System.out.println("Introduce el valor del tercer número:");
		numero3 = entrada.nextDouble();
		
		/*
		 * Inicialmente iba a hacer esto como en los ejercicios anteriores, con Math.max y Math.min, pero sólo aceptan dos números...
		 */

		// Ya que estos ejercicios son de variables y condicionales, veámoslo con condicionales...
		if (numero1 > numero2 && numero2 > numero3) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero1 + ", " + numero2 + " y " + numero3);
			
		} else if (numero2 > numero1 && numero1 > numero3) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero2 + ", " + numero1 + " y " + numero3);
			
		} else if (numero3 > numero1 && numero1 > numero2) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero3 + ", " + numero1 + " y " + numero2);
			
		} else if (numero2 > numero3 && numero3 > numero1) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero2 + ", " + numero3 + " y " + numero1);
			
		} else if (numero3 > numero2 && numero2 > numero1) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero3 + ", " + numero2 + " y " + numero1);
			
		} else if (numero1 > numero3 && numero3 > numero2) {
			
			System.out.println("Los números ordenados de mayor a menos son: " + numero1 + ", " + numero3 + " y " + numero2);
			
		} else {
			
			System.out.println("Este caso se me ha pasado...");
			
		}

	}

}
