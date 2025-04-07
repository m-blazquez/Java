package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		 */

		// Declarar e inicializar variables. En el enunciado los números no tienen posiciones decimales, por lo que entenderé que son ints (y además así variamos un poco, que en los demás ejercicios siempre han sido doubles)
		int numero = 0;
		int cifras = 0;
		
		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce el valor del número:");
		numero = entrada.nextInt();
		
		// Convertir el número a String con el método valueOf de la clase String. Originalmente intenté hacer un casting, pero no está permitido
		String numeroS = String.valueOf(numero);
		
		// Obtener la longitud del String. Como los datos de partida eran ints, este valor debe ser el mismo que el número de cifras
		cifras = numeroS.length();
		
		// Devolver el resultado
		System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
		

	}

}
