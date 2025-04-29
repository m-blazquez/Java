package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * ENUNCIADO: Pedir 5 números e indicar si alguno es múltiplo de 3.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		int contadorMultiplos3 = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Declarar un array de ints que va a almacenar los N sueldos
		int [] arrayNumeros = new int[5];

		// Rellenar el array con un bucle for
		for (int i = 0; i < 5; i++) {
			
			// Pedir número
			System.out.println("\nIntroduce un número (" + (i+1) + " de 5)\n");
			numero = entrada.nextInt();
			
			// Almacenar ese valor en la posición i del array
			arrayNumeros[i] = numero;
		}
		
		// Recorrer el array con otro bucle for 
		for (int i = 0; i < 5; i++) {

			// Evaluar si el valor de la posición i es un múltiplo de 3 y, si lo es, incrementar el contador
			if (arrayNumeros[i] % 3 == 0) {
				
				contadorMultiplos3++;
				
			}
		}
		
		// Imprimir el resultado
		if (contadorMultiplos3 > 0) {
			
			System.out.println("\nSí hay múltiplos de 3.\n");
			
		} else {
			
			System.out.println("\nNo hay múltiplos de 3.\n");
			
		}
		
	}

}
