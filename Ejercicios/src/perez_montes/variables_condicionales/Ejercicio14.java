package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		 */

		// Declarar e inicializar variables. En el enunciado los números no tienen posiciones decimales, por lo que entenderé que son ints (y además así variamos un poco, que en los demás ejercicios siempre han sido doubles)
		int nota = 0;

		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce una nota de 0 a 10:");
		nota = entrada.nextInt();

		// Evaluar con un switch "de los nuevos"
		String notaTexto = switch(nota) {

		case 1, 2, 3, 4 -> "Insuficiente";

		case 5 -> "Suficiente";

		case 6 -> "Bien";

		case 7, 8 -> "Notable";
		
		case 9, 10 -> "Sobresaliente";

		default -> "La nota que has introducido no es válida, debe ser entre 0 y 10";

		};

		System.out.println("La nota que has introducido (" + nota + ") corresponde a un " + notaTexto);


	}

}