package perez_montes.bucles_anidados;

public class Ejercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
		 */
		
		// Haremos esto don dos bucles for anidados
		for (int i = 1; i <= 10; i ++) {
			
			System.out.println("Tabla de multiplicar del " + i + ":\n");
			for (int j = 0; j < 11; j++) {
				
				System.out.println(i + " x " + j + " = " + (i*j));
				
			}
			
			System.out.println(""); // Línea en blanco para que qyede mejor separado
			
		}

	}

}
