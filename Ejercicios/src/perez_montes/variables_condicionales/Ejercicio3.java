package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Pedir el radio de una circunferencia y calcular su longitud.
		 */
		
		// NOTA: La fórmula para la longitud de una circunferencia es: longitud = 2 * Pi * radio
		
		// Declarar e inicializar variables, seran doubles porque tanto el radio como el área de un circulo pueden tener decimales
		double radio = 0.0;
		double longitud = 0.0;
		
		// Crear un objeto de la clase scanner para ingresar el radio
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Solicitar al usuario que introduzca los valores de los coeficientes:
		System.out.println("Introduce el valor del radio:");
		radio = entrada.nextDouble();
		
		// Calcular el área del círculo utilizando la constante pi de la clase Math:
		longitud = 2 * Math.PI * radio;
		
		// Devolver el resultado a pantalla
		System.out.println("La longitud de la circunferencia es " + longitud);

	}

}
