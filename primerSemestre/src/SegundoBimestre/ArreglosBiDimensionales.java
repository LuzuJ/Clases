package SegundoBimestre;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.text.AbstractDocument.LeafElement;

/*
 * Esta clase esta creada para el desarrollo de arreglos BiDimensionales 
 * Matrices
 */
public class ArreglosBiDimensionales {
	/*
	 * Una matriz o arreglo bidimensional consta de filas y columnas, estas
	 * servirán para ubicar un elemento mediante una posicion dada
	 * Filas pa abajo, Columnas pa alado
	 * Para el manejo adecuado de un arreglo bidimensional se va a tener que
	 * organizar el movimiento sea de filas o de columnas para poder acceder
	 * a cada uno de sus elementos.
	 */
	
/**
 * Esta Funcion me sirve para llenar los valores de una matriz tipo entero
 * @param Numero de Filas
 * @param Numero de Columnas
 * @return Matriz de tipo entero
 */
	public static int[][] llenadoMatrizEnteros(int numFil, int numCol) {
		int[][] matResul = new int[numFil][numCol];
		//Maneja las filas
		for(int i = 0; i< matResul.length; i++) {
			//Maneje las columnas
			for(int j = 0; j < numCol; j++) {
				matResul[i][j] = (int)(Math.random()*101);
			}
		}
		return matResul;
	}
	
	/**
	 * Esta funcion sirve para imprimir una matriz de tipo entero
	 * @param matriz de tipo entero
	 */
	public static void imprimirMatrizEnt(int[][] matrizEnt) {
		//Fijar las filas
		
		for (int i = 0; i < matrizEnt.length; i++) {
			//Fijas las columnas
			for(int k =0; k < matrizEnt[0].length; k++) {
				System.out.print(matrizEnt[i][k]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 *Esta es una funcion que obtiene el conjunto de promedio por filas
	 * @param una matriz de tipo entero
	 * @return un arreglo de tipo entero con los promedios por filas
	 */
	public static double[] promedioFilasArrEnt(int[][] matrizEnt) {
		//Def Varaibles
		int filas = matrizEnt.length;
		int columnas = matrizEnt[0].length;
		int sumaAcumulativa = 0;
		double promedioFilas = 0;
		double[] arregloDePromedios = new double[matrizEnt.length];
		
		for(int i =0; i<filas;i++) {
			sumaAcumulativa=0;
			promedioFilas=0;
			for(int j=0; j<columnas;j++) {
				//Suma de todas las columnas para la primera fila
				sumaAcumulativa = sumaAcumulativa + matrizEnt[i][j];
			}
			promedioFilas = (double)sumaAcumulativa/ (double)matrizEnt[0].length;
			arregloDePromedios[i]=promedioFilas;
			//System.out.println("Valor promedio " + promedioFilas);
			//System.out.println("Valor suma acumulado " + sumaAcumulativa);
			
		}
		/*
		 * En este caso para la funcion, yo no necesito un valor, lo que se necesita
		 * es retornar un conjunto de valores
		 */
		return arregloDePromedios;
	}
	
	/**
	 * Esta es una funcion que obtiene el conjunto de promedio por columnas
	 * @param una matriz de tipo entero
	 * @return un arreglo de tipo entero con los promedios por columnas
	 */
	public static double[] promedioColArrEnt(int[][] matrizEnt) {
		int filas = matrizEnt.length;
		int columnas = matrizEnt[0].length;
		int sumaAcumulativa=0;
		double promedioColInd=0;
		double[]promeColumnas = new double[columnas];
		//For ezterno se va a mover entre las columnas
		//Recuerde que en este caso el for externo es el más lento
		for(int i =0; i<matrizEnt[0].length;i++) {
			sumaAcumulativa=0;
			promedioColInd=0;
			for(int k=0; k<matrizEnt.length;k++) {
				//Tome en cuenta el orden de los contadores en este caso 
				//i corresponde a la columna
				//k corresponde a la fila
				//Recuerde el for externo se mueve más lentamente
				sumaAcumulativa = sumaAcumulativa + matrizEnt[k][i];
			}
			promedioColInd = (double)sumaAcumulativa/filas;
			promeColumnas[i] = promedioColInd;
		}
		
		return promeColumnas;
	}
	
	/**
	 * 
	 * @param length
	 * @param length2
	 * @return
	 */
	public static int[][] llenarMatrizColumnas(int numFil, int numCol) {
		int[][] matResul = new int[numFil][numCol];
		//Maneja las filas
		for(int i = 0; i< matResul[0].length; i++) {
			//Maneje las columnas
			for(int j = 0; j < numFil; j++) {
				matResul[j][i] = (int)(Math.random()*101);
			}
		}
		return matResul;
	}
	
	public static void imprimirMatrizCol(int[][] matrizEnt) {
		for (int i = 0; i < matrizEnt[0].length; i++) {
			//Fijas las columnas
			for(int k =0; k < matrizEnt.length; k++) {
				System.out.print(matrizEnt[k][i]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		/*
		 * Definicion: Para definir un arreglo bidimensional es necesario lo siguiente
		 * Expreasr el tipo de dato, escribir "[][]" en donde se indica que es un arreglo
		 * bidimensional, colocar el nombre del arreglo, la palabra restrinfida "new
		 * tipo de dato y dimension [filas][columnas]
		 */
		int[][] matrizEnt = new int[3][2];
		int[][] matrizEnt3 = new int[2][2];	
		int[][] matrizEnt4 = new int[5][1];	
		int[][] matrizEnt5 = new int[4][2];	
		//SEGUNDA FORMA de llenado a traves de agrupaciones de datos.
		int[][] matrizEnt2 = {{1,2,2}, {2,4,2}, {3,5,4},{7,9,10}};
		
		//Llenado de la matriz a traves de su posicion de forma manual PRIMERA FORMA
		matrizEnt[0][0] = 3;
		matrizEnt[1][0] = 5;
		matrizEnt[2][0] = 6;
		matrizEnt[0][1] = 10;
		matrizEnt[1][1] = 1;
		matrizEnt[2][1] = 5;
		
		//Impresion
		/*
		 * Si usted intenta imprimir la matriz directamente, lo que obtendrá es
		 * la direccion de memoria
		 */
	/*
		System.out.println("Direccion de memoria de la matriz " + matrizEnt );
		//La siguiente sentencia muestra el numero de filas de  una matriz
		System.out.println("Numero de filas "+ matrizEnt.length);
		//La siguiente sentencua muestra el numero de columnas de una matrix
		System.out.println("Numero de columnas" + matrizEnt[0].length);
		
		//Llenado de una matriz por filas TERCERA FORMA
		//Fijo la fila y me dezplazo a traves de las columnas
		for (int i =0; i<matrizEnt.length; i++) { //Filas
			//Tome en cuenta que el manejo de una fila es independiente a la columna
			//System.out.println(matrizEnt[i][i]);
			for(int j =0; j < matrizEnt[0].length;j++) { //Columnas
				 System.out.println("Fila" + i + " , Columna " + j );
				 matrizEnt[i][j] = (int)(Math.random()*11);
			}
			//System.out.println("*********************");
		}
		//Imprimir
		for(int i = 0; i<matrizEnt.length; i++) {
			//Con la fila fijada me desplazo entre las columnas.
			for (int j=0; j<matrizEnt[0].length;j++) {
				System.out.print(matrizEnt[i][j] + " ");
			}
			//Hago un salto de linea y siga 
			System.out.println();
		}
		System.out.println("**********************************");
		for(int i = 0; i<matrizEnt2.length; i++) {
			for (int j=0; j<matrizEnt2[0].length;j++) {
				System.out.print(matrizEnt2[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		matrizEnt = llenadoMatrizEnteros(matrizEnt.length, matrizEnt[0].length);
		matrizEnt2 = llenadoMatrizEnteros(matrizEnt2.length, matrizEnt2[0].length);
		matrizEnt3 = llenadoMatrizEnteros(matrizEnt3.length, matrizEnt3[0].length);
		matrizEnt4 = llenadoMatrizEnteros(matrizEnt4.length, matrizEnt4[0].length);
		matrizEnt5 = llenadoMatrizEnteros(matrizEnt5.length, matrizEnt5[0].length);
		System.out.println("Matriz 1");
		imprimirMatrizEnt(matrizEnt);
		System.out.println("Matriz 2");
		imprimirMatrizEnt(matrizEnt2);
		System.out.println("Matriz 3");
		imprimirMatrizEnt(matrizEnt3);
		System.out.println("Matriz 4");
		imprimirMatrizEnt(matrizEnt4);
		System.out.println("Matriz 5");
		imprimirMatrizEnt(matrizEnt5);
		
		
		/*
		 * 1) Una funcion que obtemga el promedion por filas
		 * 2) Una funcion que obtemga el promedio por columnas
		 * 3) Una funcion que llene la matriz por columnas
		 * 4) Una funcion que imrpima la matriz por columnas
		 * 5) Una funcion que sume dos matrices, siempre y cuando sus dimensiones
		 * sean iguales
		 */
		
		/*
		 * Exsite la funcion 
		 * Arrays.toString(arreglo)
		 * Esta funcion permite imprimir los valores de un arreglo
		 */
		double[] promedioFilas = promedioFilasArrEnt(matrizEnt);
		System.out.println("Promedio Filas " + Arrays.toString(promedioFilas));
		
		double[] promedioColumnas = promedioColArrEnt(matrizEnt); 
		System.out.println("El promedio por columnas es " + Arrays.toString(promedioColumnas));
		/*
		 * Arrays.toString() devuelve solo string solo enseña na mas
		 */
		matrizEnt = llenarMatrizColumnas(matrizEnt.length, matrizEnt[0].length);
		imprimirMatrizCol(matrizEnt);
	}

	

	

	

	

	

	
	


}
