package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Ordenamiento:
 * En computacion y matematicas un algoritmo de ordenamiento es un algoritmo
 * que pone elementos de una lista o un vectos en una secuencia dada por una 
 * relacion de orden, es decir, el resultado de la salida ha de ser una permutacion o 
 * reordenamiento de la entrada que satisfaga la relacion de orden dada.
 * Las realcinoes de orden más usadas son el orden numéricp y el orden lexicográfico(Stings),
 * Ordenamieto eficientes son importantes para optimizar el uso de otros algoritmos
 * (como los de busqueda y funcion) que requiere listas ordenadas para una ejecucion rapida.
 */
/*
 * Particularidades del ordenamiento:
 * 1.- Se necesita un conjunto de datos para poder ordenar.
 * Arreglos, matrices - Listas Filas, Colas y arboles.
 * 2.- Se debe tener una condicion definida para el ordenamiento de los datos.
 * Arreglo Numericos: Ascendentemente, Descendentemente,
 * Desde el valor medio a la parte inferior y recorrer hasta la parte superior.
 * 4,5,1,3,8,7
 * As: 1,3,4,5,7,8
 * Ds: 8,7,5,4,3,1
 * CP: 4,3,1,5,7,8
 */
/*
 * A lo largo de la historia se ha necesitado desarrollar diferentes algortimos
 * para el ordenamiento, dado que en un inicio la informatica tenia recursos
 * de hadware limitados(Memoria Fisica, RAM, ROM).
 */
/*
 * Esta clase muestra 4 tipos de ordenamiento:
 * Burbuja, Inserccion, Seleccion, Quicksort.
 * En la medida de lo posible implementar en pseudocodigo Pseint(Preferencia)
 * Dos algoritmos de ordenamiento Quicksort Obligatoria y escoger**
 * uno de entre burbuja, inserccion o seleccion. 
 */

public class Ordenamiento {
	/*
	 * Tipos de Ordenamiento: 
	 * Ordenamiento Burbuja: El ordenamiento de burbuja (Bubble Sort en inglés) es un 
	 * sencillo algoritmo de ordenamiento. Funciona revisando cada elemento de la lista 
	 * que va a ser ordenada con el siguiente, intercambiándolos de posición si están en 
	 * el orden equivocado. Es necesario revisar varias veces toda la lista hasta que no 
	 * se necesiten más intercambios, lo cual significa que la lista está ordenada.
	 * http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
	 */
	public static void burbuja(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] > data[j + 1]) {
					Integer temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}
	/*
	 * Ordenamiento por seleccion: Consiste en encontrar el menor de todos los elementos 
	 * del vector e intercambiarlo con el que está en la primera posición. 
	 * Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo.
	 * http://lwh.free.fr/pages/algo/tri/tri_selection_es.html
	 */
	public static void seleccion(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				if (data[i] > data[j]) {
					int aux = data[j];
					data[j] = data[i];
					data[i] = aux;
				}
			}
		}
	}

	/*
	 * Ordenamiento por insercion: El ordenamiento por inserción (insertion sort en inglés)
	 * es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente 
	 * para ordenar un mazo de cartas numeradas en forma arbitraria.
	 * http://lwh.free.fr/pages/algo/tri/tri_insertion_es.html
	 * 
	 */
	public static void insercion(int[] data) {
		for (int i = 1; i < data.length; i++) {
			Integer aux = data[i];
			int j = i - 1;
			while (j >= 0 && data[j] > aux) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = aux;
		}
	}

	/*
	 * Ordenamiento Quick Sort: El algoritmo QuickSort se basa en la técnica de
	 *  "divide y vencerás" por la que en cada recursión, el problema se divide 
	 *  en subproblemas de menor tamaño y se resuelven por separado para ser unidos 
	 *  de nuevo una vez resueltos.
	 * http://lwh.free.fr/pages/algo/tri/tri_rapide_es.html
	 */

	public static void quickSort(int vec[], int inicio, int fin){ //Pivote: un elemento a comparar
		if(inicio>=fin) return; //Crear un grupo de más de un elemento
		int pivote=vec[inicio];
		int elemIzq=inicio+1;
		int elemDer=fin;
		//Ordenar dentro del sub arreglo creado a partir del elemento pivote
		while(elemIzq<=elemDer){
			//Los dos siguientes while  lo que ddetermina las posiciones
			//del nuevo grupo de datos a ordenar
			while(elemIzq<=fin && vec[elemIzq]<pivote){
				elemIzq++;//Un valor que determina la posicion del arreglo
			}
			while(elemDer>inicio && vec[elemDer]>=pivote){
				elemDer--; //Un valor que determina la posicion del arreglo
			}
			if(elemIzq<elemDer){
				int temp=vec[elemIzq];
				vec[elemIzq]=vec[elemDer];
				vec[elemDer]=temp;
			}
		}
		//Este if es donde se realiza el ordenamiento
		if(elemDer>inicio){
			int temp=vec[inicio];
			vec[inicio]=vec[elemDer];
			vec[elemDer]=temp;
		}
		//Ordena a la derecha y a la izquierda al mismo tiempo
		quickSort(vec, inicio, elemDer-1);
		quickSort(vec, elemDer+1, fin);
	}
	/*
	 * Clase principal 
	 */
	
	public static int[] llenarAlea(int longitud) {
		int arregloLleno[] = new int[longitud];
		for (int i = 1; i < longitud; i++) {
			arregloLleno[i] = (int) ((Math.random() * 2003)+1);
		}
		return arregloLleno;
	}
	
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		long inicio;
		long fin;
		//int [] vals = {15, 60, 8, 16, 44, 27, 12, 35};
		
		System.out.print("Ingrese la longitud del arreglo: ");
		int longi = ingreso.nextInt();
		int[] vals = new int[longi];
		
		vals = llenarAlea(vals.length);
		System.out.println(Arrays.toString(vals));
		/*
		 * Si quiere cambiar solo cambia la condicion
		 */
				
		System.out.println();
		
		System.out.println("Ordenamiento Burbuja");
		inicio = System.nanoTime();//Calcula el tiempo en nano segundos de mi hora actual
		burbuja(vals);
		System.out.println(Arrays.toString(vals));
		fin = System.nanoTime()-inicio;
		System.out.println(fin);
		
		System.out.println();
		
		System.out.println("Ordenamiento Seleccion");
		inicio = System.nanoTime();
		seleccion(vals);
		System.out.println(Arrays.toString(vals));
		fin = System.nanoTime()-inicio;
		System.out.println(fin);
		
		System.out.println();
		
		System.out.println("Ordenamiento Insercion");
		inicio = System.nanoTime();
		insercion(vals);
		System.out.println(Arrays.toString(vals));
		fin = System.nanoTime()-inicio;
		System.out.println(fin);
		
		System.out.println();
		
		System.out.println("Ordenamiento Quicksort");
		inicio = System.nanoTime();
		quickSort(vals, 0, vals.length-1);
		System.out.println(Arrays.toString(vals));
		fin = System.nanoTime()-inicio;
		System.out.println(fin);
		/*
		 * P1, P3, P5 //Primeras letras diferentes
		 * P1, P1, P2, P2
		 * 1) Llenar un arreglo con 100 palabras de un conjunto de 10
         * para ordenarlos alfabeticamente, con los 4 algoritmos de ordenamiento
         * 2) LLenar un arreglo de tamano 10 con caracteres a traves de consola
         * y ordenardos de forma descendente en su codigo ASCII
		 * 
		 * ------------------------------------------
		 * 
		 * 3) Con un arreglo de tamaño 10 con palabras y numero y ordenarlos 
		 * a traves del primer varacter y el valor de su codigo ASCII
		 * 
		 */
		
		
	}
	


}
