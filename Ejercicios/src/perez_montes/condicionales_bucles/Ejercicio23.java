package perez_montes.condicionales_bucles;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
		 */

		// Declarar e inicializar variables. La declaro como double porque el enunciado no especifica que tengan que ser enteros
		double numero = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario el número, elevarlo al cuadrado y mostrar el resultado. Todo dentro de un do while para controlar que el número sea positivo:
		do {

			// Pedir el número
			System.out.println("Introduce un número:");
			numero = entrada.nextDouble();
			
			// Si el número introducido es negativo salir del bucle
			if (numero < 0) {				
		        break;		        
		    }
			
			// Elevarlo al cuadrado
			numero = Math.pow(numero, 2);
			
			// Mostrar el resultado
			System.out.println("\nEl número que as introducido elevado al cuadrado es " + numero + "\n");

		} while (numero >= 0);
		
		// En cuanto se introduzca un número negativo se saldrá del bucle y el programa acabará. Incluir un mensaje para informar
		System.out.println("El número introducido es negativo. Fin del programa");

	}

}
