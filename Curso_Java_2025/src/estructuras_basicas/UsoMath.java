package estructuras_basicas;

public class UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Raíces cuadradas
		int raiz = (int) Math.sqrt(9); // Aquí hacemos un casting, convirtiendo en double que devuelve Math.sqrt en un int
		System.out.println("La raíz cuadrada de 9 es " + raiz);
		
		double raiz2 = Math.sqrt(685.26); // Si no estamos seguros de que el resultado es un int mejor dejarlo como double para evitar pérdida de información (si fuese decimal se trunca a la parte entera, descartando las cifras decimales)
		System.out.println("La raíz cuadrada de 685.26 es " + raiz2);
		
		// Potencias
		double potencia = Math.pow(5, 3); // Método para hacer potencias
		System.out.println("5 elevado a 3 es " + potencia); 
		
		// Para generar números aleatorios entre 0 y 100:
		double aleatorio = Math.random(); // Genera un double diferente entre 0 y º
		System.out.println("Número aleatorio: " + aleatorio);
		System.out.println("Número aleatorio entre 0 y 100: " + (aleatorio*100)); // Multiplicando por 100
		System.out.println("Número aleatorio entre 0 y 100 que sea un int: " + (int) (aleatorio*100)); // Haciendo un casting. PROBLEMA: No redondea, sólo trunca los valores 
		
		// Para redondear, método Math.round()
		aleatorio = aleatorio*100; // Guardo en la misma variable lo del apartado anterior
		System.out.println("Número aleatorio entre 0 y 100: " + aleatorio);
		int aleatorioIntRounded = Math.round((float) aleatorio);
		System.out.println("Número aleatorio entre 0 y 100 que sea un int redondeado: " + aleatorioIntRounded);
		
		// Valor absoluto
		int absoluto = Math.abs(-45);
		System.out.println("Valor absoluto de -45: " + absoluto);
		
		// El máximo de dos valores
		int mayor = Math.max(3, 7);
		System.out.println("Entre 3 y 7, el mayor número es " + mayor);
		
	}

}
