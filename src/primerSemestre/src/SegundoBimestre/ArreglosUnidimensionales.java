package SegundoBimestre;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Esta clase esta diseñada para explicar el uso de los diferentes tipos de arreglos
 * unidimensionales que se pueden crear en base de los datos primitivos.
 */
public class ArreglosUnidimensionales {
	/**
	 * La funcion para llenar un arreglo de enteros
	 * 
	 * @param Longitud del arreglo
	 * @return arreglo entero
	 */
	public static int[] llenarArrEntero(int longitud) {
		int[] arregloLleno = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (int) (Math.random() * 15);// recuerde que el uno no esta incluido
		}
		return arregloLleno;
	}

	/**
	 * La funcion para llenar un arreglo de dobles
	 * 
	 * @param Longitud del arreglo
	 * @return arreglo doble
	 */
	public static double[] llenarArrDou(int longitud) {
		double[] arregloLleno = new double[longitud];
		for (int i = 0; i < longitud; i++) {
			// Math.random devuelve dobles, decimales
			arregloLleno[i] = (Math.random() * 51);// recuerde que el uno no esta incluido
		}
		return arregloLleno;
	}

	/**
	 * La funcion para llenar un arreglo de flotantes
	 * 
	 * @param Longitud del arreglo
	 * @return arreglo flotante
	 */
	public static float[] llenarArrFlo(int longitud) {
		float[] arregloLleno = new float[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (float) ((Math.random() * 51) + 50);
		}
		return arregloLleno;
	}

	/**
	 * La funcion para llenar un arreglo de caracteres
	 * 
	 * @param Longitud del arreglo
	 * @return arreglo caracteres
	 */
	public static char[] llenarArrChar(int longitud) {
		char[] arregloLleno = new char[longitud];
		int valorAsciiChar = 0;
		for (int i = 0; i < longitud; i++) {
			valorAsciiChar = (int) ((Math.random() * 30) + 100);
			arregloLleno[i] = (char) valorAsciiChar;// recuerde que el uno no esta incluido
		}
		return arregloLleno;
	}

	/**
	 * Esta es la funcion para imprimir los valores de un arreglo tipo entero
	 * 
	 * @param arreglo de tipo entero Imprime los valores dentro del arreglo
	 */
	public static void imprimirArrEnt(int[] arrEnt) {
		// Borro Ln para quitar el espacio entre lineas
		System.out.print("El arreglo Entero es {" );
		for(int i =0; i<arrEnt.length-1;i++) {
			System.out.print(arrEnt[i] + ", ");
		}
		System.out.println(arrEnt[arrEnt.length-1] + " }");
	}

	/**
	 * Esta es la funcion para imprimir los valores de un arreglo tipo double
	 * 
	 * @param arreglo de tipo double Imprime los valores dentro del arreglo
	 */
	public static void imprimirArrDob(double[] arrDob) {
		System.out.print("El arreglo Strings es {" );
		for(int i =0; i<arrDob.length-1;i++) {
			System.out.print(arrDob[i] + ", ");
		}
		System.out.println(arrDob[arrDob.length-1] + " }");
	}

	/**
	 * Esta es la funcion para imprimir los valores de un arreglo tipo flotantes
	 * 
	 * @param arreglo de tipo flotantes Imprime los valores dentro del arreglo
	 */
	public static void imprimirArrFlo(float[] arrFlo) {
		System.out.print("El arreglo Flotantes es {" );
		for(int i =0; i<arrFlo.length-1;i++) {
			System.out.print(arrFlo[i] + ", ");
		}
		System.out.println(arrFlo[arrFlo.length-1] + " }");
	}

	/**
	 * Esta es la funcion para imprimir los valores de un arreglo tipo caracter
	 * 
	 * @param arreglo de tipo caracter Imprime los valores dentro del arreglo
	 */
	public static void imprimirArrChar(char[] arrChar) {
		System.out.print("El arreglo de caracteres es {" );
		for(int i =0; i<arrChar.length-1;i++) {
			System.out.print(arrChar[i] + ", ");
		}
		System.out.println(arrChar[arrChar.length-1] + " }");
	}

	/**
	 * Funcion para sumar un arreglo entero mas un arreglo double de dimensiones
	 * iguales
	 * 
	 * @param rreglo  de enteros
	 * @param arreglo de dobles
	 * @return arreglo de dobles
	 */
	public static double[] sumArreDimIgual(int[] arrEnt, double[] arrDob) {
		double[] resultado = new double[arrEnt.length];// Crear nueva matriz y darle la dimesion
		if (arrEnt.length == arrDob.length) {
			for (int i = 0; i < arrEnt.length; i++) {
				resultado[i] = arrEnt[i] + arrDob[i]; // Para redondear
			}
		}
		return resultado;
	}

	/**
	 * Funciones para sumar un arreglo entero mas un double de dimensiones
	 * diferentes
	 * 
	 * @param arreglo entero
	 * @param arreglo double
	 * @return arreglo de dobles
	 */
	public static double[] sumArreDif(int[] arrEnt, double[] arrDob) {
		int dimesion = 0;
		double[] copiaArregloDob;
		int[] copiaArregloInt;
		double[] resultado;
		if (arrDob.length > arrEnt.length) {
			dimesion = arrDob.length;
			resultado = new double[dimesion];
			// copia los primeros valores y el resto lo llena de ceros
			copiaArregloInt = new int[dimesion];
			for (int i = 0; i < arrEnt.length; i++) {
				copiaArregloInt[i] = arrEnt[i];
			}
			for (int i = 0; i < arrEnt.length; i++) {
				resultado[i] = copiaArregloInt[i] + arrDob[i];
			}
		} else {
			dimesion = arrEnt.length;
			copiaArregloDob = new double[dimesion];
			resultado = new double[dimesion];
			// Copia los primeros valores y resto lo llena de ceros
			for (int i = 0; i < arrDob.length; i++) {
				copiaArregloDob[i] = arrDob[i];
			}
			for (int i = 0; i < dimesion; i++) {
				resultado[i] = copiaArregloDob[i] + arrEnt[i];
			}
		}

		return resultado;

	}

	/**
	 * Esta funcion esta creada para concatenar caracteres de un arreglo
	 * 
	 * @param arreglo caracteres
	 * @return un String con todos los caracteres juntos.
	 */
	public static String concatenarCar(char[] arrChar) {
		String carCont = "";
		// "{"
		// "{|"
		/*
		 * Recuerde que la concatenacion de caracteres debe dar un
		 * String no un caracter
		 */
		for(int i =0; i< arrChar.length;i++) {
			carCont = carCont + arrChar[i];
		}
		return carCont;
	}

	
	/**
	 * Esta es la funcion que me permite ingresar palabras aleatorias de un conjunto
	 * a un arreglo de tipo String
	 * @param longitud del arreglo
	 * @return arreglo tipo String
	 */
	public static String[] llenarArrString(int longitudArreglo) {
		String[] palabrasAUsar = {"Perro", "Avion", "Balon", "Tenis", "Programacion"};
		String[] arregloResultado = new String [longitudArreglo];
		for(int i =0; i<longitudArreglo; i++) {
			int posiAle = (int)(Math.random()*5); //Castear a enteros
			arregloResultado[i] = palabrasAUsar[posiAle]; //Varia entre posiciones
		}
		return arregloResultado;
	}

	/**
	 * Esta funcion me permite imprimir un arreglo de tipo String
	 * @param arreglo tipo String
	 */
	public static void imprimirArrString(String[] arrStr) {
		System.out.print("El arreglo Strings es {" );
		//10 0-8 9
		for(int i =0; i<arrStr.length-1;i++) {
			System.out.print(arrStr[i] + ", ");
		}
		System.out.println(arrStr[arrStr.length-1] + " }");
	}
	/**
	 * Esta funcion me permite concatenar un arreglo de tipo entero con un arreglo
	 * de tipo String
	 * @param arreglo de tipo entero
	 * @param arreglo de tipo String
	 * @return arreglo de tipo String
	 */
	public static String[] sumarArrEntArrStri(int[] arrEnt2, String[] arrStr) {
		String[] arregloResul = new String[arrEnt2.length];
		for(int i =0; i<arrEnt2.length; i++) {
			arregloResul[i]= arrEnt2[i] + arrStr[i]; //Se concatenan
		}
		return arregloResul;
	}
	
	/**
	 * Esta funcion me permite ingresar datos de tipo short
	 * @param longitud del arreglo
	 * @return un arreglo de tipo Short
	 */
	public static short[] llenarArrShort(int longitudArreglo) {
		short[] arregloResultado = new short[longitudArreglo];
		for(int i =0; i<longitudArreglo; i++) {
			arregloResultado[i] = (short)(Math.random()*100);
		}
		return arregloResultado;
	}

	/**
	 * Esta funcion me permite imprimir los fatos de un arreglo de tipo short
	 * @param arreglo de tipo short
	 */
	public static void imprimirArrShort(short[] arrShor) {
		System.out.print("El arreglo de enteros cortos es {" );
		for(int i =0; i<arrShor.length-1;i++) {
			System.out.print(arrShor[i] + ", ");
		}
		System.out.println(arrShor[arrShor.length-1] + " }");
		
	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		int[] arrEnt = new int[10];
		int[] arrEnt2 = new int[100];
		double[] arrDob = new double[10];
		char[] arrChar = new char[10];
		String[] arrStr = new String[100]; // Son 10 textos no palabras
		float[] arrFlo = new float[10];
		short[] arrShor = new short[10];

		// Funciones de llenado
		arrEnt = llenarArrEntero(arrEnt.length);
		arrDob = llenarArrDou(arrDob.length);
		arrFlo = llenarArrFlo(arrFlo.length);
		arrChar = llenarArrChar(arrChar.length);
		arrEnt2 = llenarArrEntero(arrEnt2.length);
		arrStr = llenarArrString(arrStr.length);
		arrShor = llenarArrShort(arrShor.length);


		// Funciones de impresion
		imprimirArrEnt(arrEnt);
		imprimirArrDob(arrDob);
		imprimirArrFlo(arrFlo);
		imprimirArrChar(arrChar);
		imprimirArrEnt(arrEnt2);
		imprimirArrString(arrStr);
		imprimirArrShort(arrShor);

		/*
		 * Sumar los valores del arreglo entero + los valores del arreglo double
		 */

		double[] resultadoSum = sumArreDimIgual(arrEnt, arrDob);
		imprimirArrDob(resultadoSum);// Usamos las funciones ya creadas

		resultadoSum = sumArreDif(arrEnt2, arrDob);
		imprimirArrDob(resultadoSum);
		
		/*
		 * 1) Concatenar todos los valores del arreglo de caracteres
		 * 2) En base de 5 palabras llenar el arreglo de Strings 
		 * perro, avion, computadora, balon, programacion
		 * 0        1      2      3     n-1     n
		 * {avion, perro, balon, balon,....., programacion} arreglo de palabras
		 * 3) La suma de un arreglo de enteros + Strings 
		 * 1 + Avion = 1Avion
		 * 4) Llenas e imprimir el arreglo de shorts
		 */

		// Para concatenar valores de arreglo de carcacteres
		//Unir los caracteres
		String carConta = concatenarCar(arrChar);
		System.out.println("Los caracteres concatenados " + carConta); //Concatenar
		
		String[]conEntStri = sumarArrEntArrStri(arrEnt2,arrStr);
		imprimirArrString(conEntStri);
	
		//arreglo de tipo object sirve para cualquiera, enteros, float lo que sea
		
		
	}
	

}
