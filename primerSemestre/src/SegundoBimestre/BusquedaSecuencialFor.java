package SegundoBimestre;

import java.util.Arrays;
public class BusquedaSecuencialFor {

	public static void main(String[] args) {
		int [] arregloABuscar = new int[100]; 
		int elemtoABuscar = 5; 
		
		arregloABuscar = llenarElementos(arregloABuscar.length); 
		arregloABuscar[0] = 5; 
		busquedaSecuencial(arregloABuscar,elemtoABuscar); 
		String[] arreglo = busquedaSecuencialTodo(arregloABuscar,elemtoABuscar);
		System.out.println(arreglo);
		System.out.println(Arrays.toString(arregloABuscar));

	}

	private static String[] busquedaSecuencialTodo(int[] arregloABuscar, int elemtoABuscar) {
		String [] elementoEncontrado = new String[arregloABuscar.length]; 

		for(int i = 0 ; i < arregloABuscar.length ; i++) {
			if(arregloABuscar[i]== elemtoABuscar) {
				elementoEncontrado[i] = "" + i ;
			}else {
				//elementoEncontrado[i] = "" + arregloABuscar[i]; 
			}
		}
	
		return elementoEncontrado;
	}

	public static void busquedaSecuencial(int[] arregloABuscar, int elemtoABuscar) {
		for(int i = 0 ; i < arregloABuscar.length ; i++) {
			if(arregloABuscar[i]== elemtoABuscar) {
				System.out.println("Elemento Encontrado en la posicion " + i );
				break; 
			}else {
				System.out.println("Elemento no encontrado");
			}
		}
	}

	public static int[] llenarElementos(int tamano) {
		int [] arregloALlenar = new int [tamano];
		
		for (int i = 0 ; i < tamano; i++) {
			arregloALlenar[i] = (int)(Math.random()*6); 
			//System.out.println(arregloALlenar[i]);
		}
		
		return arregloALlenar;

	}

}
