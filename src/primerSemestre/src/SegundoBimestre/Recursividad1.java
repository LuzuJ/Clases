package SegundoBimestre;
import java.util.Scanner;

/*
 * Recursivdad: Es la capacidad que tienen las funciones para llamarse a si misma
 * El objetivo de la recursividad, en primer lugar es ahorrar lineas de cogigo
 * mejorar la eficiencia con la realcion al procesamiento basado en la comunicacion
 * entre el procesador (ROM) y la memoria RAM.
 * Recuerde que recursividad siempre es un proceso finito, el cual me va a permitir
 * ejecutar y realizar operacines de acuerdo con condicinoes especificas las cuales
 * van a romper los ciclos de repeticiones
 * Ciclo for -> numero determinado de veces.
 * Recursividad -> numero determinado de veces a traves de las operaciones
 * que se realizan a los parametros de la funcion. 
 */
public class Recursividad1 {

	/**
	 * Esta funcion esta diseñada para realizar una suma recursiva en base de la
	 * disminucion del segunfo valor en 1
	 * La primera condicion, permite romper la recursividad
	 * Las dos primeras condicinoes lo que permites es manejar casos especiales
	 * en donde si alguno de los dos valores es igual a cero, la suma simplemente
	 * sera retornar el valor que diferente de cero.
	 * @param entero mayor igual que cero
	 * @param entero mayor igual que cero
	 * Tome en cuenta que el segundo parametro tiene que ser positivo
	 * @return retornara la suma de los dos valores
	 */
	/*
	 * Funciones anidadas son parte de las funciones recursivas
	 * Funciones anidadas, son fuciones que se ecuentran dentro de otra funcion.
	 * 
	 */
	public static int suma(int a, int b) {
		if (b == 0) {
			//Funcion anidada: funcion dentro de otra funcion
			imprimirValores(a);
			return a;
		} else if (a == 0) {
			imprimirValores(a);
			return b;
		}else {
			//funcion anidada y funcion recursiva
			return 1 + suma(a, b-1);
		}
	}
	
	public static void imprimirValores(int a) {
		System.out.println("El valor es " + a);
		
	}
	/**
	 * Esta funcion me permite recorrer los elementos dentro de una matriz
	 * @param matriz de timpo entero matEnt
	 * @param i es el numero de filas
	 * @param j es el numero de columnas
	 * Tome en cuenta que el valor de j se tiene que reiniciar cada vez 
	 * que se ejecuta la funcion dado que necesitamos imprimir los valores
	 * desde la columna cero,
	 */
	public static void recorrerMatrizRecursivo(int[][] matEnt, int i, int j) {
		// Muestro el nimero (sin salto de linea)
		System.out.print(matEnt[i][j] + " "); //String format
		//
		if (i != matEnt.length -1 || j != matEnt[i].length -1) {
			//Indico si llego al dinal de la fila
			if(j == matEnt[i].length -1) {
				//Paso a la siguiente fila
				i++;
				//Reinicio la j
				j=0;
				//Salto la linea (solo formato)
				System.out.println("");
			}else {
				//Paso a la siguiente columna
				j++;
			}
			//Volvemos a llamar la funcion recursiva
			recorrerMatrizRecursivo(matEnt, i, j);
		}
		
	}

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		int val1 = ingreso.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		int val2 = ingreso.nextInt();
		System.out.println("suma: " + suma(val1, val2));
		
		int [][] matEnt = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		//Llamada incial
		recorrerMatrizRecursivo(matEnt,0,0);
		
		int x = 5;
		int y = 7;
		System.out.println(); 
		String a = String.format("Este es un ejemplo de formato %d %d", x, y);
		System.out.println("Este es un ejemplo de formato " + x + " " + y);
		System.out.println(a);
		
		

	}

	

}
