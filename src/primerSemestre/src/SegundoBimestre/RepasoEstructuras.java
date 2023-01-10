package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Repaso general de estructuras unidimensionales y bidimensionales, Arreglos
 * Estructura de Datos: Es una agrupacion de datos, las cuales tienen una longitud
 * determinada a cada uno de los datos a traves de su posicion
 * Arreglo: Es una estructura de datos LINEAL, la cual tiene un orden y un 
 * tamaño definido. Es una estructura de datos homogenea. Es decir todos los datos
 * son del mismo tipo
 * Matriz: Es una estructura de dato bidimensional, an la cual se accedera a los datos 
 * a traves de las posiciones de sus filas y columnas. Al igual que los arreglos
 * las matricess tambien son estructuras de datos homogeneas.
 * Para este tipo de estructuras se esta utilziando la sentencia FOR, dado que esta sentencia 
 * desde su definiciossn, nos permite asignar un inicio y un fin para recorrer y operar
 * dentro de estas estructuras.´
 * Para la sentencia FOR, se tiene dos tipo de formas de escribir
 * Tradicional for(condicion inicial; conidicon final; incrementar)
 * Estructura for(variable con tipo de dato: estructura)
 * Definicion de la estructura.
 * Unidimensionales:
 * Tipo Dato[] nombreArreglo = new tipo de dato [dimension]
 * Dimension es estetica, es decir no se puede ingresar mas datos de los especificados
 * de la dimensino 
 * Bidimensional:
 * Tipo Dato[][] nombreMatriz = new tioo de dato [fila][columna]
 */
public class RepasoEstructuras {
	/*
	 * Recordar como se realizan los ingreso de datos Como se puede operar en base
	 * de posiciones definidas Como se puede realizar un barrido completo de las
	 * estructuras Operacinoes que se pueden realizar con los datos definifos
	 */
	/**
	 * Esta es la funcion para llenar un arreglo de tipo entero
	 * 
	 * @param El tamaño del arreglo
	 * @return arreglo entero
	 */
	public static int[] llenadoArregloEnt(int longitud) {
		int[] arregloLleno = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (int) (Math.random() * 21);
		}
		return arregloLleno;
	}

	/**
	 * Esta funcion me determina el valor ASCII de un caracter
	 * 
	 * @param un arreglo de tipo caracter
	 * @return un arreglo de tipo entero
	 */
	public static int[] detValorAsciiCar(char[] arreCar) {
		int[] valorAscii = new int[arreCar.length];
		int posArr = 0;
		for (char elem : arreCar) {
			valorAscii[posArr] = elem;
			posArr++;
		}
		return valorAscii;
	}

	/**
	 * Esta funcion me indica el caracter y su codigo Ascii
	 * 
	 * @param Arreglo tipo caracter
	 * @param Arreglo tipo entero
	 * @return Arreglo tipo String
	 */
	public static String[] valorCar(char[] arreCar, int[] valoresArrCar) {
		String[] arreLleno = new String[arreCar.length];
		if (arreCar.length == valoresArrCar.length) {
			for (int i = 0; i < arreCar.length; i++) {
				// Se puede escribir y colocar así , son String
				arreLleno[i] = "" + arreCar[i] + "->" + valoresArrCar[i];
			}
		} else {
			System.out.println("No se pudo realizar la comparacion dado que las " + "dimensiones son diferentes ");
		}
		return arreLleno;
	}

	 /**
	  * Esta funcion me permite llenar una matriz de caracteres
	  * @param filas
	  * @param columnas
	  * @return matriz llena de caracteres
	  */
	public static char[][] llenadoMatCar(int filas, int columnas) {
		char [][] matLlena = new char[filas][columnas];
		//Fijamos las filas
		for(int i = 0; i<filas ; i++) {
			for(int j = 0; j<columnas;j++) {
				int valAscii = (int)((Math.random()*120)+40);
				matLlena[i][j] = (char)valAscii;
			}
		}
		return matLlena;
	}
	
	/**
	 * Este es el metodo de llenado de matriz entero
	 * @param filas
	 * @param columnas
	 * @return matriz enteros
	 */
	public static int[][] llenadoMatEnt(int filas, int columnas) {
		int [][] matLlena = new int[filas][columnas];
		//Fijamos las filas
		for(int i = 0; i<filas ; i++) {
			for(int j = 0; j<columnas;j++) {
				matLlena[i][j] = (int)((Math.random()*120)+40);
			}
		}
		return matLlena;
	}
	
	/**
	 * Esta es la funcion para la suma de diagonales de una matriz de caracteres
	 * mas una matriz enter
	 * @param matriz tipo caracter
	 * @param matriz tipo entero
	 * @return arreglo con la suma de las diagonales
	 */
	public static int[] sumaMatDiaMat(char[][] matCar, int[][] matEnt) {
		int [] arrResul = new int[matCar.length];
		//Deben ser matrices cuadradas y ambas iguales
		if((matCar.length==matCar[0].length) && (matEnt.length== matEnt[0].length) && (matCar.length == matEnt.length)) {
			for(int i =0; i<matCar.length ; i++) {
				arrResul[i] = matCar[i][i]+ matEnt[i][i];
			}
		}
		return arrResul;
	}
	
	/**
	 * 
	 * @param matString
	 */
	public static void busquedaMarString(String[][] matString, String palabra) {
		int bandera = 0;
		for(String[] arrgloMat : matString) {
			for(String elemeArr : arrgloMat) {
				if (elemeArr.equals(palabra)) {
					bandera = 1; //Si pasa será 1
				}
			}
		}
		if(bandera== 1) {
			System.out.println("Elemento Encontrado");
		}else {
			System.out.println("Elemento no Encontrado");
		}
	}
	public static void main(String[] args) {
		// Definicion de variables
		// Defincion de los arreglos
		int[] arreEnt = new int[10];
		String[] arreString;
		char[] arreCar = { '"', '@', ':', '<', '>', '$', '!', 'ª', '(', '=' };
		// Definicion de matrices
		int[][] matEnt = new int[3][3];
		char[][] matCar = new char[3][3];
		String[][] matString = {{"Pa1", "Pa2", "Pa3"},
								{"Pa4", "Pa5", "Pa6"},
								{"Pa7", "Pa8", "Pa9"}};

		arreEnt = llenadoArregloEnt(arreEnt.length);
		System.out.println(Arrays.toString(arreEnt));

		int[] valoresArrCar = detValorAsciiCar(arreCar);
		System.out.println(Arrays.toString(valoresArrCar));

		arreString = valorCar(arreCar, valoresArrCar);
		System.out.println(Arrays.toString(arreString));

		// Operaciones con matrices
		System.out.println("Operaciones con matrices");
		matCar = llenadoMatCar(matCar.length, matCar[0].length);
		//for para llenar la matriz 
		//Cada fila es un arreglo
		for(char[] elemeChar : matCar) {
			System.out.println(Arrays.toString(elemeChar));
		}

		System.out.println("----------------------------------------");
		matEnt = llenadoMatEnt(matEnt.length, matEnt[0].length);
		for(int[] elemeEnt : matEnt) {
			System.out.println(Arrays.toString(elemeEnt));
		}
		System.out.println("-----------------------------------------");
		System.out.println("Suma de diagonales");
		int[] matResultado = sumaMatDiaMat(matCar,matEnt);
		System.out.println(Arrays.toString(matResultado));
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Digite la palabra a buscar");
		String palabra = ingreso.nextLine();
		busquedaMarString(matString, palabra);
		
		/*
		 * Actividades arreglos
		 * Dado un arreglo de enteros de 10 elementos realizar las siguientes operaciones.
		 * 2) Ordenar de forma ascendente los valores del arreglo
		 * Subir la actividad hasta la 1:30 lo que hayamos conseguido, esta actividad se realizara
		 * de manera individual.
		 */
	}

	

	

	

	

}
