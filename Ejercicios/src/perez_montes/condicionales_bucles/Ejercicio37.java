package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años
		 * y la cantidad de alumnos que miden más de 1.75.
		 */

		// Declarar e inicializar variables
		double edad = 0;
		double altura = 0;
		double sumaEdad = 0;
		double sumaAltura = 0;
		int contadorMayores18 = 0;
		int contadorAltura175 = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		for (int i = 0; i < 5; i++) {

			// Pedir la edad
			System.out.println("\nIntroduce la edad del alumno " + (i+1) + " :\n");
			edad = entrada.nextDouble();

			// Pedir la altura
			System.out.println("\nIntroduce la altura del alumno " + (i+1) + " (en metros):\n");
			altura = entrada.nextDouble();

			// Añadir edad a la suma
			sumaEdad += edad;

			// Añadir altura a la suma
			sumaAltura += altura;

			// Determinar si la edad es mayor de 18 y, si lo es, incrementar el contador
			if (edad > 18) {

				contadorMayores18++;

			}

			// Determinar si la altura es mayor de 1.75 y, si lo es, incrementar el contador
			if (altura > 1.75) {

				contadorAltura175++;

			}

		}

		// Imprimir los resultados:
		System.out.println("Edad media de los alumnos: " + (sumaEdad/5));
		System.out.println("Altura media de los alumnos: " + (sumaAltura/5));
		System.out.println("Nº de alumnos de más de 18 años: " + contadorMayores18);
		System.out.println("Nº de alumnos de más de 1.75 m: " + contadorAltura175);


	}
}