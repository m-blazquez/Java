package perez_montes.bucles_anidados;

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		boolean esPrimo = true;
		int contadorPrimos = 0;
		
		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);

		// Pedir el número
		System.out.println("Introduce un número.\n");
		numero = entrada.nextInt();
		
		// Resolver con bucles for anidados
		for (int i = (numero-1); i > 0; i--) {
			
			// Averiguar si i es un número primo
			
			/*
			 *  EXPLICACIÓN: Un número primo es un numero que sólo puede dividirse por 1 y por sí mismo. 
			 *  He tenido que buscar online cómo averiguar si un número es primo. 
			 *  Empiezo asumiendo que el número es primo hasta que se demuestre lo contrario, 
			 *  luego se busca si es divisible por algún número desde 2 hasta la raiz de i (esto es por una propiedad matemática al parecer). 
			 *  Si el número es divisible por alguno de estos, no es primo.
			 */
			
			esPrimo = true; // Reiniciar para cada iteración del bucle
			
		    for (int j = 2; j <= Math.sqrt(i); j++) {
		    	
		        if (i % j == 0) {
		        	
		            esPrimo = false;		            
		            break;
		            
		        }
		    }
			
			// Si es numero era primo, incremetnar el contador
			if (esPrimo) {
				contadorPrimos++;
			}
			
		}
		
		// Mostrar el resultado
		System.out.println("\nEntre " + numero + " y 1 hay " + contadorPrimos + " números primos.");

	}

}
