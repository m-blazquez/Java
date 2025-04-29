package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * ENUNCIADO: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
		 */

		// Declarar e inicializar variables
		int numero = 0;
		int contadorNegativos = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Declarar un array de ints que va a almacenar los N sueldos
		int [] arrayNumeros = new int[10];

		// Rellenar el array con un bucle for
		for (int i = 0; i < 10; i++) {
			
			// Pedir sueldo
			System.out.println("\nIntroduce un número (" + (i+1) + " de 10)\n");
			numero = entrada.nextInt();
			
			// Almacenar ese valor en la posición i del array
			arrayNumeros[i] = numero;
		}
		
		// Recorrer el array con otro bucle for 
		for (int i = 0; i < 10; i++) {

			// Evaluar si el valor de la posición i negativo y, si lo es, incrementar el contador
			if (arrayNumeros[i] < 0) {
				
				contadorNegativos++;
				
			}
		}
		
		// Imprimir el resultado
		if (contadorNegativos > 0) {
			
			System.out.println("\nSí se han introducido valores negativos.\n");
			
		} else {
			
			System.out.println("\nNo se han introducido valores negativos.\n");
			
		}
		
	}

}
