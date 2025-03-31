package estructuras_basicas;

public class ManipulacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Miguel";
		
		// Para averiguar la longitud de un String
		System.out.println("La longitud del nombre es " + nombre.length());
		
		// Para averiguar qué carácter hay en una determianda posición (empezando a contar desde 0)
		System.out.println("La primera letra del nombre es " + nombre.charAt(0));
		
		// Para averiguar la última letra
		char ultima_letra = nombre.charAt(nombre.length()-1);
		System.out.println("La última letra del nombre es " + ultima_letra);
		
		// Para sacar un substring (subcadena)
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		System.out.println(frase.substring(4)); // Sólo dando char de partida
		System.out.println(frase.substring(4, 6)); //dando el char de partida y el char de después del final (este no lo coge)
		
		// Para ver si dos strings tienen el mismo valor
		String alumno1 = "David";
		String alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2)); // Teniendo en cuenta las mayúsculas
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); // Sin tener en cuenta las mayúsculas

	}

}
