package perez_montes.variables_condicionales;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO: Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
		 */

		// Declarar e inicializar variables
		int numero = 0;

		// Crear un objeto de clase Scanner para guardar los valores
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario los valores (le he añadido bucles do while para asegurar que los valores son válidos):
		do {

			System.out.println("Introduce un número del 0 al 99:");
			numero = entrada.nextInt();

		} while (numero < 0 || numero > 99);
		
		/*
		 *  He decidido usar un switch gigante para cada uno de los 100 casos.
		 *  Soy consciente de que es totalmente fuerza bruta. 
		 *  
		 *  Se podría haber hecho de otra forma, separando el número en decenas y unidades y construyendo los nombres en "String" en base a estos valores.
		 *  Pero sinceramente... teniendo en cuenta que hay varios casos especiales que no siguen la norma general (once, doce... veintiuno, veintidos...)
		 *  me parece verdaderamente más fácil hacerlo así 
		 */

		String numeroString = switch(numero) {

		case 0 -> "cero";
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		case 10 -> "diez";
		case 11 -> "once";
		case 12 -> "doce";
		case 13 -> "trece";
		case 14 -> "catorce";
		case 15 -> "quince";
		case 16 -> "dieciséis";
		case 17 -> "diecisiete";
		case 18 -> "dieciocho";
		case 19 -> "diecinueve";
		case 20 -> "veinte";
		case 21 -> "veintiuno";
		case 22 -> "veintidós";
		case 23 -> "veintitrés";
		case 24 -> "veinticuatro";
		case 25 -> "veinticinco";
		case 26 -> "veintiséis";
		case 27 -> "veintisiete";
		case 28 -> "veintiocho";
		case 29 -> "veintinueve";
		case 30 -> "treinta";
		case 31 -> "treinta y uno";
		case 32 -> "treinta y dos";
		case 33 -> "treinta y tres";
		case 34 -> "treinta y cuatro";
		case 35 -> "treinta y cinco";
		case 36 -> "treinta y seis";
		case 37 -> "treinta y siete";
		case 38 -> "treinta y ocho";
		case 39 -> "treinta y nueve";
		case 40 -> "cuarenta";
		case 41 -> "cuarenta y uno";
		case 42 -> "cuarenta y dos";
		case 43 -> "cuarenta y tres";
		case 44 -> "cuarenta y cuatro";
		case 45 -> "cuarenta y cinco";
		case 46 -> "cuarenta y seis";
		case 47 -> "cuarenta y siete";
		case 48 -> "cuarenta y ocho";
		case 49 -> "cuarenta y nueve";
		case 50 -> "cincuenta";
		case 51 -> "cincuenta y uno";
		case 52 -> "cincuenta y dos";
		case 53 -> "cincuenta y tres";
		case 54 -> "cincuenta y cuatro";
		case 55 -> "cincuenta y cinco";
		case 56 -> "cincuenta y seis";
		case 57 -> "cincuenta y siete";
		case 58 -> "cincuenta y ocho";
		case 59 -> "cincuenta y nueve";
		case 60 -> "sesenta";
		case 61 -> "sesenta y uno";
		case 62 -> "sesenta y dos";
		case 63 -> "sesenta y tres";
		case 64 -> "sesenta y cuatro";
		case 65 -> "sesenta y cinco";
		case 66 -> "sesenta y seis";
		case 67 -> "sesenta y siete";
		case 68 -> "sesenta y ocho";
		case 69 -> "sesenta y nueve";
		case 70 -> "setenta";
		case 71 -> "setenta y uno";
		case 72 -> "setenta y dos";
		case 73 -> "setenta y tres";
		case 74 -> "setenta y cuatro";
		case 75 -> "setenta y cinco";
		case 76 -> "setenta y seis";
		case 77 -> "setenta y siete";
		case 78 -> "setenta y ocho";
		case 79 -> "setenta y nueve";
		case 80 -> "ochenta";
		case 81 -> "ochenta y uno";
		case 82 -> "ochenta y dos";
		case 83 -> "ochenta y tres";
		case 84 -> "ochenta y cuatro";
		case 85 -> "ochenta y cinco";
		case 86 -> "ochenta y seis";
		case 87 -> "ochenta y siete";
		case 88 -> "ochenta y ocho";
		case 89 -> "ochenta y nueve";
		case 90 -> "noventa";
		case 91 -> "noventa y uno";
		case 92 -> "noventa y dos";
		case 93 -> "noventa y tres";
		case 94 -> "noventa y cuatro";
		case 95 -> "noventa y cinco";
		case 96 -> "noventa y seis";
		case 97 -> "noventa y siete";
		case 98 -> "noventa y ocho";
		case 99 -> "noventa y nueve";
		default -> "(Algo raro ha pasado...)";

		};

		// Escribir el resultado
		System.out.println("El número en forma de texto: " + numeroString);

	}

}
