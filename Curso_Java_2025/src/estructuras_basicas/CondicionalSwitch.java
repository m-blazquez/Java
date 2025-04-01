package estructuras_basicas;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir un número de mes
		Scanner entrada = new Scanner(System.in);
						
		System.out.println("Introduce el número de mes, por favor:");
						
		int numero_mes = entrada.nextInt(); // nextInt para guardar enteros
		
		// Evaluar qué mes es
		
		switch(numero_mes) {
		
		case 1: 
			System.out.println("Enero");
			break;
			
		case 2: 
			System.out.println("Febrero");
			break;
			
		case 3: 
			System.out.println("Marzo");
			break;
			
		case 4: 
			System.out.println("Abril");
			break;
			
		case 5: 
			System.out.println("Mayo");
			break;
			
		case 6: 
			System.out.println("Junio");
			break;
			
		case 7: 
			System.out.println("Julio");
			break;
			
		case 8: 
			System.out.println("Agosto");
			break;
			
		case 9: 
			System.out.println("Septiembre");
			break;
			
		case 10: 
			System.out.println("Octubre");
			break;
			
		case 11: 
			System.out.println("Noviembre");
			break;
			
		case 12: 
			System.out.println("Diviembre");
			break;
		
		default:
			System.out.println("Número de mes incorrecto");
		
		}
		
	// Switch en las ultimas versiones puede utilizarse para asignar valor a variables en base a los casos:
		
String mes = switch(numero_mes) {
		
		case 1 -> "Enero";
			
		case 2 -> "Febrero";
			
		case 3 -> "Marzo";
			
		case 4 -> "Abril";
			
		case 5 -> "Mayo";
			
		case 6 -> "Junio";
			
		case 7 -> "Julio";
			
		case 8 -> "Agosto";
			
		case 9 -> "Septiembre";
			
		case 10 -> "Octubre";
			
		case 11 -> "Noviembre";
			
		case 12 -> "Diviembre";
		
		default -> "Número de mes incorrecto";
		
	};
		
	System.out.println("El mes es " + mes);
		
	// También permite agrupar los valors:
	
	String estacion = switch(numero_mes) {
	
		case 1,2,3 -> "invierno";
		
		case 4,5,6 -> "primavera";
		
		case 7,8,9 -> "verano";
		
		case 10,11,12 -> "otoño";
		
	default -> "Número de mes incorrecto";
	
	};
	
	System.out.println("Estás en " + estacion);




	}

}
