package estructuras_basicas;

import java.util.Scanner;

public class CondicionalIF {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir la edad al usuario por consola
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor:");
		
		int edad = entrada.nextInt(); // nextInt para guardar enteros
		
		entrada.close();
		
		// Si es mayor de edad (>= 18 años) decirlo
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");
			
		}
		
		// Añadimos un else para que, si es menor, lo diga
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");
			
		} else {
			
			System.out.println("Eres menor de edad");
			
		}
		
		// Se pueden encadenar varios ifs con ELSEIF
		
		if (edad >= 65) {
			
			System.out.println("Estás jubilado");
			
		} else if (edad >= 22) {
			
			System.out.println("Estás en edad de trabajar");
			
		} else {
			
			System.out.println("Eres joven");
			
		}

	}

}
