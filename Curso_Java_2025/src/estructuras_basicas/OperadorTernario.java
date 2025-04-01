package estructuras_basicas;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir la edad al usuario por consola
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Introduce tu edad, por favor:");
				
		int edad = entrada.nextInt(); // nextInt para guardar enteros
		
		
		// Evaluar si es mayor de edad con un operador ternario
		String resultado = (edad>18)? "Eres menor de edad":"Eres mayor de edad";
		System.out.println(resultado);
		
		

	}

}
