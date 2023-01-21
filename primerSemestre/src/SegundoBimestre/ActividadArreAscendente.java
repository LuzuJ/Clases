package SegundoBimestre;

import java.util.Arrays;

/*
 * Actividades arreglos
 * Dado un arreglo de enteros de 10 elementos realizar las siguientes operaciones.
 * 2) Ordenar de forma ascendente los valores del arreglo
 * Subir la actividad hasta la 1:30 lo que hayamos conseguido, esta actividad se realizara
 * de manera individual.
 */
public class ActividadArreAscendente {

	/**
	 * Funcion para llenar arreglos enteros
	 * 
	 * @param longitud
	 * @return Arreglo lleno enteros
	 */
	public static int[] llenarMatrizEnt(int longitud) {
		int[] arreEnt = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			// Random de 1 a 50
			arreEnt[i] = (int) (Math.random() * 51);
		}
		return arreEnt;
	}

	/**
	 * Funcion para odenar de forma ascendente
	 * @param arreglo entero
	 * @return arreglo ordenado
	 */
	public static int[] funcionAscendente(int[] arrEnt) {
		int[] arrAsceR = new int[arrEnt.length];
		int asc = arrEnt[0];
		for (int i = 0; i < arrEnt.length; i++) {
			if (arrEnt[i] <= asc) {
				asc = arrAsceR[i];
			} else if (arrEnt[i]> asc) {
				asc --;
			}
		}
		return arrAsceR;
	}

	
	public static void main(String[] args) {
		// Definimos un arreglo
		int[] arrEnt = new int[10];
		// Arreglo con igual numeros de arreglos
		int[] arreAsc = new int[10];
		// Llamamos una funcion para llenarla de numero randomicos
		// Definimos el arreglo a llenar
		arrEnt = llenarMatrizEnt(arrEnt.length);
		System.out.println(Arrays.toString(arrEnt));

		// Llamamos una funcion para que nos imprima en Ascendente
		arreAsc = funcionAscendente(arrEnt);
		System.out.println();
		System.out.println(Arrays.toString(arreAsc));

	}

	

}
