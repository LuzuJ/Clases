package SegundoBimestre;

import java.util.Arrays;
/*
 * Busqueda:
 * Es comparar elementos de un grupo contra u elemento designado, hasta verificar
 * si el elemento existe o no dentro del grupo original.
 * 
 * Comparar es la clave en las busquedas dado que solo se puede comparar de 
 * dos en dos los elementos
 * 
 * Busqueda secuencial: 
 * Es ir comparando de elemento en elemento designado para verificar si el elemento 
 buscado se encuentra dentro del arreglo
 * 
 * Busqueda binaria: 
 * Se fundamenta en dividir el conjunto de elementos en dos partes
 * Para esto el conjunto de elementos debe encontrarse ordenado
 * Una vez dividido se compara el elemento central con el elemento a buscar
 * Si el elemento central es igual al elemento a buscar se indica que encontro el elemento
 * Si el elemento centrar es mayor que el elemento a buscar, se realiza una busqueda secuencial 
 * eb la parte izquieda del arreglo
 * Si el elemento central es menor que el elemento a buscar, se realiza una busqueda secuencial 
 * en la parte derecha del arreglo
 */
public class BusquedaBinaria {

	public static void main(String[] args) {
		int [] arregloABuscar = {1,2,3,4,5,6,7,8,9,10,11,12,15,16,20}; 
		int elemtoABuscar = 5; 
		System.out.println(Arrays.toString(arregloABuscar));
		busquedaSecuencial(arregloABuscar,elemtoABuscar);
		System.out.println(Arrays.toString(arregloABuscar));
	}

	private static void busquedaSecuencial(int[] arregloABuscar, int elemtoABuscar) {
		// Encontrar elemento de la mitad
		int mitad = (int) (arregloABuscar.length/2);
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloABuscar[mitad]);
		if(elemtoABuscar < arregloABuscar[mitad]) {
			for(int i = 0 ; i < mitad; i++) {
				if(elemtoABuscar == arregloABuscar[i]) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		}else {
			for(int i = mitad ; i < arregloABuscar.length; i++) {
				if(elemtoABuscar==arregloABuscar[i]) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}
			}
		}
		System.out.println("Elemento no encontrado ");
		
	

	}

}
