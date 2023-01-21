package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadesRecursividadPares {

	/*
	 * Trabajo en parejas para los programas Informe individual Actividades dia
	 * Lunes para presentar el lunes hasta la media noche: Caratula. Indice.
	 * Introduccion: 3 - 5 Parrafos del significado de recursividad. Pueden usar
	 * ejemplos, imagenes, diagramas. Por nosotros mismos Ejemplos: 2 Ejemplos de
	 * recursividad no necesariamente ejemplos de programacion
	 * 
	 * Programas parejas: 1) Ingresado un numero por consola calcular el
	 * factorialdel mismo Ya pueden utilizar restricciones, es decir si el usuario
	 * ingresa un numero negativ les muestre un error. ** 2) Ingresado un numero por
	 * consola calcular la suma de los digitos 578 Resultado 5+7+8 = 20*** 3)
	 * Calcular el máximo de un arreglo utilizando recursividad. Crear un arreglo de
	 * 10 elementos de forma aleatoria entre 20 y 100, **
	 */

	/**
	 * Funcion para calcular el factorial de un numero
	 * 
	 * @param Numero a calcular
	 * @return Valor factorial
	 */
	public static int calculoFactorial(int num1) {
		if (num1 == 0) {
			return 1;
		} else {
			return num1 * calculoFactorial(num1 - 1);
		}
	}

	/**
	 * Funcion para sumar los digitos de un numero
	 * 
	 * @param numero entero
	 * @return La suma de los digitos de un numero
	 */
	public static int sumaDigitos(int numeroEntero) {
		if (numeroEntero == 0) {
			return 0;
		} else {
			/*
			 * Al tener un numero con algunos digitos, sacamos el residuo que ese lo
			 * sumaremos con la division del anterior numero que tendra menos digitos y así
			 * hasta solo tener la suma de los digitos
			 */
			return sumaDigitos(numeroEntero / 10) + numeroEntero % 10;
		}
	}

	/**
	 * Funcion para llenar arreglos enteros
	 * 
	 * @param longitud del arreglo
	 * @return Arreglo entero de numeros randomicos
	 */
	public static int[] llenarArreglo(int longitud) {
		int[] arregloLleno = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (int) ((Math.random() * 80) + 20);
		}
		return arregloLleno;
	}

	/**
	 * 
	 * @param Funcion  para imprmir el mayor de un numero
	 * @param posicion
	 * @param valor    a comparar
	 * @return Maximo de un arreglo entero
	 */
	public static int mayorArreglo(int[] arregloEnte, int posicion, int valorComp) {
		if (posicion == 0) {
			return valorComp;
		} else {
			if (arregloEnte[posicion] > valorComp) {
				valorComp = arregloEnte[posicion];

			}
		}
		return mayorArreglo(arregloEnte, posicion - 1, valorComp);
	}

	public static void imprimirValoresTope(int valorTope) {
		if (valorTope >= 1) {
			// System.out.print(valorTope + " ");
			//System.out.print(valorTope+" ");
			valorTope--;
			imprimirValoresTope(valorTope);
			// Por acumulacion de datos
			System.out.print((valorTope + 1) + " ");
		}
	}

	public static void main(String[] args) {
		Scanner ingre = new Scanner(System.in);
		/*
		 * Factorial de un numero Para poder ingresar un numero positivo
		 */
		System.out.println("ingrese hasta donde desea el factorial");
		int num1 = Integer.parseInt(ingre.nextLine());
		while (num1 <= 0 && num1 < 13) {
			System.err.println("Ingrese un numero positivo y menor que 13");
			num1 = Integer.parseInt(ingre.nextLine());
		}
		int numF = calculoFactorial(num1);
		System.out.println("El factorial de " + num1 + "! es " + numF);

		/*
		 * Usamos restriccion para que no sean numero con menos de dos pueden ser
		 * negativos y positivos
		 */
		System.out.println("Ingrese un numero mayor de más de 2 cifras para poder sumarlos");
		int num2 = Integer.parseInt(ingre.nextLine());
		while (num2 < 10 && num2 > -10) {
			System.err.println("Ingrese un numero de más digitos");
			num2 = Integer.parseInt(ingre.nextLine());
		}
		int numSu = sumaDigitos(num2);
		System.out.println("La suma de los digitos es " + numSu);

		/*
		 * El maximo de un arreglo usando recursividad
		 */
		int[] arregloEnte = new int[10];
		arregloEnte = llenarArreglo(arregloEnte.length);
		System.out.println();
		System.out.println(Arrays.toString(arregloEnte));
		System.out.println();
		// Llamamos funcion para calcular el mayor de un arreglo
		int numMax = mayorArreglo(arregloEnte, arregloEnte.length - 1, arregloEnte[0]);
		System.out.println("El mayor del arreglo es: " + numMax);

		System.out.println();
		
		System.out.println("Digite el numero hasta donde desea imprimir");
		int valorTope = Integer.parseInt(ingre.nextLine());
		imprimirValoresTope(valorTope);

	}

}
