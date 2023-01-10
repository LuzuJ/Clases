package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

//Anthony Morales
//Erick Mideros
//Edwin Pereira
//Emilio Jacome
//Julio Arrobo
//Jonathan Luzuriaga

public class TrabajoGrupal1 {
	/**
	 * Funcion para regresar un arreglo entero lleno
	 * @param longitud del arreglo		
	 * @return arreglo entero 
	 */
	public static int[] llenarArreglo(int longitud) {
		//creamos un arreglo de tipo entero
		int[] arrResul = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			//del 0 al 50
			arrResul[i] = (int) ((Math.random() * 51));
		}
		return arrResul;
	}

	/**
	 * Funcion para ordenar un arreglo por inserción
	 * @param arreglo de enteros
	 * @return Arreglo ordenado por insercion
	 */
	public static int[] ordenarArregloInsercion(int[] arregloEntero) {
		for (int i = 1; i < arregloEntero.length; i++) {
			int aux = arregloEntero[i];
			int j = i - 1;
			while (j >= 0 && arregloEntero[j] > aux) {
				arregloEntero[j + 1] = arregloEntero[j];
				j--;
			}
			arregloEntero[j + 1] = aux;
		}
		return arregloEntero;
	}

	/**
	 * Esta funcion sirve para buscar un numero por busqueda secuencial
	 * @param arreglo entero ordenado
	 * @param numero a buscar
	 */
	public static void busquedaSecuencial(int[] arregloOrd, int numBus) {
		boolean bandera = false;
		int i = 0;
		while ((i < arregloOrd.length) && !bandera) {
			if (arregloOrd[i++] == numBus) { // Incrementamos el índice después de la comparación
				System.out.println("La posicion del valor esta en: " + i);
				bandera = true;
			}
		}
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (bandera)
			System.out.println("Sí hay algún valor " + numBus + " en la lista.");
		else
			System.out.println("No hay ningún valor " + numBus + " en el arreglo.");
	}

	/**
	 * Funcion de busqueda para busqueda binaria
	 * @param arreglo entero ordenado
	 * @param numero a buscar
	 */
	public static void busquedaBinaria(int[] arregloOrden, int numeroBuscar) {
		// Encontrar elemento de la mitad
		int mitad = (int) (arregloOrden.length / 2);
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloOrden[mitad]);
		if (numeroBuscar < arregloOrden[mitad]) {
			for (int i = 0; i < mitad; i++) {
				if (numeroBuscar == arregloOrden[i]) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		} else {
			for (int i = mitad; i < arregloOrden.length; i++) {
				if (numeroBuscar == arregloOrden[i]) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}
			}

		}
		// Si no se encuentra en el arreglo de 0 a 50
		if (numeroBuscar > 0 & numeroBuscar < 51) {
			System.out.println();
		} else {
			System.out.println("El dato no se encuentra en el arreglo");
		}

	}

	/**
	 * Funcion para llenar un arreglo de tipo double
	 * @param longitud del arreglo
	 * @return arreglo lleno de dobles
	 */
	public static double[] llenarArregloDob(int longitud) {
		double[] arrResul = new double[longitud];
		for (int i = 0; i < longitud; i++) {
			// arrResul[i] = redondearDecimales((Math.random() * 25), 2);
			arrResul[i] = (Math.random() * 26);
		}
		return arrResul;
	}

	/**
	 * Esta funcion sirve para redondear a dos decimales un arreglo de dobles
	 * @param arreglo de dobles
	 * @return arreglo redondeado a dos decimales
	 */
	public static double[] redondeoArreglo(double[] arrdoub) {
		double[] result = new double[arrdoub.length]; // creamos un arreglo 
		for (double aux : arrdoub) {
			for (int i = 0; i < arrdoub.length; i++) { //llamamos los datos
				aux = arrdoub[i];
				//multimplicamos por los decimales que queramos en el nuevo arreglo
				int aux2 = (int) (aux * 100);
				//colocamos en una auxiliar y ubicamos los decimales deseados
				double aux3 = (double) aux2 / 100;
				result[i] = aux3;
			}
		}
		return result;
	}

	/**
	 * Funcion para ordear un arreglo por insercion 
	 * @param arreglo de dobles
	 * @return arreglo ordenado de dobles
	 */
	public static double[] ordenarArregloInser(double[] arregloDoble) {
		for (int i = 1; i < arregloDoble.length; i++) {
			double aux = arregloDoble[i];
			int j = i - 1;
			while (j >= 0 && arregloDoble[j] > aux) {
				arregloDoble[j + 1] = arregloDoble[j];
				j--;
			}
			arregloDoble[j + 1] = aux;
		}
		return arregloDoble;
	}

	/**
	 * Funcion para buscar en un arreglo de doubles
	 * @param arreglo de doubles
	 * @param numero a buscar
	 */
	public static void busquedaBinaria(double[] arregloDoble, double numeroBuscar) {
		int mitad = (int) (arregloDoble.length / 2);
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloDoble[mitad]);
		if (numeroBuscar < arregloDoble[mitad]) {
			for (int i = 0; i < mitad; i++) {
				if (numeroBuscar == arregloDoble[i]) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		} else {
			for (int i = mitad; i < arregloDoble.length; i++) {
				if (numeroBuscar == arregloDoble[i]) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}
			}
			System.out.println("Valor no encontado");

		}
		// Si no se encuentra en el arreglo de 0 a 50
		if (numeroBuscar > 0 & numeroBuscar < 1000) {
			System.out.println();
		} else {
			System.out.println("El dato no se encuentra en el arreglo");
		}

	}

	/**
	 * Funcion para llenar un arreglo de Strings con palabras ya establecidas
	 * @param palabras a ordear aleatoriamente
	 * @return arreglo de strings
	 */
	public static String[] llenarArreglo(String[] palabras) {
		String[] nuevoArrString = new String[100];
		for (int i = 0; i < nuevoArrString.length; i++) { // ubicamos una palabra aleatoria en cada posicion del arreglo
															// int
			int posicAl = (int) (Math.random() * 10);// las palabras usadas
			nuevoArrString[i] = palabras[posicAl];
		}
		return nuevoArrString;
	}

	/**
	 * Funciones para ordenar un arreglo de palabras a partir del primer caracter
	 * @param arreglo de strings 
	 * @return arreglo ordenado de Strings
	 */
	public static String[] ordenarArreglo(String[] arregloStr) {
		for (int i = 1; i < arregloStr.length; i++) {
			String aux = arregloStr[i];
			int j = i - 1;
			//usamos el primer caracter para ordenar la palabra
			while (j >= 0 && arregloStr[j].charAt(0) > aux.charAt(0)) {
				arregloStr[j + 1] = arregloStr[j];
				j--;
			}
			arregloStr[j + 1] = aux;
		}

		return arregloStr;

	}

	/**
	 * Funcion para ordenar por busqueda secuencial
	 * @param arreglo de strings ordenados
	 * @param palabra a buscar
	 */
	public static void busquedaSecuencial(String[] arregloStr, String palabraBuscar) {
		boolean bandera = false;
		int i = 0;
		while ((i < arregloStr.length) && !bandera) {
			if (arregloStr[i++].equals(palabraBuscar)) { // Incrementamos el índice después de la comparación
				System.out.println("La posicion del valor esta en: " + i);
				bandera = true;
			}
		}
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (bandera)
			System.out.println("Sí hay algún valor " + palabraBuscar + " en la lista.");
		else
			System.out.println("No hay ningún valor " + palabraBuscar + " en el arreglo.");

	}

	/**
	 * Funcion para realizar busqueda de manera binaria
	 * @param arreglo ordenado de Strings
	 * @param palabra a buscar
	 */
	public static void busquedaBinaria(String[] arregloStr, String palabraBuscar) {
		int mitad = (int) (arregloStr.length / 2);
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloStr[mitad]);
		if (palabraBuscar.charAt(0) < arregloStr[mitad].charAt(0)) {
			for (int i = 0; i < mitad; i++) {
				if (palabraBuscar.equals(arregloStr[i])) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		} else {
			for (int i = mitad; i < arregloStr.length; i++) {
				if (palabraBuscar.equals(arregloStr[i])) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}

			}

		}

		System.out.println("Valor no encontado");

	}

	/**
	 * Funcion para llenar arreglo de caracteres de 100 a 200
	 * @param longitud del arreglo
	 * @return arreglo de caracteres
	 */
	public static char[] arregloLlenar(int longitud) {
		char[] ascii = new char[longitud];
		for (int i = 0; i < ascii.length; i++) {
			ascii[i] = (char) ((Math.random() * 100) + 100);
		}
		return ascii;
	}

	/**
	 * Funcion para ordenar un arreglo por insercion
	 * @param arreglo de caracteres
	 * @return arreglo ordenado por caracteres
	 */
	public static char[] ordenarArregloInser(char[] arregloChar) {
		for (int i = 1; i < arregloChar.length; i++) {
			char aux = arregloChar[i];
			int j = i - 1;
			while (j >= 0 && arregloChar[j] > aux) {
				arregloChar[j + 1] = arregloChar[j];
				j--;
			}
			arregloChar[j + 1] = aux;
		}
		return arregloChar;
	}

	/**
	 * Funcion para buscar un caracter por busqueda de secuencia
	 * @param arreglo de caracteres
	 * @param caracter a buscar
	 */
	public static void busquedaSecuencial(char[] arregloChar, char caracterBuscar) {
		boolean bandera = false;
		int i = 0;
		while ((i < arregloChar.length) && !bandera) {
			if (arregloChar[i++] == caracterBuscar) {
				System.out.println("La posicion del valor esta en: " + i);
				bandera = true;
			}

		}
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (bandera)
			System.out.println("Sí hay algún valor " + caracterBuscar + " en la lista.");
		else
			System.out.println("No hay ningún valor " + caracterBuscar + " en el arreglo.");

	}

	/**
	 * Funcion para realizar busqueda binaria a partir de un caracter
	 * @param arreglo ordenado de caracteres
	 * @param caracter a buscar
	 */
	public static void busquedaBinaria(char[] arregloChar, char caracterBuscar) {
		int mitad = (int) (arregloChar.length / 2);
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloChar[mitad]);
		if (caracterBuscar < arregloChar[mitad]) {
			for (int i = 0; i < mitad; i++) {
				if (caracterBuscar == arregloChar[i]) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		} else {
			for (int i = mitad; i < arregloChar.length; i++) {
				if (caracterBuscar == arregloChar[i]) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}
			}
		}
		System.out.println("Elemento no encontrado ");

	}

	public static void main(String[] args) {
		// Definimos y asignamos variables
		long inicio, inicio2;
		long fin, fin2;
		Scanner ingresoDatos = new Scanner(System.in);
		Scanner ingreso = new Scanner(System.in);

		System.out.println("Ejercicio 1");
		int[] arrEnt = new int[1000];
		// Llamamos a funcion para llenar arreglo
		int[] arreLleno = llenarArreglo(arrEnt.length);
		System.out.println("Arreglo: " + Arrays.toString(arreLleno));
		// Llamamos una funcion para ordenar el arreglo y proceder a buscarlo
		// Usamos un metodo de ordenamiento que nos convenga
		int[] arrOrd = ordenarArregloInsercion(arreLleno);
		System.out.println("Orden: " + Arrays.toString(arrOrd));
		// Pedimos al usuario un numero para buscar en el arreglo
		System.out.println("Inserte un numero a bsucar en el arreglo:");
		int numBus = ingresoDatos.nextInt();
		// Buscamos por secuencialidad
		System.out.println("Busqueda Secuencial: ");
		inicio = System.nanoTime();
		busquedaSecuencial(arrOrd, numBus);
		fin = System.nanoTime() - inicio;
		System.out.println("Tiempo arreglo 1: " + fin);
		System.out.println();

		System.out.println("Busqueda Binaria: ");
		inicio2 = System.nanoTime();
		busquedaBinaria(arrOrd, numBus);
		fin2 = System.nanoTime() - inicio2;
		System.out.println("Tiempo arreglo 2: " + fin2);
		System.out.println();

		// ----------------------------------------------------------------

		System.out.println("Ejercicio 2");
		double[] arrdoub = new double[1000];
		// double numeroBuscar = 0;
		double[] arreDouble = llenarArregloDob(arrdoub.length);
		System.out.println("Arreglo Double " + Arrays.toString(arreDouble));
		// double[] ordeDoube= insercionArreglo(arrdoub);

		double[] resulArr = redondeoArreglo(arreDouble);
		System.out.println(Arrays.toString(resulArr));

		double[] ordenDouble = ordenarArregloInser(resulArr);
		System.out.println("Orden: " + Arrays.toString(ordenDouble));

		System.out.println("Ingrese el numero a buscar:");
		System.err.println("USE LA COMA',' EN LUGAR DEL PUNTO'.' ");
		double numIngreso;
		numIngreso = ingresoDatos.nextDouble();
		System.out.println("Num ingresado: " + numIngreso);
		busquedaBinaria(ordenDouble, numIngreso);

		// ---------------------------------------------------------------------

		System.out.println("Ejercicio 3");
		String[] palabras = { "Hola", "Juego", "Compu", "Libro", "Dragon", "Supernatural", "Universo", "Viejo", "Arbol",
				"Programa" };
		String[] arregloStr = llenarArreglo(palabras);
		System.out.println(Arrays.toString(arregloStr));
		String[] stringNuevo = ordenarArreglo(arregloStr);
		System.out.println(Arrays.toString(stringNuevo));

		String palabraBuscar = " ";
		System.out.println("Ingrese una palabra a buscar:");
		palabraBuscar = ingreso.nextLine(); // USO DOS ESCANER PARA NUMEROS Y PARA STRINGS
		System.out.println("Busqueda secuencial:");
		busquedaSecuencial(stringNuevo, palabraBuscar);
		System.out.println();
		System.out.println("Busqueda Binaria:");
		busquedaBinaria(stringNuevo, palabraBuscar);

		// ------------------------------------

		System.out.println("Ejercicio 4");
		char[] arregloChar = arregloLlenar(100);
		System.out.println(Arrays.toString(arregloChar));
		char[] arregOrde = ordenarArregloInser(arregloChar);
		System.out.println(Arrays.toString(arregOrde));
		System.out.println("Ingrese un caracter a buscar: ");
		char charUsua = ingreso.nextLine().charAt(0);

		System.out.println("Busqueda secuencial: ");
		busquedaSecuencial(arregOrde, charUsua);
		System.out.println();
		System.out.println("Busqueda Binaria: ");
		busquedaBinaria(arregOrde, charUsua);

	}

}
