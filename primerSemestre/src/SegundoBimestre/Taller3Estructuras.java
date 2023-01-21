package SegundoBimestre;
/*
 * Inge el enviado anterior mente fue en el tiempo estipulado, este es el completo 
 */
import java.util.Arrays;
import java.util.Scanner;

/*
 * Sistema para una compañia de transportes
 */
public class Taller3Estructuras {
	/**
	 * Funcion para sumar los valores que se desee ingresar
	 * @param Arreglo de tipo entero
	 * @param a cual se le desea sumar
	 * @param caunto se le desea sumar
	 * @return Arreglo con nuevos valores
	 */
	public static int[] funcionLlenado(int[] arreglo, int trns, int numTr) {

		switch (trns) {
		case 1:
			arreglo[0] = arreglo[0] + numTr;
			break;
		case 2:
			arreglo[1] = arreglo[1] + numTr;

			break;
		case 3:
			arreglo[2] = arreglo[2] + numTr;

			break;
		case 4:
			arreglo[3] = arreglo[3] + numTr;

			break;
		case 5:
			arreglo[4] = arreglo[4] + numTr;

			break;

		default:
			System.out.println("No existe esa opcion");
			break;
		}

		return arreglo;
	}

	/**
	 * Funcion para imprimir los arreglos con los nuevos valoers
	 * @param Un arreglo entero
	 */
	public static void imprimirArr(int[] arreglo) {
		System.out.print("{");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(i + 1 + ".- " + arreglo[i] + ", ");
		}
		System.out.println(arreglo.length + ".-" + arreglo[arreglo.length - 1] + " }");

	}

	/**
	 * Funcion para poder imprimir los arreglos como matrices
	 * @param Arreglo entero
	 * @param Arrelo etero
	 * @param Arrego entero
	 * @return Matriz
	 */
	public static int[][] impirmirMate(int[] quitoNe, int[] guayaNe, int[] cuencNe) {
		// Como son tres arreglos creamos un arreglo en general para poder unirlo
		int[][] nuevaMatr = { quitoNe, guayaNe, cuencNe };
		for (int[] matNue : nuevaMatr) {
			for (int i : matNue) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
		return nuevaMatr;
	}

	/**
	 * Funcion para imprimir la matriz
	 * @param Mtriz entera
	 */
	public static void imprimirMatM(int[][] nuevaMat) {
		for (int[] elemeChar : nuevaMat) {
			System.out.println(Arrays.toString(elemeChar));
		}

	}

	/**
	 * Funcion para conocer el mayor dentro de un arreglo
	 * @param Arreglo entero
	 * @return EL numero mayor en un arreglo
	 */
	public static int funcionMayor(int[] arrelo) {
		int mayor = arrelo[0];
		//Recorremos los arreglos para compararlos
		for(int i = 0; i<arrelo.length; i++) {
			if(arrelo[i]>mayor) {
				mayor= arrelo[i];
			}
		}
		
		return mayor;
	}
	

	/**
	 * Funncion oara imprimir los arreglos con sus precios
	 * @param arreglo entero
	 * @return arreglo entero
	 */
	public static int[] funcionImpr(int[] arregloEnt) {
		int[] numeroG = new int[arregloEnt.length];
		numeroG[0]= arregloEnt[0]*12000;
		numeroG[1]= arregloEnt[1]*30000;
		numeroG[2]= arregloEnt[2]*50000;
		numeroG[3]= arregloEnt[3]*25000;
		numeroG[4]= arregloEnt[4]*18000;
		return numeroG;
	}
	
	/**
	 * Funcion para sumar todos los valores
	 * @param arreglo enter
	 * @return Un valor entero
	 */
	public static int funcionSum(int[] arregloEnt) {
		int sumaG =0;
		for(int i= 0 ; i<arregloEnt.length;i++) {
			sumaG= sumaG+arregloEnt[i];
		}
		return sumaG;
	}
	public static void main(String[] args) {
		/*
		 * Definimos y asginamos los arreglos para cada compañia Agrupamos en un arreglo
		 * todas las cantidades en el siguiente orden taxis, camiones, buses, busetas,
		 * camionetas Llamamos un Scanner para ingresar datos
		 */
		Scanner ingreso = new Scanner(System.in);
		String ing = " ", ing2 = " ";
		boolean bandera = true, bandera2 = true;

		int[] compQuito = { 5, 7, 3, 4, 2 };
		int[] compGuaya = { 10, 2, 5, 4, 5 };
		int[] compCuenc = { 2, 4, 7, 8, 5 };
		int[] quitoNe = new int[compQuito.length];
		int[] guayaNe = new int[compGuaya.length];
		int[] cuencNe = new int[compCuenc.length];
		System.out.println("Menu para compañias de transportes");
		System.out.println("En Quito hay: " + Arrays.toString(compQuito));
		System.out.println("En Guayakill hay: " + Arrays.toString(compGuaya));
		System.out.println("En Cuenca hay: " + Arrays.toString(compCuenc));

		// Llamamos una funcion para realizar agrgar los valores
		// Usamos un if
		// A esta funcion no se le hace funcion por que es necesario el Scanner

		while (bandera == true) {
			System.out.println("Ingrese si si desea continuar");
			ing = ingreso.nextLine().toLowerCase();
			if (ing.equals("si")) {
				System.out.println("A que cuiudad desea agregarle más medios de transporte");
				String ciudad = ingreso.nextLine().toLowerCase();
				if (ciudad.equals("quito")) {

					System.out.println("A que fila desea arreglo desea agregar transportes");
					System.out.println("Recuerde que estan ordenados en este orden");
					System.out.println("taxis, caminones, buses, busetas y camionetas");
					int trns = Integer.parseInt(ingreso.nextLine());
					System.out.println("Cuantos desea agregar");
					int numTr = Integer.parseInt(ingreso.nextLine());
					quitoNe = funcionLlenado(compQuito, trns, numTr);
					System.out.println(Arrays.toString(quitoNe));

				}
				if (ciudad.equals("guayaquil")) {

					System.out.println("A que fila desea arreglo desea agregar transportes");
					System.out.println("Recuerde que estan ordenados en este orden");
					System.out.println("taxis, caminones, buses, busetas y camionetas");
					int trns = Integer.parseInt(ingreso.nextLine());
					System.out.println("Cuantos desea agregar");
					int numTr = Integer.parseInt(ingreso.nextLine());
					guayaNe = funcionLlenado(compGuaya, trns, numTr);
					System.out.println(Arrays.toString(guayaNe));

				}
				if (ciudad.equals("cuenca")) {

					System.out.println("A que fila desea arreglo desea agregar transportes");
					System.out.println("Recuerde que estan ordenados en este orden");
					System.out.println("taxis, caminones, buses, busetas y camionetas");
					int trns = Integer.parseInt(ingreso.nextLine());
					System.out.println("Cuantos desea agregar");
					int numTr = Integer.parseInt(ingreso.nextLine());
					cuencNe = funcionLlenado(compCuenc, trns, numTr);
					System.out.println(Arrays.toString(cuencNe));

				}

			} else {
				bandera = false;
			}
		}

		System.out.println("Ingrese una opcion para ontinuar con el menu");
		System.out.println("1- Para imrpimir cada una de las sucursales");
		System.out.println("2- Para determinar el numero mayor");
		System.out.println("3- Para conocer la inversion total");
		/*
		 * Al reasignar los valores es necesario que haya cambiado los valores antes
		 * sino sale 0
		 */
		//Usamos while e if para poder repetir hasta que la persona lo desee
		while (bandera2 == true) {
			System.out.println("Ingrese si si desea continuar");
			ing2 = ingreso.nextLine().toLowerCase();
			if (ing2.equals("si")) {
				System.out.println("ingrese la opcion");
				int opcM = Integer.parseInt(ingreso.nextLine());
				switch (opcM) {
				case 1:
					System.out.println("Compañia quito" + Arrays.toString(compQuito));
					System.out.print("Quito: ");
					imprimirArr(quitoNe);

					System.out.println("Compañia guayaquil" + Arrays.toString(compGuaya));
					System.out.print("Guayaquil: ");
					imprimirArr(guayaNe);

					System.out.println("Compañia cuenca" + Arrays.toString(compCuenc));
					System.out.print("Cuenca: ");
					imprimirArr(cuencNe);
					break;
				case 2:
					/*
					 * Debemos generar una matriz y de ahi obtenemos el mayor
					 */
					int[][] nuevaMat = impirmirMate(quitoNe, guayaNe, cuencNe);
					/*
					 * Para mostar de mejor manera la matriz
					 */
					imprimirMatM(nuevaMat);
					/*
					 * Creamos una funcion para saber cual es el mayor dentro de los arreglos
					 */
					int mayorQuito = funcionMayor(quitoNe);
					System.out.println("El numero mayor del arreglo es: " + mayorQuito);
					int mayorGuayas = funcionMayor(guayaNe);
					System.out.println("El numero mayor del arreglo es: " + mayorGuayas);
					int mayorCuenca = funcionMayor(cuencNe);
					System.out.println("El numero mayor del arreglo es: " + mayorCuenca);
					int[] mayorG = {mayorQuito, mayorGuayas, mayorCuenca};
					int mayorGeneral = funcionMayor(mayorG);
					System.out.println("El mayor general es: " + mayorGeneral);
					
					break;
				case 3:
					System.out.println("La inversion por compañia es");
					int[] numGeneQ = funcionImpr(quitoNe);
					System.out.println(Arrays.toString(numGeneQ));
					int valQ = funcionSum(numGeneQ);
					System.out.println("El valor total de la compañia 1 es:" + valQ);
					
					int[] numGeneG = funcionImpr(guayaNe);
					System.out.println(Arrays.toString(numGeneG));
					int valG = funcionSum(numGeneG);
					System.out.println("El valor total de la compañia 2 es:" + valG);
					
					int[] numGeneC = funcionImpr(cuencNe);
					System.out.println(Arrays.toString(numGeneC));
					int valC = funcionSum(numGeneC);
					System.out.println("El valor total de la compañia 3 es:" + valC);
					
					System.out.println("El valor total a pagar es de : $"+  valC + valG + valQ);
					break;

				default:
					System.out.println("Ingrese una opcion valida");
					break;
				}
			}else {
				bandera2=false;
			}
		}
		System.out.println("Gracias por elegirnos");
	}

	


	

	

}
