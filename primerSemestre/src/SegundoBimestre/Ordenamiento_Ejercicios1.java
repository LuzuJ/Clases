package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3) Con un arreglo de tamaño 10 con palabras y numero y ordenarlos 
 * a traves del primer varacter y el valor de su codigo ASCII
 * 
 */
public class Ordenamiento_Ejercicios1 {
	/**
	 * Este metodo sirve para generar un arreglo de 100 palabras a partir de un
	 * arreglo asignado
	 * 
	 * @param longitud del arreglo
	 * @return Arreglo de 100
	 */
	public static String[] crearArreg(int longitud) {
		// Creamos un arreglo de 10 palabras de donde obtendremos un arreglo aleatorio
		// de 100 palabras
		String[] arregloStri = { "Michael_Jackson", "Nebula_Pacman", "JuegoDeTronos", "Guardarraya", "Hades", "Vegeta",
				"Supernatural", "Checo_Perez", "Ella_no_te_ama", "Webb_Telescope" }; // Fue lo primero que se me ocurrio
																						// :v
		// Creamos un arreglo para asignar los valores aleatorios
		String[] nuevoArrString = new String[longitud];
		for (int i = 0; i < longitud; i++) {
			// ubicamos una palabra aleatoria en cada posicion del arreglo
			int posicAl = (int) (Math.random() * 10);
			nuevoArrString[i] = arregloStri[posicAl];
		}
		return nuevoArrString;
	}

	/**
	 * Este metodo sirve para rear una copia de un arreglo de String
	 * 
	 * @param arreglo a copiar
	 * @return copia del arreglo
	 */
	public static String[] copiarArreglo(String[] arregloStri) {
		// Creamos un arreglo nuevo donde colocaremos los valores del anterior arreglo
		String[] arregloCopia = new String[arregloStri.length];
		for (int i = 0; i < arregloStri.length; i++) {
			arregloCopia[i] = arregloStri[i];
		}
		return arregloCopia;
	}

	/**
	 * Este metodo sirve para ordenar un arreglo por el metodo de burbuja
	 * 
	 * @param arreglo de string
	 */
	public static void burbuja(String[] arregloStri) {
		for (int i = 0; i < arregloStri.length; i++) {
			for (int j = 0; j < arregloStri.length - 1; j++) {
				// Para ordenar es necesario que comparemos solo el primer caracter, por ello
				// usamos el charAt(0) para ordenar y colocar los valores donde pertenecen
				if (arregloStri[j].charAt(0) > arregloStri[j + 1].charAt(0)) {
					// Creamos un string temporal para re colocar los valores
					String temp = arregloStri[j];
					arregloStri[j] = arregloStri[j + 1];
					arregloStri[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Funcion para ordenar un arreglo por seleccion
	 *
	 * @param arreglo de String
	 */
	public static void seleccion(String[] arregloString) {
		for (int i = 0; i < arregloString.length; i++) {
			for (int j = i; j < arregloString.length; j++) {
				// Como en el caso anterior solo comparamos el primer caracter
				if (arregloString[i].charAt(0) > arregloString[j].charAt(0)) {
					// Usamos el string temporal para re colocar los valores
					String aux = arregloString[j];
					arregloString[j] = arregloString[i];
					arregloString[i] = aux;
				}
			}
		}
	}

	/**
	 * Funcion para ordenar un arreglo de string por insercion
	 * 
	 * @param arreglo String
	 */
	public static void insercion(String[] arregloString) {
		for (int i = 1; i < arregloString.length; i++) {
			// Creamos un auxiliar para poder re colocar los valores
			String aux = arregloString[i];
			int j = i - 1;
			// Usamos el mientras para que el arreglo compare los valores mientras este
			// en el arreglo, comparamos el primer caracter
			while (j >= 0 && arregloString[j].charAt(0) > aux.charAt(0)) {
				arregloString[j + 1] = arregloString[j];
				j--;
			}
			// con esto recolocamos los valores
			arregloString[j + 1] = aux;
		}
	}

	/**
	 * Este metodo sirve para ordenar un string por QuickSort
	 * 
	 * @param arreglo de string
	 * @param inicio
	 * @param fin
	 */
	public static void quickSort(String[] arregloString, int inicio, int fin) {
		if (inicio >= fin)
			return; // Crear un grupo de más de un elemento
		String pivote = arregloString[inicio];
		int elemIzq = inicio + 1;
		int elemDer = fin;
		// Con el while comparamos los valores de derecha a izquierda y va creando
		// subgrupos
		while (elemIzq <= elemDer) {
			while (elemIzq <= fin && arregloString[elemIzq].charAt(0) < pivote.charAt(0)) {
				elemIzq++;
			}
			while (elemDer > inicio && arregloString[elemDer].charAt(0) >= pivote.charAt(0)) {
				elemDer--;
			}
			// Esta parte re ordena los valores con un string temporal
			if (elemIzq < elemDer) {
				String temp = arregloString[elemIzq];
				arregloString[elemIzq] = arregloString[elemDer];
				arregloString[elemDer] = temp;
			}
		}
		if (elemDer > inicio) {
			String temp = arregloString[inicio];
			arregloString[inicio] = arregloString[elemDer];
			arregloString[elemDer] = temp;
		}
		// Repetimos esto hasta que el arreglo este ordenado
		quickSort(arregloString, inicio, elemDer - 1);
		quickSort(arregloString, elemDer + 1, fin);
	}

	// ------------------------------------------------------------

	/**
	 * Funcion para crear una copia de un arreglo de caracteres
	 * 
	 * @param arreglo de caracteres
	 * @return una copia del arreglo
	 */
	public static char[] copiarArreglo(char[] arregloChar) {
		// Creamos un arreglo el cual copiara el arreglo de caracteres
		char[] arregloCopia = new char[arregloChar.length];
		for (int i = 0; i < arregloChar.length; i++) {
			arregloCopia[i] = arregloChar[i];
		}
		return arregloCopia;
	}

	/**
	 * Funcion de ordenamiento por burbuja a partir del codigo Ascii Cobierte el
	 * arreglo char en entero lo ordena y lo regresa a caracter de manera que queda
	 * ordenado de manera descendente
	 * 
	 * @param arreglo de caracteres
	 */
	public static void burbuja(char[] arregloChar) {
		// Creamos un metodo para convertir los caracteres a su respectivo codigo ascii
		// Asignamos y definimos los arreglos
		int[] arregloAscii = new int[arregloChar.length];
		char[] arregloChar2 = new char[arregloChar.length];
		System.out.println("Arreglo de caracteres: " + Arrays.toString(arregloChar));
		for (char aux : arregloChar) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloChar[i];
				// covertimos los caracteres a entero
				arregloAscii[i] = (int) (aux);
			}
		}
		// Esta parte nos enseñara el arreglo con el cogido ascii
		System.out.println("Codigo Ascii del arreglo: " + Arrays.toString(arregloAscii));
		/*
		 * Esta parte ordenara de manera descentende el codigo ascii que creamos arriba
		 */
		for (int i = 0; i < arregloChar.length; i++) {
			for (int j = 0; j < arregloChar.length - 1; j++) {
				if (arregloAscii[j] < arregloAscii[j + 1]) {
					int temp = arregloAscii[j];
					arregloAscii[j] = arregloAscii[j + 1];
					arregloAscii[j + 1] = temp;
				}
			}
		}
		// Este metodo covierte el ascii a el respectivo caracter y lo ordena de manera
		// descendente
		System.out.println("Codido Ascii ordenado del arreglo: " + Arrays.toString(arregloAscii));
		for (int aux : arregloAscii) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloAscii[i];
				arregloChar2[i] = (char) (aux);
			}
		}
		System.out.println("Arreglo ordenado a partir del cogido Ascii: " + Arrays.toString(arregloChar2));
	}

	/**
	 * Ordenamiento de burbuja de caracteres sin tener que pasar por el codigo ascii
	 * 
	 * @param arreglo de caracteres
	 */
	public static void burbujadir(char[] arregloChar) {
		System.out.println("Arreglo de caracteres" + Arrays.toString(arregloChar));
		for (int i = 0; i < arregloChar.length; i++) {
			for (int j = 0; j < arregloChar.length - 1; j++) {
				// de igual manera funciona si cambiamos el temporar con caracteres
				if (arregloChar[j] < arregloChar[j + 1]) {
					char temp = arregloChar[j];
					arregloChar[j] = arregloChar[j + 1];
					arregloChar[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Esta funcion ordena los valores de un caracter junto con su codigo ascii
	 * 
	 * @param arreglo de caracteres
	 */
	public static void seleccion(char[] arregloChar) {
		// definimos y asignamos nuevos arreglos para poder ordenarlos
		int[] arregloAscii = new int[arregloChar.length];
		char[] arregloChar2 = new char[arregloChar.length];
		//imprimimos el arreglo de caracteres
		System.out.println("Arreglo de caracteres: " + Arrays.toString(arregloChar));
		// metodo para convertir el caracter a entero
		for (char aux : arregloChar) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloChar[i];
				arregloAscii[i] = (int) (aux);
			}
		}
		// El arreglo convertido a ascii
		System.out.println("Codigo Ascii del arreglo: " + Arrays.toString(arregloAscii));
		// Cambiamos los signos para que ordene de manera descendente el arreglo
		for (int i = 0; i < arregloAscii.length; i++) {
			for (int j = i; j < arregloAscii.length; j++) {
				if (arregloAscii[i] < arregloAscii[j]) {
					int aux = arregloAscii[j];
					arregloAscii[j] = arregloAscii[i];
					arregloAscii[i] = aux;
				}
			}
		}
		// el arreglo ordenado se mostara a continuacion
		System.out.println("Codido Ascii ordenado del arreglo: " + Arrays.toString(arregloAscii));
		// este metodo convertira el arreglo a caracteres a partir del codigo ascii
		for (int aux : arregloAscii) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloAscii[i];
				arregloChar2[i] = (char) (aux);
			}
		}
		// enseñara el arreglo ordenado a partir del codigo ascii
		System.out.println("Arreglo ordenado a partir del cogido Ascii2: " + Arrays.toString(arregloChar2));

	}

	/**
	 * Esta funcion ordena el arreglo de caracteres sin el codigo ascii de manera
	 * directa
	 * 
	 * @param arreglo de caracteres
	 */
	public static void seleccionDir(char[] arregloChar) {
		//imprimimos el arreglo de caracteres
		System.out.println("Arreglo caracteres: " + Arrays.toString(arregloChar));
		for (int i = 0; i < arregloChar.length; i++) {
			for (int j = i; j < arregloChar.length; j++) {
				if (arregloChar[i] < arregloChar[j]) {
					//Cambiamos el orden de comparar y usamos char 
					char aux = arregloChar[j];
					arregloChar[j] = arregloChar[i];
					arregloChar[i] = aux;
				}
			}
		}
	}

	/**
	 * Esta funcion ordena el arreglo de caracteres con el codigo ascii
	 * @param arreglo de caracteres
	 */
	public static void insercion(char[] arregloChar) {
		//asignamos y definimos los arreglos a usar
		char[] arreglochar2 = new char[arregloChar.length];
		int[] arregloAscii = new int[arregloChar.length];
		System.out.println("Arreglo caracteres:" + Arrays.toString(arregloChar));
		//Funcion para convertir el arreglo de caracteres a enteros, para poder compararlos
		for (char aux : arregloChar) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloChar[i];
				arregloAscii[i] = (int) (aux);
			}
		}
		System.out.println("Codigo Ascii del arreglo: " + Arrays.toString(arregloAscii));
		//funcion para ordenar descendentemente el arreglo convertido
		for (int i = 1; i < arregloAscii.length; i++) {
			int aux = arregloAscii[i];
			int j = i - 1;
			//cambiamos para que se pueda mover por el arreglo y compare 
			//de una manera descendente
			while (j >= 0 && arregloAscii[j] < aux) {
				arregloAscii[j + 1] = arregloAscii[j];
				j--;
			}
			arregloAscii[j + 1] = aux;
		}
		System.out.println("Codido Ascii ordenado del arreglo: " + Arrays.toString(arregloAscii));
		//Esta parte convierte el codigo ascii a los caracteres ya ordenados
		for (int aux : arregloAscii) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloAscii[i];
				arreglochar2[i] = (char) (aux);
			}
		}
		System.out.println("Arreglo ordenado a partir del cogido Ascii: " + Arrays.toString(arreglochar2));

	}

	/**
	 * Esta funcion ordena de manera descendente el arreglo de caracteres
	 * sin necesidad de usar su codigo ascii
	 * @param arregloChar
	 */
	public static void isercionDir(char[] arregloChar) {
		System.out.println("Arreglo de caracteres: "+ Arrays.toString(arregloChar));
		for (int i = 1; i < arregloChar.length; i++) {
			char aux = arregloChar[i];
			int j = i - 1;
			//usamos el menor que para poder compararlos de manera descendente
			//y la posicion ira cambiando
			while (j >= 0 && arregloChar[j] < aux) {
				arregloChar[j + 1] = arregloChar[j];
				j--;
			}
			arregloChar[j + 1] = aux;
		}

	}

	/**
	 * Este arreglo sirve para convertir un arreglo de caracteres
	 * a su codigo ascii
	 * @param arreglo de caracteres
	 * @return codigo ascii
	 */
	public static int[] codigoAscii(char[] arregloChar) {
		int[] arregloAscii = new int[arregloChar.length];
		for (char aux : arregloChar) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloChar[i];
				arregloAscii[i] = (int) (aux);
			}
		}
		return arregloAscii;
	}
	/**
	 * Metodo para ordenar el arreglo de caracteres de manera descendente usando el 
	 * codigo ascii de igual manera imprimira como el arreglo se va ordenando
	 * @param arreglo de caracteres
	 * @param inicio 
	 * @param fin
	 * @return 
	 */
	public static int[] quickSort1(int[] arregloChar, int inicio, int fin) {
		if (inicio >= fin)
			return arregloChar;
		int pivote = arregloChar[inicio];
		int elemIzq = inicio + 1;
		int elemDer = fin;
		while (elemIzq <= elemDer) {
			while (elemIzq <= fin && arregloChar[elemIzq] > pivote) {
				elemIzq++;
			}
			while (elemDer > inicio && arregloChar[elemDer] <= pivote) {
				elemDer--;
			}
			if (elemIzq < elemDer) {
				int temp = arregloChar[elemIzq];
				arregloChar[elemIzq] = arregloChar[elemDer];
				arregloChar[elemDer] = temp;
			}
		}
		if (elemDer > inicio) {
			int temp = arregloChar[inicio];
			arregloChar[inicio] = arregloChar[elemDer];
			arregloChar[elemDer] = temp;
		}
		quickSort1(arregloChar, inicio, elemDer - 1);
		return quickSort1(arregloChar, elemDer + 1, fin);
	}

	/**
	 * Metodo para convertir un arreglo ascii a un  arreglo de caracteres
	 * @param arreglo ascii
	 * @return arreglo de caracteres
	 */
	public static char[] ordenChar(int[] arregloAscii) {
		char[] arregloChar = new char[arregloAscii.length];
		for (int aux : arregloAscii) {
			for (int i = 0; i < arregloChar.length; i++) {
				aux = arregloAscii[i];
				arregloChar[i] = (char) (aux);
			}
		}
		return arregloChar;
	}
	
	/**
	 * Este metodo sirve para ordenar un arreglo de caracteres sin la 
	 * neceesidad de usar el codigo ascii
	 * @param arreglo de caracteres
	 * @param inicio
	 * @param fin
	 */
	public static void quickSortdir(char[] arregloChar, int inicio, int fin) {
		/*
		 * Cambiamos los signos para que se ordene de manera descendente 
		 * y usamos char para poder comparar unicamente los caracteres
		 */
		if (inicio >= fin)
			return;
		char pivote = arregloChar[inicio];
		int elemIzq = inicio + 1;
		int elemDer = fin;
		while (elemIzq <= elemDer) {
			while (elemIzq <= fin && arregloChar[elemIzq] > pivote) {
				elemIzq++;
			}
			while (elemDer > inicio && arregloChar[elemDer] <= pivote) {
				elemDer--;
			}
			if (elemIzq < elemDer) {
				char temp = arregloChar[elemIzq];
				arregloChar[elemIzq] = arregloChar[elemDer];
				arregloChar[elemDer] = temp;
			}
		}
		if (elemDer > inicio) {
			char temp = arregloChar[inicio];
			arregloChar[inicio] = arregloChar[elemDer];
			arregloChar[elemDer] = temp;
		}
		quickSortdir(arregloChar, inicio, elemDer - 1);
		quickSortdir(arregloChar, elemDer + 1, fin);
	}

	public static void main(String[] args) {
		// asignamos y definimos valores que se van a usar
		Scanner ingresoD = new Scanner(System.in);

		System.out.println("1.-");
		// 1) Llenar un arreglo con 100 palabras de un conjunto de 10 para ordenarlos
		// alfabeticamente, con los 4 algoritmos de ordenamiento

		// Funcion para generar el arreglo de 100 palabras
		String[] arregloStri = crearArreg(100);
		// Usamos un Arrays para poder obtener ver los arreglos
		System.out.println("Arreglo: " + Arrays.toString(arregloStri));
		System.out.println();
		// Realizamos copias de los arreglos para utilizar cada uno en su respectiva
		// funcion
		String[] copiaString1 = copiarArreglo(arregloStri);
		String[] copiaString2 = copiarArreglo(arregloStri);
		String[] copiaString3 = copiarArreglo(arregloStri);
		String[] copiaString4 = copiarArreglo(arregloStri);

		// Llamamamos a las funciones que vamos a usar en cada caso para ordenarlos,
		burbuja(copiaString1);
		System.out.println("Burbuja: " + Arrays.toString(copiaString1));
		System.out.println();

		seleccion(copiaString2);
		System.out.println("Seleccion: " + Arrays.toString(copiaString2));
		System.out.println();

		insercion(copiaString3);
		System.out.println("Insercion: " + Arrays.toString(copiaString3));
		System.out.println();

		quickSort(copiaString4, 0, copiaString4.length - 1);
		System.out.println("QuickSort: " + Arrays.toString(copiaString4));
		System.out.println();

		/*
		 * LLenar un arreglo de tamano 10 con caracteres a traves de consola y
		 * ordenardos de forma descendente en su codigo ASCII
		 */

		System.out.println("2.-");
		// Creamos un arreglo de 10 valores donde nosotros ingresaremos los valores
		char[] arregloChar = new char[10];
		System.out.println("Ingrese 10 caracteres:");
		// Colocamos esta funcion para llenar los arreglos, no creamos funcion por
		// el uso del escaner
		for (int i = 0; i < arregloChar.length; i++) {
			// En el caso que el usuario ingrese una palabra o mas de un caracter
			// el programa se encargara de tomar solo el primer caracter ingresado
			arregloChar[i] = ingresoD.nextLine().charAt(0);
		}
		// Usamos el array para orgenar el arreglo
		System.out.println("Arreglo caracteres: " + Arrays.toString(arregloChar));
		System.out.println("---------------------------------------------------");
		System.out.println();

		// Llamamos una funcion para crear copias
		// Usamos 2 copias de cada uno, uno para usarlo en los arreglos usando el codigo
		// ascii
		// y otros para ordenarlos de manera directa
		char[] copiaChar1 = copiarArreglo(arregloChar);
		char[] copiaChar2 = copiarArreglo(arregloChar);
		char[] copiaChar3 = copiarArreglo(arregloChar);
		char[] copiaChar4 = copiarArreglo(arregloChar);
		char[] copiaChar1_1 = copiarArreglo(arregloChar);
		char[] copiaChar2_1 = copiarArreglo(arregloChar);
		char[] copiaChar3_1 = copiarArreglo(arregloChar);
		char[] copiaChar4_1 = copiarArreglo(arregloChar);

		/*
		 * Llamamos las funciones para ordenarlos de manera descendente, como se
		 * menciono antes usaremos en los primeros casos el codigo asciis y en los tros
		 * usaremos de manera directa
		 */
		System.out.println("Metodo Burbuja");
		burbuja(copiaChar1);
		System.out.println();
		burbujadir(copiaChar1_1);
		System.out.println("Arreglo ordenado directamente por burbuja: " + Arrays.toString(copiaChar1_1));
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();

		System.out.println("Metodo Seleccion:");
		seleccion(copiaChar2);
		System.out.println();
		seleccionDir(copiaChar2_1);
		System.out.println("Arreglo ordenado directamente por seleccion: " + Arrays.toString(copiaChar2_1));
		System.out.println("-------------------------------------------------------");
		System.out.println();

		System.out.println("Metodo insercion:");
		insercion(copiaChar3);
		System.out.println();
		isercionDir(copiaChar3_1);
		System.out.println("Arreglo ordenado directamente por isercion: " + Arrays.toString(copiaChar3_1));
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		System.out.println("Metodo QuickSort:");
		System.out.println("Arreglo caracter: " + Arrays.toString(copiaChar4));
		int[] arrIntChar = codigoAscii(copiaChar4);
		System.out.println("Codigo Ascii: " + Arrays.toString(arrIntChar));
		int[] ordIntChar = quickSort1(arrIntChar, 0, arrIntChar.length - 1);
		System.out.println("Descendente: " + Arrays.toString(ordIntChar));
		char[] ordChar = ordenChar(ordIntChar);
		System.out.println("Arreglo descendente: " + Arrays.toString(ordChar));
		System.out.println();
		quickSortdir(copiaChar4_1, 0, copiaChar4_1.length - 1);
		System.out.println("Arreglo ordenado directamente por quickSort: " + Arrays.toString(copiaChar4_1));

	}

	

	

}
