package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		 */
		
		// Declarar e inicializar variables
		double numero = 0;
		int contador = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Pedir al usuario el número, elevarlo al cuadrado y mostrar el resultado. Todo dentro de un do while para controlar que el número sea positivo:
		do {

			// Pedir el número
			System.out.println("\nIntroduce un número:\n");
			numero = entrada.nextDouble();

			// Si el número introducido es negativo salir del bucle
			if (numero < 0) {				
				break;		        
			}

			// Incrementar el contador 
			contador++;

		} while (numero >= 0);

		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("\nEl número introducido es negativo.\n" + "\nSe han introducido " + contador +" números válidos.");
	}

}
