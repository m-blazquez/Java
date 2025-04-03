package estructuras_basicas;

public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar un array de ints que va a almacenar 5 elementos
		int [] miArray = new int[5];

		// Asignar los valores del array de uno en uno
		miArray[0] = 5; // Como siempre, se empieza a contar en 0
		miArray[1] = 38;
		miArray[2] = -15;
		miArray[3] = 92;
		miArray[4] = 71;

		// Para ver los valores que hay un array hay que recorrerlo
		for (int i = 0; i < 5; i++) {

			System.out.println("Valor en la posición " + i + ": " + miArray[i]);

		}

		// También se pueden asignar los valores en la misma línea que se declara un array
		int [] array2 = {10, 20, 30, 40, 50};

		// Para recorrerlo igual, pero si no supiésemos cuantos elementos tiene podemos usar el metodo length
		for (int i = 0; i < array2.length; i++) {

			System.out.println("Valor en la posición " + i + ": " + array2[i]);

		}



	}
}
