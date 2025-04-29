package perez_montes.bucles_anidados;

import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Dibuja un cuadrado de n elementos de lado utilizando *.
		 */

		// Declarar variables
		int ladoCuadrado = 0;
		char simbolo = '*';

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		
		// Pedir el lado del cuadrado
		System.out.println("Introduce la longitud del lado del cuadrado.\n");
		ladoCuadrado = entrada.nextInt();
		
		// Meter una línea en blanco para que queda más bonito
		System.out.println("");
		
		// Pintar utilizando un bucle for
		for (int i = 0; i < ladoCuadrado; i ++) {
			System.out.print(String.valueOf(simbolo).repeat(ladoCuadrado) + "\n");
		}
		
		
	}

}
