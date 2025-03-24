package inicio;

public class UsoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edad; // Declarar una variable de tipo byte
		
		edad = 17; // Inicializar la variable "edad" con el valor 17
		
		System.out.println(edad);
		
		int sueldo = 1500; // Declarar e inicializar una variable en la misma linea
		
		System.out.println(sueldo);
		
		// Si se utiliza inferencia de tipos es necesario declarar e inicializar la variable en la misma linea
		
		edad = 36; // Cambiar el valor de una variable
		
		System.out.println(edad);
		
		/* Esto
		 * es
		 * un
		 * comentario
		 * de
		 * varias
		 * lineas
		 */
		
		int operador1, operador2, resultado; // Declaracion multiple de variables
		
		int numero1 = 1, numero2 = 2, suma = numero1 + numero2; // En una declaracion multiple tambien se pueden inicializar las variables
		
		System.out.println(suma);

	}

}
