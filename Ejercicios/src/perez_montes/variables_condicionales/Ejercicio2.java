package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Pedir el radio de un círculo y calcular su área. A=PI*r^2.
		 */
		
		// Declarar e inicializar variables, seran doubles porque tanto el radio como el área de un circulo pueden tener decimales
		double radio = 0.0;
		double area = 0.0;
		
		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Solicitar al usuario que introduzca los valores de los coeficientes:
		System.out.println("Introduce el valor del radio:");
		radio = entrada.nextDouble();
		
		// Calcular el área del círculo utilizando la constante pi de la clase Math:
		area = 2 * Math.PI * Math.pow(radio, 2);
		
		// Devolver el resultado a pantalla
		System.out.println("El área del círculo es " + area);

	}

}
