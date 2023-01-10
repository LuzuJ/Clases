package SegundoBimestre;
/*
 * Esta clase esta creada para manipulacion de elemetos dentro de un arreglo
 */
public class ArreglosUnidiPart2 {
	/**
	 * Funcion para llenar un arreglo de tipo entero en base de un grupo de numeros
	 * @param longitud del arreglo
	 * @return un arreglo de tipo entero
	 */
	public static int[] llenarArreglo(int longitud) {
		int[] arregloLleno = new int[longitud];
		//{10,2,4,50,7} Basado en numeros
		int [] numerosAlAzar = {10,2,4,50,7};
		for (int i = 0; i < longitud; i++) {
			int posAle = (int)(Math.random()*5); // 1-5
			arregloLleno[i] = numerosAlAzar[posAle];
		}
		return arregloLleno;
	}

	/**
	 * Funcion para imprimir un arreglo de tipo entero
	 * @param arreglo tipo entero
	 */
	public static void imprimirArrEnt(int[] arrEnt) {
		// Borro Ln para quitar el espacio entre lineas
		System.out.print("El arreglo Entero es {" );
		for(int i =0; i<arrEnt.length-1;i++) {
			System.out.print(arrEnt[i] + ", ");
		}
		System.out.println(arrEnt[arrEnt.length-1] + " }");
	}
	
    /**
     * Contar el numero de veces que se repite un elemento
     * @param arreglo tipo entero
     */
	public static void repeticionValore(int[] arregloEnt) {
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
		for(int i =0; i<arregloEnt.length;i++) {
			if(arregloEnt[i]==10) {
				cont1++;
			}
			if(arregloEnt[i]==2) {
				cont2++;
			}
			if(arregloEnt[i]==4) {
				cont3++;
			}
			if(arregloEnt[i]==50) {
				cont4++;
			}
			if(arregloEnt[i]==7) {
				cont5++;
			}
		}
		System.out.println(arregloEnt.length);
		System.out.println(cont1+cont2+cont3+cont4+cont5);
		System.out.println("El numero 10 se repite " + cont1);
		System.out.println("El numero 2 se repite " + cont2);
		System.out.println("El numero 4 se repite " + cont3);
		System.out.println("El numero 50 se repite " + cont4);
		System.out.println("El numero 7 se repite " + cont5);
		
	}
	public static void main(String[] args) {
		/*
		 * Con un arreglo entero que contenga 5 numeros, me indique el numero de 
		 * veces que se repita cada uno de estos numeros.
		 * {0,1,1,2,3,4,2,3,4}
		 * 0 se repite 1 vez
		 * 1 se repite 2 veces
		 * 2 se repite 2 veces
		 * 3 se repite 2 veces
		 * 4 se repite 2 veces
		 */
		int[] arregloEnt = new int[100];
		
		arregloEnt= llenarArreglo(arregloEnt.length);
		imprimirArrEnt(arregloEnt);
		repeticionValore(arregloEnt);
		//Individuaaaaaaal
		/*
		 * Switch
		 * 1)Numero que se repita más veces se a a obtener la multiplicaion de las repeticiones
		 * por el numero 2*26=52
		 * 2)Numero que se repita menos veces se va a obtener la division del numero para 
		 * las repeticinoes
		 * 3)Si existen dos numeros con igual numero de repeticiones que se muetsra el mensaje
		 * que se tiene 2 numeros con las mismas repeticiones
		 */

		/*
		 * Deber Semana 9
		 * Recuerde que este deber se subira en parejas.
		 * Crear un sistema para alamacenar productos perecivles y no perecibles
		 * Se necesita una lista de 5 productos percibles y 7 no perecibles
		 * Con esta linea se necesitará llenar 2 arreglos de 100 elementos
		 * Manzana= 0.5
		 * Atun =1
		 * Un total con el valor de todos los productos perericles  
		 * Un total con el valor de todos los productos no perecibles
		 * Conocer cual es el producto no perecible que más se repite
		 *y el total por este producto
		 *Conocer cual es el producto perecible que menos se repite y 
		 *el total por este producto
		 *Si el total de los productos perecibles es mayor al de los no perecibles se
		 *otorgará un 10% de descuento al total general de los productos
		 *perecibles y no perecibles
		 *Si el total de los porductos perecibles es menor al de los no perecibles se 
		 *otorgará un 8% de descuento al total general de los productos
		 *perecibles y no perecibles´
		 *Mostrar cada uno de los arreglos de la siguiente manera.
		 *{1.- Piña, 2.- Fresa, .... , 100.- Piña}
		 *{1.- atun, 2.- Lenteja, ... , 100.- Tallarin}
		 */
	}




}
