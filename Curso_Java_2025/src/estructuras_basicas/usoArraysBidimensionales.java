package estructuras_basicas;

public class usoArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarar un array bidiomensional (con [][])
		int [][] arrayDeArrays = new int [4] [5]; // Vamos a tener 4 arrays de 5 elementos cada uno
				
		// Para rellenar esto, con un bucle dentro de otro:
		for (int i = 0; i < 4; i++ ) {
			System.out.println("Rellenando el array " + i + "...\n");
			for (int j = 0; j < 5; j++) {
				System.out.println("Añadiendo elemento " + j);
				arrayDeArrays [i] [j] = i+j; // El i+j es al azar, no me apetece crear un scanner para ir agregandolos yo
			}
			System.out.println("\n" + "Array " + i + " relleno\n");
		}
		

	}

}
