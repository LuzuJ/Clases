package SegundoBimestre;
/*
 * Estructura de datos: Es una agrupacion de datos, las cuales tienen un 
 * orden y un tamaó definido.
 * Dentro de la estructura de datos, se va a tener tipo de datos 
 * Homogeneos (Mismos datos) y Heterogeneos (Diferentes tipos de datos)
 * En programacion 1 o programacion estructurada, se estudiaran los tipos de datos
 * homogeneos a traves de los arreglos Uni y Bidimensionales.
 * 
 * Arreglo: Es un conjunto de datos HOMOGENEOS los cuales estan agrupados en 
 * un orden determinado y con una dimension DEFINIDA desde la creacion 
 * de la estructura de datos.
 * 
 * Unidimensionles: Es un conjunto de datos, que se almacenan uno a continuacion de
 * otro, es decir un conjutno de este estilo:
 * [el0, el1, el2, .., eln]
 * 
 * Siempre los elementos inician desde el 0
 * 
 * Bidimensionales: Conjunto de datos, tipo matriz, es decir donde se manejara lo 
 * que son filas y columnas para la distribucion de datos.
 * Es decir un conjunto de este estilo m Filas X n Columnas
 * [el0, el0,1, el0,2, .., el0,n]
 * [el1,0, el1,1, e1,1, .., el1,1n]
 * .
 * .
 * .
 * [elm,0, elm,1, elm,2, .., elm,n]
 */

public class EstructuraDeDatos {
	/**
	 * Esta es una funcion para imprimir arreglos de tipo entero
	 * 
	 * @param arregloEnt1 un arreglo No retorna nada
	 */

	public static void imprimirArreEnt(int[] arregloEnt) {
		// Siempre usar valores dinamicos .lenght no quemados n
		for (int i = 0; i < arregloEnt.length; i++) {
			System.out.println("Elemento " + arregloEnt[i]);
		}

	}

	/**
	 * Esta es una funcion para sumar los elementos de un arreglo
	 * 
	 * @param arregloEnt1
	 */

	public static int sumaAcuArregEnt(int[] arrFunEnt) {
		int sumaACu = 0;
		for (int i = 0; i < arrFunEnt.length; i++) {
			sumaACu = sumaACu + arrFunEnt[i];
		}
		return sumaACu;
	}

	/**
	 * Esta es una funcion para llenar de datos enteros un arreglo
	 * 
	 * @param longitudArreglo
	 * @return arreglo lleno
	 */
	public static int[] llenarArreEnt(int longitudArreglo) {
		int[] arregloALlenar = new int[longitudArreglo];
		for (int i = 0; i < arregloALlenar.length; i++) { // o longitudArreglo
			arregloALlenar[i] = (int) (Math.random() * 51); // entre 0 y 50
		}
		return arregloALlenar;
	}

	/**
	 * Esta es una funcion para determinar el numero mayor dentro
	 * de un arreglo de enteros
	 * @param arreglo entero
	 * @return el valor de numero mayor
	 */
	
	public static int mayorArreglo(int[] arregloNum) {
		/*
		 * Numero pivote: Es aquel valor que me permite iniciar una comparación y 
		 * sirve como ancla para poder moverme y comparar a lo largo de la regla
		 */
		
		int mayor = arregloNum[0];
		int posArreg =0;
		for (int k = 0; k < arregloNum.length; k++) {
			//Esto irá comparando los valores con el numero pivote y cuando sea verdad,
			//El valor cambiará, caso contrario se matendrá.
			//Con el contador hará el proceso con todos.
			/*
			 * Al usar la comparacion "<=" dentro del If es verificar
			 * si es que hay numeros iguales dentro del arreglo, en este caso
			 * si existen numeros iguales comparados se camniará por la 
			 * posicion actual comparada
			 */
			if (mayor <= arregloNum[k]) {
				mayor = arregloNum[k];
				posArreg =k;
				//System.out.println(k);
			}
		}
		System.out.println("El numero mayor es " + mayor + " se encuentra en la posicion " + posArreg);
		return mayor;
	}

	/**
	 * Esta funcion calcula el promedio de los elementos de un arreglo de enteros
	 * @param La suma acumulativade los valores del arreglo
	 * @param La longitud del arreglo
	 * @return El promedio de los valores
	 */
	public static double promedioArrEnt(int sumaAcuArregEnt, int length) {
		double promedio = 0;
		//Recuerde castear
		promedio = (double) sumaAcuArregEnt / length;
		return promedio;
	}

	public static void main(String[] args) {
		/*
		 * Definicion de arreglos de tipos de datos primitivos Con los corchetes se
		 * indican que es inn arreglo alt91, alt93 Se debe indicar el numero de
		 * elementos Tipo de dato "[]" nombreArreglo = new tipo dato [numero de
		 * elementos] Recuerde que se inicia desde el 0
		 */
		// Si la dimension varia imprimen elementos vacios
		// int sumaAcu = 0;
		int[] arregloEnt1 = new int[5];
		// int[] arregloEnt2 = {5,4,8,7,5,7};
		int[] arregloEnt2i = new int[10];
		int[] arregloEnt3 = new int[100];
		int[] arregloEnt4 = new int[50];

		// int [][] Para bidimensional

		/*
		 * (10,3,2,4,7)-> Conjunto de datos homogeneos Ingreso de datos: nombre de
		 * arreglo [posicion] = dato
		 */
		/*
		 * arregloEnt1[0] = 5; System.out.println("Elemento " + arregloEnt1[0]);
		 * arregloEnt1[1] = 3; System.out.println("Elemento " + arregloEnt1[1]);
		 * arregloEnt1[2] = 2; System.out.println("Elemento " + arregloEnt1[2]);
		 * arregloEnt1[3] = 4; System.out.println("Elemento " + arregloEnt1[3]);
		 * arregloEnt1[4] = 7; System.out.println("Elemento " + arregloEnt1[4]);
		 * arregloEnt1[0] = 10; System.out.println("Elemento cambiado " +
		 * arregloEnt1[0]);
		 */
		// Reasignar un valor
		// arregloEnt2 [2] = 100;
		/*
		 * Error en tiempo de ejecucion, dado que la posicion 6 Esta fuera del limite
		 * del arreglo. Que no se puede ingresar ese dato. arregloEnt1 [6] = 9;
		 */
		/*
		 * System.out.println("La longitud del arreglo " + arregloEnt1.length); //
		 * Posicion maxima es -1 <- // For relacionado con los arreglos // arreglo por
		 * si cambio el numero de elementos // Mejor forma de imprimir los datos :3
		 * System.out.println("***************************************************");
		 * System.out.println("Con FOR"); for (int i = 0; i < arregloEnt1.length; i++) {
		 * System.out.println("Elemento " + (i + 1) + " es " + arregloEnt1[i]); sumaAcu
		 * = sumaAcu + arregloEnt1[i]; }
		 */

		/*
		 * System.out.println("***************************************************");
		 * System.out.println("Con WHILE"); int contador = 0; while (contador <
		 * arregloEnt1.length) { System.out.println("Elemento " + (contador + 1) +
		 * " es " + arregloEnt1[contador]); // No olvidar el contador // contador ++;
		 * contador = contador + 1; }
		 */

		System.out.println("***************************************************");

		arregloEnt1 = llenarArreEnt(arregloEnt1.length);

		// Llenar con numeros randomicos
		System.out.println("Con una Funcion");
		arregloEnt1 = llenarArreEnt(arregloEnt1.length);
		imprimirArreEnt(arregloEnt1); // Long 5

		System.out.println("********************************");
		arregloEnt2i = llenarArreEnt(arregloEnt2i.length);
		imprimirArreEnt(arregloEnt2i);

		System.out.println("********************************");
		arregloEnt3 = llenarArreEnt(arregloEnt3.length);
		imprimirArreEnt(arregloEnt3);

		System.out.println("********************************");
		arregloEnt4 = llenarArreEnt(arregloEnt4.length);
		imprimirArreEnt(arregloEnt4);

		// System.out.println("La suma es " + sumaAcu);
		int sumaAcumulativa = sumaAcuArregEnt(arregloEnt1);
		System.out.println(sumaAcumulativa);
		System.out.println(sumaAcuArregEnt(arregloEnt2i));

		/*
		 * 2pts a un deber Una funcion que determine cual es el numero mayor de un
		 * arreglo Una funcion que saque el promedio de los arreglos utilizando como
		 * parametro solo un numero y la dimension.
		 */

		int numeroMayor = mayorArreglo(arregloEnt1);
		numeroMayor = mayorArreglo(arregloEnt2i);
		numeroMayor = mayorArreglo(arregloEnt3);
		
		//Se puede llamar una funcion dentro de otra funcion
		double promedioArreglo= promedioArrEnt(sumaAcuArregEnt(arregloEnt1),arregloEnt1.length);
		System.out.println("El primedio del arreglo 1 es de " + promedioArreglo);
	}


}
