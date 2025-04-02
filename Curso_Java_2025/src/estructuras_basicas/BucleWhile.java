package estructuras_basicas;

import java.util.Scanner;

public class BucleWhile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Establecer contraseña correcta
		String clave = "Java";
				
		// Inicializar variable para almacenr la contraseña que introduzca el usuario 
		String password = "";
		
		
		// Pedir contraseña dentro de un bucle while, para que siga preguntando hasta que se acierte
		
		while (clave.equals(password) == false) {
			
			// Pedir al usuarioque introduzca la contraseña
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce la contraseña:");
			
			password = entrada.nextLine();
			
			// Si la contraseña es incorrecta que informe al usuario
			if (clave.equals(password) == false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
			
		}
		
		System.out.println("Contraseña correcta");
			
	
	}

}
