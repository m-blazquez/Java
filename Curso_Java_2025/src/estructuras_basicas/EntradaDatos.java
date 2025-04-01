package estructuras_basicas;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leer datos con la clase Scanner
		
		Scanner entrada = new Scanner(System.in); // Crear una nueva instancia de la clase Scanner con el constructor que coge datos con System.in
		
		System.out.println("Introduce tu nombre, por favor:"); // Mensaje para que el usuario sepa qué hacer
		
		String nombre_usuario = entrada.nextLine(); // nextLine es para guardar Strings
		
		System.out.println("Hola " + nombre_usuario);
		
		System.out.println("Introduce tu edad, por favor:");
		
		int edad = entrada.nextInt(); // nextInt para guardar enteros
		
		System.out.println(nombre_usuario + " tiene " + edad + " años.");
		
		// Cuando hayas terminado con el Scanner, cerralo para no desperdiciar recursos
		entrada.close();
	}

}
