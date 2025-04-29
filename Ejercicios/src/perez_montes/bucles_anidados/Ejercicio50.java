package perez_montes.bucles_anidados;

public class Ejercicio50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO: Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, 
		 * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
		 */
		
		// Declarar variables
		int decenasMillar;
		int millares;
		int centenas;
		int decenas;
		int unidades;
		char decenasMillarChar;
		char millaresChar;
		char centenasChar;
		char decenasChar;
		char unidadesChar;
		String contador = "";
		
		// Generar el resultado deseado con cinco bucles anidados (debe haber una forma más elegante de hacer esto con Strings...)
		for (decenasMillar = 0; decenasMillar < 10; decenasMillar++) {
			for (millares = 0; millares < 10; millares++) {
				for (centenas = 0; centenas < 10; centenas++) {
					for (decenas = 0; decenas < 10; decenas++) {
						for (unidades = 0; unidades < 10; unidades++) {
							
							// Convertir eso a chars
							decenasMillarChar = (char) (decenasMillar + '0');
							millaresChar = (char) (millares + '0');
							centenasChar = (char) (centenas + '0');
							decenasChar = (char) (decenas + '0');
							unidadesChar = (char) (unidades + '0');
							
							/*
							 * NOTA: En un principio intenté hacer el casting así: 
							 *    decenasMillarChar = (char) decenasMillar;
							 * Pero al parecer en Java eso no es correcto porque devuelve el carácter Unicode correspondiente 
							 * al código n, sindo n el int almacenado en la variable... Me parece un poco obtuso, pero al parecer es así.
							 */
							
							// Evaluar si alguno de esos elementos es un 3 y, si lo es, cambiarlo por una E
							if(decenasMillarChar =='3') {
								
								decenasMillarChar ='E';
								
							}
							
							if(millaresChar =='3') {
								
								millaresChar ='E';
								
							}
							
							if(centenasChar =='3') {
								
								centenasChar ='E';
								
							}
							
							if(decenasChar =='3') {
								
								decenasChar ='E';
								
							}
							
							if(unidadesChar =='3') {
								
								unidadesChar ='E';
								
							}
							
							// Concatenar todo esto en un String 
							contador = decenasMillarChar + "-" + millaresChar + "-" + centenasChar + "-" + decenasChar + "-" + unidadesChar;
							
							// Imprimir el String
							System.out.println(contador);
						}
					}
				}
			}
			
		}
	}

}
