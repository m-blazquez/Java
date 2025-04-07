package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO:  Pedir un número entre 0 y 9.999, decir si es capicúa.
		 */

		// Declarar e inicializar variables. En el enunciado los números no tienen posiciones decimales, por lo que entenderé que son ints (y además así variamos un poco, que en los demás ejercicios siempre han sido doubles)
		int numero = 0;
		
		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Solicitar al usuario que introduzca los dos números:
		System.out.println("Introduce un número entre 0 y 9.999:");
		numero = entrada.nextInt();

		// Convertir el número a String con el método valueOf de la clase String. Originalmente intenté hacer un casting, pero no está permitido
		String numeroS = String.valueOf(numero);
		
		// Declarar e inicializar una nueva variable String que almacenará el número al revés. Se irá rellenando con un bucle for que va "al revés"
		String numeroReves = "";
		
		for (int i = (numeroS.length() - 1); i >= 0; i--) {
			
			numeroReves = numeroReves + numeroS.charAt(i);
			
		}
		
		// Determinar si es capicua (numeroS igual que numeroReves)
		if (numeroS.equalsIgnoreCase(numeroReves)) {
			
			System.out.println("El número es capicúa.");
			
		} else {
			
			System.out.println("El número no es capicúa.");
			
		}
		
	}

}