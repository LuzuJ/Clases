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
public class ActividadIndividualArr {
	/*
	 * Usaremos las funciones vistas en clases anteriores
	 */
	public static int[] llenarArrEntero(int longitud) {
		int[] arregloLleno = new int[longitud];
		int[] arrExis = { 5, 7, 10, 57, 21 };
		for (int i = 0; i < longitud; i++) {
			// Usaremos los numero randomicos para ubicar los valores de arreglo
			// De manera aleaotria.
			int posAle = (int) (Math.random() * 5);
			arregloLleno[i] = arrExis[posAle];
		}
		return arregloLleno;
	}

	/*
	 * Usaremos otra funcion para imprimir los valores
	 */
	public static void imprimirArrEnt(int[] arrEnt) {
		// Se debe siempre borrar Ln para que quede concatenado correctamente
		System.out.print("El arreglo es {");
		for (int i = 0; i < arrEnt.length - 1; i++) {
			System.out.print(arrEnt[i] + ", ");
		}
		System.out.println(arrEnt[arrEnt.length - 1] + " }");
	}

	/**
	 * Funcion para calcular la multiplicacion del numero que más se repite con la
	 * cantidad que se repite
	 * 
	 * @param arreglo de tipo entero
	 * @return Multiplicacion Numero y Veces repetidas
	 */
	public static int numeroMulti(int[] arregloEntero) {
		int mayor = arregloEntero[0];
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

		for (int i = 0; i < arregloEntero.length; i++) {
			if (arregloEntero[i] == 5) {
				cont1++;
			}
			if (arregloEntero[i] == 7) {
				cont2++;
			}
			if (arregloEntero[i] == 10) {
				cont3++;
			}
			if (arregloEntero[i] == 57) {
				cont4++;
			}
			if (arregloEntero[i] == 21) {
				cont5++;
			}
		}
		// Para el numero que más se repite
		for (int k = 0; k < arregloEntero.length; k++) {
			if (mayor >= arregloEntero[k]) {
				mayor = arregloEntero[k];
			}
		}

		if (mayor == 5) {
			System.out.println("El numero que más se repite es: " + mayor);
			System.out.println("Las veces que se repite son: " + cont1);
			System.out.println("La multiplicacion de ambos numero es: " + (mayor * cont1));
		} else if (mayor == 7) {
			System.out.println("El numero que más se repite es: " + mayor);
			System.out.println("Las veces que se repite son: " + cont2);
			System.out.println("La multiplicacion de ambos numero es: " + (mayor * cont2));
		} else if (mayor == 10) {
			System.out.println("El numero que más se repite es: " + mayor);
			System.out.println("Las veces que se repite son: " + cont3);
			System.out.println("La multiplicacion de ambos numero es: " + (mayor * cont3));
		} else if (mayor == 57) {
			System.out.println("El numero que más se repite es: " + mayor);
			System.out.println("Las veces que se repite son: " + cont4);
			System.out.println("La multiplicacion de ambos numero es: " + (mayor * cont4));
		} else if (mayor == 21) {
			System.out.println("El numero que más se repite es: " + mayor);
			System.out.println("Las veces que se repite son: " + cont5);
			System.out.println("La multiplicacion de ambos numero es: " + (mayor * cont5));
		}

		return mayor;
	}

	/**
	 * Funcion para el valor que menos se repite y dividido para las veces que lo
	 * hace
	 * 
	 * @param arreglo de tipo entero
	 * @return division numero y veces que se repite
	 */
	public static double numeroDivi(int[] arregloEntero) {
		int menor = arregloEntero[0];
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

		for (int i = 0; i < arregloEntero.length; i++) {
			if (arregloEntero[i] == 5) {
				cont1++;
			}
			if (arregloEntero[i] == 7) {
				cont2++;
			}
			if (arregloEntero[i] == 10) {
				cont3++;
			}
			if (arregloEntero[i] == 57) {
				cont4++;
			}
			if (arregloEntero[i] == 21) {
				cont5++;
			}
		}

		for (int k = 10000000; k < arregloEntero.length; k++) {
			if (menor <= arregloEntero[k]) {
				arregloEntero[k] = menor;
			}
		}

		if (menor == 5) {
			System.out.println("El numero que menos se repite es: " + menor);
			System.out.println("Las veces que se repite son: " + cont1);
			System.out.println("La multiplicacion de ambos numero es: " + (double) menor / (double) cont1);
		} else if (menor == 7) {
			System.out.println("El numero que menos se repite es: " + menor);
			System.out.println("Las veces que se repite son: " + cont2);
			System.out.println("La multiplicacion de ambos numero es: " + (double) menor / (double) cont2);
		} else if (menor == 10) {
			System.out.println("El numero que menos se repite es: " + menor);
			System.out.println("Las veces que se repite son: " + cont3);
			System.out.println("La multiplicacion de ambos numero es: " + (double) menor / (double) cont3);
		} else if (menor == 57) {
			System.out.println("El numero que menos se repite es: " + menor);
			System.out.println("Las veces que se repite son: " + cont4);
			System.out.println("La multiplicacion de ambos numero es: " + (double) menor / (double) cont4);
		} else if (menor == 21) {
			System.out.println("El numero que menos se repite es: " + menor);
			System.out.println("Las veces que se repite son: " + cont5);
			System.out.println("La multiplicacion de ambos numero es: " + (double) menor / (double) cont5);
		}

		return menor;
	}

	/**
	 * Funcion para saber cuales numeros tienen iguales veces de repeticion
	 * 
	 * @param arreglo de tipo entero
	 * @return veces iguales que se repiten
	 */

	public static int numerosIguales(int[] arregloEntero) {
		int numIgua = arregloEntero[0];
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

		for (int i = 0; i < arregloEntero.length; i++) {
			if (arregloEntero[i] == 5) {
				cont1++;
			}
			if (arregloEntero[i] == 7) {
				cont2++;
			}
			if (arregloEntero[i] == 10) {
				cont3++;
			}
			if (arregloEntero[i] == 57) {
				cont4++;
			}
			if (arregloEntero[i] == 21) {
				cont5++;
			}
		}

		if (cont1 == cont2) {
			System.out.println("5 y 7 tienen " + cont1 + " repeticiones");
		}
		if (cont1 == cont3) {
			System.out.println("5 y 10 tienen " + cont1 + " repeticiones");
		}
		if (cont1 == cont4) {
			System.out.println("5 y 57 tienen " + cont1 + " repeticiones");
		}
		if (cont1 == cont5) {
			System.out.println("5 y 21 tienen " + cont1 + " repeticiones");
		}
		if (cont2 == cont3) {
			System.out.println("7 y 10 tienen " + cont2 + " repeticiones");
		}
		if (cont2 == cont4) {
			System.out.println("7 y 57 tienen " + cont2 + " repeticiones");
		}
		if (cont2 == cont5) {
			System.out.println("5 y 21 tienen " + cont2 + " repeticiones");
		}
		if (cont3 == cont4) {
			System.out.println("10 y 57 tienen " + cont3 + " repeticiones");
		}
		if (cont3 == cont5) {
			System.out.println("10 y 21 tienen " + cont3 + " repeticiones");
		}
		if (cont4 == cont5) {
			System.out.println("57 y 21 tienen " + cont4 + " repeticiones");
		}

		return numIgua;
	}

	public static void main(String[] args) {
		// Creamos las variables y asignamos valores
		// Creamos un arreglo
		Scanner ingresoDatos = new Scanner(System.in);
		int n = 0;
		boolean bandera = true;

		// Este arreglo será opcupado por la canitad que se repite cada valor
		System.out.println("El arreglo poseera numero entre el {5,7,10,57,21}");
		System.out.println("Ingrese la longitud que poseera el arreglo");
		n = Integer.parseInt(ingresoDatos.nextLine());

		// Con el valor que se ingrese se creará el arreglo
		int[] arrEnt = new int[n];

		// Llamamos una funcion para que llene arreglos entre 0 - 30
		arrEnt = llenarArrEntero(arrEnt.length);

		// Funcion para imprimir los valores
		imprimirArrEnt(arrEnt);

		// Usaremos esta funcion para realizar las funciones
		int numMul = numeroMulti(arrEnt);
		System.out.println("*******************************************************");

		// Numero que se repita menos veces se va a obtener la division del numero para
		// las repeticinoes
		double numDiv1 = numeroDivi(arrEnt);
		System.out.println("*******************************************************");

		// llamamos a una funcion para encontrar los que tienen igual numero de rep
		int numeIgua = numerosIguales(arrEnt);
		System.out.println("*******************************************************");

	}



}