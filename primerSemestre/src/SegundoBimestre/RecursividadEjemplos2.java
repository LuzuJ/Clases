package SegundoBimestre;

import java.util.Scanner;

public class RecursividadEjemplos2 {

	/**
	 * Este es un metodo para encontrar un elemento dentro de un arreglo
	 * 
	 * @param Arreglo de tipo entero
	 * @param El      elemento a buscar
	 * @param La      posicion dentro del arreglo desde donde se quiere iniciar la
	 *                busqueda
	 * @return La posicion del arrglo si encuentra el elemento, caso contrario
	 *         retornara -1 si el elemento no se ha encontrado
	 */
	/*
	 * Recuerde la diferencia entre un error y una respuesta negativa
	 */
	public static int posicionElementoRecursivo(int[] array, int elementoBuscar, int indice) {
		if (indice == array.length || array[indice] == elementoBuscar) {
			if (indice == array.length) {
				// Luego de haber recorrdio todo el arreglo, si llega al tamaño del arreglo
				// y no se encontro el vlaor se retorna -1
				return -1;
			} else {
				// Si el elemento se encontro se retornara la posicion dentro del arreglo
				return indice;
			}
		} else {
			return posicionElementoRecursivo(array, elementoBuscar, indice + 1);
		}
	}

	/**
	 * Esta funcion calcula la suma de los valores para la serie de fibonacci
	 * 
	 * @param Posicion del elemento a buscar
	 * @return El valor del elemento buscado Tome en cuenta que esta funcion trabaja
	 *         con una recursividad doble. Desde el tope superior va a ir sumando
	 *         los valores de las posiciones anteriores para ir generando los
	 *         valores deseados hasta encontrar la pareja 0-1 Con estos indices se
	 *         rompe la recursividad y se retorna los valores calculados para
	 *         realizar la suma.
	 */
	public static int fibonacciRecursivo(int n) {
		// CASO BASE, si es cero devuelve un cero
		// Puedes poder n&lt;=0 tambien para inlcuir negativos
		if (n == 0) {
			return 0;
			// CASO BASE, si es 1 devuelve 1
		} else if (n == 1) {
			return 1;
		} else {
			// Hago la suma
			return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		}
	}

	/**
	 * Este metodo calcula el resultado de una base a un exponente
	 * 
	 * @param base
	 * @param exponente
	 * @return resultado
	 */
	public static double potencia(int base, int exponente) {
		/*
		 * Recuerde que tanto el caso de expo 0 y exp 1 son los unicos casos que rompen
		 * la recursividad
		 */
		if (exponente == 0) { // caso base
			return 1; // 10^0=1
		} else if (exponente == 1) { // caso base
			return base; // 10^1 = 10
		} else if (exponente < 0) { // Exponente negativo
			return potencia(base, exponente + 1) / base;
		} else { // Exponente positivo
			return base * potencia(base, exponente - 1);
		}
	}

	/**
	 * Este es el metodo para verificar si los caracteres de una palabra
	 * se encuentran ordenados alfabeticamente
	 * @param palabra
	 * @return El valor de verdad si estan o no ordenados alfabeticamnete
	 */
	public static boolean orden(String cad) {
		cad = cad.toLowerCase();
		/*
		 * Para saber si los caracteres de una palabra estan ordenados
		 * alfaberticamnete se utilizara los codigos ascii de cada caracter
		 * para compararlos
		 */
		if(cad.length()>1) 
		{
			if(cad.charAt(0)<=cad.charAt(1))
				return orden(cad.substring(1,cad.length()));
			else return false;
		}
		else return true;
	}

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		// Buscar dentro de un arreglo
		int[] array = { 1, 2, 3, 4, 5 };
		int elementoBuscar = 5;
		int posElementoEncontrado = posicionElementoRecursivo(array, elementoBuscar, 0);
		System.out.println("Se encuentra en la posicion " + posElementoEncontrado);

		// Buscar dentro de la serie de fibbonacci por un aposicion dada.
		// Serie de fibonacci
		// (0)mejor evitar xD 1 1 2 3 5 8 13 21 34 55 ...
		int posicion = 5;
		int resultado = fibonacciRecursivo(posicion);
		System.out.println("El elemento de fibonacci es " + resultado);

		// Potencia de un numero
		int base = 10;
		int exponente = -2;
		System.out.println(potencia(base, exponente));

		// Palabra analizada
		String palabra = "axyz";
		if (orden(palabra)) // Si es una linea si se puede
			System.out.println("La palabra está ordenada alfabeticamente");
		else
			System.out.println("La palabra NO está ordenada alfabeticamente");
		
		
		/*
		 * Actividades en pareja se van a presentar hasta el viernes media noche:
		 * 1) Crear un metodo donde indique si una palabra es un palindromo.
		 * Es una palabra que se lee igual de izq - der = der - izq
		 * aba - aba
		 * Anita lava la tina = anita lava la tinA
		 * 2) Crear un metodo que indique si un numero ingresado es binario
		 * es decir solo esta formado por ceros y unos.
		 * 3) Crear un metodo que obtenga el numero binario de un numero, decimal
		 * 4) Crar un metodo que realice la tabal de multiplicar de un numero,
		 * Eg. Si el numero es 5 
		 * 5* 1
		 * 5*2 hasta el 12
		 */
		
		
		
		
		
		
	}

	

}
