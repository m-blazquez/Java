package perez_montes.variables_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
		 *  
		 */
		
		// Una ecuación de segundo grado tiene esta forma: ax^2 + bx + c = 0
		//La formula para resolver estas ecuaciones es x = (-b ± sqrt(b^2 - 4ac)) / (2a)
		
		// Empecemos declarando e inicializando las variables, que a priori son todas double, porque los coeficients pueden ser decimales
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		
		// Crear un objeto de tipo scanner para pedir los valores iniciale por consola
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas
		
		// Solicitar al usuario que introduzca los valores de los coeficientes:
		System.out.println("Introduce el valor de a:");
		a = entrada.nextDouble();
		
		System.out.println("Introduce el valor de b:");
		b = entrada.nextDouble();
		
		System.out.println("Introduce el valor de c:");
		c = entrada.nextDouble();
		
		// Determinar si la ecuación se puede resolver (si el discriminante (b^2 - 4ac) es positivo), y si se puede calcular y mostrar las dos soluciones.
		// Si no se puede decirlo.
		if ((Math.pow(b, 2) - 4*a*c) > 0) {
			
			// Calcular las soluciones
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			
			// Mostrarlas
			System.out.println("Las soluciones de tu ecuación son:\nx1 = " + x1 + "\nx2 = " + x2);
			
		} else {
			
			System.out.println("El discriminante de la ecuación es negativo, no tiene soluciones reales.");
			
		}
				
		
		
		
		

	}

}
