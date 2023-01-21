package SegundoBimestre;

import java.util.Scanner;

/*
 * 1) Una funcion que obtemga el promedion por filas**
 * 2) Una funcion que obtemga el promedio por columnas**
 * 3) Una funcion que llene la matriz por columnas **
 * 4) Una funcion que imrpima la matriz por columnas **
 * 5) Una funcion que sume dos matrices, siempre y cuando sus dimensiones
 * 		sean iguales**
 */
public class ActivdadMatriz {
	/**
	 * Funcion para llenar una matriz
	 * 
	 * @param numero de Filas
	 * @param numero de Columnas
	 * @return Matriz llena
	 */
	private static int[][] llenadoMatriz(int numF, int numC) {
		int[][] resultado = new int[numF][numC];
		for (int i = 0; i < numF; i++) {
			for (int k = 0; k < numC; k++) {
				resultado[i][k] = (int) (Math.random() * 21);
			}
		}
		return resultado;
	}

	/**
	 * Funcion para imprimir matriz fijada la fila
	 * 
	 * @param matriz enteros
	 */
	public static void imprimirMatrizFil(int[][] matrizEnt) {
		for (int i = 0; i < matrizEnt.length; i++) {
			// Fijas las filas
			for (int k = 0; k < matrizEnt[0].length; k++) {
				System.out.print(matrizEnt[i][k] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Funcion para impimir matriz fijada la columna
	 * 
	 * @param matriz enteros
	 */
	public static void imprimirMatriz1Col(int[][] matrizEnt) {
		for (int i = 0; i < matrizEnt[0].length; i++) {
			// Fijas las columnas
			for (int k = 0; k < matrizEnt.length; k++) {
				System.out.print(matrizEnt[k][i] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Funcion Para promediar filas de matrices
	 * 
	 * @param matriz Entera
	 * @return promedio filas de Matrices
	 */
	public static double[][] promedioFila(int[][] matrizEnt) {
		double[][] resultS = new double[1][matrizEnt[0].length];
		// Creamos una matriz simple con la longitud de la columna

		// Realizamos una suma acumulativa de todas las filas
		for (int i = 0; i < matrizEnt.length; i++) {
			for (int k = 0; k < matrizEnt[0].length; k++) {
				resultS[0][k] = resultS[0][k] + matrizEnt[i][k];
			}
		}
		// Con el resultado castearmos los datos para que imprima la division
		double[][] promFil = new double[1][matrizEnt[0].length];
		System.out.println("Promedio por filas");
		for (int i = 0; i < matrizEnt.length; i++) {
			for (int k = 0; k < matrizEnt[0].length; k++) {
				promFil[0][k] = ((double) resultS[0][k]) / ((double) (matrizEnt.length));
			}
		}
		return promFil;
	}

	/**
	 * Funcion para imprimir un arreglo doble
	 * 
	 * @param matriz doble
	 */
	public static void imprimirMatriz1ColDouble(double[][] matrizDob) {
		for (int i = 0; i < matrizDob[0].length; i++) {
			for (int k = 0; k < matrizDob.length; k++) {
				System.out.print(matrizDob[k][i] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Funcion para promediar Columnas
	 * 
	 * @param matriz entera
	 * @return promedio de columnas
	 */
	public static double[][] promedioColumas(int[][] matrizEnt) {
		double[][] resultS = new double[matrizEnt.length][1];
		/*
		 * En este casi usaremos la longitud de la fila y y asginaremos a 1 la longitud
		 * de la columna esto con el fin de que solo mueste el resultado en esta columna
		 */
		for (int i = 0; i < matrizEnt.length; i++) {
			for (int k = 0; k < matrizEnt[0].length; k++) {
				resultS[i][0] = resultS[i][0] + matrizEnt[i][k];
			}
		}
		double[][] promCol = new double[matrizEnt.length][1];
		System.out.println("Promedio por columnas");
		for (int i = 0; i < matrizEnt.length; i++) {
			for (int k = 0; k < matrizEnt[0].length; k++) {
				// Cateamos los datos y los colocamos en la fila que necesitamos
				promCol[i][0] = ((double) resultS[i][0]) / ((double) (matrizEnt[0].length));
			}
		}
		return promCol;
	}

	/**
	 * Funcion organizar por filas los promedios de doubles
	 * 
	 * @param Matriz double
	 */
	public static void imprimirMatrizFilDouble(double[][] matrizDouble) {
		for (int i = 0; i < matrizDouble[0].length; i++) {
			// Fijas las columnas
			for (int k = 0; k < matrizDouble.length; k++) {
				System.out.print(matrizDouble[k][i] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Funcion para suma entre matrices
	 * 
	 * @param matriz entera 1
	 * @param matriz entera 2
	 * @return Suma de matrices
	 */

	public static int[][] sumaEntreMatrices(int[][] matrizEntera1, int[][] matrizEntera2) {
		// Usaremos un if oara que solo ingrese si ambas matrices son iguales
		int[][] resultMatriz = new int[matrizEntera1.length][matrizEntera1[0].length];
		// Usamos cualquiera de las dos longitudes pues son iguales
		if (matrizEntera1.length == matrizEntera2.length && matrizEntera1[0].length == matrizEntera2[0].length) {
			System.out.println("La suma de ambas matrices es: ");
			for (int i = 0; i < matrizEntera1.length; i++) {
				for (int k = 0; k < matrizEntera1[0].length; k++) {
					resultMatriz[i][k] = matrizEntera1[i][k] + matrizEntera2[i][k];
				}
			}
		} else {
			System.out.println("Ambas matrices no son iguales en dimensiones");
		}

		return resultMatriz;
	}

	public static void main(String[] args) {
		Scanner ingresoD = new Scanner(System.in);
		System.out.println("Ingrese el numero que desee por filas");
		int numF = Integer.parseInt(ingresoD.nextLine());
		System.out.println("Ingrese el numero que desee por columnas");
		int numC = Integer.parseInt(ingresoD.nextLine());

		// Creamos una matriz con los datos que ingrese el usuario
		int[][] matrizU = new int[numF][numC];
		// Creamos una funcion que llene la matriz con numeros entre 0 y 20
		matrizU = llenadoMatriz(numF, numC);
		System.out.println("Matriz fijada por Filas");
		imprimirMatrizFil(matrizU);
		System.out.println("Matriz fijadas por columnas");
		imprimirMatriz1Col(matrizU);

		double[][] promedioF = promedioFila(matrizU);
		imprimirMatriz1ColDouble(promedioF);

		double[][] promedioC = promedioColumas(matrizU);
		imprimirMatrizFilDouble(promedioC);

		System.out.println("Ingrese otras dimensiones para poder sumar matrices");
		System.out.println("Recuerde que para poder sumar dos matrices es necesario que "
				+ "ambas matrices tengas igual dimension");
		System.out.println("Ingrese la dimension de las filas");
		int numF2 = Integer.parseInt(ingresoD.nextLine());
		System.out.println("Ingrese la dimension de las columnas");
		int numC2 = Integer.parseInt(ingresoD.nextLine());
		int[][] matrizU2 = new int[numF2][numC2];
		matrizU2 = llenadoMatriz(numF2, numC2);
		System.out.println("Matriz fijada por Filas");
		imprimirMatrizFil(matrizU2);
		System.out.println("Matriz fijada por columnas");
		imprimirMatriz1Col(matrizU2);

		int[][] sumaResultante = sumaEntreMatrices(matrizU, matrizU2);
		imprimirMatrizFil(sumaResultante);
	}

}
