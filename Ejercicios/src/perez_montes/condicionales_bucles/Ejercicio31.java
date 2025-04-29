package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Escribir todos los números del 100 al 0 de 7 en 7.
		 */

		// Declarar e inicializar variables
		int contador = 100;

		// Bucle do-while
		System.out.println("Números entre el 100 y el 0 de 7 en 7:\n");

		do {

			// Devolver el valor del contador
			System.out.println(contador);

			// Restar 7 al contador
			contador -= 7;

		} while (contador > 0);


	}

}

