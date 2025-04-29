package perez_montes.condicionales_bucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
		 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
		 * Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y 
		 * cuantas facturas se emitieron de más de 600 €.
		 */

		// Declarar e inicializar variables
		String codigoArticulo = "";
		double cantidadLitros = 0;
		double precioLitro = 0;
		double ingresosArticulo = 0;
		String codigoMejorArticulo = "";
		double ingresosMejorArticulo = 0;
		double cantidadMejorArticulo = 0;
		double facturacionTotal = 0;
		int numeroFacturas600 = 0;
		
		/* 
		 * NOTA: No tengo claro a qué se refiere el enunciado con "litros vendidos del artículo 1". Asumo que es el artículo que ha generado más ingresos
		 */

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Esto es para que coja los decimales con punto en vez de con comas

		// Bucle for
		for (int i = 1; i <= 5; i++) {
			
			// Pedir código del artículo
			System.out.println("Introduce el código del artículo de la factura " + i);
			codigoArticulo = entrada.nextLine();
			
			// Pedir cantidad vendida
			System.out.println("Introduce la cantidad vendida de la factura " + i);
			cantidadLitros = entrada.nextDouble();
			
			// Pedir precio/litro
			System.out.println("Introduce el precio/litro de la factura " + i);
			precioLitro = entrada.nextDouble();
			
			// Ñapa para que se puedan seguir leyendo Strings en las siguientes iteraciones del bucle...
			entrada.nextLine();
			
			// Calcular ingresos generados por el artículo
			ingresosArticulo = cantidadLitros * precioLitro;
			
			// Evaluar si el artículo genera más ingresos que el que esté actualmente como mejor artículo
			// Si es así, actualizar la información del mejor artículo
			if (ingresosArticulo > ingresosMejorArticulo) {
				
				codigoMejorArticulo = codigoArticulo;
				ingresosMejorArticulo = ingresosArticulo;
				cantidadMejorArticulo = cantidadLitros;
				
			}
			
			// Añadir los ingresos del artículo a la facturación total
			facturacionTotal += ingresosArticulo;
			
			// Evaluar si los ingresos del artículo son superiores a 600 € y, si lo son, incrementar el contador
			if (ingresosArticulo > 600) {
				
				numeroFacturas600++;
				
			}

		}
		
		// Imprimir los resultados
		System.out.println("Facturación total: " + facturacionTotal);
		System.out.println("Cantidad en litros del artículo que generó más ingresos (" + codigoMejorArticulo + "): " + cantidadMejorArticulo);
		System.out.println("Nº de facturas de más de 600 €: " + numeroFacturas600);
	}
}