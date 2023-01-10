package SegundoBimestre;

import java.util.Scanner;

/*
* 1)Numero que se repita más veces se a obtener la multiplicaion de las repeticiones
* por el numero 2*26=52
* 2)Numero que se repita menos veces se va a obtener la division del numero para 
* las repeticinoes
* 3)Si existen dos numeros con igual numero de repeticiones que se muetsra el mensaje
* que se tiene 2 numeros con las mismas repeticiones
*/
public class ActividadIndividualA {
	/**
	 * Funcion para llenar arregos con numeros al azar
	 * 
	 * @param longitud Ingresada
	 * @return Arreglo lleno enteros
	 */
	public static int[] llenarArrEntero(int longitud) {
		int[] arregloEnt = new int[longitud];
		// Creamos un arreglo con los numeros que queremos que repita
		int[] arrExs = { 4, 7, 10, 15, 22 };
		// Crearemos un contador para producir el Arreglo
		for (int i = 0; i < longitud; i++) {
			// Usaremos los numero randomicos para ubicar los valores de arreglo
			// De manera aleaotria
			// 5 son los valores que nosotros asiganmos
			int posAle = (int) (Math.random() * 5);
			arregloEnt[i] = arrExs[posAle];
		}
		return arregloEnt;
	}

	/**
	 * Funcion para imprimir arreglo
	 * 
	 * @param arreglo Entero
	 */
	public static void llenarArrEnt(int[] arregloEntero) {
		System.out.print("El arreglo es: { ");
		for (int i = 0; i < arregloEntero.length - 1; i++) {
			System.out.print(arregloEntero[i] + " , ");
		}
		System.out.println(arregloEntero[arregloEntero.length - 1] + " }");

	}

	/**
	 * Funcion para contar numero de repeticiones
	 * 
	 * @param arreglo Entero
	 * @return Arreglo con repeticiones de cada numero
	 */
	public static int[] numeroRepeticion(int[] arregloEntero) {
		// Los contadores almacenarás las veces que se repite cada valor
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int[] arrRep = new int[5];
		for (int i = 0; i < arregloEntero.length; i++) {
			if (arregloEntero[i] == 4) {
				cont1++;
				arrRep[0] = cont1;
			}
			if (arregloEntero[i] == 7) {
				cont2++;
				arrRep[1] = cont2;
			}
			if (arregloEntero[i] == 10) {
				cont3++;
				arrRep[2] = cont3;
			}
			if (arregloEntero[i] == 15) {
				cont4++;
				arrRep[3] = cont4;
			}
			if (arregloEntero[i] == 22) {
				cont5++;
				arrRep[4] = cont5;
			}
		}
		System.out.println("El numero 4 se repite " + cont1);
		System.out.println("El numero 7 se repite " + cont2);
		System.out.println("El numero 10 se repite " + cont3);
		System.out.println("El numero 15 se repite " + cont4);
		System.out.println("El numero 22 se repite " + cont5);
		return arrRep;
	}

	/**
	 * Funcion para producto n-veces * n
	 * 
	 * @param Arreglo de veces repetidas
	 */
	public static void productNumReps(int[] arregloReps) {
		int mayor = 0;
		boolean bandera = true;
		int[] valAs = { 4, 7, 10, 15, 22 };
		// Usamos un contador
		for (int i = 0; i < arregloReps.length; i++) {
			if (mayor < arregloReps[i]) {
				mayor = arregloReps[i];
			}
		}
		// Usamos un While para que repita la accion por si existen más numeros iguales
		while (bandera == true) {
			if (mayor == arregloReps[0]) {
				arregloReps[0] = valAs[0];
				System.out.println(
						"El valor que más se repite es " + arregloReps[0] + ", con " + mayor + " repeticiones");
				System.out.println("Y su producto es de " + (mayor * arregloReps[0]));
			}
			if (mayor == arregloReps[1]) {
				arregloReps[1] = valAs[1];
				System.out.println(
						"El valor que más se repite es " + arregloReps[1] + ", con " + mayor + " repeticiones");
				System.out.println("Y su producto es de " + (mayor * arregloReps[1]));
			}
			if (mayor == arregloReps[2]) {
				arregloReps[2] = valAs[2];
				System.out.println(
						"El valor que más se repite es " + arregloReps[2] + ", con " + mayor + " repeticiones");
				System.out.println("Y su producto es de " + (mayor * arregloReps[2]));
			}
			if (mayor == arregloReps[3]) {
				arregloReps[3] = valAs[3];
				System.out.println(
						"El valor que más se repite es " + arregloReps[3] + ", con " + mayor + " repeticiones");
				System.out.println("Y su producto es de " + (mayor * arregloReps[3]));
			}
			if (mayor == arregloReps[4]) {
				arregloReps[4] = valAs[4];
				System.out.println(
						"El valor que más se repite es " + arregloReps[4] + ", con " + mayor + " repeticiones");
				System.out.println("Y su producto es de " + (mayor * arregloReps[4]));
			}
			bandera = false;
		}

	}

	/**
	 * Funcion para el numero que menos se repite
	 * 
	 * @param arreglo Entero
	 */
	public static void divNumReps(int[] arregloReps) {
		// No se le asigna un numero sino un valor para que empiece a comparar numeros
		int menor = arregloReps[0];
		boolean bandera = true;
		int[] valAs = { 4, 7, 10, 15, 22 };
		// Usamos un contador
		for (int i = 0; i < arregloReps.length; i++) {
			if (menor > arregloReps[i]) {
				menor = arregloReps[i];
			}
		}
		// Usamos un While para que repita la accion por si existen más numeros iguales
		while (bandera == true) {
			if (menor == arregloReps[0]) {
				arregloReps[0] = valAs[0];
				System.out.println(
						"El valor que menos se repite es " + arregloReps[0] + ", con " + menor + " repeticiones");
				System.out.println("Y su cociente es de " + ((double) menor / (double) arregloReps[0]));
			}
			if (menor == arregloReps[1]) {
				arregloReps[1] = valAs[1];
				System.out.println(
						"El valor que menos se repite es " + arregloReps[1] + ", con " + menor + " repeticiones");
				System.out.println("Y su cociente es de " + ((double) menor / (double) arregloReps[1]));
			}
			if (menor == arregloReps[2]) {
				arregloReps[2] = valAs[2];
				System.out.println(
						"El valor que menos se repite es " + arregloReps[2] + ", con " + menor + " repeticiones");
				System.out.println("Y su cociente es de " + ((double) menor / (double) arregloReps[2]));
			}
			if (menor == arregloReps[3]) {
				arregloReps[3] = valAs[3];
				System.out.println(
						"El valor que menos se repite es " + arregloReps[3] + ", con " + menor + " repeticiones");
				System.out.println("Y su cociente es de " + ((double) menor / (double) arregloReps[3]));
			}
			if (menor == arregloReps[4]) {
				arregloReps[4] = valAs[4];
				System.out.println(
						"El valor que menos se repite es " + arregloReps[4] + ", con " + menor + " repeticiones");
				System.out.println("Y su cociente es de " + ((double) menor / (double) arregloReps[4]));
			}
			bandera = false;
		}
	}

	/**
	 * Funcion para identificar si ecisten dos numeros con igual reps
	 * 
	 * @param arreglo Entero
	 */
	public static void numeroIguResp(int[] arregloReps) {
		int menor = arregloReps[0];
		boolean bandera = true;
		int[] valAs = { 4, 7, 10, 15, 22 };
		// Usamos un contador
		for (int i = 0; i < arregloReps.length; i++) {
			if (menor == arregloReps[i]) {
				menor = arregloReps[i];
			}
		}

		while (bandera == true) {
			if (menor == arregloReps[0]) {
				arregloReps[0] = valAs[0];
				System.out.println("El valor que menos se repite es " + arregloReps[0] + " repeticiones iguales");
			}
			if (menor == arregloReps[1]) {
				arregloReps[1] = valAs[1];
				System.out.println("El valor que menos se repite es " + arregloReps[1] + " repeticiones iguales");
			}
			if (menor == arregloReps[2]) {
				arregloReps[2] = valAs[2];
				System.out.println("El valor que menos se repite es " + arregloReps[2] + " repeticiones iguales");
			}
			if (menor == arregloReps[3]) {
				arregloReps[3] = valAs[3];
				System.out.println("El valor que menos se repite es " + arregloReps[3] + " repeticiones iguales");
			}
			if (menor == arregloReps[4]) {
				arregloReps[4] = valAs[4];
				System.out.println("El valor que menos se repite es " + arregloReps[4] + " repeticiones iguales");
			}
			bandera = false;
		}

	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Creamos las variables y asignamos valores
		// Creamos un arreglo con numero que ingrese el usuario
		int n = 0;
		// 5 por los numeros que contará la funcion
		int[] valorRepet = new int[5];
		boolean bandera = true;

		// Este arreglo será opcupado para la longitud del arreglo
		System.out.println("El arreglo poseera numero entre el {4,7,10,15,22}");
		System.out.println("Ingrese la longitud que poseera el arreglo");
		n = Integer.parseInt(ingresoDatos.nextLine());

		// Con el valor que se ingrese se creará el arreglo
		int[] arrEnt = new int[n];

		// Llamamos una funcion para que llene el arreglo entero
		arrEnt = llenarArrEntero(arrEnt.length);

		// Crearemos una funcion para imrpimir los valores
		llenarArrEnt(arrEnt);

		// Creamos una funcion para devolver los valores las veces que se repiten
		valorRepet = numeroRepeticion(arrEnt);

		// Funcion para imprimir los valores las veces que se repiten
		llenarArrEnt(valorRepet);

		// Funcion para el valor que más se repite con su numero
		productNumReps(valorRepet);

		System.out.println("Menor");
		// Funcion para el valor que menos se repite
		divNumReps(valorRepet);

		// Funcion para imprimir si tiene igual numero de reps
		numeroIguResp(valorRepet);

		/*
		 * Casi fallece mi Pc en la realizacion de esta actividad :c
		 */
	}

}
