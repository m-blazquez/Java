package perez_montes.tablas;

import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Leer 5 números y mostrarlos en el mismo orden introducido.
		 */

		// Declarar variables
		int numero = 0;
		
		// Declarar array
		int [] miArray = new int[5];

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		
		// Mensaje de inicio
		System.out.println("INICIO DEL PROGRAMA");
		
		// Rellenar el array utilizando un bucle for
		for (int i = 0; i < miArray.length; i++) {
			
			// Pedir el número
			System.out.println("\nIntroduce un número (" + (i+1) + " de " + miArray.length + ").\n");
			numero = entrada.nextInt();
			
			// Almacenar el número en la posición i
			miArray[i] = numero;
			
		}
		
		// Devolver números introducidos en el mismo orden
		System.out.println("Los números introducidos son:\n");
		for (int i = 0; i < miArray.length; i++) {

			System.out.println(miArray[i]);

		}



	}

}
