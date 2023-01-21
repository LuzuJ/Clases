package SegundoBimestre;

// Luzuriaga Jonathan
// Miguel Mendosa
import java.util.Arrays;
import java.util.Scanner;

/*
 * Actividad lunes: Se realiza en parejas.
 * Es realizar la multiplicacion de matrices en un metodo
 * Para eso se necestia ingrsar el tamaño de las matrices por teclado
 * Fila A = 5
 * Colu A = 7
 * Fila B = 6 -> El dato ingresado es erroneo ingrese nuevamente
 * Colum B = 2
 * Imprimir la matriz resultado 
 * Por favor utilizar una clase nueva para la realizacion de la actividad
 * Recuerde comentar su codigo y funcion
 * Utilizar el estandar para el nombramiento de variables y metodo
 * Recuerde que solo es necesario que un miembro de la pareja suba la actividadper
 * Coloque los nombres al inicio de la calse para poder indentificar la pareja
 */
public class ActividadMatMultiplicacion {

	/**
	 * Funcion para llenar matrices
	 * 
	 * @param filas
	 * @param columnas
	 * @return matriz llena
	 */
	public static int[][] llenarMatriz(int filas, int columnas) {
		int[][] matrizLlena = new int[filas][columnas];
		// Maneja las filas
		for (int i = 0; i < filas; i++) {
			// Maneja las columnas
			for (int j = 0; j < columnas; j++) {
				// del al 5
				matrizLlena[i][j] = (int) ((Math.random() * 6) + 1);
			}
		}
		return matrizLlena;
	}

	/**
	 * Funcion para imprimir matrices
	 * 
	 * @param Matriz entera
	 */
	public static void imprimirMatrizEnt(int[][] arreMatriz) {
		for (int[] arreFilas : arreMatriz) {
			System.out.println(Arrays.toString(arreFilas));
		}
	}

	/**
	 * Funcion para transponer matrices
	 * 
	 * @param matriz de enteros
	 * @return matriz transpuesta
	 */
	public static int[][] transponerMatriz(int[][] arreMatriz) {
		int[][] matTrans = new int[arreMatriz[0].length][arreMatriz.length];// [columnas][filas]
		for (int i = 0; i < arreMatriz.length; i++) {
			for (int j = 0; j < arreMatriz[0].length; j++) {
				matTrans[j][i] = arreMatriz[i][j];
			}
		}
		return matTrans;
	}

	/**
	 * Funciones para Multiplicar matrices
	 * 
	 * @param matriz Entero 1
	 * @param matriz Entero 2
	 * @return multiplicacion de dos matrices
	 */
	public static int[][] productoMatrizEnt(int[][] arreMatriz1, int[][] arreMatriz2) {
		int[][] matrizResultado = new int[arreMatriz1.length][arreMatriz2.length];
		// llamamos for para acumular los datos
		/*
		 * for (int[] elemenT1 : arreMatriz1) { for (int [] elemnT2 : arreMatriz2) {
		 * //Colocamos 2 for para poder movernos entre filas y columnas for(int i = 0; i
		 * <arreMatriz1.length; i++) { for (int j =0; j<arreMatriz2.length; j++) {
		 * matrizResultado[i][j] = elemenT1[i]*elemnT2[j] + matrizResultado[i][j] ; } }
		 * } } return matrizResultado; }
		 */
		int[] arrResul = new int[arreMatriz1.length];
		int[][] matrizLlena = new int[arreMatriz1.length][arreMatriz2.length];
		int  resulSuma = 0;
		for(int[]arregloF1:arreMatriz1) {
			for(int[]arregloF2:arreMatriz2) {
				for(int i=0; i < arregloF1.length; i++) {
					arrResul[i] = arregloF1[i]*arregloF2[i];
				}
				resulSuma=0;
				for (int j=0; j<arrResul.length; j++) {
					resulSuma = arrResul[j]+resulSuma;
				}
				System.out.println("resultado multiplicacion "+resulSuma);
				System.out.println(resulSuma);
				
			}
			
		}
		

		return resulSuma;
	}

	public static void main(String[] args) {
		// Asignacion y definicion de variables
		int columnasMat1 = 0, filasMat1 = 0, columnasMat2 = 0, filasMat2 = 0;
		Scanner ingresoDatos = new Scanner(System.in);
		boolean bandera = true;

		// Ingreso de datos por teclado
		System.out.println("Ingrese el numero de filas para la matriz 1");
		filasMat1 = Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese el numero de columnas para la matriz 1");
		columnasMat1 = Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese el numero de filas para la matriz 2");
		System.out.println(
				"Tenga en cuenta que el numero de columnas de la matriz 1, debe ser igual al numero de filas de la matriz 2");
		// Para poder cumplir la propiedad
		while (bandera == true) {
			filasMat2 = Integer.parseInt(ingresoDatos.nextLine());
			if (columnasMat1 == filasMat2) {
				bandera = false;
			} else {
				System.out.println(
						"El valor ingresado no es correcto para que se pueda realizar el producto entre matrices");
				System.out.println("Ingrese nuevamente el numero de filas para la matriz 2");
			}
		}
		System.out.println("Ingrese el numero de columnas para la matriz 2");
		columnasMat2 = Integer.parseInt(ingresoDatos.nextLine());

		// Creamos arreglos de matrices
		int[][] arreMatriz1 = new int[filasMat1][columnasMat1];
		int[][] arreMatriz2 = new int[filasMat2][columnasMat2];
		int[][] arreMatriz2Tran = new int[columnasMat2][filasMat2];
		int[][] arreMatrizResult = new int[filasMat1][columnasMat2];

		// Llamamos las funciones
		arreMatriz1 = llenarMatriz(arreMatriz1.length, arreMatriz1[0].length);
		arreMatriz2 = llenarMatriz(arreMatriz2.length, arreMatriz2[0].length);

		System.out.println("Matriz A----------------------------------------------------");
		imprimirMatrizEnt(arreMatriz1);
		System.out.println("Matriz B----------------------------------------------------");
		imprimirMatrizEnt(arreMatriz2);

		// Funcion para transponer Matriz 2
		arreMatriz2Tran = transponerMatriz(arreMatriz2);

		arreMatrizResult = productoMatrizEnt(arreMatriz1, arreMatriz2Tran);
		System.out.println("Matriz resultante");
		imprimirMatrizEnt(arreMatrizResult);

	}

}
