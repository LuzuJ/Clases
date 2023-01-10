package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2)Escriba una función recursiva que ordene de menor a mayor un arreglo de
 * enteros basándose en la siguiente idea: coloque el elemento más pequeño en la
 * primera ubicación, y luego ordene el resto del arreglo con una llamada
 * recursiva.
 */
/*
 * 5)Programe un método recursivo que invierta los números de un arreglo de enteros
 */
public class RecursividadEjerciciosGrupo {

	/**
	 * Funcion para llenar arreglo en funcion del primer numero
	 * 
	 * @param Primer   numero del arreglo
	 * @param longitud del arreglo
	 * @return Arreglo lleno
	 */
	public static int[] llenarArreglo(int primerNum, int longitud) {
		// Creamos un arreglo con la longiud definida
		int arregloLleno[] = new int[longitud];
		/*
		 * Usamos el for para llenar el arreglo con numero aleatorios Al valor colocado
		 * se le sumara 1 y con ello lo haremos en un intervalo De ese numero y 30 más
		 * Usamos el for desde el 1, con ello el primer valor lo coloca el usuario
		 */
		for (int i = 1; i < longitud; i++) {
			arregloLleno[i] = (int) ((Math.random() * 30) + primerNum + 1);
		}
		// Colocamos el valor en la primera posicion
		arregloLleno[0] = primerNum;
		// retornamos el arreglo de enteros
		return arregloLleno;
	}

	/**
	 * Funcion para ordenar un arreglo en funcion del primer valor Metodo burbuja
	 * 
	 * @param arreglo  Entero
	 * @param posicion inicial
	 * @param posicion Final
	 * @return Arreglo ordenado
	 */
	public static int[] ordenarArreglo(int[] arreglo, int pos0, int posF) {
		/*
		 * Colocamos desde la posicion inicial 0 y posicion final 1 Esto nos ayuda a
		 * comparar el valor inicial y el siguiente
		 */
		// Cuando se hayan comparado todos los valores saldra del if y compara este
		// valor
		// Con el siguiente y asi sucesivamente
		if (posF < arreglo.length) {
			// Los if nos sirve a recorrer las posiciones
			if (pos0 < arreglo.length - posF) {
				// En esta ocacion restamos la posicion inical para evitar errores
				// En la longitud
				if (arreglo[pos0] > arreglo[pos0 + 1]) {
					// Aqui el arrelo compara el valor y el siguiente +1, este valor va a recorrer
					// Posiciones hasta que sea menor al siguiente
					int comp = arreglo[pos0];
					// Aqui iremos recorriendo los valores de la poscion inicial
					arreglo[pos0] = arreglo[pos0 + 1];
					// Asignamos el siguiente valor en la variable para acumularlo y compararki
					arreglo[pos0 + 1] = comp;
				}
				// Retornamos el arreglo +1 posicion
				return ordenarArreglo(arreglo, pos0 + 1, posF);
			} else {
				// Esta nos ayuda a sumar a la primera posicion
				pos0 = 0;
				return ordenarArreglo(arreglo, pos0, posF + 1);
			}
		} else {
			// Retornaremos el arreglo ordenado
			return arreglo;
		}
	}

	/**
	 * Funcion para llenar arreglo entero
	 * 
	 * @param longitud del arreglo
	 * @return Arreglo lleno
	 */
	public static int[] arregloLlenar(int longitud) {
		int[] arregloLleno = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (int) ((Math.random() * 80) + 10);
		}
		return arregloLleno;
	}

	/**
	 * Funcion para invertir el orden un arreglo entero
	 * 
	 * @param arreglo  entero
	 * @param posicion Inicial
	 * @param posicion Final
	 * @return Arreglo con los valores invertidos
	 */
	public static int[] invertirArreglo(int[] arreglo, int posI, int posF) {
		// Usamos el if para recorrer desde la posicion incial y la posicion final
		// A la posicion de la mitad, donde dejara de intercambiar los valores
		if (posI <= posF) {
			// Usamos el mismo principio de crear una variable temporal para que
			// guarde el valor y nos facilite cambiar de posicion
			int comp = arreglo[posF];
			arreglo[posF] = arreglo[posI];
			arreglo[posI] = comp;
			// Retornamos la funcion agregando una posicion a la posicion inicial
			// Y eliminando una a la posicion final
			return invertirArreglo(arreglo, posI + 1, posF - 1);
		}
		// Cuando cumpla con todas las posiciones retornara el arreglo ya cambiado
		return arreglo;
	}

	public static void main(String[] args) {
		// Definimos las variables
		Scanner ingresoDatos = new Scanner(System.in);
		boolean bandera = true;
		boolean bandera2 = true;

		// Pedimos al usuario la longitud del arreglo
		System.out.println("Longitud del arreglo");
		System.out.println("La longitud debe ser mayor o igual a 5 y menor o igual a 50");
		int longitud = Integer.parseInt(ingresoDatos.nextLine());
		// Usamos banderas y while para repetir hasta que el usuario cumpla con la
		// condicion
		while (bandera == true) {
			if (longitud > 4 && longitud < 51) {
				bandera = false;
			} else {
				// No usamos una funcion por el uso del Scanner
				System.err.println("Ingrese un valor positivo y mayor a 4");
				longitud = Integer.parseInt(ingresoDatos.nextLine());
				bandera = true;
			}
		}
		// Creamos el arreglo con la longitud colocada
		int[] arregloEnt = new int[longitud];

		// Pedimos al usuario el primer valor para llenar desde ese valor
		System.out.println("Ingrese el elemento más pequeño del arreglo");
		// Colocamos el valor en la primera posicion del arreglo
		arregloEnt[0] = Integer.parseInt(ingresoDatos.nextLine());
		// Usamos while para repetir hasta que cumpla con la condicion
		while (bandera2 == true) {
			if (arregloEnt[0] > 0) {
				bandera2 = false;
			} else {
				System.err.println("Ingrese un valor positivo");
				arregloEnt[0] = Integer.parseInt(ingresoDatos.nextLine());
				bandera2 = true;
			}
		}

		// Llamamos una funcion para llenar arreglos aleatoriamente en
		// al primer numero ingresado
		arregloEnt = llenarArreglo(arregloEnt[0], longitud);
		System.out.println(Arrays.toString(arregloEnt));

		// Funcion para ordenarlos de menor a mayor en funcion del numero más pequeño
		// en la primera posicion

		// Llamamos a la funcion y colocamos desde que pisicioneos va a comparar el
		// arreglo
		// Esto para evitar inicializar variables
		int[] arregloOrdenado = ordenarArreglo(arregloEnt, 0, 1);
		System.out.println("Ordenado de menor a mayor");
		System.out.println(Arrays.toString(arregloOrdenado));

		// Programe un método recursivo que invierta los números de un arreglo de
		// enteros
		// Usamos el arreglo ya creado para invertir los valores

		System.out.println("----------------------------------------------------------");

		System.out.println("Longitud del arreglo");
		System.out.println("La longitud debe ser mayor o igual a 5 y menor o igual a 50");
		int longitud2 = Integer.parseInt(ingresoDatos.nextLine());
		while (bandera == true) {
			if (longitud2 > 4 && longitud2 < 51) {
				bandera = false;
			} else {
				System.err.println("Ingrese un valor positivo y mayor a 4");
				longitud2 = Integer.parseInt(ingresoDatos.nextLine());
				bandera = true;
			}
		}

		System.out.println("El arreglo se ordenara aleatoriamente de 10 a 90");
		// Llamamos una funcion para llenar un arreglo con numeros aleatorios
		int[] arregloLleno = arregloLlenar(longitud2);
		System.out.println(Arrays.toString(arregloLleno));

		System.out.println("Arreglo invertido");
		// En la funcion enviamos el arreglo, la posicion inical y la posicion final
		int[] arreInver = invertirArreglo(arregloLleno, 0, arregloLleno.length - 1);
		System.out.println(Arrays.toString(arreInver));

	}

}
