package inicio;

public class UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int raiz = Math.sqrt(9); // Esto da error porque el método Math.sqrt devuelve un double, y estqamos intentando almacenar el resultado en un int
		int raiz = (int) Math.sqrt(9); // Aquí hacemos un casting, convirtiendo en double que devuelve Math.sqrt en un int
		System.out.println("La raíz cuadrada de 9 es " + raiz);
		
		double raiz2 = Math.sqrt(685.26); // Si no estamos seguros de que el resultado es un int mejor dejarlo como double para evitar pérdida de información (si fuese decimal se trunca a la parte entera, descartando las cifras decimales)
		System.out.println("La raíz cuadrada de 685.26 es " + raiz2);
		
		

	}

}
