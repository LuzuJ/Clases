package SegundoBimestre;

import java.util.Arrays;

/*
 * Esta clase va a ser utilizada para una forma diferente de imprimir las matrices
 * y tambien para analizar la forma de transponer una matriz
 */
public class ArreglosBidimensionalesParte2 {
/*
 * Esta clase se mostrara una froma diferente de  utilizar la sentencia for
 * para agrupacion de datos
 * Es decir se explicara o mostrara la sintaxis diferente para el uso for
 */
	/**
	 * Metodo para transponer una matriz
	 * @param matriz de tipo entero con x filas y columnas
	 * @return matriz de tipo entero con y filas x columnas
	 */
	public static int[][] transponerMatriz(int[][] matArre) {
		int filas = matArre.length;
		int columnas = matArre[0].length;
		//Cambio las filas y columnas
		int [][]matTrans= new int[columnas][filas];
		
		
		for(int i = 0; i < filas; i++) {
			for (int j =0; j < columnas;j++) {
				matTrans[j][i]= matArre[i][j];
			}
		}
		
		return matTrans;
	}
	/**
	 * Este es el metodo que me ayuda a imprimir una matriz de tipo entero
	 * @param matriz de tipo entero
	 */
	public static void imprimiMat(int[][] matArre) {
		for (int[] arreFil : matArre) {
			System.out.println(Arrays.toString(arreFil)); 
		}
		
	}
	
	public static void main(String[] args) {
		int[] arregloEntero = {1,5,9,7,8};
		String [] arregloString = {"Pa1", "Pa2", "Pa3"};
		/*
		 * For forma tradicional
		 */
		for(int i=0; i<arregloEntero.length;i++) {
			System.out.println("El elemento del arreglo " + arregloEntero[i]);
		}
		
		/*
		 * For sintaxis nueva: Esta sintaxis se puede utilizar para agrupaciones de datos
		 * es decir no es exclusiva para arreglos
		 * Agrupaciones de datos: A lo largo de los estudios en la carrera, se van a aprender
		 * diferentes estructuras de datos. Arreglos, Matrices, Pilas, Colas, Mapas, Arboles
		 * HashMaps 
		 * Este for esta creado para recorrer todos y cada uno de los elementos de 
		 * una agrupacion (Estructura de datos). Tome en cuenta que usted necesita
		 * utilizar el mismo tipo de dato de la agrupacion
		 *  para la variable que va a alojar los datos dentro de la agrupacion
		 *  
		 *  Recuerde que esta sintaxis SOLO Y EXCLUISVAMENTE sirve para agrupaciones
		 *  de datos.
		 */
		/*
		 * Para cada uno de los elementos(elemeDArre) del arreglo (arregloEntero)
		 */
		for(int elemeDArr : arregloEntero) {
			System.out.println("Elem Sintax Nueva" + elemeDArr);
		}
		
		for(int eleComp : arregloEntero) {
			if (eleComp==5) {
				System.out.println("Existe el numero 5 dentro del arreglo");
			}else {
				System.out.println("No existe el numero buscado");
			}
		}
		
		for (String eleArrSt : arregloString) {
			System.out.println(eleArrSt);
		}
		
		int filas = 3;
		int columnas = 2 ;
		int[][] matArre = { {3,2},
							{2,7},
							{5,4}	};
		int[][] matArreTrn;
		/*
		 * En este caso la sintaxis nueva para el for, lo que genera es que
		 * se pueda utilizar el conjunto de datos de una matrzi por filas.
		 * De igual manera recuerde que si usted desea obtener los datos de la 
		 * matriz por filas el arreglo debe tener el mismo tipo de la matriz
		 */
		for (int[] arreFil : matArre) {
			System.out.println(Arrays.toString(arreFil)); // :o
		}
	
		matArreTrn = transponerMatriz(matArre);
		System.out.println("Matriz original");
		imprimiMat(matArre);
		System.out.println("Matriz transpuesta");
		imprimiMat(matArreTrn);
		
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
		
	}

	



}
